package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;


public class CalculadoraJUNITtest{
	@SuppressWarnings("deprecation")
	@Test
	//Cenário de teste 1: soma de dois valores positivos ()
	public void SomarDoisNumerosPositivos() {
		calculadora calc = new calculadora();
		int soma = calc.somar(3,7);
		Assert.assertEquals(10, soma);
	}
    //Cenário de teste 2: soma de dois valores Negativos
	public void SomarDoisNumerosNegativos() {
		calculadora calc = new calculadora();
		int soma = calc.somar(-3,-7);
		Assert.assertEquals(-10, soma);
	}
    //Cenário de teste 3: soma de dois valores, um posito e um negativo
	public void SomarDoisNumerosnegativoepositivo() {
		calculadora calc = new calculadora();
		int soma = calc.somar(-3,7);
		Assert.assertEquals(4, soma);
	}
    //Cenário de teste 4: soma de um valor com zero
	public void SomarValorcomZero() {
		calculadora calc = new calculadora();
		int soma = calc.somar(3,0);
		Assert.assertEquals(3, soma);
	}

    //Cenário de teste 5: soma de dois zeros
	public void SomarDoisZeros() {
		calculadora calc = new calculadora();
		int soma = calc.somar(0,0);
		Assert.assertEquals(0, soma);
	}

    //Cenário de teste 6: subtração de dois valores positivos 
	public void SubtrairDoisNumerosPositivos() {
		calculadora calc = new calculadora();
		int subtrair = calc.subtrair(3,7);
		Assert.assertEquals(-4, subtrair);
	}

    //Cenário de teste 7: subtração de dois valores Negativos
	public void SubtrairDoisNumerosNegativos() {
		calculadora calc = new calculadora();
		int subtrair = calc.subtrair(-3,-7);
		Assert.assertEquals(4, subtrair);
	}

    //Cenário de teste 8: subtração de dois valores, um posito e um negativo
	public void SubtrairDoisValoresPositivoNegativo() {
		calculadora calc = new calculadora();
		int subtrair = calc.subtrair(-3,7);
		Assert.assertEquals(-10, subtrair);
	}

    //Cenário de teste 9: subtração de um valor com zero
	public void SubtrairComZero() {
		calculadora calc = new calculadora();
		int subtrair = calc.subtrair(-3,0);
		Assert.assertEquals(-3, subtrair);
	}

    //Cenário de teste 10: subtração de zero por um valor
	public void SubtrairZeroporValor() {
		calculadora calc = new calculadora();
		int subtrair = calc.subtrair(0,-7);
		Assert.assertEquals(-7, subtrair);
	}

    //Cenário de teste 11: subtração de dois zeros
	public void SubtrairDoisZeros() {
		calculadora calc = new calculadora();
		int subtrair = calc.subtrair(0,0);
		Assert.assertEquals(0, subtrair);
	}

    //Cenário de teste 12: multiplicação de dois valores positivos
	public void MultiplicarPositivos() {
		calculadora calc = new calculadora();
		int multiplicar = calc.multiplicar(3,7);
		Assert.assertEquals(21, multiplicar);
	}

    //Cenário de teste 13: multiplicação de dois valores negativos
	public void MultiplicarNegativos() {
		calculadora calc = new calculadora();
		int multiplicar = calc.multiplicar(-3,-7);
		Assert.assertEquals(21, multiplicar);
	}

    //Cenário de teste 14: multiplicação de um valor positivo e um negativo
	public void MultiplicarPositivoComNegativos() {
		calculadora calc = new calculadora();
		int multiplicar = calc.multiplicar(3,-7);
		Assert.assertEquals(-21, multiplicar);
	}

    //Cenário de teste 15: multiplicação de um valor com zero
	public void MultiplicarValorComZero() {
		calculadora calc = new calculadora();
		int multiplicar = calc.multiplicar(3,0);
		Assert.assertEquals(0, multiplicar);
	}

    //Cenário de teste 16: multiplicação de dois zeros
	public void MultiplicarZeros() {
		calculadora calc = new calculadora();
		int multiplicar = calc.multiplicar(0,0);
		Assert.assertEquals(0, multiplicar);
	}

    //Cenário de teste 17: divisão de dois valores positivos
	public void DividirPositivos() {
		calculadora calc = new calculadora();
		float dividir = calc.dividir(6,2);
		Assert.assertEquals(3, dividir, 1);
	}

    //Cenário de teste 18: divisão de dois valores negativos
	public void DividirNegativos() {
		calculadora calc = new calculadora();
		float dividir = calc.dividir(-6,-2);
		Assert.assertEquals(3, dividir, 1);
	}

    //Cenário de teste 19: divisão de um valor positivo por um negativo
	public void DividirPositivoPorNegativo() {
		calculadora calc = new calculadora();
		float dividir = calc.dividir(6,-2);
		Assert.assertEquals(-3, dividir, 1);
	}

    //Cenário de teste 20: divisão de um valor negativo por um positivo
	public void DividirNegativoPorPositivo() {
		calculadora calc = new calculadora();
		float dividir = calc.dividir(-6,2);
		Assert.assertEquals(-3, dividir, 1);
	}

    //Cenário de teste 21: divisão de um valor por zero
	public void DividirPorZero() {
		calculadora calc = new calculadora();
		float dividir = calc.dividir(6,0);
		Assert.assertEquals(1, dividir, 1);
	}

    //Cenário de teste 22: divisão de zero por um valor
	public void DividirZeroPorValor() {
		calculadora calc = new calculadora();
		float dividir = calc.dividir(0,2);
		Assert.assertEquals(0, dividir, 1);
	}
    
}