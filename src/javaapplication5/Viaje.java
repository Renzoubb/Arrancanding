package javaapplication5;

//ATRIBUTOS
public class Viaje {
    private int codigoViaje;
    private int fechaInicioViaje;
    private int fechaFinViaje;

//METODOS
public Viaje(){}
    
public void setCodigoViaje (int var10){
    codigoViaje = var10;
}    

public int getCodigoViaje (){
    return codigoViaje;
}

public void setFechaInicio (int var20){
    fechaInicioViaje = var20;
}

public int getFechaInicio (){
    return fechaInicioViaje;
}

public void setFechaFin (int var30){
    fechaFinViaje = var30;
}

public int getFechaFin (){
    return fechaFinViaje;
}

}

