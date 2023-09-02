package calculadora

public class CalculadoraTestes{
    public static void main(String [] args) {
        Calculadora calc = new Calculadora();

        //Cenário de teste 1: soma de dois valores positivos ()
        int conta = calc.somar(3,7);
        System.out.println(conta);

        //Cenário de teste 2: soma de dois valores Negativos
        int conta = calc.somar(-3,-7);
        System.out.println(conta);

        //Cenário de teste 3: soma de dois valores, um posito e um negativo
        int conta = calc.somar(-3,7);
        System.out.println(conta);

        //Cenário de teste 4: soma de um valor com zero
        int conta = calc.somar(0,7);
        System.out.println(conta);

        //Cenário de teste 5: soma de dois zeros
        int conta = calc.somar(0,0);
        System.out.println(conta);

        //Cenário de teste 6: subtração de dois valores positivos 
        int conta = calc.subtrair(3,7);
        System.out.println(conta);

        //Cenário de teste 7: subtração de dois valores Negativos
        int conta = calc.subtrair(-3,-7);
        System.out.println(conta);

        //Cenário de teste 8: subtração de dois valores, um posito e um negativo
        int conta = calc.subtrair(-3,7);
        System.out.println(conta);

        //Cenário de teste 9: subtração de um valor com zero
        int conta = calc.subtrair(7,0);
        System.out.println(conta);

        //Cenário de teste 10: subtração de zero por um valor
        int conta = calc.subtrair(0,7);
        System.out.println(conta);

        //Cenário de teste 11: subtração de dois zeros
        int conta = calc.subtrair(0,0);
        System.out.println(conta);

        //Cenário de teste 12: multiplicação de dois valores positivos
        int conta = calc.multiplicar(3,7);
        System.out.println(conta);

        //Cenário de teste 13: multiplicação de dois valores negativos
        int conta = calc.multiplicar(-3,-7);
        System.out.println(conta);

        //Cenário de teste 14: multiplicação de um valor positivo e um negativo
        int conta = calc.multiplicar(-3,7);
        System.out.println(conta);

        //Cenário de teste 15: multiplicação de um valor com zero
        int conta = calc.multiplicar(3,0);
        System.out.println(conta);

        //Cenário de teste 16: multiplicação de dois zeros
        int conta = calc.multiplicar(0,0);
        System.out.println(conta);

        //Cenário de teste 17: divisão de dois valores positivos
        float conta = calc.dividir(3,7);
        System.out.println(conta);

        //Cenário de teste 18: divisão de dois valores negativos
        float conta = calc.dividir(-3,-7);
        System.out.println(conta);

        //Cenário de teste 19: divisão de um valor positivo por um negativo
        float conta = calc.dividir(3,-7);
        System.out.println(conta);

        //Cenário de teste 20: divisão de um valor negativo por um positivo
        float conta = calc.dividir(-3,7);
        System.out.println(conta);

        //Cenário de teste 21: divisão de um valor por zero
        float conta = calc.dividir(3,0);
        System.out.println(conta);

        //Cenário de teste 22: divisão de zero por um valor
        float conta = calc.dividir(0,7);
        System.out.println(conta);

        //Cenário de teste 17: divisão de zero por zero
        float conta = calc.dividir(0,0);
        System.out.println(conta);
    }
}