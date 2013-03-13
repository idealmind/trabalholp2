package geometria;

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
	
	private void calculaDimensoes(){
		this.base = vid.x() - vid.x();
		this.altura = vsd.y() - vid.y();
	}
	
	public double calculaArea(){
		return base * altura;
	}
	
	public double calculaLinha(){
		return 2 * ( base + altura );
	}
	
	public boolean contemPonto( Ponto2D ponto ){
		return ( ponto.x() > vie.x() && ponto.x() < vid && ponto.y() < vsd && ponto.y() > vid );
	}
	
	public String getNome(){
		return "retangulo";
	}
}
