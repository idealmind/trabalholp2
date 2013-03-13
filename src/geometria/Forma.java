package geometria;

public interface Forma {
	
	public double calculaArea();
	
	public double calculaLinha();
	
	public boolean contemPonto(Ponto2D ponto);
	
	public String getNome();
}
