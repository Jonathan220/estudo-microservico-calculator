package br.com.jonathan.service;

import org.springframework.stereotype.Service;

import br.com.jonathan.exception.DividedByZeroException;
import br.com.jonathan.exception.UnsupportedMathOperationException;
import br.com.jonathan.utils.MathUtils;

@Service
public class CalculatorService {
	
	public Double sum(String numberOne, String numberTwo) throws UnsupportedMathOperationException{
		if(!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("please set a numeric value!");
		}
		return MathUtils.convertToDouble(numberOne) + MathUtils.convertToDouble(numberTwo);
	}
	
	public Double subtration(String numberOne, String numberTwo) {
		if(!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("please set a numeric value!");
		}
		return MathUtils.convertToDouble(numberOne) - MathUtils.convertToDouble(numberTwo);

	}
	
	public Double multiplication(String numberOne, String numberTwo) {
		if(!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("please set a numeric value!");
		}
		return MathUtils.convertToDouble(numberOne) * MathUtils.convertToDouble(numberTwo);
	}
	
	public Double division(String numberOne, String numberTwo){
		if(!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("please set a numeric value!");
		}
		
		if(MathUtils.convertToDouble(numberTwo) == 0) {
			throw new DividedByZeroException("please enter a number other than zero!");
		}
		
		return MathUtils.convertToDouble(numberOne) / MathUtils.convertToDouble(numberTwo);
	}
	
	public Double average(String numberOne, String numberTwo) {
		if(!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("please set a numeric value!");
		}
		return (MathUtils.convertToDouble(numberOne) + MathUtils.convertToDouble(numberTwo)) / 2;
	}
	
	public Double squareRoot(String number) {
		if(!MathUtils.isNumeric(number)) {
			throw new UnsupportedMathOperationException("please set a numeric value!");
		}
		return Math.sqrt(MathUtils.convertToDouble(number));
	}
}
