/*
CONVERSÃO IMPLÍCITA: Ocorre automaticamente quando convertemos
un tipo menor para um tipo maior
CONVERSÃO EXPLÍCITA: Precisamos fazer manualmente ao converter
um tipo maior para um tipo menor
 */
public class ConversoesEmJava {
    static void main(String[] args) {
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        String numeroString2 = "10";
        Integer numeroInteger2 = Integer.parseInt(numeroString2);

        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroString);
        System.out.println(numeroInteger2);
    }
}
