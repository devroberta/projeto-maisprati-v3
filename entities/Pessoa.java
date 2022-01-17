package entities;
/**
 * Classe que instancia e cria um objeto Pessoa (entidade genérica)
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */
import java.util.*;
import util.ConversaoDados;

public class Pessoa {
    private String nome;
    private String telefone;
    private Date dataNasc;
    private Date dataCadastro;
    private Date ultimaAlteracao;
    
    // Construtor padrão
    public Pessoa() {
    }
    // Construtor para objetos da classe Pessoa com parametros
    public Pessoa(String nome, String telefone, Date dataNasc) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataCadastro = new Date();
    }
    
    public String getNome() {
        return nome;
    }    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }    
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Date getDataNasc() {
        return dataNasc;
    }    
    
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void setDataCadastro(){
        Date data = new Date();
        this.dataCadastro = data;
    }
    
    public Date getUltimaAlteracao() {
        return ultimaAlteracao;
    }
    
    public void setUltimaAlteracao() {
        Date data = new Date();
        this.ultimaAlteracao = data;
    }
    
    @Override
    public String toString(){
        if (ultimaAlteracao == null){
            StringBuilder sb = new StringBuilder();
            sb.append(">> Nome: "+ nome + "\n");
            sb.append(" | Fone: " + telefone + " | D. Nasc: " + ConversaoDados.converteDataString(dataNasc) +"\n");
            sb.append(" | D. Cadastro: " + ConversaoDados.converteDataString(dataCadastro));
            sb.append("\n");
            return sb.toString();
        }
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(">> Nome: "+nome + "\n");
            sb.append(" | Fone: " + telefone + " | D. Nasc: " + ConversaoDados.converteDataString(dataNasc) +"\n");
            sb.append(" | D. Cadastro: " + ConversaoDados.converteDataString(dataCadastro) +" | Data Ultima Alteração: " + ConversaoDados.converteDataString(ultimaAlteracao));
            sb.append("\n");
            return sb.toString();
        }
    }
}
