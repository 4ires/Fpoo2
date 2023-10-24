package atividade3;

public class Calcular implements Calculos {
	

	@Override
	public int div(int a, int b) {
		return a/b;
	}
	

	@Override
	public double mult(double a, double b) {
		return a*b;
	}


	@Override
	public double somar(double a, double b) {
		return 0;
	}


	@Override
	public double sub(double a, double b) {
		return 0;
	}

	@Override
	public int exp(int a, int b) {
		return 0;
	}
}
