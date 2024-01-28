
package ejercicio4;

public class Vehiculo {
    // propiedades de la clase u objeto

	private String matricula;
	private String marca;
	private String modelo;
	private double precio;
	private boolean elevalunasElectrico;
	private boolean airbag;
	private boolean cierreAutomatico;
	private String motor;

//Constructor

public Vehiculo(String matricula, String marca, String modelo, double precio, 
        boolean elevalunasElectrico, boolean airbag, boolean cierreAutomatico, 
        String motor){
	this.matricula = matricula;
	this.marca = marca;
	this.modelo = modelo;
	this.precio = precio;
	this.elevalunasElectrico = elevalunasElectrico;
	this.airbag = airbag;
	this.cierreAutomatico = cierreAutomatico;
	this.motor = motor;
}

// creamos los métodos de clase (las cosas que puede hacer)

// Setters:

	public void setMatricula(String matricula){
					//this ^
		this.matricula = matricula;
	}

	public void setMarca(String marca){
				
		this.marca = marca;
	}

	public void setModelo(String modelo){
					
		this.modelo = modelo;
	}

	public void setPrecio(double precio){

		this.precio = precio;

	}

	public void setElevalunas(boolean elevalunasElectrico){
					
		this.elevalunasElectrico = elevalunasElectrico;
	}

	public void setAirbag(boolean airbag){
	
		this.airbag = airbag;

	}
	public void setCierre(boolean cierre){
	
		this.cierreAutomatico = cierreAutomatico;

	}
	public void setMotor(String motor){
				
		this.motor = motor;
	}

	

// Getters:

	public String getMatricula(){

	return this.matricula;

	}
	public String getMarca(){

	return this.marca;

	}
	public String getModelo(){

	return this.modelo;

	}

	public double getPrecio(){

	return this.precio;

	}

	public boolean getElevalunas(){

	return this.elevalunasElectrico;

	}
	public boolean getAirbag(){

	return this.airbag;

	}
	public boolean getCierre(){

	return this.cierreAutomatico;

	}
	public String getMotor(){

	return this.motor;

	}
	
	public double getIVA(){

	double calculaIVA;
	double Iva = 0.21;
	
	calculaIVA = this.precio * Iva;

	return calculaIVA;

	}

	public double getExtras(){
	
	double extras=0;

	if(motor.equals("Diesel")){
	extras+=2000; }

	if(cierreAutomatico = true){
	extras+=500; }

	if(airbag = true){
	extras+=1000;}

	if(elevalunasElectrico = true){
	extras+=750;}

	return extras;
	}

	public double precioFinal(){

	double precioF = this.precio + this.getIVA() + this.getExtras();

	return precioF;
	}
        
// Creamos un string con todos los datos:

	public String mostrarVehiculo(){
		
		String resultado = this.matricula + " - " + this.marca + " - " + this.modelo + " - " + this.precio + " - " + this.elevalunasElectrico + " - " + this.airbag + " - " + this.cierreAutomatico + " - " + this.motor;
	return resultado;	

	}

}
