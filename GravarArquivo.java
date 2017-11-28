package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GravarArquivo {
	private Aldeao[] unidades;
	/**
	 *
                   * @param Vetor
	 */
	public void gravarArquivo( Aldeao[] Vetor) {
		this.Gravar();

	}

	public void LerArquivo() {
		this.Ler();
	}
        
                
	// apagar esse metodo, s� para testes
	private void IMPRIME() {

		System.out.println("Vetor Aldeoes ");
		for (Aldeao unidades2 : this.unidades) {
			System.out.println(unidades2);
		}
	}
        

	private void Gravar() {

		File arquivo = new File(nomeArquivo + ".dat");

		try {
			FileOutputStream fout = new FileOutputStream(arquivo);
			ObjectOutputStream objGravar = new ObjectOutputStream(fout);
			objGravar.writeObject(this.unidades);
			objGravar.flush();
			objGravar.close();
			fout.close();
		} catch (Exception ex) {
			System.err.println("Erro : " + ex.toString());
		}
	}

	private void Ler() {
		File arquivo = new File(nomeArquivo + ".dat");
		try {
			FileInputStream fin = new FileInputStream(arquivo);
			ObjectInputStream oin = new ObjectInputStream(fin);

			Aldeao[] Salvo = (Aldeao[]) oin.readObject();
			oin.close();
			fin.close();
			for (Aldeao unidade : Salvo) {
				System.out.println(unidade);
			}

		} catch (Exception ex) {
			System.err.println("erro:" + ex.toString());
		}
	}

}
