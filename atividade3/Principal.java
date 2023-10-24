package atividade3;

public class Principal {

	public static void main(String[] args) {
		
		Adicionar adc = new Adicionar();
		System.out.print("A soma dos números é: " + adc.somar(30, 50));
		
		Subtrair sbt = new Subtrair();
		System.out.print("A subtração dos números é: " + sbt.sub(68, 43));

		Calcular clr = new Calcular();
		System.out.print("A divisão dos números é: " + clr.div(70, 9));
		System.out.print("A multiplicação dos números é: " + clr.mult(6, 9));

		
		Expo expt = new Expo();
		System.out.print("A exponenciação dos números é: " + expt.exp(6, 5));

	}
}
