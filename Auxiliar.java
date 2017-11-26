package main;
public class Auxiliar {
	private String direcao;
	
	private Aldeao selecionado;//unidade a ser movida
	
	private Aldeao[] unidades;
	
	private String[][] Mapa;
	
	private int id;// id da unidade
	

                
	
	
	public void Movimenta(int id, String direcao, Aldeao[] Vetor, String[][] Mapa) 
                 {
		this.unidades = Vetor;
		this.Mapa = Mapa;
		this.id = id; 
		this.selecionado = this.ExisteUnidade(Vetor);
                                    
                                  
                                    
		
		if(this.selecionado == null) {
                                             System.out.println("Unidade não Existe.");	
		}
		else {		
		
                                             if(direcao == "N") {
                                                      if(this.selecionado.GetPosX() == 0){
                                                               System.out.println("Limite Norte da Arena - Movimento Inválido.");	
                                                      }
                                                      else 
                                                      {
                                                               //verificaçao para ver se o movimento NÃO esta nos limites da arena, se n estiver setar para a posicao limite da arena na direcao (norte nesse caso)
                                                          
                                                               if(this.selecionado.GetPosX() - (acessar o valor de movimento da unidade) < 0)           // Ex: do navio é 5, do aldeao 1...
                                                               {
                                                                        //se entrou quer dizer que o movimento e maior do que a arena
                                                                        
                                                                        if(verificar se existe alguem na coluna y / linha zero)     // X[0] Y[Valor da Coluna] // 
                                                                        {
                                                                                  //ja que existe comparar qual dos dois é mais forte
                                                                                 if(se o da posicao que quero mover ser o mais forte, )
                                                                                 {
                                                                                          //excluir meu personagem atual
                                                                                          System.out.println("Alguém mais forte na Posição  - Personagem Excluído.");
                                                                                 }
                                                                                 else
                                                                                 {
                                                                                          //nao fazer nada
                                                                                          System.out.println("Outro Personagem Igual ou mais Fraco na Posição - Movimento Inválido.");
                                                                                 }
                                                                        }
                                                                        
                                                               }
                                                               
                                                               //se nao entrar no primeiro if quer dizer que o movimento vai estar dentro dos limites e entrara no else
                                                               else
                                                               {
                                                                        if(verificar se existe alguem na posicao  Ex: Pos[GetPosX() - (acessar o valor de movimento da unidade) ][Y] )
                                                                        {
                                                                                   //ja que existe comparar qual dos dois é mais forte
                                                                                 if(se o da posicao que quero mover ser o mais forte, )
                                                                                 {
                                                                                          //excluir meu personagem atual
                                                                                          System.out.println("Alguém mais forte na Posição  - Personagem Excluído.");
                                                                                 }
                                                                                 else
                                                                                 {
                                                                                          //nao fazer nada
                                                                                          System.out.println("Outro Personagem Igual ou mais Fraco na Posição - Movimento Inválido.");
                                                                                 }
                                                                        }
                                                                        else    // nao existe ninguem na posicao
                                                                        {
                                                                                 //setar meu personagem para a nova posicao XY
                                                                                 //gravar null na posicao antiga
                                                                        }
                                                               }
                                                      }
                                                }
                                             
                                             
                                             /*
                                             PRA SUL LESTE E OESTE VAI SER QUASE A MSM COISA, SO MUDA A POSICAO E DIRECAO Q VAMOS COMPARAR
                                             
                                              DA PRA OTIMIZAR O CODIGO FAZENDO UMA FUNCAO QUE COMPARA QUANDO JA EXISTE ALGUEM NA POSICAO
                                             
                                             EVITA A REPETICAO DESSA PARTE:
                                             if(se o da posicao que quero mover ser o mais forte, )
                                                                                 {
                                                                                          //excluir meu personagem atual
                                                                                          System.out.println("Alguém mais forte na Posição  - Personagem Excluído.");
                                                                                 }
                                                                                 else
                                                                                 {
                                                                                          //nao fazer nada
                                                                                          System.out.println("Outro Personagem Igual ou mais Fraco na Posição - Movimento Inválido.");
                                                                                 }
                                             */
                                    }
                 }
	
	public Aldeao[] getUnidade() {
		return this.unidades;
	}
	
	public String[][] getMapa(){
		return this.Mapa;
	}
	
	private void ExcluirUnidade(int idExclui) {
		int i;
		for(i = 0; i < this.unidades.length; i++) {
			if(this.unidades[i].getId() == idExclui) {
				this.Mapa[unidades[i].GetPosX()][unidades[i].GetPosY()] = "-";
				this.unidades[i] = null;
			}
		}
	}
	//terminar de arrumar o tipo do personagem.
	private void SetUnidade(Aldeao Setar) {
		if(Setar != null) {
			this.Mapa[Setar.GetPosX()][Setar.GetPosY()] = "" + Setar.getId() + Setar.GetFrente();
		}
	}
	
	
                    /**
                 * Retorna a Unidade se Existir
                 */
                  private Aldeao ExisteUnidade(Aldeao[] unidades) {
                            int i;
                            for(i = 0; i < unidades.length; i++) {
    		if(unidades[i].getId() == this.id) {
    			return unidades[i];
    		}
                            }
                           return null;
                   }
                  
                
                  
         
	public void Atacar(int id, String direcao, Aldeao[] Vetor, String[][] Mapa) 
                 {
                 
                     
                                    //ESBOCO
                     
                                     
                 }

}
