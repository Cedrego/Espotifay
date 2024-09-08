package Espotify;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author cedre
 */

@Entity
public class Playlist implements Serializable {
    @Id
    @Column(name="NOMBRE")
    protected String nombre;

    @OneToMany
    private List<Tema> temas;

    public Playlist() {}

    public Playlist(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }
}
