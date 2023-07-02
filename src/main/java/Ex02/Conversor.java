package Ex02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversor {
    //ATRIBUTOS
    List<String> moedas = new ArrayList<>();

    //MÉTODOS
    public String tratarTipoMoeda(String tipoMoeda) {
        List<String> listaMoedas = Arrays.asList("DA", "DC", "EU", "LI");
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






