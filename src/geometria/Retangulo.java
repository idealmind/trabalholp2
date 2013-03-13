package geometria;
import java.lang.Float;

/**
 * Armazena uma forma retângulo, com seus vertices e suas informações
 * calcula a área e o perímetro do retângulo, e verifica se um ponto está delimitado pelo retângulo 
 * @author wellington
 *
 */
public class Retangulo
	implements Forma {
	private float base;
	private float altura;
	private Ponto2D vie;
	private Ponto2D vid;
	private Ponto2D vse;
	private Ponto2D vsd;
	
	public Retangulo( Ponto2D vie, Ponto2D vid, Ponto2D vse, Ponto2D vsd ){
		this.vie = vie;
		this.vid = vid;
		this.vse = vse;
		this.vsd = vsd;
		calculaDimensoes();
	}
	
	/**
	 * Calcula as dimensoes do retângulo e armazena o valor
	 */
	private void calculaDimensoes(){
		this.base = vid.x() - vid.x();
		this.altura = vsd.y() - vid.y();
	}
	
	/**
	 * Calcula a área do retângulo
	 */
	public double calculaArea(){
		return base * altura;
	}
	
	/**
	 * Calcula o perímetro do retângulo
	 */
	public double calculaLinha(){
		return 2 * ( base + altura );
	}
	
	/**
	 * Verifica se um ponto está delimitado pelo retângulo
	 */
	public boolean contemPonto( Ponto2D ponto ){
		
		boolean retorno = Float.compare(ponto.y(),vse.y()) < 0;
		if( retorno )
			retorno = Float.compare(ponto.y(),vie.y()) > 0;
		if( retorno )
			retorno = Float.compare(ponto.x(),vie.x()) > 0;
		if( retorno )
			retorno = Float.compare(ponto.x(),vid.x()) < 0;
		
		return retorno;
	}
	
	/**
	 * Retorna o nome da forma geométrica
	 */
	public String getNome(){
		return "retangulo";
	}
	
	/**
	 * Retorna as informações do objeto
	 */
	public String toString(){
		return String.format("Retangulo: Vertices: IE (%.0f,%.0f) ID (%.0f,%.0f) SE (%.0f,%.0f) SD (%.0f,%.0f) ",vie.x(),vie.y(),vid.x(),vid.y(),vse.x(),vse.y(),vsd.x(),vsd.y());
	}
}
