package br.com.project.calculator.resource;

public class calculatorServices {
	public static String serviAdd(Float num1, Float num2) {
		Float calculo = num1 + num2;
		String result = Float.toString(calculo);
		return result;
	}

	public static String serviSubtract(Float num1, Float num2) {
		Float calculo = num1 - num2;
		String result = Float.toString(calculo);
		return result;
	}

	public static String serviDivide(Float num1, Float num2) {
		Float calculo = num1 / num2;
		String result = Float.toString(calculo);
		return result;
	}

	public static String serviMultiply(Float num1, Float num2) {
		Float calculo = num1 * num2;
		String result = Float.toString(calculo);
		return result;
	}

}
