package utils;

import geometria.*;
import java.util.Scanner;
/**
 * 
 * @author wellington
 * Realiza a leitura das formas geométricas, armazenando os pontos 2D no plano
 */
public class LeitorDeFigura {
	/**
	 * objeto que faz a leitura de dados
	 */
	private Scanner entrada; 
	
	public LeitorDeFigura( Scanner entrada ){
		this.entrada = entrada;
	}
	
	/**
	 * Lê os pontos de um círculo: raio e centor
	 * @return object Circulo
	 */
	public Forma leCirculo(){
		int raio = entrada.nextInt();
		Ponto2D centro = lePonto();
		return new Circulo( raio, centro );
	}
	
	/**
	 * Lê os pontos de um retângulo: seus vértices (os lados devem ser paralelos aos eixos do plano) 
	 * @return object Retangulo
	 */
	public Retangulo leRetangulo() {
		
		Ponto2D pontoInfEsq = lePonto();
		Ponto2D pontoInfDir = lePonto();
		Ponto2D pontoSupEsq = lePonto();
		Ponto2D pontoSupDir = lePonto();
		
		return new Retangulo(pontoInfEsq, pontoInfDir, pontoSupEsq, pontoSupDir);
	}
	
	/**
	 * Lê um ponto qualquer no plano
	 * @return object Ponto2D
	 */
	public Ponto2D lePonto(){
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		return new Ponto2D( x, y );
	}
}
