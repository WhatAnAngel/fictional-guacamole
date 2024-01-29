package actividad28t5pro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversorFechas {

//Este método convierte una fecha en formato 
//normal dd/mm/yyyy a formato americano mm/dd/yyyy
    public String normalToAmericano(LocalDateTime fecha) {
        //Formatos
        DateTimeFormatter formatoInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoOutput = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
        DateTimeFormatter.ofPattern(formatoOutput);
        return null;
    }

}
