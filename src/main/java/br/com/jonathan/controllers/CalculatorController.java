package br.com.jonathan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.service.CalculatorService;

@RestController
public class CalculatorController {
	
	//TODO Criar testes unitários com a classe de serviço
	
	@Autowired
	CalculatorService calculatorService;
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		return calculatorService.sum(numberOne, numberTwo);
	}

	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		return calculatorService.subtration(numberOne, numberTwo);
	}

	@RequestMapping(value = "/multi/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multi(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		return calculatorService.multiplication(numberOne, numberTwo);
	}

	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		return calculatorService.division(numberOne, numberTwo);
	}

	@RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		return calculatorService.average(numberOne, numberTwo);
	}

	@RequestMapping(value = "/square/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) throws Exception {
		return calculatorService.squareRoot(number);
	}

}
