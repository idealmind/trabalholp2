package geometria;
import geometria.Ponto2D;
/**
 * Armazena um vetor e realiza operaçoes sobre ele
 * @author wellington
 *
 */
public class Vetor2D {
	private Ponto2D pontoIni;
	private Ponto2D pontoFim;
	private Ponto2D pontoEquivalente;

	public Vetor2D(Ponto2D pontoIni, Ponto2D pontoFim) {
		this.pontoIni = pontoIni;
		this.pontoFim = pontoFim;

		this.pontoEquivalente = new Ponto2D(pontoFim.x() - pontoIni.x(), pontoFim.y() - pontoIni.y());
	}

	public Vetor2D(Ponto2D pontoEquivalente) {
		this.pontoIni = new Ponto2D(0,0);
		this.pontoFim = pontoEquivalente;
		this.pontoEquivalente = pontoEquivalente;
	}

	public double produtoVetorial(Vetor2D vetor) {
		vetor.getPontoEquivalente();
		// produto vetorial calculado em cima do objeto pontoEquivalente, da
		// classe Ponto2D de cada objeto do tipo Vetor2D envolvido
		return 0d;
	}

	public double produtoEscalar(Vetor2D vetor) {
		// produto vetorial calculado em cima do objeto pontoEquivalente, da
		// classe Ponto2D de cada objeto do tipo Vetor2D envolvido
		return 0d;
	}

	public Ponto2D getPontoIni() {
		return pontoIni;
	}

	public void setPontoIni(Ponto2D pontoIni) {
		this.pontoIni = pontoIni;
	}

	public Ponto2D getPontoFim() {
		return pontoFim;
	}

	public void setPontoFim(Ponto2D pontoFim) {
		this.pontoFim = pontoFim;
	}

	public Ponto2D getPontoEquivalente() {
		return pontoEquivalente;
	}

	public void setPontoEquivalente(Ponto2D pontoEquivalente) {
		this.pontoEquivalente = pontoEquivalente;
	}
}
