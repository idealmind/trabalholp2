package geometria;
import java.lang.Math;

public class Circulo  implements Forma {
	
		public double pi = Math.PI;
		private int raio;
		private Ponto2D centro;
		
		public Circulo( int raio, Ponto2D centro ) {
			
			this.raio = raio;
			this.centro = centro;
		}
		
		public double calculaArea() {
			return pi * raio * raio;
		}
				
		public double calculaLinha() {
			return 2 * pi * raio;
		}
				
		public boolean contemPonto( Ponto2D ponto ) {
			return ( ponto.distancia( ponto, centro ) <= raio );
		}
				
		public String getNome() {
			return "circulo";
		}
				
		public String toString() {
			return String.format("Circulo: Raio %d, centro (%.0f,%.0f)",raio,centro.x(),centro.y());
		}
}
