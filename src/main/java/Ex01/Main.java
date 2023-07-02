package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alimentos alimentos = new Alimentos();
        AlimentosEmGrama emGrama = new AlimentosEmGrama();
        AlimentoEmUnidade emUnd = new AlimentoEmUnidade();

        System.out.println("SEJA BEM-VINDE AO SEU GERENCIADOR DE LISTAS DE ALIMENTOS!");
        System.out.println("**********************************************************");

        while(true){
            executaInteracao(alimentos, emGrama, emUnd);

            System.out.println("DESEJA ADICIONAR OUTRO ALIMENTO? SIM (S) / NÃO (N)");
            String deNovo = entrada.next();
            if(deNovo.equalsIgnoreCase("S")) {
                executaInteracao(alimentos, emGrama, emUnd);
            }else if (deNovo.equalsIgnoreCase("N")) {
                System.out.println("TUDO BEM. ATÉ MAIS!");
                emGrama.mostrarLista();
                emUnd.mostrarLista();
                break;
            }else {
                System.out.println("COMANDO INVÁLIDO.");
            }
        }
    }

    private static void executaInteracao(Alimentos alimentos, AlimentosEmGrama emGrama, AlimentoEmUnidade emUnd){
        Scanner entrada = new Scanner(System.in);

        System.out.println("MENU DE ALIMENTOS: VERDURA / LEGUME / GRÃOS / OUTROS.");
        System.out.println("DIGITE A OPÇÃO EQUIVALENTE PARA CONTINUAR: ");
        String tipoAlimento = entrada.next();

        double qtdeGramas;
        int qtdeUnidades;
        alimentos.checarTipoDeAlimento(tipoAlimento);

        if (tipoAlimento.equalsIgnoreCase("VERDURA")) {
            System.out.println("INFORME A QUANTIDADE DESEJADA EM GRAMAS. USE NÚMERO DECIMAL COM VÍRGULA: ");
            qtdeGramas = entrada.nextDouble();
            emGrama.tratarAlimentoGrama(qtdeGramas);
            if (qtdeGramas > 0) {
                System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA INSERIR: ");
                String alimento = entrada.next();
                emGrama.adicionarAlimentos(alimento, qtdeGramas);
                System.out.println(emGrama.listaDeAlimentos);
            }
        } else if (tipoAlimento.equalsIgnoreCase("GRÃOS")) {
            System.out.println("INFORME A QUANTIDADE DESEJADA EM GRAMAS. USE NÚMERO DECIMAL COM VÍRGULA: ");
            qtdeGramas = entrada.nextDouble();
            emGrama.tratarAlimentoGrama(qtdeGramas);
            if (qtdeGramas > 0) {
                System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA INSERIR: ");
                String alimento = entrada.next();
                emGrama.adicionarAlimentos(alimento, qtdeGramas);
                System.out.println(emGrama.listaDeAlimentos);
            }
        } else if (tipoAlimento.equalsIgnoreCase("LEGUME")) {
            System.out.println("INFORME A QUANTIDADE DESEJADA UNIDADES. USE NÚMERO INTEIRO: ");
            qtdeUnidades = entrada.nextInt();
            emUnd.tratarAlimentoUnidade(qtdeUnidades);
            if (qtdeUnidades > 0) {
                System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA INSERIR: ");
                String alimento = entrada.next();
                emUnd.adicionarAlimentos(alimento, qtdeUnidades);
                System.out.println(emUnd.listaDeAlimentos);
            }
        } else if (tipoAlimento.equalsIgnoreCase("OUTROS")) {
            System.out.println("INFORME A QUANTIDADE DESEJADA UNIDADES. USE NÚMERO INTEIRO: ");
            qtdeUnidades = entrada.nextInt();
            emUnd.tratarAlimentoUnidade(qtdeUnidades);
            if (qtdeUnidades > 0) {
                System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA INSERIR: ");
                String alimento = entrada.next();
                emUnd.adicionarAlimentos(alimento, qtdeUnidades);
                System.out.println(emUnd.listaDeAlimentos);
            }
        }
    }
}



