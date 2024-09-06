//
//
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Espotify;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author Franco
// */
//public class Ctrl{
//
//    private List<Album> albumesCtrl;
//    private List<Genero> generosCtrl;
//    
//    public Ctrl(){
//        //se inicializan todas las listas
//        this.albumesCtrl = new ArrayList<>();
//
//        this.generosCtrl = new ArrayList<>();
//    }
//    
//    //agregar un album a la lista de albumes
//    public void addAlbum(Album alb){
//        this.albumesCtrl.add(alb);
//    }
//    
//   
//    
//    //agregar un genero a la lista de generos
//    public void addGenero(Genero gen){
//        this.generosCtrl.add(gen);
//    }
//    
//    //buscar un album en la lista, retorna null en caso contrario
//    public Album buscarAlbum(String nom){
//        for (Album album : this.albumesCtrl){
//            if(album.getNombre().equalsIgnoreCase(nom)){
//                return album;
//            }
//        }
//        return null;
//    }
//    
//    //buscar un artista en la lista, retorna null en caso contrario
//    public Artista buscarArtista(String nick){
//        for (Artista art : this.artistasCtrl){
//            if(art.getNickname().equalsIgnoreCase(nick)){
//                return art;
//            }
//        }
//        return null;
//    }
//    
//    //buscar un genero en la lista, retorna null en caso contrario
//    public Genero buscarGenero(String nomG){
//        for (Genero gen : this.generosCtrl){
//            if(gen.getNombre().equalsIgnoreCase(nomG)){
//                return gen;
//            }
//        }
//        return null;
//    }
//    
//    //crear un objeto de tipo album 
//    public Album CrearAlbum (String nombreA, int anioA, List<Genero> generosA, List<Tema> temasA){
//        //hay que ver si se usa un manejador o no
//        Album albumNuevo = new Album(nombreA,anioA); //creo un album, ya inicializa las listas de genero y temas
//        
//        for (Genero genero : generosA){
//            albumNuevo.addGenero(genero);
//        }
//        
//        for (Tema tema : temasA){
//            albumNuevo.addTemas(tema);
//        }
//        
//        //si se usa un manejador habrá que agregarlo a su colección, creo
//        return albumNuevo;
//    };
//    
//    public Tema CrearTema (String nomT, String duraT, int ordT, List<Genero> generosT){
//        Tema temaNuevo = new Tema(nomT, duraT, ordT);
//        
//        for (Genero gen : generosT){
//            temaNuevo.addGenero(gen);
//        }
//        
//        return temaNuevo;
//    }
//    
//    public Genero crearGenero(String nomG, Genero padre){
//        Genero generoNuevo = new Genero(nomG);
//        
//        generoNuevo.setPadre(padre);
//        
//        return generoNuevo;
//    }
//    
//}
//
////