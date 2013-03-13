package utils;

import geometria.*;
import java.util.Scanner;

public class LeitorDeFigura {
	
	private Scanner entrada; 
	
	public LeitorDeFigura( Scanner entrada ) {
		this.entrada = entrada;
	}
		
	public Forma leCirculo() {
		
		int raio = entrada.nextInt();
		Ponto2D centro = lePonto();
		return new Circulo( raio, centro );
	}
	
	public Retangulo leRetangulo() {
		
		Ponto2D pontoInfEsq = lePonto();
		Ponto2D pontoInfDir = lePonto();
		Ponto2D pontoSupEsq = lePonto();
		Ponto2D pontoSupDir = lePonto();
		
		return new Retangulo(pontoInfEsq, pontoInfDir, pontoSupEsq, pontoSupDir);
	}
	
	public Triangulo leTriangulo() {
		
		Ponto2D verticeA = lePonto();
		Ponto2D verticeB = lePonto();
		Ponto2D verticeC = lePonto();
			
		return new Triangulo(verticeA, verticeB, verticeC);
	}
	
	public Ponto2D lePonto() {
		
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		
		return new Ponto2D(x,y);
	}
}
