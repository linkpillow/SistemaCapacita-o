package aplicacao;

import entidades.Produto;
import entidades.ServidorPublico;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela seu boy chegou");
//
//        isabela.setSalario(10000);
//        isabela.setValorHora(400);
//
//        System.out.println("o valor total recebido por isabela pelas suas horas extras trabalhadas é de " + isabela.calcularSalarioHorasExtras(20, 30));
//        System.out.println("o salário bruto total recebido por isabela ao final do mês é de " + isabela.calcularSalarioTotal());
        Produto produto = new Produto();
        Scanner sc =  new Scanner(System.in);
        System.out.println("digite as informações do produto: ");
        System.out.print("Nome: ");
        produto.setNome(sc.next());
        System.out.print("Preço: ");
        produto.setPreco(sc.nextDouble());
        System.out.print("quantidade: ");
        produto.setQuantidadeEstoque(sc.nextInt());

        System.out.println("informações do produto: "+produto.getNome()+", $ "+produto.getPreco() + ", "+produto.getQuantidadeEstoque()+" unidades,Total: $ "+produto.totalPreco());
        System.out.println();

        System.out.print("Digite o número de produtos a ser adicionado no estoque: ");
        produto.adicionarItem(sc.nextInt());
        System.out.println();

        System.out.println("informações atualizadas: "+produto.getNome()+", $ "+produto.getPreco() + ", "+produto.getQuantidadeEstoque()+" unidades,Total: $ "+produto.totalPreco());
        System.out.println();

        System.out.print("Digite o número de produtos a ser remover no estoque: ");
        produto.removerItem(sc.nextInt());
        System.out.println();

        System.out.println("informações atualizadas: "+produto.getNome()+", $ "+produto.getPreco() + ", "+produto.getQuantidadeEstoque()+" unidades,Total: $ "+produto.totalPreco());

    }
}
