/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;
import Espotify.Usuario;
/**
 *
 * @author Camilo
 */
public class AltaUsuario {
    int dias;
    int meses;
    int anios;
            
    public AltaUsuario(String nick, String nom, String ape, String mail, Object dia, Object mes, Object anio, String bio, String web){
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
        
        System.out.println("Nickname: " + nick);
        System.out.println("Nombre: " + nom);
        System.out.println("Apellido: " + ape);
        System.out.println("Correo: " + mail);
        System.out.println("Fecha: " + dias + "/" + meses + "/" + anios);
        if(bio != null){
            System.out.println("Biografia: " + bio);
        }
        if(bio != null){
            System.out.println("Pagina Web: " + web);
        }
    }
}