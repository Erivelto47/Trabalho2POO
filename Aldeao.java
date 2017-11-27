
import java.util.*;

/**
 * 
 */
public class Aldeao extends Entidade implements AldeaoSet {

	private Auxiliar mov;
	
    /**
     * Deve ser unico, e permitira a movimentacao da unidade e outras operacoes.
     */
    private int id;

    /**
     * 
     */
    private String identificador;
    
    private String tipo = "A";

    /**
     * Armazena a direcao que o personagem est� voltado, ou seja para onde foi o ultimo movimento
     * */
    private String frente;

	private int ataqueAl = 1;

	 private static int movimento = 1;

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

    public int GetCasasMovimento() {
    	return this.movimento;
    }
    public String getTipoUnidade() {
    	return this.tipo;
    }
    
   

    /**
     * Seta para onde esta a frente do personagem.
     * @param frente Recebe um valor String : 
     * N (norte)
     * S (sul)
     * L (leste)
     * O (oeste)
     */
   
    public  void setFrente(String frente) {
    	super.setFrente(frente);
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
        return " Id: "+ this.id + " X: " + super.GetPosX() + " Y: "+ super.GetPosY();
    }


	@Override
	public int getLevel() {
		return 1;
	}


	@Override
	public int getAtaque() {
		return this.ataqueAl;
	}
    
    
	

}