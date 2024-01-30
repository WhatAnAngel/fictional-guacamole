package actividad28t5pro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Este método convierte una fecha en formato 
//normal dd/mm/yyyy a formato americano mm/dd/yyyy
 
    public class ConversorFechas {
 
    public String normalToAmericano(String fecha) {
        //Formatos
        DateTimeFormatter formatoInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoOutput = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
        DateTimeFormatter.ofPattern(formatoOutput);
        return null;
    }

    }
        LocalDate newFecha = LocalDate.parse(fecha, formatoInput);
        return formatoOutput.format(newFecha);
    }
    
    public String AmericanoToNormal(String fecha) {
        //Formatos
        DateTimeFormatter formatoOutput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoInput = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
        LocalDate newFecha = LocalDate.parse(fecha, formatoInput);
        return formatoOutput.format(newFecha);
    }
 
}

