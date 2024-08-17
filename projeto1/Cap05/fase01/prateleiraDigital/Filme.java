package projeto1.Cap05.fase01.prateleiraDigital;

import javax.swing.JOptionPane;
public class Filme {
		private String titulo, diretores;
		private double nota;
		private int duracao , numVotos, ano;
		private String generos, url;
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDiretores() {
			return diretores;
		}
		public void setDiretores(String diretores) {
			this.diretores = diretores;
		}
		public double getNota() {
			return nota;
		}
		public void setNota(double nota) {
			if(nota>=0 && nota<=10)
				this.nota = nota;
			else
				JOptionPane.showMessageDialog(null, 
				"Nota INVÁLIDA! \nA nota deve estar entre 0 e 10");
		}
		public int getDuracao() {
			return duracao;
		}
		public void setDuracao(int duracao) {
			this.duracao = duracao;
		}
		public int getNumVotos() {
			return numVotos;
		}
		public void setNumVotos(int numVotos) {
			this.numVotos = numVotos;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public String getGeneros() {
			return generos;
		}
		public void setGeneros(String generos) {
			this.generos = generos;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
}