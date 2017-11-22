
import java.util.*;

/**
 * 
 */
public class Aldeao extends Entidade implements AldeaoSet {

    /**
     * Deve ser unico, e permitira a movimentacao da unidade e outras operacoes.
     */
    private int id;

    /**
     * 
     */
    private String identificador;

    /**
     * Armazena a direcao que o personagem est� voltado, ou seja para onde foi o ultimo movimento
     * */
    private String frente;

    /**
     * Default constructor
     */
    public Aldeao() {
    }
    

    /**
     * @param id
     */
    public  Aldeao(int id) {
      this.id = id;
    }

    /**
     * @return
     */
    public String GetIdentificador() {
        return this.identificador;
    }
    
    public int getId() {
    	return this.id;
    }


    /**
     * Seta para onde esta a frente do personagem.
     * @param frente Recebe um valor String : 
     * N (norte)
     * S (sul)
     * L (leste)
     * O (oeste)
     */
    @Override
    public  void SetFrente(String frente) {
    	this.frente = frente;
    }

    /**
     * @param PosX 
     * @param PosY
     */
    @Override
    public void SetPosXY(int PosX, int PosY) {
    	super.SetPosXY(PosX, PosY);
    }

    /**
     * Metodo para movimentar unidades ou seja, ele seta o novo X e Y (posicao) da unidade.
     * @param SetX Posicao X
     * @param SetY Posicao Y
     */
    @Override
	public void Movimenta(String direcao) {
		// TODO Auto-generated method stub
		
	}

    /**
     * Esse metodo serve para desferir ataque atraves da unidade selecionada, cada personagem tem sua propria configuração de ataque.
     * @param ataque Se for tue então o ataque é desferido, caso contrario não.
     */
    public void Atacar(boolean ataque) {
        // TODO implement here
    }

    /**
     * Este metodo diz qual é o tipo de movimento do Personagem. Exemplo: Para Frente ( F ) e Para o Norte ( N ).
     * @param direcao Recebe uma String com as direcoes do movimento no formato:
     * "N S L O F"
     * Letras maiusculas separadas por espaco.
     */
    public void SetTipoMovimento(String direcao) {
        // TODO implement here
    }
    
    
    /**
     * @return
     */
    public String toString() {
        return ""+ this.id;
    }
	

}