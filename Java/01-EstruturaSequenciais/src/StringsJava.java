/*
Uma String em Java é uma sequencia de caracteres
Strings são usadas para armazenar e manipular texto.
 */
public class StringsJava {
    static void main(String[] args) {
        String nome = "Joana";
        String nomeDois = "Mateus";
        String sobrenome = "da Silva";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);
        String nomeCompleto = nome.concat(sobrenome);
        
        System.out.println("Olá "+ nome.toUpperCase());
        System.out.println("Tamanho String: " + tamanhoString);
        System.out.println("Nomes são iguais: "+ saoIguais);
        System.out.println("nomeCompleto: " + nomeCompleto);
        
    }
}
