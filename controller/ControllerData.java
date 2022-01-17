package controller;
/**
 * Classe que cria uma pessoa na Lista
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import java.util.*;
import entities.*;
import model.*;

public class ControllerData {

    ListaDAO daoLista = new ListaDAO(); 
    List<Pessoa> listaController; 
    
    public boolean receberDados(String nome, String telefone, Date dataNasc) {
        //criar o objeto Pessoa passando os dados digitados pelo usuário
        Pessoa objPessoa = new Pessoa();
        objPessoa.setNome(nome);
        objPessoa.setTelefone(telefone);
        objPessoa.setDataNasc(dataNasc);
        objPessoa.setDataCadastro();

        //enviar o objeto para adicionar
        PessoaDAO daoPessoa = new PessoaDAO();
        daoPessoa.inserirPessoa(objPessoa);
        listaController = daoLista.mostrarLista();
        listaController.add(objPessoa);
        daoLista.atualizaLista(listaController);
        

        return true;
    }
    
    public boolean receberDados(String nome, String telefone, Date dataNasc, Double notaFinal) {
        //criar o objeto Pessoa passando os dados digitados pelo usuário
        Aluno objAluno = new Aluno();
        objAluno.setNome(nome);
        objAluno.setTelefone(telefone);
        objAluno.setDataNasc(dataNasc);
        objAluno.setDataCadastro();
        objAluno.setNotaFinal(notaFinal);

        //enviar o objeto para adicionar
        AlunoDAO daoAluno = new AlunoDAO();
        daoAluno.inserirAluno(objAluno);
        listaController = daoLista.mostrarLista();
        listaController.add(objAluno);
        daoLista.atualizaLista(listaController);

        return true;
    }
    
    public List<Pessoa> buscarDados() {
        listaController = daoLista.mostrarLista();
        return listaController;
    }
    
    public boolean removerDados(int id){
        listaController = daoLista.mostrarLista();
        try {
            if (listaController.contains(listaController.get(id))) {
                System.out.println("Cadastro Selecionado: > " + listaController.get(id));
                listaController.remove(id);
                daoLista.atualizaLista(listaController);
            }
        }
        catch (Exception e) {
            System.out.println("Cadastro não encontrado");
            return false;
        }
        
        return true;
    }
    
    public boolean alterarLista(List<Pessoa> lista){
        try {
            daoLista.atualizaLista(lista);
        }
        catch (Exception e) {
            System.out.println("Cadastro não encontrado");
            return false;
        }
        return true;
    }
    
    public boolean alterarAluno(int id, Double notaFinal){
        
        Pessoa obj;
        obj = listaController.get(id);
        Aluno objAluno = new Aluno(obj.getNome(), obj.getTelefone(), obj.getDataNasc(), notaFinal);
                
        AlunoDAO daoAluno = new AlunoDAO();
        daoAluno.alterarAluno(id, objAluno);
        listaController = daoLista.mostrarLista();
        listaController.set(id, objAluno);
        daoLista.atualizaLista(listaController);

        return true;
        
    }
}