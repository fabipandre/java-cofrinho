package cofrinho.moeda;

public class Euro extends Moeda {
	
	private final static double cotacao = 6;

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
		return "Euro - " + super.getValor();
	}

}
