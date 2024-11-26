/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Franco
 */
@Entity
@Table(name = "registroacceso")
public class RegistroAcceso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private int idRegistro;
    
    private String ip;
    private String nickUsuario;
    private String url;
    private String browser;
    private String sistema_operativo;
    private String metodo_acceso;
    private String fechaHora;
    
    public RegistroAcceso() {
    }

    public RegistroAcceso(String ip, String nickUsuario, String url, String browser, String sistemaOperativo, String metodoAcceso, String fechaHora) {
        this.ip = ip;
        this.nickUsuario = nickUsuario;
        this.url = url;
        this.browser = browser;
        this.sistema_operativo = sistemaOperativo;
        this.metodo_acceso = metodoAcceso;
        this.fechaHora = fechaHora;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public String getIp() {
        return ip;
    }

    public String getNickUsuario() {
        return nickUsuario;
    }

    public String getUrl() {
        return url;
    }

    public String getBrowser() {
        return browser;
    }

    public String getSistemaOperativo() {
        return sistema_operativo;
    }

    public String getMetodoAcceso() {
        return metodo_acceso;
    }
    
    public String getFechaHora(){
        return fechaHora;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setNickUsuario(String nickUsuario) {
        this.nickUsuario = nickUsuario;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistema_operativo = sistemaOperativo;
    }

    public void setMetodoAcceso(String metodoAcceso) {
        this.metodo_acceso = metodoAcceso;
    }
    
    public void setFechaHora(String fechaHora){
        this.fechaHora = fechaHora;
    }
    
}
