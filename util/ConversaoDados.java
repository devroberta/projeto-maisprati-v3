package util;
/**
 * Classe que trata a data, convertendo em String ou Date
 * @author (Roberta de Siqueira) 
 * @version (3.0)
 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ConversaoDados {
    public static Date converteStringData(String data) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");   
        return sdf.parse(data);
    }
    
    public static String converteDataString(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
        
    } 
}