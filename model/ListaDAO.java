package model;
/**
 * Classe que controla a Lista de Cadastros
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import java.util.*;
import entities.*;

public class ListaDAO {
   
    private List<Pessoa> lista;
    
    public ListaDAO() {
        lista = new ArrayList<Pessoa>();
    }
    
    public void inserirLista(Pessoa obj){
        lista.add(obj);
    }  
    
    public void inserirLista(Aluno obj) {
        lista.add(obj);
    }
    
    public void alterarPessoa(int id, Pessoa obj) {
        lista.set(id, obj);
    }
    
    public void alterarAluno(int id, Aluno obj) {
        lista.set(id, obj);
    }
    
    public List<Pessoa> mostrarLista() {
        return this.lista;
    }
    
    public void atualizaLista(List<Pessoa> lista) {
        this.lista = lista;
    }
}
