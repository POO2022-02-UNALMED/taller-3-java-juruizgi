package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;
    
    TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }
    
    void setMarca(Marca marca){
        this.marca = marca;
    }
    
     Marca getMarca(){
        return marca;
    }
    
    void setControl(Control control) {
        this.control = control;
    }
    
    Control getControl() {
        return control;
    }
    
    void setPrecio(int precio) {
        this.precio = precio;
    }
    
    int getPrecio() {
        return precio;
    }
    
    void setVolumen(int volumen){
        if (volumen>=0 && volumen<=7){
            this.volumen = volumen;
        }
    }
    
    int getVolumen(){
        return volumen;
    }
    
    void setCanal(int canal){
        if(canal<=120 && canal>=1 && estado == true){
            this.canal = canal;
        }
    }
    
    int getCanal(){
        return canal;
    }
    
    void setNumTV(int numTV){
        TV.numTV = numTV;
    }
    
    int getNumTV(){
        return TV.numTV;
    }
    
    void turnOn(){
        estado = true;
    }
    
    void turnOff(){
        estado = false;
    }
    
    boolean getEstado(){
        return estado;
    }
    
    void canalUp(){
        if(canal!=120 && estado == true){
            canal++;
        }
    }
    
    void canalDown(){
        if(canal!=1 && estado == true){
            canal--;
        }
    }
    
    void volumenUp(){
       if(volumen!=7 && estado == true){
           volumen++;
       } 
    }
    
    void volumenDown(){
        if(volumen!=0 && estado == true){
            volumen--;
        }
    }
}
