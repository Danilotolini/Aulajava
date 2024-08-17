package br.com.impacta.prateleiradigital.controle;

import java.util.Collections;
import java.util.List;

import br.com.impacta.prateleiradigital.negocio.Filme;
//import br.com.impacta.prateleiradigital.negocio.FiltroFilme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;
import br.com.impacta.prateleiradigital.utilitario.FilmesUtil;

/**
 * Representa o papel do controlador/coordenador para todos os fluxos de neg�cio relacionados ao filme.  
 */
public class FilmeController {
	
	FilmeDAO filmeDAO = new FilmeDAO();
	
	/**
	 * Adiciona um novo filme no cat�logo de filmes
	 * 
	 * @param titulo T�tulo do filme
	 * @param diretores Um ou mais diretores informados no formato de texto (virgula separando quando houver mais de um)
	 * @param nota Nota m�dia do filme. Deve estar entre 0 e 10 
	 * @param duracao Tempo de dura��o em minutos
	 * @param ano Ano de lan�amento do filme
	 * @param generos Um ou mais g�neros informados no formato de texto (virgula separando quando houver mais de um)
	 * @param numVotos N�mero de votos que o filme recebeu at� o momento do registro
	 * @param url URL de site que pode conter mais detalhes do filme, trailler, coment�rios, sinopse etc
	 * 
	 * @throws Exception Caso haja alguma falha no processo de inser��o de um novo filme no reposit�rio de dados 
	 * 
	 */
	public void criarFilme(String titulo, String diretores, double nota, int duracao, int ano, String generos, int numVotos, String url) throws Exception{
		Filme filme  = new Filme(titulo, diretores, nota, duracao, ano, generos, numVotos, url);
		filmeDAO.adicionar(filme);
	}
	
	/**
	 * Baseado nos dados informados como filtro, realiza a consulta na base de dados
	 * 
	 * @param tituloParcial Parte do titulo do filme. Sendo o padr�o informado fazendo parte de qualquer parte do texto do titulo original 
	 * @param genero Um dos generos em que o filme se enquadra
	 * @param anoInicial Ano representando o limite inferior (inclusive) do ano de lan�amento do filme. Valor maior que zero 
	 * @param anoFinal Ano representando o limite superior (inclusive) do ano de lan�amento do filme. Valor maior que o anoInicial
	 * 
	 * @return Filmes que atendem ao crit�rio
	 * @throws Exception Caso haja algum problema ao consultar o reposit�rio de filmes
	 */
	public List<Filme> consultarFilme(String tituloParcial, String genero, int anoInicial, int anoFinal) throws Exception{
	
		List<Filme> filmes = filmeDAO.consultar(tituloParcial,genero,anoInicial,anoFinal);
		
		return filmes;
	}
	
	/**
	 * Remove um filme do reposit�rio de dados
	 * 
	 * @param filme Filme que deve ser removido do reposit�rio de dados
	 * 
	 * @throws Exception Se o filme informado n�o puder ser removido 
	 */
	public void remover(Filme filme) throws Exception{
		if(filme != null){
			filmeDAO.remover(filme);
		}
	}
	
	/**
	 * Importa dados de filmes contidos num arquivo no formato .CSV informado como par�metro
	 * Cada linha do arquivo cont�m a informa��o que representa um novo filme 
	 * 
	 * @param Caminho completo do arquivo CSV
	 * 
	 * @throws Exception se os dados, por algum motivo, n�o puderem ser importados
	 * 
	 */
	public void importarFilmes(String nomeArquivo) throws Exception {
		List<Filme> filmes = FilmesUtil.extrairFilmesFromFile(nomeArquivo);
		filmeDAO.importar(filmes);
		
	}
	
	
	/**
	 * A partir dos par�metros de sorteio informados seleciona de forma aleat�ria um filme dentro dos 
	 * crit�rios informados.
	 * 
	 * @param genero Genero do filme e
	 * @param diretor Diretor ou um dos diretores do filme
	 * @param notaMinima A menor nota que deve ser considerada no filtro. Se menor ou igual a zero considerar todas notas
	 * @param numeroVotosMinimo Quantidade de votos m�nimo para considerar no filtro. Representa o grau de confiabilidade. Se informado um valor menor ou igual a zero, considerar qualquer quantidade de votos

	 * @return Filme que atende aos crit�rios informados
	 * @throws Exception Caso haja algum problema no processo de sorteio de um filme do reposit�rio de dados
	 */
	public Filme sortear(String genero, String diretor, double notaMinima, int numeroVotosMinimo) throws Exception {
		//TODO consulta filmes que se encaixem no crit�rio ou parametros informados
	
		List<Filme> filmes = filmeDAO.consultar(genero,diretor,notaMinima,numeroVotosMinimo);
		Collections.shuffle(filmes);
		
		return filmes.get(0);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
