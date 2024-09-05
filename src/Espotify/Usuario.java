package Espotify;

/**
 * Representa a un usuario en el sistema con nombre, apellido y cédula de identidad.
 * @author Camilo
 */

//@Entity
public class Usuario {
    
    //@Id
    //@Column (name="NICK");
    private String nickname;
    //@Column (name="NOMBRE");
    private String nombre;
    //@Column (name="APELLIDO");
    private String apellido;
    //@Column (name="MAIL");
    private String correo;
    //@Column (name="NAC");
    private DTFecha fecha;
    //private imagen
    
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
    public Usuario() {
    }

    public Usuario(String nick, String nom, String ape, String mail, DTFecha fech) {
        this.nickname = nick;
        this.nombre = nom;
        this.apellido = ape;
        this.correo = mail;
        this.fecha = fech;
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
    
    public DTFecha getFecha() {
        return fecha;
    }
    /*
    public getImagen() {
        return imagen;
    }
    */
    
    //Set variables
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public void setNickname(String nick) {
        this.nickname = nick;
    }
    
    public void setCorreo(String mail) {
        this.correo = mail;
    }
    
    public void setFecha(DTFecha fech) {
        this.fecha = fech;
    }
    /*
    public void setImagen(String picture) {
        imagen = picture;
    }
    */
}
