package segundoPeriodo.ecommerce_agregacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppEcommerce {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("15/10/2020");
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            menuOpçoes();
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    incluirProdutos();
                    break;
                case 2:

                    if (!(Carrinho.getListaProdutos().isEmpty())){

                    }else {
                        System.out.println("Não existe produto(s) incluso(s) no carrinho!");
                    }
                    break;
                case 3:
                    if (!(Carrinho.getListaProdutos().isEmpty())){
                        Carrinho carrinho = new Carrinho(1,data,Carrinho.getListaProdutos());
                        System.out.println(carrinho);
                        System.out.println(Carrinho.listaProdutos);
                    }else {
                        System.out.println("Não existe produto(s) incluso(s) no carrinho!");
                    }
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Opção invalida!");
                break;
            }
        }while (opcao !=0);
    }


    static void menuOpçoes(){
        System.out.println("\n1 - Inserir produto no Carrinho");
        System.out.println("2 - Confirmar Venda");
        System.out.println("3 - Lista Venda");
        System.out.println("0 - Sair");
        System.out.print("Entre com a Poção: ");
    }

    static void incluirProdutos(){
        Produto produto = new Produto("Heineken", 10.00f,1f);
        Carrinho.inserirItem(produto);
        produto = new Produto("Carne", 100f,12f);
        Carrinho.inserirItem(produto);
        produto = new Produto("Sal", 5f,18f);
        Carrinho.inserirItem(produto);
        produto = new Produto("Cigarro", 15f,30f);
        Carrinho.inserirItem(produto);
    }
}
