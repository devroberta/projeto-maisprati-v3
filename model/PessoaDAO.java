package model;
/**
 * Classe que controla a lista de registro de Aluno
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import entities.*;
import java.util.*;

public class PessoaDAO {

    private ListaDAO lista;
    private final List<Pessoa> listaAux = new ArrayList<>();
    
    public PessoaDAO() {
    }
    //inseri o objeto recebido e atualiza a lista
    public List<Pessoa> inserirPessoa(Pessoa obj) {
        listaAux.add(obj);
        return listaAux;
    }
    //altera o objeto identificado e altera na lista
    public List<Pessoa> alterarPessoa(int id, Pessoa obj) {
        listaAux.set(id, obj);
        return listaAux;
    }
    //exclui o objeto 
    public List<Pessoa> excluirPessoa(Pessoa obj) {
        listaAux.remove(obj);
        return listaAux;
    }
}
