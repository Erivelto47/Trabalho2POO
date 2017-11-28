package main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Arena mapa = new Arena();		
		Scanner teclado = new Scanner(System.in);
		int id;
		String direcao;
		int i = 0;
                                    int contadorunidades = 0;
		
		while(i != -1) {
			System.out.println("\n\nEscolha uma opcao:\n 1: Printar Mapa\n 2: Atacar\n 3: Mover\n 4: Inserir\n 5: Remover\n 6: Salvar\n");
			i = teclado.nextInt();
			
			if(i == 1) {
				mapa.PrintMapa();
			}
			else if(i ==2) {
				System.out.println("Digite o id do personagem para efetuar o Ataque: ");
				id = teclado.nextInt();
				mapa.Atacar(id);
			}
			else if(i == 3) {
				System.out.println("Digite o id do personagem.");
				id = teclado.nextInt();
				System.out.println("E a direcao sendo: \n N->Norte\n S->Sul\n L->Leste\n O->Oeste\n ");
				direcao = teclado.next();
				mapa.MovimentarUnidade(id, direcao);;
			}
			else if(i == 4) {
				int x, y;
				System.out.println("Digite o Tipo do personagem: \n (Q) Arqueiro\n(C) Cavaleiro\n (A) Aldeao\n (N) Navio\n (G) Guerreiro");
				direcao = teclado.next();
				System.out.println("Digite a posicao X do Personagem (linha do Mapa): Valor entre 0 a 9");
				x = teclado.nextInt();
				System.out.println("Digite a posicao Y do Personagem (coluna do Mapa): Valor entre 0 a 9");
				y = teclado.nextInt();
				mapa.InserirUnidade(direcao, x, y);
			}
                                                      else if (i == 6) {
				System.out.println("Gravando...");
				GravarArquivo gravar = new GravarArquivo();
				Aldeao[] arquivar = new Aldeao[10];
				int j;

				for (j = 0; j < contadorunidades; j++) {
                                                                                          if (usuario.getNome().equals(email[i].getPara())) {
                                                                                                            arquivar[i] = Aldeao[i];
					}
				}
				gravar.gravarArquivo(usuario.getNome(), arquivar);
			}
		}
		
	}
}
