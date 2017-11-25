
public class Auxiliar {
	private String direcao;
	
	private Aldeao selecionado;//unidade a ser movida
	
	private Aldeao[] unidades;
	
	private String[][] Mapa;
	
	private int id;// id da unidade
	
	
	
	
	
	public void Movimenta(int id, String direcao, Aldeao[] Vetor, String[][] Mapa) {
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
//    			private boolean foraDaArena;
//    			
//    			//se foraDaArena for negativo quer dizer que o movimento sera maior que a arena, setar para primeira linha
//    			if(GetX - 5 < 0) {
//    				foraDaArena == true;
//    			}
//    			else {
//    				foraDaArena == false;
//    			}
//    			
//   
//    			if(foraDaArena == true){
//    				if()
//    			}
//    			else{
//    				
    			}
//    			
//    				
//    			
//    		
    		}
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
			this.Mapa[Setar.GetPosX()][Setar.GetPosY()] = "" + Setar.getId() + Setar.get + Setar.GetFrente();
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

}
