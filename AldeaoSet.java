
import java.util.*;

/**
 * 
 */
public interface AldeaoSet {

    /**
     * Metodo para movimentar unidades ou seja, ele seta o novo X e Y (posicao) da unidade.
     * @param SetX Posicao X
     * @param SetY Posicao Y
     */
    public void Movimenta(String direcao, Aldeao[] Vetor, String[][] Mapa);

    /**
     * Esse metodo serve para desferir ataque atraves da unidade selecionada, cada personagem tem sua propria configuração de ataque.
     * @param ataque Se for tue então o ataque é desferido, caso contrario não.
     */
    public void Atacar(boolean ataque);

   
}