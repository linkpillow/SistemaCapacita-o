package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args){
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela seu boy chegou");

        isabela.setSalario(10000);
        isabela.setValorHora(400);

        System.out.println("o valor total recebido por isabela pelas suas horas extras trabalhadas é de " + isabela.calcularSalarioHorasExtras(20, 30));
        System.out.println("o salário bruto total recebido por isabela ao final do mês é de " + isabela.calcularSalarioTotal());
    }
}
