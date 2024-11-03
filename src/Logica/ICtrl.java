/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Capa_Presentacion.DataAlbum;
import Capa_Presentacion.DataArtistaAlt;
import Capa_Presentacion.DataCliente;
import Capa_Presentacion.DataClienteAlt;
import Capa_Presentacion.DataClienteMin;
import Capa_Presentacion.DataParticular;
import Capa_Presentacion.DataPorDefecto;
import Capa_Presentacion.DataSuscripcion;
import Capa_Presentacion.DataTema;
import java.util.List;

/**
 *
 * @author Franco
 */
public interface ICtrl {
    
    public abstract boolean existeGenero(String nomGenero);
    public abstract boolean existePassC(String NOE, String Contra);
    public abstract boolean existePassA(String NOE, String Contra);
    public abstract boolean A(boolean a);
    public abstract List<String> ContraXCliente(String NOE,String Contra);
    public abstract List<String> ContraXArtista(String NOE,String Contra);
    public abstract DataClienteAlt getDataClienteAlt(String NickCli);
    public abstract DataArtistaAlt getDataArtistaAlt(String NickArt);
    public abstract List<DataClienteMin> getDataClienteMin();
    public abstract void crearSucscripcion(String NickUsuario,String TipoSus);
    public abstract void actualizarEstado(Long id, String nuevoEstado);
    public abstract void ChequeoVencimientoSUS();
    
    public abstract void CrearAlbum (String nombreA, String artista, int anioA, List<String> generosA, List<DataTema> temasA);
    public abstract void CrearTema(DataTema dt);
    public abstract void crearGenero(String nomG, String padre);
    public abstract void crearCliente(String nick, String nom, String ape, String mail, String pass, int dia, String mes, int anio, String picture);
    public abstract void crearArtista(String nick, String nom, String ape, String mail, String pass, int dia, String mes, int anio, String bio, String web, String picture);
    public abstract void agregarSeguidorC(Cliente cliente, Cliente seguidor);
    public abstract void agregarSeguidorA(Artista artista, Cliente seguidor);
    public abstract void dejarSeguidorC(Cliente usuario, Cliente seguidor);
    public abstract void dejarSeguidorA(Artista usuario, Cliente seguidor);
    public abstract void InfiniteVoid();
    public abstract void CreateLista(String Name, String Tipo, String GOP, String Fecha );
    public abstract Particular CrearListParticular(String nombre, String nomCliente, String Fecha);
    public abstract porDefecto CrearListPorDefecto(String nombre, String genero);
    public abstract void Publicar(String lista,String cli);
    
    public abstract List<String> obtenerNombresDeGeneros();
    public abstract List <String> obtenerNombresDeAlbumes();

