package Ex01;

import java.util.HashMap;
import java.util.Map;

public class AlimentosEmGrama extends Alimentos{

    //ATRIBUTOS
    Alimentos alimentos;
    Map<String, Double> listaDeAlimentos = new HashMap<>();

    //MÉTODOS
    public double tratarAlimentoGrama(double qtdeGramas){
        try {
            if(qtdeGramas == (int)qtdeGramas){
                throw new NumberFormatException();
            }
            System.out.println("VALOR INSERIDO COM SUCESSO!");
        }catch (NumberFormatException exception) {
            System.out.println("INSIRA UM VALOR DECIMAL COM VÍRGULA.");
        }
        return qtdeGramas;
    }

    public void adicionarAlimentos(String alimento, double qtdeUnidades){
        if(alimento.isEmpty()) {
            throw new UnsupportedOperationException();
        }else{
            listaDeAlimentos.put(alimento,qtdeUnidades);
            System.out.println("ALIMENTO ADICIONADO COM SUCESSO.");
        }
    }

    public void mostrarLista(){
        System.out.println(">>>LISTA DE ALIMENTOS<<<");
        for (String chave : listaDeAlimentos.keySet()) {
            System.out.println("Alimento: " + chave + " -> quantidade = " + listaDeAlimentos.get(chave));
        }

        System.out.println("A QUANTIDADE DE ALIMENTOS DO TIPO VERDURA/GRÃOS É " + listaDeAlimentos.size());
    }

}
