package Espotify;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
public abstract class Playlist{
    @Id
    protected String nombre;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected List<Tema> temas;
    //imagen;
    
    public Playlist(){
    }
    
    public Playlist(String NuevoNombre){
        nombre = NuevoNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String NuevoNombre){
        this.nombre = NuevoNombre;
    }
    
}
