package Projeto.Cap15.fase03.impacta.prateleiradigital.persistencia;

import java.util.ArrayList;
import java.util.List;

import Projeto.Cap15.fase03.impacta.prateleiradigital.negocio.Filme;

/**
 * Representa a classe que realiza o procedimento de mapeamento objeto-relacional da classe Filme 
 */
public class FilmeDAO {

	/**
	 * Adiciona um novo filme no reposit�rio de dados
	 * 
	 * @param filme Encapsula os dados do filme que ser� adicionado ao reposit�rio de dados
	 * 
	 * @throws Exception Se alguma falha de acesso ao banco de dados ocorrer
	 */
	public void adicionar(Filme filme) throws Exception {
		//TODO C�digo para inserir um novo filme na base de dados 
	}

	/**
	 * Realiza uma consulta no reposit�rio de dados baseado no objeto filtro informado no par�metro
	 * 
	 * @param tituloParcial Parte do titulo do filme. Sendo o padr�o informado fazendo parte de qualquer parte do texto do titulo original 
	 * @param genero Um dos generos em que o filme se enquadra
	 * @param anoInicial Ano representando o limite inferior (inclusive) do ano de lan�amento do filme. Valor maior que zero 
	 * @param anoFinal Ano representando o limite superior (inclusive) do ano de lan�amento do filme. Valor maior que o anoInicial
	 * 
	 * @return Filme que atende crit�rios 
	 * 
	 * @throws Caso alguma falha no acesso aos dados ocorrer
	 */
	public List<Filme> consultar(String tituloParcial, String genero, int anoInicial, int anoFinal) throws Exception {
		// TODO Inserir C�digo para consultar o filme baseado no filtro informado
		return listaFilmeFake(4);
	}
	
	/**
	 * Executa a a��o de remover o filme do reposit�rio de dados.
	 * 
	 * @param filme Filme inst�ncia do filme que deve ser removido do reposit�rio
	 * 
	 * @throws Caso alguma falha no acesso aos dados ocorra
	 */
	public void remover(Filme filme) throws Exception{
		// TODO C�digo para remo��o do filme informado como par�metro
	}
	
	/**
	 * 
	 * @param genero G�nero desejado 
	 * @param diretor Diretor ou um dos diretores do filme 
	 * @param notaMinima Nota m�nima para ser considerada na busca
	 * @param numeroVotosMinimo N�mero minimo de votos desejado 

	 * @return Filme que atende aos crit�rios informados
	 * 
	 * @throws Exception se alguma falha no acesso aos dados ocorrer
	 */
	public List<Filme> consultar(String genero, String diretor, double notaMinima, int numeroVotosMinimo) throws Exception{
		// TODO Gerar a busca baseada nas informa��es do par�metro
		return listaFilmeFake(3);
	}
	
	
	//TODO remover este metodo ap�s implementa��o do acesso a dados
	private List<Filme> listaFilmeFake(int size) {
		
		List<Filme> filmes = new ArrayList<>();
		
		for(int i=0; i<size; i++) {
			Filme f = new Filme("Filme-"+i,"diretor-"+i,10,100,2017,"genero-"+i,100_000,"http://impacta.com.br");
			filmes.add(f);
		}
		
		return filmes;
	}



}
