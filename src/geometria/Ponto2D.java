package geometria;

public class Ponto2D {
	private float x;
	private float y;
	
	public Ponto2D( float x, float y ){
		this.x = x;
		this.y = y;
	}
	
	public float x(){
		return x;
	}
	
	public float y(){
		return y;
	}
	
	public double distancia( Ponto2D pontoA, Ponto2D pontoB ){
		return Math.sqrt( Math.pow( pontoB.x() - pontoA.x(), 2 ) + Math.pow( pontoB.y() - pontoA.y(), 2 ) );
	}
}