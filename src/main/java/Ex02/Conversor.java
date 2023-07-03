package Ex02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversor {
    //ATRIBUTOS
    List<String> moedas = new ArrayList<>();
    List<Double> valoresMoedas = Arrays.asList(5.25, 4.15, 6.15, 7.50);

    //MÉTODOS
    public String tratarTipoMoeda(String tipoMoeda) {
        List<String> listaMoedas = Arrays.asList("DÓLAR", "DÓLAR CANADENSE", "EURO", "LIBRA");
        moedas.addAll(listaMoedas);

        try {
            if (moedas.contains(tipoMoeda.toUpperCase())) {
                System.out.println("TIPO DE MOEDA VÁLIDO! UHULLL! :D");
            }else {
                throw new IllegalArgumentException("TIPO DE MOEDA INVÁLIDO!");
                }
        }catch (IllegalArgumentException exception) {
            System.out.println("TIPO DE MOEDA INVÁLIDO!");
        }return tipoMoeda;
    }

    public BigDecimal tratarValor(BigDecimal valorAConverter){
        try {
            if(valorAConverter.compareTo(BigDecimal.ZERO) <= 0) {
                System.out.println("VALOR INVÁLIDO! DIGITE UM VALOR MAIOR QUE ZERO.");
            }
        }catch (NumberFormatException exception) {
            System.out.println("O VALOR PARA A CONVERSÃO DEVE SER DECIMAL.");
        }
        return valorAConverter;
    }





}






