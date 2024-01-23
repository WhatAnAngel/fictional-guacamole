package actividad28t5pro;
 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
 
public class ConversorFechas {
 
    public String normalToAmericano(String fecha) {
        //Formatos
        DateTimeFormatter formatoInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoOutput = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
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