import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import geometria.*;
import utils.LeitorDeFigura;

/**
 * 
 * @author wellington 
 * Realiza o controle da leitura dos dados
 * Contém uma lista que armazena as formas geométricas lidas, 
 * lê um ponto qualquer, 
 * verifica se o ponto esta delimitado pela forma, 
 * e imprime o resultado
 */
public class Main {
	
	public static final int CIRCULO = 1;
	public static final int RETANGULO = 2;
	public static final int TRIANGULO = 3;
	
	public static void main( String args[] ){
		
		List<Forma> formas = new ArrayList<Forma>();
		Scanner entrada = new Scanner( System.in );
		LeitorDeFigura leitor = new LeitorDeFigura( entrada );
		
		while( entrada.hasNext() ){
			int tipoFigura = entrada.nextInt();
			Forma figura = null;
			
			switch( tipoFigura ) {
				case CIRCULO :
					figura = leitor.leCirculo(); break;
				case RETANGULO :
					figura = leitor.leRetangulo(); break;
				case TRIANGULO :
					figura = leitor.leTriangulo(); break;
			}
			
			Ponto2D ponto = leitor.lePonto();
			System.out.printf("Ponto (%.0f,%.0f) contido no %s: %b\n",ponto.x(),ponto.y(),figura.getNome(),figura.contemPonto( ponto ));
			
			formas.add( figura );
		}
		
		System.out.printf("\nTotal de formas lidas: %d\n",formas.size());

		for( Forma item: formas ){
			System.out.println(item);
		}
		
	}
}
