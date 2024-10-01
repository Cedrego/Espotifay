/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ClienteJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Camilo
 */
@Entity
@Table(name = "Cliente")
public class Cliente extends Usuario {

    @OneToMany(mappedBy = "cliente")
    @JoinTable(
        name = "CliPart",
        joinColumns = @JoinColumn(name = "nomParticular"),
        inverseJoinColumns = @JoinColumn(name = "nickCli")
    )
    private List<Particular> particular; //coleccion
    
     // Relación autoreferencial para seguir a otros clientes
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "cliente_sigue_cliente",
        joinColumns = @JoinColumn(name = "cliente_id"),
        inverseJoinColumns = @JoinColumn(name = "sigue_a_id")
    )
    private List<Cliente> cliSigueA;
    
    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "cliSigueA")
    private List<Cliente> seguidoPor;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "ARTISTAS_SEGUIDOS",
        joinColumns = @JoinColumn(name = "CLIENTE"),
        inverseJoinColumns = @JoinColumn(name = "ARTISTA")
    )
    private List<Artista> artSigueA;
    
    @OneToMany
    private List<Album> albumFav; //coleccion
    
    @OneToMany
    private List<Tema> temasFAV; //coleccion
    
    @OneToMany
    private List<porDefecto> playFavPD; //coleccion
    
    @OneToMany
    private List<Particular> playFavPart; //coleccion

    public Cliente() {
    }

    public Cliente(String nick, String nom, String ape, String mail, DTFecha fech) {
        super(nick, nom, ape, mail, fech);
        this.particular = new ArrayList();
        this.cliSigueA = new ArrayList();
        this.artSigueA = new ArrayList();
        this.seguidoPor = new ArrayList();
        this.albumFav = new ArrayList();
        this.temasFAV = new ArrayList();
        this.playFavPD = new ArrayList();
        this.playFavPart = new ArrayList();
    }
    
    //setters
    public void setParticular(List<Particular> particular) {
        this.particular = particular;
    }

    public void setCliSigueA(List<Cliente> sigueA) {
        this.cliSigueA = sigueA;
    }
    
    public void setArtSigueA(List<Artista> artSigueA) {
        this.artSigueA = artSigueA;
    }

    public void setSeguidoPor(List<Cliente> seguidoPor) {
        this.seguidoPor = seguidoPor;
    }

    
    public void setAlbumFav(List<Album> albumFav) {
        this.albumFav = albumFav;
    }

    public void setTemasFAV(List<Tema> temasFAV) {
        this.temasFAV = temasFAV;
    }

    public void setPlayFavPD(List<porDefecto> playFavPD) {
        this.playFavPD = playFavPD;
    }

    public void setPlayFavPart(List<Particular> playFavPart) {
        this.playFavPart = playFavPart;
    }
    
    //gettersssss
    public List<Particular> getParticular() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).particular;
    }

    public List<Cliente> getCliSigueA() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).cliSigueA;
    }
    
    public List<Artista> getArtSigueA() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).artSigueA;
    }

    public List<Cliente> getSeguidoPor() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).seguidoPor;
    }

    public List<Album> getAlbumFav() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).albumFav;
    }

    public List<Tema> getTemasFAV() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).temasFAV;
    }

    public List<porDefecto> getPlayFavPD() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).playFavPD;
    }

    public List<Particular> getPlayFavPart() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).playFavPart;
    }
    
    //adderssssssssss
    public void addParticular(Particular part){
        ClienteJpaController clijpa = new ClienteJpaController();
        
        this.particular.add(part);
        
        try{
            clijpa.edit(this);
        } catch (NonexistentEntityException e) {
        } catch (Exception e) {}
    }
    
    public void addTemaFav(Tema tem){
        ClienteJpaController clijpa = new ClienteJpaController();
        this.temasFAV.add(tem);
        
        try{
            clijpa.edit(this);
        } catch (NonexistentEntityException e) {
        } catch (Exception e) {}
    }
    
    public void addAlbumFav(Album alb){
        ClienteJpaController clijpa = new ClienteJpaController();
        
        this.albumFav.add(alb);
        
        try{
            clijpa.edit(this);
        } catch (NonexistentEntityException e) {
        } catch (Exception e) {}
    }
    
    public void addParticularFav(Particular part){
        ClienteJpaController clijpa = new ClienteJpaController();
        
        this.playFavPart.add(part);
        
        try{
            clijpa.edit(this);
        } catch (NonexistentEntityException e) {
        } catch (Exception e) {}
    }
    
    public void addPDFav(porDefecto pd){
        ClienteJpaController clijpa = new ClienteJpaController();
        
        this.playFavPD.add(pd);
        
        try{
            clijpa.edit(this);
        } catch (NonexistentEntityException e) {
        } catch (Exception e) {}
    }
    
    //busquersssssssssssssss
    public Particular buscarListPFav(String nom){
        for (Particular part : this.playFavPart){
            if(part.getNombre().equalsIgnoreCase(nom)){
                return part;
            }
        }
        return null;
    }
    
    public porDefecto buscarListPDFav(String nom){
        for (porDefecto pd : this.playFavPD){
            if(pd.getNombre().equalsIgnoreCase(nom)){
                return pd;
            }
        }
        return null;
    }
    
    public Album buscarAlbumFav(String nom){
        for (Album alb : this.albumFav){
            if(alb.getNombre().equalsIgnoreCase(nom)){
                return alb;
            }
        }
        return null;
    }
    
    public Tema buscarTemaFav(String nom){
        for (Tema tem : this.temasFAV){
            if(tem.getNombre().equalsIgnoreCase(nom)){
                return tem;
            }
        }
        return null;
    }
    
    //rimuversssssssssssssssssssss ss
    public void removeTemaFav(Tema tem){
        this.temasFAV.remove(tem);
    }
    
    public void removePlayPartFav(Particular part){
       this.playFavPart.remove(part);
    }

    public void removePlayPDFav(porDefecto pd){
       this.playFavPD.remove(pd);
    }

    public void removeAlbumFav(Album alb){
       this.albumFav.remove(alb);
    }
    
}