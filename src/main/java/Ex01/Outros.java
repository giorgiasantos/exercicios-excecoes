package Ex01;

import java.util.HashMap;
import java.util.Map;
public class Outros extends Alimentos{

    //ATRIBUTOS

    Map<String, Integer> listaDeAlimentos = new HashMap<>();

    //MÉTODOS
    public int tratarAlimentoUnidade(int qtdeUnidades){
        try {
            if(Math.floor(qtdeUnidades) != qtdeUnidades || qtdeUnidades <= 0){
                throw new NumberFormatException();
            }else {
                System.out.println("VALOR INSERIDO COM SUCESSO!");
            }
        }catch (NumberFormatException exception) {
            System.out.println("INSIRA UM VALOR INTEIRO MAIOR QUE ZERO.");
        }
        return qtdeUnidades;
    }

    public void adicionarAlimentos(String alimento, Integer qtdeUnidades){
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
            System.out.println("Alimento: " + chave + " -> quantidade = " + listaDeAlimentos.get(chave) + "UND.");
        }

        System.out.println("A QUANTIDADE DE ALIMENTOS DO TIPO OUTROS É " + listaDeAlimentos.size());
    }

}
