/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

/**
 *
 * @author cedre
 */
//@Entity
public class Particular extends Playlist {
    //@Column (name="PRRIVADO");
    private boolean privado;
    
    public Particular(){}
    public Particular(String NuevoNombre, boolean EsPrivado){
        nombre = NuevoNombre;
        privado = EsPrivado;
    }
    public boolean getPrivado(){
        return privado;
    }
    public void setPrivado(boolean EsPrivado){
        this.privado = EsPrivado;
    }
}
