package geometria;
import java.lang.Math;

/**
 * Armazena uma forma círculo, com raio, centro e suas informações
 * calcula a área do círculo, o perímetro e verifica se um ponto está delimitado pelo círculo 
 * @author wellington
 * 
 */
public class Circulo 
	implements Forma {
		public double pi = Math.PI;
		private int raio;
		private Ponto2D centro;
		
		public Circulo( int raio, Ponto2D centro ){
			this.raio = raio;
			this.centro = centro;
		}

		/**
		 * Calcula a área do círculo
		 */
		public double calculaArea(){
			return pi * raio * raio;
		}
		
		/**
		 * calcula o perímetro do circulo
		 */
		public double calculaLinha(){
			return 2 * pi * raio;
		}
		
		/**
		 * verifica se um ponto está delimitado pelo círculo
		 */
		public boolean contemPonto( Ponto2D ponto ){
			return ( ponto.distancia( ponto, centro ) <= raio );
		}
		
		/**
		 * Retorna o nome da figura em formato padrão
		 */
		public String getNome(){
			return "circulo";
		}
		
		/**
		 * Retorna as informações do objeto
		 */
		public String toString(){
			return String.format("Circulo: Raio %d, centro (%.0f,%.0f)",raio,centro.x(),centro.y());
		}
}
