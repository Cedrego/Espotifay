/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

/**
 *
 * @author Franco
 */
public class DTFecha {
    private int dia;
    private int mes;
    private int anio;
    
    
    public DTFecha(){};
    public DTFecha(int diaDT, int mesDT, int anioDT){
        this.dia = diaDT;
        this.mes = mesDT;
        this.anio = anioDT;
    };
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAnio(){
        return anio;
    }
    
    
}
