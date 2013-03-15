package geometria;
import java.lang.Math;

public class Triangulo implements Forma {
	
	private double ladoA, ladoB, ladoC;
	private Ponto2D verticeA, verticeB, verticeC;
	
	public Triangulo (Ponto2D verticeA, Ponto2D verticeB, Ponto2D verticeC) {
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
		this.ladoA = this.verticeA.distancia(this.verticeA, this.verticeB);
		this.ladoB = this.verticeB.distancia(this.verticeB, this.verticeC);
		this.ladoC = this.verticeC.distancia(this.verticeA, this.verticeC);
	}
	
	public double calculaArea() {
		
		int dp1 = (int) (verticeA.x() * verticeB.y() * 1);
		int dp2 = (int) (verticeA.y() * 1 * verticeC.x());
		int dp3 = (int) (1 * verticeB.x() * verticeC.y());
		int somadp = dp1 + dp2 + dp3;

		int ds1 = (int) (1 * verticeB.y() * verticeC.x());
		int ds2 = (int) (verticeA.x() * 1 * verticeC.y());
		int ds3 = (int) (verticeA.y() * verticeB.x() * 1);
		int somads = ds1 + ds2+ ds3;

		int determinante = somadp - somads;
		
		determinante = determinante >= 0 ? determinante : determinante*(-1);
		
		return determinante / 2;
	}
	
	public double calculaLinha() {
		return (this.ladoA + this.ladoB + this.ladoC);	
	}
	
	public boolean contemPonto(Ponto2D ponto) {
		
		boolean A, B, C;
		
		A = (this.verticeA.x() - ponto.x()) * (this.verticeB.y() - ponto.y()) - (this.verticeB.x() - ponto.x()) * (this.verticeA.y() - ponto.y()) > 0.0f;
		B = (this.verticeB.x() - ponto.x()) * (this.verticeC.y() - ponto.y()) - (this.verticeC.x() - ponto.x()) * (this.verticeB.y() - ponto.y()) > 0.0f;
		
		if (A != B) {
			return false;
		}
		
		C = (this.verticeC.x() - ponto.x()) * (this.verticeA.y() - ponto.y()) - (this.verticeA.x() - ponto.x()) * (this.verticeC.y() - ponto.y()) > 0.0f;
		
		return (A == C);
	}
	
	public String getNome() {
		return "triangulo";
	}
	
	public String toString() {
		return String.format("Triangulo: Vertices: (%.0f,%.0f) (%.0f,%.0f) (%.0f,%.0f), Area: %.1f, Linha: %.1f",this.verticeA.x(), this.verticeA.y(), this.verticeB.x(), this.verticeB.y(), this.verticeC.x(), this.verticeC.y(), calculaArea(), calculaLinha() );
	}
	

}
