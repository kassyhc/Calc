package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 1.3+8.7 = 10")
	void testSum() {
		 Calculadora calc = new Calculadora();
		 double valor1 = 1.3D;
		 double valor2 = 8.7D;
		 double esperado = 10D;
		 
		 double resultado = calc.sum(valor1, valor2);
		 
		 assertEquals(esperado,resultado, " 5 + 5 não gerou o valor 10");
				 			
	}
	@Test
	@DisplayName("Teste 8-7 = 1")
	void testSub() {
		 Calculadora calc = new Calculadora();
		 double valor1 = 8D;
		 double valor2 = 7D;
		 double esperado = 1D;
		 
		 double resultado = calc.sub(valor1, valor2);
		 
		 assertEquals(esperado,resultado, " 8.7 - 1.7 não gerou o valor 7");
				 			
	}
	@Test
	@DisplayName("Teste 1.3*10 = 13")
	void testMulti() {
		 Calculadora calc = new Calculadora();
		 double valor1 = 1.3D;
		 double valor2 = 10D;
		 double esperado = 13D;
		 
		 double resultado = calc.multi(valor1, valor2);
		 
		 assertEquals(esperado,resultado, " 1.3 . 10 não gerou o valor 13");
				 			
	}
	@Test
	@DisplayName("Teste 10/2 = 5")
	void testDiv() {
		 Calculadora calc = new Calculadora();
		 double valor1 = 10D;
		 double valor2 = 2D;
		 double esperado = 5;
		 
		 double resultado = calc.div(valor1, valor2);
		 
		 assertEquals(esperado,resultado, " 10/2 não gerou o valor 10");
				 			
	}

}
