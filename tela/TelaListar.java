package tela;
/**
 * Classe que cria a tela de interação com o usuário para mostrar os objetos gravados
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import controller.ControllerData;
import java.util.*;
import entities.*;
import util.LimpaTela;

public class TelaListar {
    
    List<Pessoa> lista = new ArrayList<>(); 
    
    public static void listarCadastros(ControllerData ctl) {
        LimpaTela.limpa();
        System.out.println("::: Lista de Todos os Cadastros :::");
        System.out.println();
        if (ctl.buscarDados().isEmpty()) {
            System.out.println("Lista Vazia...");
        }
        else {
            for (int i=0; i<ctl.buscarDados().size(); i++) {
                System.out.println(ctl.buscarDados().get(i));
            }
        }
    }
}