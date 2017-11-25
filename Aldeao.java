
import java.util.*;

/**
 * 
 */
public class Aldeao extends Entidade {

	private Auxiliar mov;
	
    /**
     * Deve ser unico, e permitira a movimentacao da unidade e outras operacoes.
     */
    private int id;

    /**
     * 
     */
    private String identificador;

    /**
     * Armazena a direcao que o personagem está voltado, ou seja para onde foi o ultimo movimento
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
     * @return
     */
    public String toString() {
        return ""+ this.id;
    }
	

}