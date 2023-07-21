package Correcao02;

import java.math.BigDecimal;
import java.util.HashMap;

public class Conversao {
    //ATRIBUTOS
    HashMap<String, BigDecimal>  moedas = new HashMap<>();
    private String tipoDaMoeda;

    //CONSTRUCTOR
    //popular o hashmap
    public Conversao(){
        moedas.put("Dólar Americano", new BigDecimal("5.25"));
        moedas.put("Dólar Canadense", new BigDecimal("4.15"));
        moedas.put("Euro", new BigDecimal("6.15"));
        moedas.put("Libra Esterlina", new BigDecimal("7.50"));
    }

    //MÉTODOS
    //método para verificar tipo de moeda
    public void verificaTipoDeMoeda(String tipoDaMoeda){
        //negar primeiro diminui as linhas de código
        if(!moedas.containsKey(tipoDaMoeda)) throw new IllegalArgumentException("Tipo de moeda inválido.");

        this.tipoDaMoeda = tipoDaMoeda;
    }

    //método para verificar se o valor é nulo ou <= que zero
    public void verificaValorInserido(BigDecimal valor){

        if(valor == null) throw new NumberFormatException("Para moeda, o valor monetário deve ser decimal.");

        if(valor.compareTo(BigDecimal.ZERO) == 0 || valor.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("Valor inválido. Por favor, tente novamente.");


    }

    //método que converte a moeda
    public BigDecimal realizaConversao(BigDecimal valor){
        return moedas.get(tipoDaMoeda).multiply(valor);
    }

    //getter de moedas
    public HashMap<String, BigDecimal> getMoedas() {
        return moedas;
    }
}
