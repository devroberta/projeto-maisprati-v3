package tela;
/**
 * Classe responsável pela interação com o usuário para receber os dados que serão cadastrados
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import controller.ControllerData;
import java.util.*;
import util.*;
import java.text.*;

public class TelaCadastro
{
   public static void cadastrar(ControllerData ctl) {
       
        Scanner sc = new Scanner(System.in);
       
        try {
            LimpaTela.limpa();
            System.out.println("::: Cadastrar Pessoa ou Aluno :::");
            //Solicitação dos dados que serão enviados para a lista
            System.out.println("NOME:");
            System.out.print(">>> ");
            String nome = sc.nextLine();

            System.out.println("TELEFONE: (00)00000.0000");
            System.out.print(">>> ");
            String telefone = sc.next();

            System.out.println("DATA NASCIMENTO: dd/MM/yyyy");
            System.out.print(">>> ");
            String data = sc.next();
            Date dataNasc = ConversaoDados.converteStringData(data);

            System.out.print("Deseja cadastrar a Nota Final s/n? ");
            char possuiNota = 'n';
            possuiNota = sc.next().charAt(0);
            if (possuiNota =='s' || possuiNota=='S') {
                System.out.print("(00,0) >>> ");
                Double nota = sc.nextDouble();
                ctl.receberDados(nome, telefone, dataNasc, nota);
            }
            else {
                ctl.receberDados(nome, telefone, dataNasc);
            }
            System.out.println();
            System.out.println("Cadastrado com sucesso!!!");
        }
        catch (ParseException e) {
            System.out.println("ERRO: Formato da Data Inválida. Cadastre novamente.");
        }
        catch (InputMismatchException e) {
            System.out.println("ERRO: Nota Inválida. Cadastre novamente.");
        }
   }
}