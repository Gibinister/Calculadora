package calculadora;

/**
 * A classe calculadora é reponsavel de fazer as operações matematicas basicas
 * @author Gabriel Verlangieri de Souza
 */

public class calculadora {

     /**
     * somar recebe duas variaveis, a e b, e soma elas
     * @param a é o numero que será somado
     * @param b é o numero que irá somar a
     * @return int este será o retorno do calculo
     */
    
    public int somar(int a, int b) {
        return a + b;
    }

     /**
     * somar recebe duas variaveis, a e b, e subtrai elas
     * @param a é o numero que será subtraido
     * @param b é o numero que irá subtrair a
     * @return int este será o retorno do calculo
     */
    
    public int subtrair(int a,int b){
        return a - b;
    }

    /**
     * somar recebe duas variaveis, a e b, e multiplica elas
     * @param a é o numero que será multiplicado
     * @param b é o numero que irá multiplicar a
     * @return int este será o retorno do calculo
     */
    
    public int multiplicar(int a,int b){
        return a * b;
    }

    /**
     * somar recebe duas variaveis, a e b, e soma elas
     * @param a é o numero que será dividido
     * @param b é o numero que irá dividir a
     * @return float este será o retorno do calculo
     */
    
    public float dividir(float a,float b){
        return a / b;
    }
}
