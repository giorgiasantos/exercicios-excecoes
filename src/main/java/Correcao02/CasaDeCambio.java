package Correcao02;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.exit;

public class CasaDeCambio {

    //ATRIBUTOS
    private Conversao conversao = new Conversao();
    private Scanner entrada;

    //CONSTRUTOR
    public CasaDeCambio(){
        entrada = new Scanner(System.in);
    }

    //MÉTODOS

    //método de interação com user
    public void trocaDeMoeda(){

        while (true){
            String tipoMoeda = "";
            BigDecimal valor = new BigDecimal("0");
            boolean continuar = true;

            do{
                try{
                    System.out.println("BOAS-VINDAS AO CONVERSOR DE MOEDAS!");
                    System.out.println("DIGITE O TIPO DE MOEDA QUE QUER CONVERTER:");
                    tipoMoeda = entrada.nextLine();
                    conversao.verificaTipoDeMoeda(tipoMoeda);
                    continuar = false;
                    System.out.println("No momento, só convertemos em REAL!");
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }while (continuar);

            continuar = true;

            do {
                try{
                    System.out.println("Digite o valor que quer converter:");
                    valor = BigDecimal.valueOf(entrada.nextDouble());
                    conversao.verificaValorInserido(valor);
                    continuar = false;
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }while (continuar);

            exibirConversao(tipoMoeda,valor);
            System.out.printf("Deseja fazer outra conversão? 1- SIM / 2 - NÃO: ");
            if(entrada.nextInt() == 2) exit(0);
        }

    }

    //método que exibe resultado da conversão
    public void exibirConversao(String moeda, BigDecimal valor){
        System.out.println("A moeda " + moeda + " na cotação atual de hoje " + LocalDate.now() + " está em " + conversao.getMoedas().get(moeda) + " o valor que pediu para converter de " + valor + " em reais é ");
        System.out.printf("R$%.2f\n", conversao.realizaConversao(valor));
    }


}
