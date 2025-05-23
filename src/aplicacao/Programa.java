package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Gerente de cobranças");
        isabela.setOrgao("público");
        isabela.setLotacao("xique xique - Bahia");
        isabela.setEmail("isabela@hotmail.com");

        isabela.calcularSalarioHorasExtras(10, 5.6);

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.println("horas extras R$ % " + isabela.getHorasExtras());
    }
}
