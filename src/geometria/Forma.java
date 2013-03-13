package geometria;

/**
 * Interface das formas Geométricas
 * @author wellington
 *
 */
public interface Forma {
	double calculaArea();
	double calculaLinha();
	boolean contemPonto( Ponto2D ponto );
	String getNome();
}
