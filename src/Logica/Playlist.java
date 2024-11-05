package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author cedre
 */


@MappedSuperclass
public abstract class Playlist implements Serializable {
    @Id
    protected String nombre;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected List<Tema> temas;
    //imagen;
    @Column(name = "IMAGEN")
    protected String imagen;
    
   public Playlist() {
        // Inicializar la lista aquí si se desea que todas las instancias tengan una lista de temas vacía
        this.temas = new ArrayList<>();
        this.imagen = new String();
    }
    
    public Playlist(String NuevoNombre, String pic) {
        this.nombre = NuevoNombre;
        this.imagen = pic;
        this.temas = new ArrayList<>();
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public List<Tema> getTemas(){
        return temas;
    }
    
    public String getImagen(){
        return imagen;
    }
    
    public void setNombre(String NuevoNombre){
        this.nombre = NuevoNombre;
    }
    
    public void setTemas(List<Tema> nuevosTemas){
        this.temas = nuevosTemas;
    }
    
    public void setImagen(String Imagen){
        this.imagen = Imagen;
    }
    
}