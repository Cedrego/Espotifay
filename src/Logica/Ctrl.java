/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Logica.Genero;
import Persistencia.AlbumJpaController;
import Persistencia.ClienteJpaController;
import Persistencia.ArtistaJpaController;
import Persistencia.GeneroJpaController;
import Persistencia.ParticularJpaController;
import Persistencia.TemaJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.porDefectoJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Franco
 */
public class Ctrl implements ICtrl{
    
    // Obtenemos el EntityManager desde la fábrica
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pantallaPU");
    EntityManager em = emf.createEntityManager();

    public GeneroJpaController generoJpaController = new GeneroJpaController();
    public TemaJpaController temaJpaController = new TemaJpaController();
    public AlbumJpaController albumJpaController = new AlbumJpaController();
    public ParticularJpaController particularJpaController = new ParticularJpaController();
    public porDefectoJpaController porDefectoJpaController = new porDefectoJpaController();
    public ParticularJpaController partJpa = new ParticularJpaController();
    public porDefectoJpaController pdJpa = new porDefectoJpaController();
    public ClienteJpaController clienteController = new ClienteJpaController();
    public Ctrl(){}
    
    
    
    //crear un objeto de tipo album
    @Override
    public Album CrearAlbum (String nombreA, String artista, int anioA, List<Genero> generosA, List<Tema> temasA){
        
        Album albumNuevo = new Album(nombreA, artista ,anioA); //creo un album, ya inicializa las listas de genero y temas

        for (Genero genero : generosA){
            albumNuevo.addGenero(genero);
        }

        for (Tema tema : temasA){
            albumNuevo.addTemas(tema);
            //persistimos temas
            try {
                temaJpaController.create(tema);
            } catch (Exception e) {
                System.out.println("Error al guardar el tema: " + e.getMessage());
            }
        }
        
        //persistimos album
        try {
            albumJpaController.create(albumNuevo);
        } catch (Exception e) {
            System.out.println("Error al guardar el album: " + e.getMessage());
        }
        
        return albumNuevo;
    };
    
    @Override
    public Tema CrearTema (String nomT, String duraT, int ordT, String guardadoT, List<Genero> generosT){
        Tema temaNuevo = new Tema(nomT, duraT, ordT, guardadoT);
        
        for (Genero gen : generosT){
            temaNuevo.addGenero(gen);
            
        }
        
        return temaNuevo;
    }
    
    @Override
    public Genero crearGenero(String nomG, Genero padre){
        Genero generoNuevo = new Genero(nomG);
        
        if(padre!=null){
            generoNuevo.setPadre(padre);
        }else{
            generoNuevo.setPadre(generoJpaController.findGenero("Genero"));
        }
        
        try {
            generoJpaController.create(generoNuevo);
        } catch (Exception e) {
            System.out.println("Error al crear el genero: " + e.getMessage());
        }
        
        return generoNuevo;
    }
    
    @Override
    public Artista crearArtista(String nick, String nom, String ape, String mail, int dia, int mes, int anio, String bio, String web){
        
        DTFecha dtfecha = new DTFecha(dia, mes, anio);
        
        Artista nuevoArtista = new Artista(nick, nom, ape, mail, dtfecha, bio, web);
        
        ArtistaJpaController artistaJpaController = new ArtistaJpaController();
        
        try {
            artistaJpaController.create(nuevoArtista);
        } catch (Exception e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
        }
        
        return nuevoArtista;
    }
    
