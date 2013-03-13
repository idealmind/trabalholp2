package geometria;

/**
 * Armazena um ponto 2D
 * @author wellington
 *
 */
public class Ponto2D {
	private float x;
	private float y;
	
	public Ponto2D( float x, float y ){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * retorna a coordenada x do ponto
	 * @return float x
	 */
	public float x(){
		return x;
	}
	
	/**
	 * retorna a coordenada y do ponto
	 * @return float y
	 */
	public float y(){
		return y;
	}
	
	/**
	 * Calcula a distância entre dois pontos
	 * @param pontoA
	 * @param pontoB
	 * @return double distancia
	 */
	public double distancia( Ponto2D pontoA, Ponto2D pontoB ){
		return Math.sqrt( Math.pow( pontoB.x() - pontoA.x(), 2 ) + Math.pow( pontoB.y() - pontoA.y(), 2 ) );
	}
}