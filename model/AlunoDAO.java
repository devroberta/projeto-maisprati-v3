package model;

import entities.*;
import java.util.*;

/**
 * Classe que controla a lista de registro de Aluno
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

public class AlunoDAO {
    
    private ListaDAO lista;
    private final List<Pessoa> listaAux = new ArrayList<>();
    
    public AlunoDAO() {
    }
    
    public Aluno inserirAluno(Aluno obj) {
        return obj;
    }
    
    public Aluno atualizarAluno(Aluno obj) {
        return obj;
    }
    
    public Aluno alterarAluno(int id, Aluno obj) {
        return obj;
    }
        
    public Pessoa buscarPorID(int id) {
        try {
            if (listaAux.contains(listaAux.get(id))) {
                System.out.println("Cadastro Selecionado: > " + listaAux.get(id));
            }
        }
        catch (Exception e) {
            System.out.println("Cadastro não encontrado");
        }
        return listaAux.get(id);
    }
    
    public List<Pessoa> excluirAluno(Aluno obj) {
        listaAux.remove(obj);
        return listaAux;
    }    
}
