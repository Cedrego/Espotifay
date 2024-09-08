package Espotify;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author cedre
 */

@Entity
@Table (name = "Playlist")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Playlist implements Serializable {
    @Id
    protected String nombre;
    @OneToMany
    private List<Tema> temas;
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
