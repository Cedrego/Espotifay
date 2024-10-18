/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class TemaId implements Serializable {
    
    protected String nombre;
    private String albumNombre;

    public TemaId() {
    }

    // Constructor con parámetros
    public TemaId(String nombre, String albumNombre) {
        this.nombre = nombre;
        this.albumNombre = albumNombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getAlbumNombre() {
        return albumNombre;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlbumNombre(String albumNombre) {
        this.albumNombre = albumNombre;
    }

    // equals y hashCode para asegurar que dos objetos TemaId sean iguales cuando los valores son iguales
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TemaId temaId = (TemaId) o;

        if (!nombre.equals(temaId.nombre)) {
            return false;
        }
        return albumNombre.equals(temaId.albumNombre);
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + albumNombre.hashCode();
        return result;
    }
}
