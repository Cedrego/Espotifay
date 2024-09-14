/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class ManejadorPlaylist {
    private List<porDefecto> porDefectpList;
    private List<Particular> PartList;
    
     private static ManejadorPlaylist instancia = null;
     
     //inicializo colecciones en formato de mapa para guardar junto con sus nicknames
    private ManejadorPlaylist(){
        
        this.PartList = new ArrayList<>();
        this.porDefectpList = new ArrayList<>();
    }
    
    //creo una instancia si no existe una, de lo contrario devuelvo la existente (solo existe una)
    public static ManejadorPlaylist getInstance(){
        if (instancia == null){
            instancia = new ManejadorPlaylist();
        }
        return instancia;
    }
    
    public void addPartList(Particular par){
        this.PartList.add(par);
    }
    
    public void addPorDefecto(porDefecto def){
        this.porDefectpList.add(def);
    }
    
    public Particular buscarListP(String nom){
        for (Particular part : this.PartList){
            if(part.getNombre().equalsIgnoreCase(nom)){
                return part;
            }
        }
        return null;
    }
    
    public porDefecto buscarListPD(String nom){
        for (porDefecto pd : this.porDefectpList){
            if(pd.getNombre().equalsIgnoreCase(nom)){
                return pd;
            }
        }
        return null;
    }
    
    public List<porDefecto> getListPorDefecto(){
         // Retorna la lista de playlists por defecto del amenjador
        return this.porDefectpList;
    }
    
    public List<Particular> getListParticular(){
        return this.PartList;
    }  
}