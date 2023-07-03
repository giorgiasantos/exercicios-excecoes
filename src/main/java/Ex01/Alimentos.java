package Ex01;

import java.util.Arrays;
import java.util.List;

public class Alimentos {

    //ATRIBUTOS
    List<String> tiposDeAlimentos = Arrays.asList("VERDURA", "LEGUME", "GRÃOS","OUTROS");

    //METODOS
    public String checarTipoDeAlimento(String novoAlimento){
        try{
            if(tiposDeAlimentos.contains(novoAlimento.toUpperCase())){
                System.out.println("TIPO DE ALIMENTO VALIDADO COM SUCESSO! :D");
            }else {
                throw new IllegalArgumentException("TIPO DE ALIMENTO INVÁLIDO!");
            }
        }catch(IllegalArgumentException exception){
            System.out.println("TIPO DE ALIMENTO INVÁLIDO!");
        }
        return novoAlimento;
    }



}
