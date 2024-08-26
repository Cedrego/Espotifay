package Espotify;

import java.io.Serializable;



/**
 * Representa a un usuario en el sistema con nombre, apellido y cédula de identidad.
 * @author TProg2017
 *
 */

public class Usuario implements Serializable {

    private String nickname;
    private String nombre;
    private String apellido;
    private String correo;
    //private Date fecha;
    //private imagen
    
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
    public Usuario() {
    }

    public Usuario(String nick, String nom, String ape, String mail, String fech) {
        this.nickname = nick;
        this.nombre = nom;
        this.apellido = ape;
        this.correo = mail;
        //this.fecha = fech;
        //this.imagen = picture;
        
    }
    
    //Get variables
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNickname() {
        return nickname;
    }
    
    public String getCorreo() {
        return correo;
    }
    /*
    public Date getFecha() {
        return fecha;
    }
    /*
    public getImagen() {
        return imagen;
    }
    */
    
    //Set variables
    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setApellido(String ape) {
        apellido = ape;
    }

    public void setNickname(String nick) {
        nickname = nick;
    }
    
    public void setCorreo(String mail) {
        correo = mail;
    }
    /*
    public void setFecha(Date fech) {
        fecha = fech;
    }
    /*
    public void setImagen(String picture) {
        imagen = picture;
    }
    */
}
