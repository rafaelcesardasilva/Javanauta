import java.util.Scanner;

/*
SAIDA DE DADOS
System.out.print() -> Imprime sem pular linha;
System.out.println() -> imprime e pula para a próxima linha
System.out.printf() -> imprime formatado
ENTRADA DE DADOS
Usamos a classe Scanner para ler dados do teclado.
 */
public class EntradaSaidaDados {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        scanner.close();
    }
}
