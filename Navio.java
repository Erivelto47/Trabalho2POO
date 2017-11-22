
import java.util.*;

/**
 * 
 */
public class Navio extends Entidade implements AldeaoSet {

    /**
     * Default constructor
     */
    public Navio() {
    }

    /**
     * 
     */
    private static double movimento = 5;

    /**
     * 
     */
    private final double ataqueNv = 100;



    /**
     * Seta para onde esta a frente do personagem.
     * @param frente Recebe um valor String : 
     * N (norte)
     * S (sul)
     * L (leste)
     * O (oeste)
     */
    public void SetFrente(String frente) {
    	
    }

    /**
     * @param PosX 
     * @param PosY
     */
    @Override
	public void SetPosXY(int PosX, int PosY) {
		// TODO Auto-generated method stub
		
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

	

	

}