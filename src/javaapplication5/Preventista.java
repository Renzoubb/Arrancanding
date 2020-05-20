package javaapplication5;

//ATRIBUTOS
public class Preventista {
    private String nombrePrev;
    private String apellidoPrev;
    private int legajoPrev;

//METODOS
public Preventista(){}
    
public void setNombre (String var1){
    nombrePrev = var1;
}    

public String getNombre (){
    return nombrePrev;
}

public void setApellido (String var2){
    apellidoPrev = var2;
}

public String getApellido (){
    return apellidoPrev;
}

public void setLegajo (int var3){
    legajoPrev = var3;
}

public int getLegajo (){
    return legajoPrev;
}

}


