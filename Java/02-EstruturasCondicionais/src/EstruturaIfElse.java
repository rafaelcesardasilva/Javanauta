public class EstruturaIfElse {
    static void main(String[] args) {
//        int idade = 15;
//
//        if (idade >= 18){
//            System.out.println("Você é maior de idade");
//        }else {
//            System.out.println("Você é menbor de idade");
//        }



        boolean temDinheiro = true;
        boolean temCartao = true;

        if(temDinheiro && temCartao){
            System.out.println("Pede um ifood e um zé delivery");
        }else if (temDinheiro || temCartao){
            System.out.println("Pede um ifood");
        }else {
            System.out.println("Não pede nada");        }
    }
}
