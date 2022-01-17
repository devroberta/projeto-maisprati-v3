package tela;
/**
 * Classe que mostra a tela de interação com o usuário para deletar um cadastro
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import controller.ControllerData;
import java.util.*;
import util.*;

public class TelaDeletar {
    public static void deletar(ControllerData ctl) {
        
        Scanner sc = new Scanner(System.in);
        
        LimpaTela.limpa();
        System.out.println("::: Deletar um Cadastro :::");
        System.out.println();
        if (ctl.buscarDados().isEmpty()) {
            System.out.println("Lista Vazia...");
        }
        else {
            //for para mostrar a lista completa
            for (int i=0; i<ctl.buscarDados().size(); i++) {
                    System.out.println("#" + i + " > " + ctl.buscarDados().get(i));
            }
            //solicitando o id correspondente ao cadastro a ser excluido
            System.out.print("Qual o ID deseja excluir? ");
            int id = sc.nextInt();
            if (ctl.removerDados(id)) {
                System.out.println("Cadastro removido com sucesso!!!");
            }
        }
    }
}