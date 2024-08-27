/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

/**
 *
 * @author cedre
 */
public class Particular extends Playlist {
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
        privado = EsPrivado;
    }
}
