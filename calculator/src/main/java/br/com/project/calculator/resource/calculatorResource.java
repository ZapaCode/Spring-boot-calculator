package br.com.project.calculator.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculatorResource {
	@RequestMapping("/add/{value1}/{value2}")
	public String add(@PathVariable Float num1, @PathVariable Float num2) {
		String total = calculatorServices.serviAdd(num1, num2);
		return "Resultado da soma: " +total;
	}
	
	@RequestMapping("/subtract/{value1}/{value2}")
	public String subtract(@PathVariable Float value1, @PathVariable Float value2) {
		String total = calculatorServices.serviSubtract(value1, value2);		
		return "Resultado da subtração: " +total;
	}
	
	@RequestMapping("/divide/{value1}/{value2}")
	public String divide(@PathVariable Float num1, @PathVariable Float num2) {
		String total = calculatorServices.serviDivide(num1, num2);
		return "Resultado da divisão: " +total;
	}
	
	@RequestMapping("/multiply/{value1}/{value2}")
	public String multiply(@PathVariable Float num1, @PathVariable Float num2) {
		String total = calculatorServices.serviMultiply(num1, num2);
		return "Resultado da multiplicação: " +total;
	}
}
