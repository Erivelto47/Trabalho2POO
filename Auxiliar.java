public class Auxiliar {
	private String direcao;

	private Aldeao selecionado;// unidade a ser movida

	private Aldeao[] unidades;

	private String[][] Mapa;

	private int id;// id da unidade

	public void Movimenta(int id, String direcao, Aldeao[] Vetor, String[][] Mapa){
		this.unidades = Vetor;
		this.Mapa = Mapa;
		this.id = id; 
		this.direcao = direcao;
		this.selecionado = this.ExisteUnidade();
		                    
		
		if(this.selecionado == null) {
			System.out.println("Unidade n�o Existe.");	
		}
		else {
			if((this.direcao.equals("N") && this.selecionado.GetPosX() == 0) || (this.direcao.equals("S") && this.selecionado.GetPosX() == 9)){
					System.out.println("Limite da Arena - Movimento Inv�lido.");
			}
			else if((this.direcao.equals("O") && this.selecionado.GetPosY() == 0) || (this.direcao.equals("L") && this.selecionado.GetPosY() == 9)) {
				System.out.println("Limite da Arena - Movimento Inv�lido.");
			}
			else {
				this.VerificaMapaPos();
			}
		}
	}
		
	public Aldeao[] getUnidade() {
		return this.unidades;
	}

	public String[][] getMapa() {
		return this.Mapa;
	}
	
	public void Atacar(int id, Aldeao[] Vetor, String[][] Mapa) {
		this.id = id;
		this.Mapa = Mapa;
		this.unidades = Vetor;
		this.selecionado = this.ExisteUnidade();
		this.direcao = this.selecionado.GetFrente();
		
		if(this.selecionado != null) {
			if(this.selecionado.getTipoUnidade().equals("A")){
				this.direcao = this.selecionado.GetFrente();
				this.Ataque();//funcao que percorre a matriz e realiza as operacoes
			}
			
			/*O arqueiro ataca a sua frente com alcance de 5 posicoes e pode abater 
			 * apenas aldeoes e outros arqueiros. 
			 * Caso outros personagens mais fortes estejam na direcao do ataque, os
			 * mesmos nao serao abatidos*/
			else if(this.selecionado.getTipoUnidade().equals("Q")) {
				this.Ataque();
			}
			
			/*guerreiro ataca em duas direcoes, a frente e a direita*/
			else if(this.selecionado.getTipoUnidade().equals("G")) {
				if(this.direcao.equals("N")){
					this.Ataque();
					this.direcao = "L";
					this.Ataque();
				}
				else if(this.direcao.equals("S")) {
					this.Ataque();
					this.direcao = "O";
					this.Ataque();
				}
				else if(this.direcao.equals("L")) {
					this.Ataque();
					this.direcao = "S";
					this.Ataque();
				}
				else if(this.direcao.equals("O")) {
					this.Ataque();
					this.direcao = "N";
					this.Ataque();
				}
			}
			
			/*O cavaleiro ataca em tres direcoes, a frente, a direita e  a esquerda*/
			else if(this.selecionado.getTipoUnidade().equals("C")) {
				if(this.direcao.equals("N")){
					this.Ataque();
					this.direcao = "L";
					this.Ataque();
					this.direcao = "O";
					this.Ataque();
				}
				else if(this.direcao.equals("S")) {
					this.Ataque();
					this.direcao = "O";
					this.Ataque();
					this.direcao = "L";
					this.Ataque();
				}
				else if(this.direcao.equals("L")) {
					this.Ataque();
					this.direcao = "S";
					this.Ataque();
					this.direcao = "N";
					this.Ataque();
				}
				else if(this.direcao.equals("O")) {
					this.Ataque();
					this.direcao = "N";
					this.Ataque();
					this.direcao = "S";
					this.Ataque();
				}
			}
			/*O navio ataca em quatro dire�c�oes, norte, sul, leste e oeste*/
			else if(this.selecionado.getTipoUnidade().equals("N")) {
				this.direcao = "N";
				this.Ataque();
				this.direcao = "S";
				this.Ataque();
				this.direcao = "O";
				this.Ataque();
				this.direcao = "L";
				this.Ataque();
			}
			
			
		}
		else {
			System.out.println("Esta Unidade n�o existe!");
		}
		
    }

	
	
	
	
	
	/*-----------------------------------------------METODOS PRIVADOS------------------------------------------------------*/
	
	private boolean ExcluirUnidade(int idExclui) {
		int i;
		for (i = 0; i < this.unidades.length; i++) {
			if(this.unidades[i] != null) {
				if (this.unidades[i].getId() == idExclui) {
					this.Mapa[unidades[i].GetPosX()][unidades[i].GetPosY()] = "-";
					this.unidades[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	private void Ataque() {
		Aldeao aux;
		int k, w; //indices percorrer matriz
		int alcance = this.selecionado.getAtaque();
		int i = this.selecionado.GetPosX();
		int j = this.selecionado.GetPosY();
		String frente = this.direcao;
		 
		
			if(frente.equals("N")) {
				k = i;
				//para o ataque o da matriz diminui
				while((k >= (i-alcance)) && (k >= 0)) {
					if(this.Mapa[k][j].equals("-") == false) {
						this.id = getIDMapa(k, j);
						aux = this.ExisteUnidade();
						if(aux != null) {
							if(aux.getId() != this.selecionado.getId()) {
								if(aux.getLevel() <= this.selecionado.getLevel()) {
									this.ExcluirUnidade(aux.getId());
								}
							}
						}
					}
					k--;
				}
			}
			else if(frente.equals("S")) {
				k = i;
				//para o ataque o da matriz diminui
				while((k <= (i+alcance)) && (k <= 9)) {
					if(this.Mapa[k][j].equals("-") == false) {
						this.id = getIDMapa(k, j);
						aux = this.ExisteUnidade();
						if(aux != null) {
							if(aux.getId() != this.selecionado.getId()) {
								if(aux.getLevel() <= this.selecionado.getLevel()) {
									this.ExcluirUnidade(aux.getId());
								}
							}
						}
					}
					k++;
				}
			}
			else if(frente.equals("L")) {
				k = j;
				//para o ataque o da matriz diminui
				while((k <= (j+alcance)) && (k <= 9)) {
					if(this.Mapa[i][k].equals("-") == false) {
						this.id = getIDMapa(i, k);
						aux = this.ExisteUnidade();
						if(aux != null) {
							if(aux.getId() != this.selecionado.getId()) {
								if(aux.getLevel() <= this.selecionado.getLevel()) {
									this.ExcluirUnidade(aux.getId());
								}
							}
						}
					}
					k++;
				}
			}
			if(frente.equals("O")) {
				k = j;
				//para o ataque o da matriz diminui
				while((k >= (j-alcance)) && (k >= 0)) {
					if(this.Mapa[i][k].equals("-") == false) {
						this.id = getIDMapa(i, k);
						aux = this.ExisteUnidade();
						if(aux != null) {
							if(aux.getId() != this.selecionado.getId()) {
								if(aux.getLevel() <= this.selecionado.getLevel()) {
									this.ExcluirUnidade(aux.getId());
								}
							}
						}
					}
					k--;
				}
			}
			
	}
	/**
	 * Retorna o id do personagem na posicao solicitada
	 * @param i linha da matriz
	 * @param j coluna da matriz
	 * @return int : Id do personagem 
	 */
	private int getIDMapa(int i, int j) {
		if(this.Mapa[i][j].equals("-") == false) {
			String id = this.Mapa[i][j].substring(0, 2);//pega o id do personagem
			int idConvert = Integer.valueOf(id);//transforma em inteiro
			return idConvert;
		}
		return -1;
	}

	/**
	 * Retorna a Unidade se Existir
	 */
	private Aldeao ExisteUnidade() {
		int i;
		for (i = 0; i < this.unidades.length; i++) {
			if (this.unidades[i] != null) {
				if (this.unidades[i].getId() == this.id) {
					return this.unidades[i];
				}
			}
			
		}
		return null;
	}
	
	/**
	 * Verifica a Existencia de outras unidades na dire�ao do movimento
	 */
	private void VerificaMapaPos() {
		int i = this.selecionado.GetCasasMovimento();//recebe como a unidade em questao anda pelo mapa
		//coordenadas da unidade a mover
		int y = this.selecionado.GetPosY();//posicao da coluna da matriz
		int x = this.selecionado.GetPosX();//posicao da linha da matriz
		

		
		/**************MOVIMENTO PARA CIMA *********************/
		if(this.direcao.equals("N")) {
			if((x-i) < 10 && (x-i) >= 0) {
					this.SetMovPos((x-i), y);
			}
			else {
				if(x-i< 0) {
					this.SetMovPos(0, y);
				}
			}
		}
		
		/**************MOVIMENTO PARA BAIXO *********************/
		else if(this.direcao.equals("S") == true) {
			System.out.println("Entro no ElseIF");
			if((x+i) < 10 && (x+i) >= 0) {
				this.SetMovPos(x+i, y);
			}
			else {
				if(i+x > 10) {
					this.SetMovPos(9, y);
				}
			}	
		}
		
		/**************MOVIMENTO PARA LADO ESQUERDO *********************/
		else if(this.direcao.equals("O")) {
			if((y-i) < 10 && (y-i) >= 0) {
				this.SetMovPos(x, y-i);
			}
			else {
				if(x-i < 0) {
					this.SetMovPos(x, 0);
				}
			}	
		}
		
		/**************MOVIMENTO PARA LADO DIREITO *********************/
		else if(this.direcao.equals("L")) {
			if((y+i) < 10 && (y+i) >= 0) {
				this.SetMovPos(x, (i+y));
			}
			else {
				if(i+x > 10) {
					this.SetMovPos(x, 9);
				}
			}	
		}
	}
	/*
	 * Esse metodo serve apenas para em certa posicao do mapa verificar se tem uma unidade
	 * e fazer as operacoes convenientes
	 */
	private void SetMovPos(int i, int j) {
		Aldeao aux; //caso haja uma unidade no mapa em determinada posicao essa variavel guarda
		String vazio ="-";
		
		if(this.Mapa[i][j].equals(vazio) == false) {
			this.id = this.getIDMapa(i, j);//transforma em inteiro
			aux = this.ExisteUnidade();//verifica se a unidade existe
			if(aux != null) {
				//nivel do personagem que esta na posicao e maior de quem esta sendo movido
				if(aux.getLevel() > this.selecionado.getLevel()) {
					if(this.ExcluirUnidade(this.selecionado.getId())) {
						System.out.println("Sua Unidade foi Excluida! H� uma unidade mais forte na posicao destino.");
					}
				}
				else {
					System.out.println("Movimento Inv�lido: A posicao esta ocupada por outra Unidade.");
				}
			}
			}

		else {
			this.selecionado.setFrente(this.direcao);
			//atualiza o Mapa
			this.Mapa[i][j] = "" + this.selecionado.getId() + this.selecionado.getTipoUnidade() + this.selecionado.GetFrente();
			this.Mapa[this.selecionado.GetPosX()][this.selecionado.GetPosY()] = "-";
			//atualiza a posicao da unidade
			this.selecionado.SetPosXY(i, j);
		}
	}
}
			
		
	