/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Capa_Presentacion.DataTema;
import Capa_Presentacion.DataCliente;
import Capa_Presentacion.DataArtista;
import Capa_Presentacion.DataParticular;
import Persistencia.AlbumJpaController;
import Persistencia.ClienteJpaController;
import Persistencia.ArtistaJpaController;
import Persistencia.GeneroJpaController;
import Persistencia.ParticularJpaController;
import Persistencia.TemaJpaController;
import Persistencia.porDefectoJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

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
    public ClienteJpaController clienteController = new ClienteJpaController();
    public ArtistaJpaController artistaController = new ArtistaJpaController();
    public Ctrl(){}
    
    
    
    //crear un objeto de tipo album
    @Override
    public void CrearAlbum (String nombreA, String artista, int anioA, List<String> generosA, List<DataTema> temasA){
        AltaAlbum AA = new AltaAlbum(nombreA,artista,anioA,generosA,temasA);
    };
    
    @Override
    public void CrearTema (DataTema dt){
        AltaTema AT = new AltaTema(dt);
    }
    
    @Override
    public void crearGenero(String nomG, String padre){
        AltaGenero AG = new AltaGenero(nomG,padre);
    }
    
    @Override
    public void crearArtista(String nick, String nom, String ape, String mail, String pass, int dia, String mes, int anio, String bio, String web){
        int meses = 0;
        if(mes.equals("Enero")){
            meses = 1;
        }else if(mes.equals("Febrero")){
            meses = 2;
        }else if(mes.equals("Marzo")){
            meses = 3;
        }else if(mes.equals("Abril")){
            meses = 4;
        }else if(mes.equals("Mayo")){
            meses = 5;
        }else if(mes.equals("Junio")){
            meses = 6;
        }else if(mes.equals("Jucio")){
            meses = 7;
        }else if(mes.equals("Agosto")){
            meses = 8;
        }else if(mes.equals("Septiembre")){
            meses = 9;
        }else if(mes.equals("Octubre")){
            meses = 10;
        }else if(mes.equals("Noviembre")){
            meses = 11;
        }else if(mes.equals("Diciembre")){
            meses = 12;
        }
        DTFecha nacimiento = new DTFecha(dia, meses, anio);
        AltaUsuario AU = new AltaUsuario(nick, nom, ape, mail, pass, nacimiento, bio, web);
    }
    
    @Override
    public void crearCliente(String nick, String nom, String ape, String mail, String pass, int dia, String mes, int anio){
        int meses = 0;
        if(mes.equals("Enero")){
            meses = 1;
        }else if(mes.equals("Febrero")){
            meses = 2;
        }else if(mes.equals("Marzo")){
            meses = 3;
        }else if(mes.equals("Abril")){
            meses = 4;
        }else if(mes.equals("Mayo")){
            meses = 5;
        }else if(mes.equals("Junio")){
            meses = 6;
        }else if(mes.equals("Jucio")){
            meses = 7;
        }else if(mes.equals("Agosto")){
            meses = 8;
        }else if(mes.equals("Septiembre")){
            meses = 9;
        }else if(mes.equals("Octubre")){
            meses = 10;
        }else if(mes.equals("Noviembre")){
            meses = 11;
        }else if(mes.equals("Diciembre")){
            meses = 12;
        }
        DTFecha nacimiento = new DTFecha(dia, meses, anio);
        AltaUsuario AU = new AltaUsuario(nick, nom, ape, mail, pass, nacimiento, null, null);
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
    public void CreateLista(String Name, String Tipo, String GOP ){
        CrearLista CL= new CrearLista(Name, Tipo, GOP);
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
    public List <String> obtenerNombresDeAlbumes(){
        List<Album> listaAlbumes = albumJpaController.findAlbumEntities();
        
        List<String> nombresAlbumes= new ArrayList();
        
        for(Album alb : listaAlbumes){
            nombresAlbumes.add(alb.getNombre());
        }
        
        return nombresAlbumes;
    }
    
    @Override
    public List <String> obtenerNombresListasPartTODO(){
        List<Particular> listaPart = particularJpaController.findParticularEntities();
        
        List<String> nombresPart= new ArrayList();
        
        for(Particular part : listaPart){
            nombresPart.add(part.getNombre());
        }
        
        return nombresPart;
    }
    
    @Override
    public List <String> obtenerNombresListasPDTODO(){
        List<porDefecto> listaPD = porDefectoJpaController.findporDefectoEntities();
        
        List<String> nombresPD= new ArrayList();
        
        for(porDefecto pd : listaPD){
            nombresPD.add(pd.getNombre());
        }
        
        return nombresPD;
    }
    
    @Override
    public boolean existeGenero(String nomGenero){
        Genero gen = generoJpaController.findGenero(nomGenero);
        if(gen!=null){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public boolean esPrivado(String nombrePart, String nombreCliente){
        Particular part = particularJpaController.findParticular(nombrePart, nombreCliente);
        if(part.getPrivado()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String obtenerDuenioPart(String nomPart){
        List<Particular> part = particularJpaController.findParticularEntities();
        
        for(Particular parti : part){
            if(parti.getNombre().equalsIgnoreCase(nomPart)){
                return parti.getCliente().getNickname();
            }
        }
        return null;
    }
    
    @Override
    public List<String> obtenerPartPublicaDeDuenio(String nickCliente){
        Cliente cli = clienteController.findCliente(nickCliente);
        
        List<String> listaParticularPublica = new ArrayList();
        if(cli!=null){
            if(cli.getParticular()!=null){
                for(Particular parti : cli.getParticular()){
                    if(parti.getPrivado()){
                    }else{
                        listaParticularPublica.add(parti.getNombre());
                    }
                }
            }
        }
        if(listaParticularPublica.isEmpty()){
            return null;
        }
        return listaParticularPublica;
    }
    
    
    
    @Override
    public List<String> obtenerTemasDeAlbum(String nomAlbum){
        Album alb = albumJpaController.findAlbum(nomAlbum);
        
        List<String> temasAlbum = new ArrayList();
        if(alb!=null){
            for(Tema tem : alb.getTemas()){
                temasAlbum.add(tem.getNombre());
            }
        }
        
        return temasAlbum;
    }
    
    @Override
    public List<String> obtenerTemasDeGenero(String nomGenero){
        List<Tema> temasGeneral = temaJpaController.findTemaEntities();
        
        List<String> temasFiltrados = new ArrayList();
        
        for(Tema tem : temasGeneral){
            for(Genero gen : tem.getGeneros()){
                if(gen.getNombre().equalsIgnoreCase(nomGenero)){
                    temasFiltrados.add(tem.getNombre());
                }
            }
        }
        
        return temasFiltrados;
    }
    
    @Override
    public List<String> obtenerTemasDeParticular(String nomLista){
        Particular part = particularJpaController.findParticular(nomLista, obtenerDuenioPart(nomLista));
        
        List<String> temasLista = new ArrayList();
        
        if(part!=null){
            for(Tema tem : part.getTemas()){
                temasLista.add(tem.getNombre());
            }
        }
        return temasLista;
    }
    
    @Override
    public List<String> obtenerTemasDePD(String nomLista){
        porDefecto pd = porDefectoJpaController.findporDefecto(nomLista);
        
        List<String> temasLista = new ArrayList();
        
        if(pd!=null){
            for (Tema tem : pd.getTemas()){
                temasLista.add(tem.getNombre());
            }
        }
        return temasLista;
    }
    
    @Override
    public List<String> obtenerAlbumesDeArtista(String nickArtista){
        Artista art = artistaController.findArtista(nickArtista);
        
        List<String> albumes = new ArrayList();
        
        if(art!=null){
            for(Album alb : art.getAlbumes()){
                albumes.add(alb.getNombre());
            }
        }
        return albumes;
    }
    
    @Override
    public List<String> obtenerAlbumesDeGenero(String nomGen){
        
        List<String> albumes = new ArrayList();
        
        for(Album alb : albumJpaController.findAlbumEntities()){
            for(Genero gen : alb.getGeneros()){
                if (gen.getNombre().equalsIgnoreCase(nomGen)){
                    albumes.add(gen.getNombre());
                }
            }
        }
        
        return albumes;
    }
    
    @Override
    public List<String> obtenerListasDeGenero(String nomGen){
        
        List<String> listas = new ArrayList();
        
        for(porDefecto pd : porDefectoJpaController.findporDefectoEntities()){
            if ((pd.getGenero().getNombre()).equalsIgnoreCase(nomGen)){
                listas.add(pd.getNombre());
            }   
        }
        
        return listas;
    }
    
    @Override
    public boolean chequearFavorito(String tipo, String objeto, String nickCliente){
        Cliente cli = clienteController.findCliente(nickCliente);
        
        if (cli!=null){
            if(tipo.equalsIgnoreCase("Tema")){
                for (Tema tem : cli.getTemasFAV()){
                    if(tem.getNombre().equalsIgnoreCase(objeto)){
                        return true;
                    }
                }
            }
            
            if(tipo.equalsIgnoreCase("Album")){
                for(Album alb : cli.getAlbumFav()){
                    if(alb.getNombre().equalsIgnoreCase(objeto)){
                        return true;
                    }
                }
            }
            
            if(tipo.equalsIgnoreCase("Particular")){
                for (Particular part: cli.getPlayFavPart()){
                    if(part.getNombre().equalsIgnoreCase(objeto)){
                        return true;
                    }
                }
            }
            
            if(tipo.equalsIgnoreCase("Por Defecto")){
                for (porDefecto pd : cli.getPlayFavPD()){
                    if (pd.getNombre().equalsIgnoreCase(objeto)){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    @Override
    public void guardarTLA(String tipo, String fav, String nickCliente, String nickDuenioLista){
        GuardarTLA GTLA = new GuardarTLA(tipo,fav,nickCliente,nickDuenioLista);
    }
    
    @Override
    public List<String> obtenerNombresClienteConParticular(){
        // Obtenemos todos los géneros de la base de datos
        List<Cliente> listaCliente = clienteController.findClienteEntities();

        // Creamos una lista de strings para almacenar los nombres
        List<String> nombresCliente = new ArrayList<>();

        // Recorremos la lista de Cliente y extraemos sus nombres
        for (Cliente cli : listaCliente) {
            if(obtenerPartPublicaDeDuenio(cli.getNickname())==null){
                
            }else{
                nombresCliente.add(cli.getNickname());
            }
        }
        return nombresCliente;
    }
    
    @Override
    public List<String> obtenerNombresDeGenerosConPorDefecto() {
        // Obtenemos todos los géneros de la base de datos
        List<porDefecto> listaPorDefecto = porDefectoJpaController.findporDefectoEntities();

        // Creamos una lista de strings para almacenar los nombres
        List<String> nombresGeneros = new ArrayList<>();

        // Recorremos la lista de géneros y extraemos sus nombres
        for (porDefecto pd : listaPorDefecto) {
            if(nombresGeneros.contains(pd.getGenero().getNombre())){
                
            }else{
                nombresGeneros.add(pd.getGenero().getNombre());
            }
        }

        return nombresGeneros;
    }
    
    @Override
    public List<String> obtenerFavCliente(String tipo, String nickCliente){
        Cliente cli = clienteController.findCliente(nickCliente);
        
        List<String> favoritos = new ArrayList();
        
        if(tipo.equalsIgnoreCase("Tema")){
            for(Tema tem : cli.getTemasFAV()){
                favoritos.add(tem.getNombre());
            }
        }
        
        if(tipo.equalsIgnoreCase("Album")){
            for(Album alb : cli.getAlbumFav()){
                favoritos.add(alb.getNombre());
            }
        }
        
        if(tipo.equalsIgnoreCase("Particular")){
            for(Particular part : cli.getPlayFavPart()){
                favoritos.add(part.getNombre());
            }  
        }
        if(tipo.equalsIgnoreCase("Por Defecto")){
            for(porDefecto pd : cli.getPlayFavPD()){
                    favoritos.add(pd.getNombre());
                }
        }
        return favoritos;
    }
    
    @Override
    public void eliminarTLA(String tipo, String objeto, String nickCliente){
        EliminarTLA ETLA = new EliminarTLA(tipo, objeto, nickCliente);
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
    public List<String> obtenerNombresDeArtista() {
        // Obtenemos todos los géneros de la base de datos
        List<Artista> listaArtista = artistaController.findArtistaEntities();

        // Creamos una lista de strings para almacenar los nombres
        List<String> nombresArtista = new ArrayList<>();

        // Recorremos la lista de Cliente y extraemos sus nombres
        for (Artista art : listaArtista) {
            nombresArtista.add(art.getNickname());
        }

        return nombresArtista;
    }
    @Override
    public List<String> obtenerMailDeCliente() {
        // Obtenemos todos los géneros de la base de datos
        List<Cliente> listaCliente = clienteController.findClienteEntities();

        // Creamos una lista de strings para almacenar los nombres
        List<String> mailCliente = new ArrayList<>();

        // Recorremos la lista de Cliente y extraemos sus nombres
        for (Cliente cli : listaCliente) {
            mailCliente.add(cli.getCorreo());
        }

        return mailCliente;
    }
    @Override
    public List<String> obtenerMailDeArtista() {
        // Obtenemos todos los géneros de la base de datos
        List<Artista> listaArtista = artistaController.findArtistaEntities();

        // Creamos una lista de strings para almacenar los nombres
        List<String> mailArtista = new ArrayList<>();

        // Recorremos la lista de Cliente y extraemos sus nombres
        for (Artista art : listaArtista) {
            mailArtista.add(art.getCorreo());
        }

        return mailArtista;
    }
    @Override
    public boolean ExisListPartEnCliente(String NomList, String NomCliente){
        if(particularJpaController.findParticular(NomList,NomCliente)==null){//No existe
            return false;
        }else{
            return true;
        }
    }
    @Override
    public boolean ExisListPorDefEnGenero(String NomList){
        if(porDefectoJpaController.findporDefecto(NomList)==null){//No existe
            return false;
        }else{
            return true;
        }
    }
    @Override
    public List<String> obtenerNombresDeListPart( String NomCliente) {
        Cliente cli= clienteController.findCliente(NomCliente);
        if(cli!=null){
            List<Particular> playlistsParticulares = cli.getParticular(); // Lista de playlists del cliente
            // Creamos una lista de strings para almacenar los nombres
            List<String> nombresPart = new ArrayList<>();
            for (Particular part : playlistsParticulares) {
                nombresPart.add(part.getNombre());
            }
            return nombresPart;
        }else{
            return new ArrayList<>();
        }
    }
    @Override
    public List<String> obtenerNombresDeListPD( String NomGenero) {
        Genero gen= generoJpaController.findGenero(NomGenero);
        List<porDefecto> playlistsPD = porDefectoJpaController.findporDefectoEntities(); // Lista de playlists del cliente
        if (gen == null) {
            return new ArrayList<>(); // Retorna una lista vacía si el género no se encuentra
        }
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
            if(cli.getParticular().isEmpty()){
                return new ArrayList<>();
            }else{
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
        }
        return nombresTemasAgregar;
    }
    @Override
    public List<String> obtenerNombresTemaParaPDADD(String NomList, String NomGen){
        List<Album> ListAlb = albumJpaController.findAlbumEntities(); // Lista de álbumes de la BD
        List<String> nombresTemasAgregar = new ArrayList<>();
        List<String> nombresTemasDeAlbum = new ArrayList<>(); // Contendrá los nombres de todos los temas de cada álbum
        porDefecto PD = null;
        EntityManager em = porDefectoJpaController.getEntityManager(); // Obtener el EntityManager del JPA Controller
        try {
                // Escapamos el valor de la variable `NomList` para prevenir inyecciones SQL
                String query = "SELECT * FROM porDefecto WHERE nombre = '" + NomList + "'";
                PD = (porDefecto) em.createNativeQuery(query, porDefecto.class).getSingleResult();
            } catch (NoResultException e) {
                System.out.println("No se encontró la lista por defecto con el nombre: " + NomList);
                return new ArrayList<>(); // Retorna una lista vacía si no se encuentra
            } finally {
                em.close(); // Cerrar el EntityManager
            }
        if(PD==null){
            return new ArrayList<>(); // Retorna una lista vacía si la lista no se encuentra
        }
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
        if(!PD.getTemas().isEmpty()){
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
        }else{
            return nombresTemasDeAlbum;
        }
    }
    
    @Override
    public void AddTemaList(String Tipo, String NomPlay, String NomTema, String nom ){
        AgregarTemasLista ADD= new AgregarTemasLista(Tipo, NomPlay, NomTema, nom);
    }
    
    @Override
    public List<String> obtenerNombresTemaParaPDREMOVE(String NomList, String NomGen){
        List<String> NomTemas = new ArrayList<>();
        porDefecto PD = null;
        EntityManager em = porDefectoJpaController.getEntityManager(); // Obtener el EntityManager del JPA Controller
        try {
                // Escapamos el valor de la variable `NomList` para prevenir inyecciones SQL
                String query = "SELECT * FROM porDefecto WHERE nombre = '" + NomList + "'";
                PD = (porDefecto) em.createNativeQuery(query, porDefecto.class).getSingleResult();
            } catch (NoResultException e) {
                System.out.println("No se encontró la lista por defecto con el nombre: " + NomList);
                return new ArrayList<>(); // Retorna una lista vacía si no se encuentra
            } finally {
                em.close(); // Cerrar el EntityManager
            }
        if(PD==null){
            return new ArrayList<>(); // Retorna una lista vacía si la lista no se encuentra
        }
        // Agregar todos los nombres de temas de los álbumes a nombresTemasDeAlbum
        if(!PD.getTemas().isEmpty()){
            
            for(Tema tem: PD.getTemas()){
                NomTemas.add(tem.getNombre());
            }
        }else{
            return new ArrayList<>(); // Retorna una lista vacía si la lista no contiene temas
        }
        return NomTemas;
    }
    @Override
    public List<String> obtenerNombresTemaParaPartREMOVE(String NomList, String NomCliente){
        // Verificar si la lista particular existe para el cliente
        Cliente cli = clienteController.findCliente(NomCliente);
        if (cli != null) {
            if(cli.getParticular().isEmpty()){
                return new ArrayList<>();
            }else{
                List<Particular> ListPartCli = cli.getParticular();
                List<String> NomTema = new ArrayList<>(); 
                for(Particular part: ListPartCli){//Busco esa lista en la lista de cliente
                   if(part.getNombre().equalsIgnoreCase(NomList)){
                       for(Tema tem: part.getTemas()){
                           NomTema.add(tem.getNombre());
                       }
                       return NomTema;
                   }
                }  
            }
        }
        return new ArrayList<>();
    }
    
    @Override
    public void RemoveTemaList(String Tipo, String NomPlay, String NomTema, String nom ){
        QuitarTemasLista Remove= new QuitarTemasLista(Tipo, NomPlay, NomTema, nom);
    }
    
    @Override
    public String nombreCliente (String nick){
        return clienteController.findCliente(nick).getNombre();
    }
    @Override
    public String apellidoCliente (String nick){
        return clienteController.findCliente(nick).getApellido();
    }
    @Override
    public String mailCliente (String nick){
        return clienteController.findCliente(nick).getCorreo();
    }
    @Override
    public String fechaCliente (String nick){
        DTFecha a = clienteController.findCliente(nick).getFecha();
        String retorno = new String();
        int dia = a.getDia();
        int mes = a.getMes();
        int ano = a.getAnio();
        retorno = dia+"/"+mes+"/"+ano;
        return retorno;
    }
    @Override
    public List<String> listaSeguidoresCliente (String nick){
        Cliente cli = clienteController.findCliente(nick);
        List<String> retorno = new ArrayList<>();
        for(Cliente cliSeguido : cli.getCliSigueA()){
            retorno.add("Cliente - "+cliSeguido.getNickname());
        }
        for(Artista cliSeguido : cli.getArtSigueA()){
            retorno.add("Artista - "+cliSeguido.getNickname());
        }
        return retorno;
    }
    @Override
    public List<String> listaSeguidosCliente (String nick){
        List<Cliente> listaCliente = clienteController.findClienteEntities();
        List<String> cliente = new ArrayList<>();
        for (Cliente cli : listaCliente) {
            cliente.add(cli.getNickname());
        }
        
        Cliente cli = clienteController.findCliente(nick);
        List<String> retorno = new ArrayList<>();
        for(Cliente cliSeguidores : cli.getSeguidoPor()){
            if(cliente.contains(cliSeguidores.getNickname())){
                retorno.add("Cliente - "+cliSeguidores.getNickname());
            }else{
                retorno.add("Artista - "+cliSeguidores.getNickname());
            }
        }
        return retorno;
    }
    @Override
    public List<String> listaTemasFavCliente (String nick){
        Cliente cli = clienteController.findCliente(nick);
        List<String> retorno = new ArrayList<>();
        for(Tema tem : cli.getTemasFAV()){
            retorno.add(tem.getNombre()+" - "+tem.getDuracion());
        }
        return retorno;
    }
    @Override
    public List<String> listaAlbumFavCliente (String nick){
        Cliente cli = clienteController.findCliente(nick);
        List<String> retorno = new ArrayList<>();
        for(Album alb : cli.getAlbumFav()){
            retorno.add(alb.getNombre()+" - "+alb.getArtista());
        }
        return retorno;
    }
    @Override
    public List<String> listaPlaylistFavCliente (String nick){
        Cliente cli = clienteController.findCliente(nick);
        List<String> retorno = new ArrayList<>();
        for(Particular part : cli.getPlayFavPart()){
            retorno.add(part.getNombre());
        }
        for(porDefecto pd : cli.getPlayFavPD()){
            retorno.add(pd.getNombre());
        }
        return retorno;
    }
    @Override
    public List<String> listaPlaylistCliente (String nick){
        Cliente cli = clienteController.findCliente(nick);
        List<String> retorno = new ArrayList<>();
        for(Particular part : cli.getParticular()){
            if(part.getPrivado() == false){
                retorno.add(part.getNombre());
            }
        }
        return retorno;
    }
    
    @Override
    public String nombreArtista (String nick){
        return artistaController.findArtista(nick).getNombre();
    }
    @Override
    public String apellidoArtista (String nick){
        return artistaController.findArtista(nick).getApellido();
    }
    @Override
    public String mailArtista (String nick){
        return artistaController.findArtista(nick).getCorreo();
    }
    @Override
    public String fechaArtista (String nick){
        DTFecha a = artistaController.findArtista(nick).getFecha();
        String retorno = new String();
        int dia = a.getDia();
        int mes = a.getMes();
        int ano = a.getAnio();
        retorno = dia+"/"+mes+"/"+ano;
        return retorno;
    }
    @Override
    public String webArtista (String nick){
        return artistaController.findArtista(nick).getSitioWeb();
    }
    @Override
    public String bioArtista (String nick){
        return artistaController.findArtista(nick).getBiografia();
    }
    @Override
    public List<String> listaSeguidoresArtista (String nick){
        int contador = 1;
        Artista art = artistaController.findArtista(nick);
        List<String> retorno = new ArrayList<>();
        for(Cliente seguidor : art.getSeguidoPorA()){
            retorno.add(contador+" - "+seguidor.getNickname());
            contador++;
        }
        return retorno;
    }
    @Override
    public int cantSeguidoresArtista (String nick){
        int contador = 0;
        Artista art = artistaController.findArtista(nick);
        for(Cliente seguidor : art.getSeguidoPorA()){
            contador++;
        }
        return contador;
    }
    @Override
    public List<String> listaAlbumArtista (String nick){
        Artista art = artistaController.findArtista(nick);
        List<String> retorno = new ArrayList<>();
        for(Album alb : art.getAlbumes()){
            retorno.add(alb.getNombre());
        }
        return retorno;
    }
    
    @Override
    public String publicarLista (String nick, String lista){
        String retorno = nick;
        
        Particular listaP = particularJpaController.findParticular(lista, nick);
        if(listaP.getPrivado()!=false){
            listaP.setPrivado(false);
            retorno = "Se publico la lista "+lista+" con exito";
        }else{
            retorno = "La lista "+lista+" ya es publica";
        }
        
        return retorno;
    }
    
    @Override
    public List<String> obtenerPartPrivadaDeDuenio (String nick){
        Cliente cli = clienteController.findCliente(nick);
        
        List<String> listaParticularPublica = new ArrayList();
        if(cli!=null){
            if(cli.getParticular()!=null){
                for(Particular parti : cli.getParticular()){
                    if(!parti.getPrivado()){
                    }else{
                        listaParticularPublica.add(parti.getNombre());
                    }
                }
            }
        }
        if(listaParticularPublica.isEmpty()){
            return null;
        }
        return listaParticularPublica;
    }
    
    @Override
    public List<String> clientesConParticularesPriv (){
        // Obtenemos todos los géneros de la base de datos
        List<Cliente> listaCliente = clienteController.findClienteEntities();
        

        // Creamos una lista de strings para almacenar los nombres
        List<String> nombresCliente = new ArrayList<>();

        // Recorremos la lista de Cliente y extraemos sus nombres
        for (Cliente cli : listaCliente) {
            if(obtenerPartPrivadaDeDuenio(cli.getNickname())==null){
                
            }else{
                nombresCliente.add(cli.getNickname());
            }
        }
        return nombresCliente;
    }
    @Override
    public String seguirPerfil (String cliente, String tipo, String aSeguir){
        String retorno = "";
        Cliente cli = clienteController.findCliente(cliente);
        if(tipo.equals("Cliente")){
            Cliente segC = clienteController.findCliente(aSeguir);
            agregarSeguidorC(segC, cli);
            retorno = "Ahora "+cli.getNickname()+" sigue a "+segC.getNickname();
        }else{
            Artista segA = artistaController.findArtista(aSeguir);
            agregarSeguidorA(segA, cli);
            retorno = "Ahora "+cli.getNickname()+" sigue a "+segA.getNickname();
        }
        return retorno;
    }
    @Override
    public String dejarSeguirPerfil (String cliente, String tipo, String aSeguir){
        String retorno = "";
        Cliente cli = clienteController.findCliente(cliente);
        if(tipo.equals("Cliente")){
            Cliente segC = clienteController.findCliente(aSeguir);
            dejarSeguidorC(segC, cli);
            retorno = cli.getNickname()+" dejo de siguir a "+segC.getNickname();
        }else{
            Artista segA = artistaController.findArtista(aSeguir);
            dejarSeguidorA(segA, cli);
            retorno = cli.getNickname()+" dejo de siguir a "+segA.getNickname();
        }
        return retorno;
    }
}
