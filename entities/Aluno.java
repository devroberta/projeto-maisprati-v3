package entities;
/**
 * Classe para cadastrar um Aluno com herança da Classe Pessoa.
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import java.util.*;

public class Aluno extends Pessoa
{
    private Double notaFinal;
    
    public Aluno(){
        super();
    }
    
    public Aluno(String name, String telefone, Date dataNasc, Double notaFinal) {
        super(name, telefone, dataNasc);
        this.notaFinal = notaFinal;
    }
    
    public Double getNotaFinal(){
        return notaFinal;
    }
    
    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +" | Nota Final: "
                + String.format("%.1f",notaFinal)
                +"\n";
    }     
}
