package tela;
/**
 * Classe que mostra a tela de interação com o usuário para atualizar os dados
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import controller.ControllerData;
import java.util.*;
import util.*;
import java.text.*;

public class TelaAtualizar {
    public static void atualizar(ControllerData ctl) {
        
        Scanner sc = new Scanner(System.in);
         
        LimpaTela.limpa();
        System.out.println("::: Atualizar um Cadastro :::");
        System.out.println();
        if (ctl.buscarDados().isEmpty()) {
            System.out.println("Lista Vazia...");
        }
        else {
            //for que mostra a lista completa associando a variavel 'i' ao registro a ser selecionado 
            for (int i=0; i<ctl.buscarDados().size(); i++) {
                System.out.println("# "+ i +" ::: "+ ctl.buscarDados().get(i));
            }
            System.out.println();
            System.out.print("Digite o Código do Cadastro: ");
            int id= sc.nextInt();//recebendo o id do objeto
            System.out.println(id);
            //try para tratamento de exceções
            try {
                //buscando o id digitado na lista
                System.out.println("Cadastro Selecionado: > " + ctl.buscarDados().get(id));//mostra o objeto selecionado
                System.out.println("Digite: 1-NOME | 2-TELEFONE | 3 - DATA DE NASC. | 4 - NOTA FINAL");
                System.out.print("Qual dados quer alterar? ");
                int num = sc.nextInt();
                String nome = ctl.buscarDados().get(id).getNome();
                String telefone = ctl.buscarDados().get(id).getTelefone();
                Date dataNasc = ctl.buscarDados().get(id).getDataNasc();
                Double notaFinal;
                //if para selecionar o parametro a ser alterado
                if (num == 1){
                    System.out.print("Digite o Nome Correto: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    ctl.buscarDados().get(id).setNome(nome);
                }
                else if (num == 2){
                    System.out.print("Digite o TELEFONE Correto: ");
                    telefone = sc.next();
                    ctl.buscarDados().get(id).setTelefone(telefone);
                }
                else if (num == 3){
                    System.out.print("Digite a DATA NASC Correta (dd/MM/yyyy): ");
                    dataNasc = ConversaoDados.converteStringData(sc.next());
                    ctl.buscarDados().get(id).setDataNasc(dataNasc);
                } 
                else if (num == 4){
                    System.out.print("Digite a NOTA FINAL (00,0): ");
                    notaFinal = sc.nextDouble();
                    //recebe o parametro notaFinal e cria o objeto Aluno e altera o registro na lista
                    ctl.alterarAluno(id, notaFinal);
                }
                //atualiza a data da Alteração do registro selecionado
                ctl.buscarDados().get(id).setUltimaAlteracao();
                //atualiza a lista com as novas alterações
                ctl.alterarLista(ctl.buscarDados());
                System.out.println();
                System.out.println(">>> CADASTRO ATUALIZADO <<<");
                //mostra o objeto atualizado
                System.out.println("> " + id +" - "+ ctl.buscarDados().get(id));
            }
            catch (ParseException e){
                System.out.println("ERRO: Formato da Data Inválida. Altere novamente.");
            }
            catch (InputMismatchException e){
                System.out.println("ERRO: Nota inválida");
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("ERRO: ID não encontrado");
            }
        }
    }
}