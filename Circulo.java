import java.lang.Math;

public class Circulo 
	implements Forma {
		public double pi = Math.PI;
		private int raio;
		private int centrox;
		private int centroy;
		
		
		public Circulo( int raio, int centrox, int centroy ){
			this.raio = raio;
			this.centrox = centrox;
			this.centroy = centroy;
		}

		public double calculaArea(){
			return this.pi * this.raio * this.raio;
		}
		
		public double calculaLinha(){
			return 2 * this.pi * this.raio;
		}
		
		public boolean contemPonto( Ponto2D ponto ){
			double distancia = Math.sqrt( Math.pow( ponto.x - this.centrox, 2 ) + Math.pow( ponto.y - this.centroy, 2 ) );
			return ( distancia <= this.raio );
		}
		
		public String toString(){
			return "Círculo: Raio "+ this.raio +", centro ("+this.centrox+","+this.centroy+")";
		}
}
