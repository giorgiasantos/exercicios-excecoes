package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alimentos alimentos = new Alimentos();
        Verdura emVerdura = new Verdura();
        Legume emLegume = new Legume();
        Graos emGraos = new Graos();
        Outros emOutros = new Outros();

        System.out.println("SEJA BEM-VINDE AO SEU GERENCIADOR DE LISTAS DE ALIMENTOS!");
        System.out.println("**********************************************************");

        while (true) {
            executaInteracao(alimentos, emVerdura, emLegume, emGraos, emOutros);

            System.out.println("DESEJA ADICIONAR OUTRO ALIMENTO? SIM (S) / NÃO (N)");
            String deNovo = entrada.nextLine();

            if (deNovo.equalsIgnoreCase("S")) {
                executaInteracao(alimentos, emVerdura, emLegume, emGraos, emOutros);
            } else if (deNovo.equalsIgnoreCase("N")) {
                System.out.println("TUDO BEM. ATÉ MAIS!");
                System.out.println("-----------------------------------");
                System.out.println("SUA LISTA DE COMPRAS COMPLETA:");
                emVerdura.mostrarLista();
                emLegume.mostrarLista();
                emGraos.mostrarLista();
                emOutros.mostrarLista();
                break;
            } else {
                System.out.println("COMANDO INVÁLIDO.");
            }
        }
    }

    private static void executaInteracao(Alimentos alimentos, Verdura emVerdura, Legume emLegume, Graos emGraos, Outros emOutros) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("MENU DE ALIMENTOS: VERDURA / LEGUME / GRÃOS / OUTROS.");
        System.out.println("DIGITE A OPÇÃO EQUIVALENTE PARA CONTINUAR: ");
        String tipoAlimento = entrada.nextLine();

        double qtdeGramas;
        int qtdeUnidades;

        alimentos.checarTipoDeAlimento(tipoAlimento);

        if (tipoAlimento.equalsIgnoreCase("VERDURA")) {
            System.out.println("INFORME A QUANTIDADE DESEJADA EM GRAMAS. USE NÚMERO DECIMAL COM VÍRGULA: ");
            qtdeGramas = entrada.nextDouble();
            entrada.nextLine();
            emVerdura.tratarAlimentoGrama(qtdeGramas);
            if (qtdeGramas > 0) {
                System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA INSERIR: ");
                String alimento = entrada.nextLine();
                emVerdura.adicionarAlimentos(alimento, qtdeGramas);
                System.out.println(emVerdura.listaDeAlimentos);
            }
        } else if (tipoAlimento.equalsIgnoreCase("GRÃOS")) {
                System.out.println("INFORME A QUANTIDADE DESEJADA EM GRAMAS. USE NÚMERO DECIMAL COM VÍRGULA: ");
                qtdeGramas = entrada.nextDouble();
                entrada.nextLine();
                emGraos.tratarAlimentoGrama(qtdeGramas);
                if (qtdeGramas > 0) {
                    System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA INSERIR: ");
                    String alimento = entrada.nextLine();
                    emGraos.adicionarAlimentos(alimento, qtdeGramas);
                    System.out.println(emGraos.listaDeAlimentos);
                }
        } else if (tipoAlimento.equalsIgnoreCase("LEGUME")) {
                System.out.println("INFORME A QUANTIDADE DESEJADA UNIDADES. USE NÚMERO INTEIRO: ");
                qtdeUnidades = entrada.nextInt();
                entrada.nextLine();
                emLegume.tratarAlimentoUnidade(qtdeUnidades);
                if (qtdeUnidades > 0) {
                    System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA INSERIR: ");
                    String alimento = entrada.nextLine();
                    emLegume.adicionarAlimentos(alimento, qtdeUnidades);
                    System.out.println(emLegume.listaDeAlimentos);
                }
        } else if (tipoAlimento.equalsIgnoreCase("OUTROS")) {
                System.out.println("INFORME A QUANTIDADE DESEJADA UNIDADES. USE NÚMERO INTEIRO: ");
                qtdeUnidades = entrada.nextInt();
                entrada.nextLine();
                emOutros.tratarAlimentoUnidade(qtdeUnidades);
                if (qtdeUnidades > 0) {
                    System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA INSERIR: ");
                    String alimento = entrada.nextLine();
                    emOutros.adicionarAlimentos(alimento, qtdeUnidades);
                    System.out.println(emOutros.listaDeAlimentos);
                }
            }
        }
    }




