package cofrinho.moeda;

public class Real extends Moeda {

	@Override
	public void info() {
		System.out.println(this.toString());
	}

	@Override
	public double converter() {
		return super.getValor();
	}
	
	@Override
	public String toString() {
		return "Real - " + super.getValor();
	}
}
