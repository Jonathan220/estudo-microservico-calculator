package br.com.jonathan.service;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.jonathan.exception.UnsupportedMathOperationException;

public class CalculatorServiceTest {
	
	private CalculatorService calculatorService;
	
	@Rule
    public ExpectedException expectException = ExpectedException.none(); 

	
	@Before
	public void setup() {
		calculatorService = new CalculatorService();
	}
	
	@Test
	public void deveSomarDoisValoresComSucesso() {
		//Cenario
		String numberOne = "2.0";
		String numberTwo = "2.0";
		
		
		//Ação
		Double resultado = calculatorService.sum(numberOne, numberTwo);
		
		//Verificação
		Assert.assertThat(resultado, is(4.0));
	}
	
	@Test
	public void deveSubtrairDoisValoresComSucesso() {
		//cenario
		String numberOne = "3.0";
		String numberTwo = "1.0";
		
		//ação
		Double resultado = calculatorService.subtration(numberOne, numberTwo);
		
		//Verificação
		Assert.assertThat(resultado, is(2.0));
	}
	
	@Test
	public void deveMultiplicarDoisValoresComSucesso() {
		//cenario
		String numberOne = "2.0";
		String numberTwo = "2.0";
		
		//ação
		Double resultado = calculatorService.multiplication(numberOne, numberTwo);
		
		//verificação
		Assert.assertThat(resultado, is(4.0));
	}
	
	@Test
	public void deveDividirDoisValoresComSucesso() {
		//cenario
		String numberOne = "2.0";
		String numberTwo = "2.0";
		
		//ação
		Double resultado = calculatorService.division(numberOne, numberTwo);
		
		//verificação
		Assert.assertThat(resultado, is(1.0));
	}
	
	@Test
	public void deveMedirAMediaDeDoisValoresComSucesso() {
		//cenario
		String numberOne = "4.0";
		String numberTwo = "2.0";

		//ação
		Double resultado = calculatorService.average(numberOne, numberTwo);
		
		//verificação
		Assert.assertThat(resultado, is(3.0));
	}
	
	@Test
	public void deveMedirARaizQuadradaDeUmValorComSucesso() {
		//cenario
		String number = "4.0";
		
		//ação
		Double resultado = calculatorService.squareRoot(number);
		
		//verificação
		Assert.assertThat(resultado, is(2.0));
	}
	
	@Test
	public void deveLancarExcecaoQuandoForUmValorInvalido() throws UnsupportedMathOperationException{
		//cenario
		String numberOne = "a";
		String numberTwo = "2.0";
		
		expectException.expect(UnsupportedMathOperationException.class);
		expectException.expectMessage("please set a numeric value!");
		
		calculatorService.sum(numberOne, numberTwo);
	}
	
	
}
