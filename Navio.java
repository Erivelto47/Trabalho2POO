
import java.util.*;

/**
 * 
 */
public class Navio extends Aldeao {
	
	private String frente;
	
	private String tipo = "N";
	


    /**
     * Default constructor
     */
    public Navio() {
    }

    /**
     * 
     */
    private static int movimento = 5;

    /**
     * 
     */
    private final int ataqueNv = 100;



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
    
    public int GetCasasMovimento() {
    	return this.movimento;
    }
    public String tipoUnidade() {
    	return this.tipo;
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