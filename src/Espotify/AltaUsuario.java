/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;
import Espotify.Usuario;
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
    int dias;
    int meses;
    int anios;
            
    public AltaUsuario(String nick, String nom, String ape, String mail, Object dia, Object mes, Object anio){
        nickname = nick;
        nombre = nom;
        apellido = ape;
        dias = Integer.parseInt((String) dia);
        switch ((String) mes) {
            case "Enero": meses = 1; break;
            case "Febrero": meses = 2; break;
            case "Marzo": meses = 3; break;
            case "Abril": meses = 4; break;
            case "Mayo": meses = 5; break;
            case "Junio": meses = 6; break;
            case "Julio": meses = 7; break;
            case "Agosto": meses = 8; break;
            case "Septiembre": meses = 9; break;
            case "Octubre": meses = 10; break;
            case "Noviembre": meses = 11; break;
            case "Diciembre": meses = 12; break;
            default: meses = 0; break; // Manejo de caso por defecto
        }
        anios = Integer.parseInt((String) anio);
        //usuario u = new usuario
        
        System.out.println("Nickname: " + nickname);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Fecha: " + dias + "/" + meses + "/" + anios);
    }
}