    @Override
    public Cliente crearCliente(String nick, String nom, String ape, String mail, int dia, int mes, int anio){
        DTFecha dtfecha = new DTFecha(dia, mes, anio);
        
        Cliente nuevoCliente = new Cliente(nick, nom, ape, mail, dtfecha);
        
        ClienteJpaController clienteJpaController = new ClienteJpaController();
        
        try {
            // Intentar persistir el nuevo cliente en la base de datos
            clienteJpaController.create(nuevoCliente);
            System.out.println("Cliente guardado exitosamente en la base de datos");
        } catch (Exception e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
            // Manejar la excepción si ocurre algún error durante la creación
        }
        return nuevoCliente;
    }
    
   
    @Override
    public void agregarSeguidorC(Cliente cliente, Cliente seguidor) {
    seguidor = em.merge(seguidor);
    cliente = em.merge(cliente);
    if (!seguidor.getArtSigueA().contains(cliente)){    
        EntityManager em = null;
        try {
            ClienteJpaController cliJpa = new ClienteJpaController();
            em = cliJpa.getEntityManager();
            em.getTransaction().begin();

            // Asegúrate de que ambos clientes están gestionados
            seguidor = em.merge(seguidor);
            cliente = em.merge(cliente);

            // Inserta en la tabla de unión
            em.createNativeQuery("INSERT INTO cliente_sigue_cliente (cliente_id, sigue_a_id) VALUES (?, ?)")
                    .setParameter(1, seguidor.getNickname())
                    .setParameter(2, cliente.getNickname())
                    .executeUpdate();
            
            em.getTransaction().commit();
            em.refresh(cliente);
            em.refresh(seguidor);
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        System.out.println("ahora, "+seguidor.getNickname()+ " sigue a " +cliente.getNickname());
        } else {
            System.out.println(seguidor.getNickname() + " ya sigue a " + cliente.getNickname());
    }
    
}


    @Override
    public void agregarSeguidorA(Artista artista, Cliente seguidor) {
        
        if (!seguidor.getArtSigueA().contains(artista)){
            EntityManager em = null;
            try {
                ClienteJpaController cliJpa = new ClienteJpaController();
                ArtistaJpaController artJpa = new ArtistaJpaController();
                em = cliJpa.getEntityManager();
                em.getTransaction().begin();
                
                // Asegúrate de que ambos clientes están gestionados
                seguidor = em.merge(seguidor);
                artista = em.merge(artista);

                // Inserta en la tabla de unión
                em.createNativeQuery("INSERT INTO artistas_seguidos (ARTISTA,CLIENTE) VALUES (?, ?)")
                        .setParameter(1, artista.getNickname())
                        .setParameter(2, seguidor.getNickname())
                        .executeUpdate();

                em.getTransaction().commit();
                em.refresh(artista);
                em.refresh(seguidor);
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                e.printStackTrace();
            } finally {
                em.close();
            }
            System.out.println("ahora, "+seguidor.getNickname()+ " sigue a " +artista.getNickname());
        } else {
            System.out.println(seguidor.getNickname() + " ya sigue a " + artista.getNickname());
        }
        
        
    }

    @Override
    public void dejarSeguidorC(Cliente usuario, Cliente seguidor) {
        // Verificar que efectivamente el seguidor sigue al usuario
        
            try {
                ClienteJpaController cliJpa = new ClienteJpaController();
                em = cliJpa.getEntityManager();
                em.getTransaction().begin();
                
                // Asegúrate de que ambos clientes están gestionados
                seguidor = em.merge(seguidor);
                usuario = em.merge(usuario);

                // Inserta en la tabla de unión
                em.createNativeQuery("DELETE FROM cliente_sigue_cliente WHERE cliente_id = ? AND sigue_a_id = ?")
                        .setParameter(1, seguidor.getNickname())
                        .setParameter(2, usuario.getNickname())
                        .executeUpdate();
                em.getTransaction().commit();
                em.refresh(usuario);
                em.refresh(seguidor);
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                e.printStackTrace();
            } finally {
                em.close();
            }
        
    }

    @Override
    public void dejarSeguidorA(Artista usuario, Cliente seguidor) {
        
            EntityManager em = null;
            try {
                ClienteJpaController cliJpa = new ClienteJpaController();
                ArtistaJpaController artJpa = new ArtistaJpaController();
                em = cliJpa.getEntityManager();
                em.getTransaction().begin();
                
                // Asegúrate de que ambos clientes están gestionados
                seguidor = em.merge(seguidor);
                usuario = em.merge(usuario);

                // Inserta en la tabla de unión
                em.createNativeQuery("DELETE FROM artistas_seguidos WHERE ARTISTA = ? AND CLIENTE = ?")
                        .setParameter(1, usuario.getNickname())
                        .setParameter(2, seguidor.getNickname())
                        .executeUpdate();

                em.getTransaction().commit();
                em.refresh(usuario);
                em.refresh(seguidor);
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                e.printStackTrace();
            } finally {
                em.close();
            }
        
    }
    
    @Override
    public Particular CrearListParticular(String nombre, String nomCliente){
        
        ManejadorUsuario mu = ManejadorUsuario.getInstance();
        Cliente cliente = mu.buscarCliente(nomCliente);
        
        Particular nuevoParticular = new Particular(nombre, cliente);
        
        try {
            particularJpaController.create(nuevoParticular);
        } catch (Exception e) {
            System.out.println("Error al guardar la lista particular: " + e.getMessage());
        }
        
        return nuevoParticular;
    }
    @Override
    public porDefecto CrearListPorDefecto(String nombre, String genero){
        
        Genero Gen = generoJpaController.findGenero(genero);
        porDefecto nuevoPorDefecto = new porDefecto(nombre,Gen);//Uso el constructor de pordefcto
        
        try {
            porDefectoJpaController.create(nuevoPorDefecto);
        } catch (Exception e) {
            System.out.println("Error al guardar la lista por defecto: " + e.getMessage());
        }
        return nuevoPorDefecto;
    }
    @Override
    public void InfiniteVoid(){
        
    }
    
    @Override
    public void Publicar(String lista,String cli){
        ManejadorPlaylist mp = ManejadorPlaylist.getInstance();
        Particular list = mp.buscarListP(lista,cli);
        list.setPrivado(false);
    }
    //Obtener
    @Override
    public List<String> obtenerNombresDeGeneros() {
        // Obtenemos todos los géneros de la base de datos
        List<Genero> listaGeneros = generoJpaController.findGeneroEntities();

        // Creamos una lista de strings para almacenar los nombres
        List<String> nombresGeneros = new ArrayList<>();

        // Recorremos la lista de géneros y extraemos sus nombres
        for (Genero genero : listaGeneros) {
            nombresGeneros.add(genero.getNombre());
        }

        return nombresGeneros;
    }
    @Override
     public List<String> obtenerNombresDeCliente() {
        // Obtenemos todos los géneros de la base de datos
        List<Cliente> listaCliente = clienteController.findClienteEntities();

        // Creamos una lista de strings para almacenar los nombres
        List<String> nombresCliente = new ArrayList<>();

        // Recorremos la lista de Cliente y extraemos sus nombres
        for (Cliente cli : listaCliente) {
            nombresCliente.add(cli.getNickname());
        }

        return nombresCliente;
    }
    @Override
    public boolean ExisListPartEnCliente(String NomList, String NomCliente){
        if(partJpa.findParticular(NomList,NomCliente)==null){//No existe
            return false;
        }else{
            return true;
        }
    }
    @Override
    public boolean ExisListPorDefEnGenero(String NomList){
        if(pdJpa.findporDefecto(NomList)==null){//No existe
            return false;
        }else{
            return true;
        }
    }
    @Override
    public List<String> obtenerNombresDeListPart( String NomCliente) {
        Cliente cli= clienteController.findCliente(NomCliente);
        List<Particular> playlistsParticulares = cli.getParticular(); // Lista de playlists del cliente
        // Creamos una lista de strings para almacenar los nombres
        List<String> nombresPart = new ArrayList<>();
        for (Particular part : playlistsParticulares) {
            nombresPart.add(part.getNombre());
        }
        return nombresPart;
    }
    @Override
    public List<String> obtenerNombresDeListPD( String NomGenero) {
        Genero gen= generoJpaController.findGenero(NomGenero);
        List<porDefecto> playlistsPD = pdJpa.findporDefectoEntities(); // Lista de playlists del cliente
        // Creamos una lista de strings para almacenar los nombres
        List<String> nombresPD = new ArrayList<>();
        for (porDefecto PD : playlistsPD) {
            if(PD.getGenero().getNombre().equalsIgnoreCase(gen.getNombre())){
                nombresPD.add(PD.getNombre());
            }
        }
        return nombresPD;
    }
    @Override
    public List<String> obtenerNombresTemaParaPartADD(String NomList, String NomCliente){
        List<Album> ListAlb = albumJpaController.findAlbumEntities(); // Lista de álbumes de la BD
        List<String> nombresTemasAgregar = new ArrayList<>();
        List<String> nombresTemasDeAlbum = new ArrayList<>(); // Contendrá los nombres de todos los temas de cada álbum

        // Agregar todos los nombres de temas de los álbumes a nombresTemasDeAlbum
        for (Album alb : ListAlb) {
            for (Tema tem : alb.getTemas()) {
                nombresTemasDeAlbum.add(tem.getNombre());
            }
        }
         // Verificar si la lista particular existe para el cliente
        Cliente cli = clienteController.findCliente(NomCliente);
        if (cli != null) {
            List<Particular> ListPartCli = cli.getParticular();
            List<String> NTPC = new ArrayList<>(); 
            for(Particular part: ListPartCli){//Busco esa lista en la lista de cliente
               if(part.getNombre().equalsIgnoreCase(NomList)){
                   for(Tema tem: part.getTemas()){
                       NTPC.add(tem.getNombre());
                   }
               }
            }
            boolean existe= false;
            for(String NTA: nombresTemasDeAlbum){
                for(String tem: NTPC){
                    if(tem.equalsIgnoreCase(NTA)){
                        existe= true;
                        break;
                    }
                }
                if(existe==false){//Busco y no lo encontro entonces lo agrega
                    nombresTemasAgregar.add(NTA);
                }else{//Busco y se lo encontro entonces no lo agrega y resetea la variable
                    existe = false;
                }
            }
        }
            
        return nombresTemasAgregar;
    }
    @Override
    public List<String> obtenerNombresTemaParaPDADD(String NomList, String NomGen){
        List<Album> ListAlb = albumJpaController.findAlbumEntities(); // Lista de álbumes de la BD
        List<String> nombresTemasAgregar = new ArrayList<>();
        List<String> nombresTemasDeAlbum = new ArrayList<>(); // Contendrá los nombres de todos los temas de cada álbum
        porDefecto PD= porDefectoJpaController.findporDefecto(NomList);
        // Agregar todos los nombres de temas de los álbumes a nombresTemasDeAlbum
        for (Album alb : ListAlb) {
            for (Tema tem : alb.getTemas()){//Los temas se almacenanan en albunes
                for(Genero gene : tem.getGeneros()){//cada tema tiene a su vez una lista de genero
                         if (gene.getNombre().equalsIgnoreCase(NomGen)){//El tema comparte el mismo genero que se seleciono anteriormente se agrega
                            nombresTemasDeAlbum.add(tem.getNombre());//Nombre de Todos los temas que comparten el mismo genero
                        }
                   }
            }
        }  
        boolean existe= false;
         for(String NTDA: nombresTemasDeAlbum){//Nombre de todos los temas que comparten genero
           for(Tema tem: PD.getTemas()){//Lista de temas de la lista
                if(tem.getNombre().equalsIgnoreCase(NTDA)){//S
                   existe= true;
                   break;
                }
            }
            if(existe==false){//Busco y no lo encontro entonces lo agrega
                nombresTemasAgregar.add(NTDA);
            }else{//Busco y se lo encontro entonces no lo agrega y resetea la variable
                existe = false;
            }
        }     
        return nombresTemasAgregar;
    }
}
