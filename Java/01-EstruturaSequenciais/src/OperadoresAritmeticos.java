public class OperadoresAritmeticos {
    static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDoasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDivido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDoasDoMes;

        System.out.println("Total: " + valorTotal);
        System.out.println("valor Mensal: " + valorTotalMensal);
        System.out.println("valor Divido: " + valorTotalDivido);
    }
}
