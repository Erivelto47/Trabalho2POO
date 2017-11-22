
import java.util.*;

/**
 * 
 */
public abstract class Entidade {

    /**
     * Default constructor
     */
    public Entidade() {
    }

    /**
     * 
     */
    private int posX;

    /**
     * 
     */
    private int posY;

    /**
     * 
     */
    private String frente;




    /**
     * Seta a posicao da entidade, chama a Classe Random para criar a posicao X e Y
     */
    public void Entidade() {
        // TODO implement here
    }

    /**
     * Retorna a posicao X do personagem
     * @return
     */
    public int GetPosX() {
        // TODO implement here
        return this.posX;
    }

    /**
     * Retorna a posicao Y do personagem
     * @return
     */
    public int GetPosY() {
        // TODO implement here
        return this.posY;
    }

    /**
     * @return
     */
    public String GetFrente() {
       
        return this.frente;
    }

    /**
     * Seta para onde esta a frente do personagem.
     * @param frente Recebe um valor String : 
     * N (norte)
     * S (sul)
     * L (leste)
     * O (oeste)
     */
    public abstract void SetFrente(String frente);

    /**
     * @param PosX 
     * @param PosY
     */
    public void SetPosXY(int PosX, int PosY) {
    	this.posX = PosX;
    	this.posY = PosY;
    }

}