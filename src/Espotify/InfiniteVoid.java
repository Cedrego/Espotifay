/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;
/**
 *
 * @author Camilo
 */
public class InfiniteVoid {
    private ICtrl ictrl;
            
    public InfiniteVoid(ICtrl ic){
        ManejadorUsuario mu = ManejadorUsuario.getInstance();
        ManejadorMusica mm = ManejadorMusica.getInstance();
        ictrl = ic;
        Artista VP = ictrl.crearArtista("vpeople", "Village", "People", "vpeople@tuta.io", 1, 1, 1977,"Village People es una innovadora formación musical de estilo disco de finales de los años 70. Fue famosa tanto por sus peculiares disfraces, como por sus canciones pegadizas, con letras sugerentes y llenas de dobles sentidos.","www.officialvillagepeople.com");
        mu.addArtista(VP);
        Artista DM = ictrl.crearArtista("dmode", "Depeche", "Mode", "dmode@tuta.io", 14, 6, 1980,"","www.depechemode.com");
        mu.addArtista(DM);
        Artista CL = ictrl.crearArtista("clauper", "Cyndi", "Lauper", "clauper@hotmail.com", 22, 6, 1953,"Cynthia Ann Stephanie Lauper, conocida simplemente como Cyndi Lauper, es una cantautora, actriz y empresaria estadounidense. Después de participar en el grupo musical, Blue Angel, en 1983 firmó con Portrait Records (filial de Epic Records) y lanzó su exitoso álbum debut She's So Unusual a finales de ese mismo año Siguió lanzando una serie de álbumes en los que encontró una inmensa popularidad, superando los límites de contenido de las letras de sus canciones.","www.cyndilauper.com");
        mu.addArtista(CL);
        Artista BS = ictrl.crearArtista("bruceTheBoss", "Bruce", "Springsteen", "bruceTheBoss@gmail.com", 23, 9, 1949,"","brucespringsteen.net");
        mu.addArtista(BS);
        Cliente VC = ictrl.crearCliente("el_padrino", "Vito", "Coronele", "el_padrino@tuta.io", 8, 3, 1972);
        mu.addCliente(VC);
    }
}