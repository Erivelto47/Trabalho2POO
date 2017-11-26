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
                                             
                                              DA PRA OTIMIZAR O CODIGO FAZENDO UM METODO QUE FAZ AS COMPARACOES QUANDO JA EXISTE ALGUEM NA POSICAO:
              
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
                 
                     
                                    //ESBOCO METODO ATAQUE
                     
                                    if(this.selecionado == null) {
                                             System.out.println("Unidade não Existe.");	
		}
		else
                                    {
                                        
                                        //ataca apenas pra frente - alcance de 1 posicao - so mata outros aldeoes
                                         if(aldeao)
                                         {
                                             // faz um GetFrente pra receber a direcao da frente 
                                             //as verificacoes de (PosX-1 > 0 ou PosY+1<9)  sao para garantir que so vai realizar operacao se o aldeao tiver 1 posicao distante do limite da arena, 
                                             //pra evitar de se estiver no limte da arena vai tentar atacar uma posicao lixo de memoria
                                             
                                             if(frente == "N")
                                             {
                                                    if(verifica se PosX-1 é maior que zero)
                                                    {
                                                            if(verificar se existe alguem na posicao X-1){
                                                                       //se existir e for mais forte
                                                                       System.out.println("O Ataque Falhou.");
                                                            }
                                                            else{
                                                                       //excluir o outro aldeao da posicao X-1
                                                                       System.out.println("Ataque Com Sucesso!");
                                                            }
                                                    }
                                               
                                                
                                             }
                                             else if(frente == "S")
                                             {
                                                 //verifica se PosX+1 é menor que 9
                                             }
                                             else if(frente == "L")
                                             {
                                                 //verifica se PosY+1 é menor que 9
                                             }
                                             else if(frente == "O"")"
                                             {
                                                 //verifica se PosY-1 é maior que 0
                                             }
                                             
                                         }
                                         
                                         //ataca apenas pra frente - alcance de 5 posicoes - mata aldeoes e outros arqueiros 
                                         if else(arqueiro)
                                         {
                                              if(frente == "N")
                                             {
                                                    // a ideia é fazer um while 
                                                    // a variavel i é para controle de ele nao fazer mais operacoes do que o alcance do arqueiro
                                                    int i=0;
                                                    int k  = GetPosX-1;    //para se por ex: o arqueiro ta na posicao X=3 a estrutura de repeticao tem q comparar apenas 4 vezes, vai comparar até o num chegar a zero
                                                    
                                                    while(i < 5 || k >-1)
                                                    {
                                                            if(verificar se existe alguem na posicao X[k]Y[Coluna d Arqueiro])
                                                            {
                                                                       //se existir e for mais forte
                                                                       System.out.println("O Ataque Falhou.");
                                                            }
                                                            else{
                                                                       //excluir o outro aldeao da posicao X-1
                                                                       System.out.println("Ataque Com Sucesso!");
                                                            }
                                                            k--;
                                                            i++;
                                                    }
                                               
                                                
                                             }
                                             else if(frente == "S")
                                             {
                                                        //  while(i < 5 || k <10)
                                                    
                                             }
                                             else if(frente == "L")
                                             {
                                                         //  while(i < 5 || k <10)
                                             }
                                             else if(frente == "O")
                                             {
                                                         //  while(i < 5 || k >-1)
                                             }
                                         }
                                         
                                         //ataca a frente e a direita - alcance de 3 posicoes - mata aldeoes, arqueiros e guerreiros
                                         if else(guerreiro)
                                         {   
                                             //mesma ideia do while, mas nessa vamos ter que acrescentar as comparacoes de ataque pra direita/esquerda dependendo de pra que lado ta a frente do personagem
                                         }
                                         
                                         //ataca a frente, direita e esquerda - alcance de 5 posicoes - mata todos menos navio
                                         if else(cavaleiro)
                                         {
                                              //mesma ideia do while, mas nessa vamos ter que acrescentar as comparacoes de ataque pra direita/esquerda dependendo de pra que lado ta a frente do personagem
                                         }
                                         
                                         //ataca em todas as direcoes - alcance maximo ate o limite da arena - mata ate a sombra da galera
                                         if else(navio)
                                         {
                                             //armazenar em dois inteiros a posicao a linha e coluna que ele está
                                             int x = getPosX;
                                             int y = getPosY;
                                             
                                             //fazer um for que percorre o vetor de personagens e exclui todos os peronagens que estao ou na linha X ou na coluna Y, menos a posicao do navio
                                             // se nao consegui, apaga inclusive o navio, e usa as variaveis que fiz acima onde esta salvo a posicao xy dele, entao grava novamente so ele na antiga posicao
                                             
                                         }
                                            
                                    }
                                     
                 }

}
