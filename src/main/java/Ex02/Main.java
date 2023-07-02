package Ex02;

import java.math.BigDecimal;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //SCANNER DO MAIN
        Scanner entrada = new Scanner(System.in);

        //COMEÇO DO PROGRAMA
        System.out.println("BEM-VINDE AO CONVERSOR DE MOEDAS!");
        System.out.println(">>>>>ATENÇÃO!! EU SÓ CONVERTO VALORES EM REAL(R$)!!!<<<<<");
        System.out.println("--------------------------------------------------------------");

        //LOOP DO MENU
        while(true) {
            //MÉTODO COM CONDICIONAL PARA CONVERSÕES
            condicionalConversao();

            System.out.println("DESEJA FAZER OUTRA CONVERSÃO? SIM (S) / NÃO (N)");
            String deNovo = entrada.next();
                if(deNovo.equalsIgnoreCase("S")) {
                    condicionalConversao();
                }else if (deNovo.equalsIgnoreCase("N")) {
                    System.out.println("TUDO BEM. ATÉ MAIS!");
                    break;
                }else {
                    System.out.println("COMANDO INVÁLIDO.");
                }
        }
    }

    //MÉTODO ESTÁTICO PARA INTERAÇÃO COM USUÁRIO
    private static void condicionalConversao(){
        // SCANNER NO MÉTODO
        Scanner entrada = new Scanner(System.in);

        //INSTANCIAS
        Moeda dolar = new Dolar();
        Moeda dolarCa = new DolarCanadense();
        Moeda euro = new Euro();
        Moeda libra = new LibraEsterlina();
        Conversor conversor = new Conversor();
        // VARIÁVEIS
        BigDecimal valorReal;
        LocalDate dataAtual = LocalDate.now();

        //INÍCIO DA INTERAÇÃO COM O USUÁRIO
        System.out.println("DIGITE O TIPO DE MOEDA: (DÓLAR = DA | DÓLAR CANADENSE = DC | EURO = EU | LIBRA =  LI)");
        String tipoMoeda = entrada.next();
        conversor.tratarTipoMoeda(tipoMoeda);

        //INÍCIO DAS CONDICIONAIS PARA CONVERSÃO
        if (tipoMoeda.equalsIgnoreCase("DA")) { //DÓLAR
            System.out.println("DIGITE O VALOR (EM REAL) A SER CONVERTIDO: ");
            valorReal = entrada.nextBigDecimal();
            conversor.tratarValor(valorReal);
                if(valorReal.compareTo(BigDecimal.ZERO) > 0){
                    dolar.converterParaReal(valorReal);
                    System.out.println("A MOEDA " + "'" + tipoMoeda.toUpperCase() + "'" + " NA COTAÇÃO DE " + dataAtual + " CONVERTIDA EM REAIS É = R$" + dolar.converterParaReal(valorReal));
                }
        } else if (tipoMoeda.equalsIgnoreCase("DC")) { //DÓLAR CANADENSE
            System.out.println("DIGITE O VALOR (EM REAL) A SER CONVERTIDO: ");
            valorReal = entrada.nextBigDecimal();
            conversor.tratarValor(valorReal);
                if(valorReal.compareTo(BigDecimal.ZERO) > 0) {
                    dolarCa.converterParaReal(valorReal);
                    System.out.println("A MOEDA " + "'" + tipoMoeda.toUpperCase() + "'" + " NA COTAÇÃO DE " + dataAtual + " CONVERTIDA EM REAIS É = R$" + dolarCa.converterParaReal(valorReal));
                }
        } else if (tipoMoeda.equalsIgnoreCase("EU")) { //EURO
            System.out.println("DIGITE O VALOR (EM REAL) A SER CONVERTIDO: ");
            valorReal = entrada.nextBigDecimal();
            conversor.tratarValor(valorReal);
                if(valorReal.compareTo(BigDecimal.ZERO) > 0) {
                    System.out.println("A MOEDA " + "'" + tipoMoeda.toUpperCase() + "'" + " NA COTAÇÃO DE " + dataAtual + " CONVERTIDA EM REAIS É = R$" + euro.converterParaReal(valorReal));
                }
        } else if (tipoMoeda.equalsIgnoreCase("li")) { //LIBRA
            System.out.println("DIGITE O VALOR (EM REAL) A SER CONVERTIDO: ");
            valorReal = entrada.nextBigDecimal();
            conversor.tratarValor(valorReal);
                if(valorReal.compareTo(BigDecimal.ZERO) > 0) {
                    libra.converterParaReal(valorReal);
                    System.out.println("A MOEDA " + "'" + tipoMoeda.toUpperCase() + "'" + " NA COTAÇÃO DE " + dataAtual + " CONVERTIDA EM REAIS É = R$" + libra.converterParaReal(valorReal));
                }
        }

    }

}
