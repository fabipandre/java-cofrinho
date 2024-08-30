package cofrinho.moeda;

public class Dolar extends Moeda {
	
	private final static double cotacao = 5.5;

	@Override
	public void info() {
		System.out.println(this.toString());
	}

	@Override
	public double converter() {
		return super.getValor() * cotacao;
	}
	
	@Override
	public String toString() {
		return "Dolar - " + super.getValor();
	}
}
