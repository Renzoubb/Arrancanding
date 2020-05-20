package javaapplication5;

//ATRIBUTOS
public class OrdenDePago {
    private Preventista rol1;
    private int fechaDesdeOP;
    private int fechaHastaOP;
    private int fechaEmisionOP;
    private int montoOrdenPago;
    private int numeroOrdenPago;
 
//METODOS    
public OrdenDePago(){}

public void setFechaDesdeOP (int var100){
    fechaDesdeOP = var100;
}    

public int getFechaDesdeOP (){
    return fechaDesdeOP;
}

public void setFechaHastaOP (int var200){
    fechaHastaOP = var200;
}    

public int getFechaHastaOP (){
    return fechaHastaOP;
}

public void setFechaEmisionOP (int var300){
    fechaEmisionOP = var300;
}    

public int getFechaEmisionOP (){
    return fechaEmisionOP;
}

public void setMontoOrdenPago (int var400){
    montoOrdenPago = var400;
}

public int getMontoOrdenPago (){
    return montoOrdenPago;
}

public void setNumeroOrdenPago (int var500){
    numeroOrdenPago = var500;
}

public int getNumeroOrdenPago (){
    return numeroOrdenPago;
}

public void setPreventista(Preventista vpreventista)
{
    rol1 = vpreventista;
}

public Preventista getPreventista()
{
    return rol1;
}

}
