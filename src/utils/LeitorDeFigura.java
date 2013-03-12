package utils;

import geometria.*;
import java.util.Scanner;

public class LeitorDeFigura {
	private Scanner entrada; 
	
	public LeitorDeFigura( Scanner entrada ){
		this.entrada = entrada;
	}
	
	public Forma leCirculo(){
		int raio = entrada.nextInt();
		Ponto2D centro = lePonto();
		return new Circulo( raio, centro );
	}
	
	public Ponto2D lePonto(){
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		return new Ponto2D( x, y );
	}
}
