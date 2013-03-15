package geometria;
import java.lang.Float;

public class Retangulo implements Forma {
	
	private float base;
	private float altura;
	private Ponto2D vie;
	private Ponto2D vid;
	private Ponto2D vse;
	private Ponto2D vsd;
	
	public Retangulo( Ponto2D vie, Ponto2D vid, Ponto2D vse, Ponto2D vsd ) {
		
		this.vie = vie;
		this.vid = vid;
		this.vse = vse;
		this.vsd = vsd;
		this.base = vid.x() - vie.x();
		this.altura = vsd.y() - vid.y();
	}
	
	public double calculaArea() {
		return this.base * this.altura;
	}
	
	public double calculaLinha() {
		return 2 * ( base + altura );
	}
	
	public boolean contemPonto( Ponto2D ponto ) {
		
		boolean retorno = Float.compare(ponto.y(),vse.y()) < 0;
		
		if( retorno )
			retorno = Float.compare(ponto.y(),vie.y()) > 0;
		if( retorno )
			retorno = Float.compare(ponto.x(),vie.x()) > 0;
		if( retorno )
			retorno = Float.compare(ponto.x(),vid.x()) < 0;
		
		return retorno;
	}
	
	public String getNome() {
		return "retangulo";
	}
	
	
	public String toString() {
		return String.format("Retangulo: Vertices: IE (%.0f,%.0f) ID (%.0f,%.0f) SE (%.0f,%.0f) SD (%.0f,%.0f), Area: %.1f, Linha: %.1f",vie.x(),vie.y(),vid.x(),vid.y(),vse.x(),vse.y(),vsd.x(),vsd.y(), calculaArea(), calculaLinha() );
	}
}
