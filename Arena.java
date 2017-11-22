
import java.util.*;

/**
 * Será a "Interface" de comunicacao cm os comandos do usuario, como exibir mapa e as unidades, possibilitar movimentacao, excluir ou adicionar unidades.
 */
public class Arena {


    /**
     * 
     */
    private Aldeao[] unidades;

    /**
     * 
     */
    private String[][] mapa;

    String[] stringe = new String[3];
 
    private Randomico RD = new Randomico();


    /**
     * Seta a Quantidade inicial de Unidades como 10 .
     * Inicializa o Mapa como null.
     */
    public Arena() {
    	this.mapa = new String[10][10];
    	this.SetMapNull();
    	this.unidades = new Aldeao[30];
    	this.SetUnidadesStart();
    	this.SetaMapaUnidades();
    	
    }

    /**
     * Recebe a Quantidade de Unidades que o mapa tera, sendo esse limitado a no maximo 30 personagens.
     * Seta a Quantidade inicial de Unidades como 10.
     * Inicializa cada posicao do Mapa como NULL.
     * @param QtdeUnidades Determina quantas unidades tera no mapa, entre navio, aldeao, arqueiro, guerreiro ou cavaleiro
     */
    public void Arena(double QtdeUnidades) {
        // TODO implement here    	   
    	    
    }

    /**
     * Seta individualmente quantas unidade de cada tipo tera no Mapa.
     * @param aldeao Diz quantas unidades Aldeaos terá no mapa.
     * @param arqueiro Quantidade de Arqueiros.
     * @param cavaleiro Quantidade de cavaleiros.
     * @param navio Quantidade de Navios.
     * @param guerreiro Numero de Guerreiros.
     */
    public void SetUnidades(int aldeao, int arqueiro, int cavaleiro, int navio, int guerreiro) {
        // TODO implement here
    }

    /**
     * Printa o Mapa com todas as unidades em suas respectivas posicoes.
     */
    public void PrintMapa() {
       int i, j;
       System.out.println("*******************************************************************************");
       
       for(i = 0; i < 10; i++) {
    	   for(j = 0; j < 10; j++) {
    		   System.out.print(this.mapa[i][j] + "\t ");    		   
    	   }
    	   System.out.println("\n"); //muda de linha
       }
       
       System.out.println("*******************************************************************************");
    }

    /**
     * Possibilita a movimentacao da unidade.
     * @param nome Nome da Unidade a ser movimentada.
     * @param direcao Direcao de ser do Tipo: 'S' -> Sul ... 'N' -> Norte ... 'L' -> Leste ... 'O' -> Oeste.
     */
    public void MovimentarUnidade(int id, String direcao) {
    	Aldeao unit = this.ExisteUnidade(id);
       if(unit != null) {
    	   unit.Movimenta(direcao);
       }
       else {
    	   System.out.println("Esta unidade N�o existe!");
       }
    	   
    }
    
    /** 
     * Insere uma nova unidade. 
     * 
     * @param tipo Espera-se: Arqueiro, Cavaleiro, Aldeao, Navio ou Guerreiro
     * @param PosX A Linha onde sera inserido
     * @param PosY A Coluna onde sera inserido
     */
    
    public void InserirUnidade(String tipo, int PosX, int PosY) {
    	
    }

    /**
     * Deleta a Unidade Informada
     * @param id Recebe o Nome/Id da Unidade a ser removida
     */
    public void DeleteUnidade(String id) {
        // TODO implement here
    }

    /**
     * Funcao para salvar o jogo em arquivo.
     */
    public void SalvarJogo() {
        // TODO implement here
    }

    /**
     * Seta o Mapa com as unidades criadas em suas  respectivas posicoes.
     */
    private void SetaMapaUnidades() {
    	int i;
    	int c, l;
    	String nome;
    	
    	for( i = 0; i < 10; i++) {
    		l = (int) this.unidades[i].GetPosX();
    		c = (int) this.unidades[i].GetPosY();
    		nome = "" +  this.unidades[i].getId();
    		this.mapa[l][c] = nome;
    	}
       
    }
    
    /**
     * Seta o Mapa com o simbolo '-' com as posicoes vazias no mapa.
     */    
    private void SetMapNull() {
    	int i, j;
    	for(i = 0; i < 10; i++) {
    		for(j = 0; j < 10; j++) {
    			this.mapa[i][j] = "-";    			
    		}
    	}
    }
    
    /**
     * Seta o Mapa com as 10
     */   
    private void SetUnidadesStart() {
    	int i;
    	int  x , y;
    	int nome; 
    	for(i = 0; i < 10; i++) {
    		nome = i;
    		unidades[i] = new Aldeao(nome);
    		x = RD.getPosX(); y = RD.getPosY();
    		unidades[i].SetPosXY(x,y);
    	}
    }
    
    /**
     * Retorna a Unidade se Existir
     */
    private Aldeao ExisteUnidade(int id) {
    	int i;
    	for(i = 0; i < unidades.length; i++) {
    		if(unidades[i].getId() == id) {
    			return unidades[i];
    		}
    	}
		return null;
    }
}