    public abstract List<String> obtenerNombresDeCliente();
    public abstract List<String> obtenerNombresDeArtista();
    public abstract List<String> obtenerMailDeCliente();
    public abstract List<String> obtenerMailDeArtista();
    public abstract boolean ExisListPartEnCliente(String NomList, String NomCliente);
    public abstract boolean ExisListPorDefEnGenero(String NomList);
    public abstract List<String> obtenerNombresDeListPart(String NomCliente);
    public abstract List<String> obtenerNombresDeListPD( String NomGenero);
    public abstract List<String> obtenerNombresTemaParaPartADD(String NomList, String NomCliente);
    public abstract List<String> obtenerNombresTemaParaPDADD(String NomList, String NomGen);
    public abstract void AddTemaList(String Tipo, String NomPlay, String NomTema, String nom );
    public abstract List<String> obtenerNombresTemaParaPDREMOVE(String NomList, String NomGen);
    public abstract List<String> obtenerNombresTemaParaPartREMOVE(String NomList, String NomCliente);
    public abstract void RemoveTemaList(String Tipo, String NomPlay, String NomTema, String nom );
    public abstract List <String> obtenerNombresListasPartTODO();
    public abstract List <String> obtenerNombresListasPDTODO();
    public abstract boolean esPrivado(String nombrePart, String nombreCliente);
    public abstract List<String> obtenerPartPublicaDeDuenio(String nickCliente);
    public abstract List<String> obtenerTemasDeAlbum(String nomAlbum);
    public abstract List<String> obtenerTemasDeGenero(String nomGenero);
    public abstract List<String> obtenerTemasDeParticular(String nomLista);
    public abstract List<String> obtenerTemasDePD(String nomLista);
    public abstract List<String> obtenerAlbumesDeArtista(String nickArtista);
    public abstract List<String> obtenerAlbumesDeGenero(String nomGen);
    public abstract boolean chequearFavorito(String tipo, String objeto, String nickCliente);
    public abstract void guardarTLA(String tipo, String fav, String nickCliente, String nickDuenioLista);
    public abstract List<String> obtenerFavCliente(String tipo, String nickCliente);
    public abstract void eliminarTLA(String tipo, String objeto, String nickCliente);
    public abstract String obtenerDuenioPart(String nomPart);
    public abstract List<String> obtenerNombresClienteConParticular();
    public abstract List<String> obtenerNombresDeGenerosConPorDefecto();
    public abstract List<String> obtenerListasDeGenero(String nomGen);
    public abstract boolean ArtistaTieneAlbum(Artista art);
    public abstract List<String> obtenerNombresDeArtistaConAlbum();
    public abstract List<String> obtenerNombresDeGenerosConAlbum();
    public abstract DataAlbum obtenerDataAlbum(String nomAlbum);
    public abstract DataParticular obtenerDataParticular(String nombPart, String nickCli);
    public abstract DataPorDefecto obtenerDataPorDefecto(String nombPart);
    public abstract Tema obtenerTema(String nombreTema, String nombreAlbum);
    public abstract int obtenerIdTema(String nombreTema, String nombreAlbum);
    public abstract DataTema crearDataTemaAltaAlbum(List<DataTema> temasAlbum, String nombreTema,String alb,String duracionTema, int ordenAlbumT, String guardadoT,List<String> Generos);
    
    public abstract List<String> listaPlaylistCliente (String nick);
    public abstract List<String> listaPlaylistFavCliente (String nick);
    public abstract List<String> listaAlbumFavCliente (String nick);
    public abstract List<String> listaTemasFavCliente (String nick);
    public abstract List<String> listaSeguidosCliente (String nick);
    public abstract List<String> listaSeguidoresCliente (String nick);
    public abstract String fechaCliente (String nick);
    public abstract String mailCliente (String nick);
    public abstract String apellidoCliente (String nick);
    public abstract String nombreCliente (String nick);
    
    public abstract String nombreArtista (String nick);
    public abstract String apellidoArtista (String nick);
    public abstract String mailArtista (String nick);
    public abstract String fechaArtista (String nick);
    public abstract String webArtista (String nick);
    public abstract String bioArtista (String nick);
    public abstract List<String> listaSeguidoresArtista (String nick);
    public abstract int cantSeguidoresArtista (String nick);
    public abstract List<String> listaAlbumArtista (String nick);
    public abstract String publicarLista (String nickname, String nombreLista);
    public abstract List<String> clientesConParticularesPriv ();
    public abstract List<String> obtenerPartPrivadaDeDuenio (String nick);
    public abstract String seguirPerfil (String cliente, String tipo, String aSeguir);
    public abstract String dejarSeguirPerfil (String cliente, String tipo, String aSeguir);
    public abstract void ordenarTemasPorPosicion(List<DataTema> temasAlbum);
    
    public abstract List<DataSuscripcion> ObtenerSubscClietne(String NickCliente);
    public abstract DataSuscripcion createDataSuscripcion(Suscripcion Sus);
    public abstract void ActualizarSuscripcion(Long ID, String Estado);
    public abstract void CreateSus(String Estado,String dia,String mes, String anio, String Tipo, String Cliente );
    //FUNCIONES SW
    public abstract List<String> listaSeguidoresClienteSW(String nick);
    
    public abstract List<String> buscadorAlbum(String query);
    public abstract List<DataTema> buscadorTema(String query);
    public abstract List<String> buscadorPart(String query);
    public abstract List<String> buscadorPD(String query);
}
