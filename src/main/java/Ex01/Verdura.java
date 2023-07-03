package Ex01;

import java.util.HashMap;
import java.util.Map;

public class Verdura extends Alimentos{

    //ATRIBUTOS
    Map<String, Double> listaDeAlimentos = new HashMap<>();

    //MÉTODOS
    public double tratarAlimentoGrama(double qtdeGramas){
        try {
            if(qtdeGramas == (int)qtdeGramas|| qtdeGramas <= 0){
                throw new NumberFormatException("INSIRA UM VALOR DECIMAL MAIOR QUE ZERO.");
            }else {
                System.out.println("VALOR INSERIDO COM SUCESSO!");
            }
        }catch (NumberFormatException exception) {
            System.out.println("INSIRA UM VALOR DECIMAL MAIOR QUE ZERO.");
        }

        return qtdeGramas;
    }


    public void adicionarAlimentos(String alimento, double qtdeUnidades){
        if(alimento.isEmpty()) {
            throw new UnsupportedOperationException("O NOME DO ALIMENTO NÃO PODE SER UM VALOR VAZIO.");
        }else{
            listaDeAlimentos.put(alimento,qtdeUnidades);
            System.out.println("ALIMENTO ADICIONADO COM SUCESSO.");
        }
    }

    public void mostrarLista(){
        System.out.println(">>>LISTA DE ALIMENTOS<<<");
        for (String chave : listaDeAlimentos.keySet()) {
            System.out.println("Alimento: " + chave + " -> quantidade = " + listaDeAlimentos.get(chave) + "g");
        }

        System.out.println("A QUANTIDADE DE ALIMENTOS DO TIPO VERDURA É " + listaDeAlimentos.size());
    }

}
