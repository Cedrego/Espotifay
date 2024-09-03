/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;
/**
 *
 * @author camin
 */
public class AltaUsuario {
    String nickname;
    String nombre;
    String apellido;
    String correo;
    String biografia;
    String pagina;
    Object dias;
    Object meses;
    Object anios;
            
    public AltaUsuario(String nick, String nom, String ape, String mail, Object dia, Object mes, Object anio){
        nickname = nick;
        nombre = nom;
        apellido = ape;
        dias = dia;
        meses = mes;
        anios = anio;
        
        //usuario u = new usuario
        
        System.out.println("Nickname: " + nickname);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Fecha: " + dias + "/" + meses + "/" + anios);
    }
}