/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.ArrayList;
import java.util.List;

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
        
        //Creacion de artistas
        Artista VP = ictrl.crearArtista("vpeople", "Village", "People", "vpeople@tuta.io", 1, 1, 1977,"Village People es una innovadora formación musical de estilo disco de finales de los años 70. Fue famosa tanto por sus peculiares disfraces, como por sus canciones pegadizas, con letras sugerentes y llenas de dobles sentidos.","www.officialvillagepeople.com");
        mu.addArtista(VP);
        Artista DM = ictrl.crearArtista("dmode", "Depeche", "Mode", "dmode@tuta.io", 14, 6, 1980,"","www.depechemode.com");
        mu.addArtista(DM);
        Artista CL = ictrl.crearArtista("clauper", "Cyndi", "Lauper", "clauper@hotmail.com", 22, 6, 1953,"Cynthia Ann Stephanie Lauper, conocida simplemente como Cyndi Lauper, es una cantautora, actriz y empresaria estadounidense. Después de participar en el grupo musical, Blue Angel, en 1983 firmó con Portrait Records (filial de Epic Records) y lanzó su exitoso álbum debut She's So Unusual a finales de ese mismo año Siguió lanzando una serie de álbumes en los que encontró una inmensa popularidad, superando los límites de contenido de las letras de sus canciones.","www.cyndilauper.com");
        mu.addArtista(CL);
        Artista BS = ictrl.crearArtista("bruceTheBoss", "Bruce", "Springsteen", "bruceTheBoss@gmail.com", 23, 9, 1949,"","brucespringsteen.net");
        mu.addArtista(BS);
        Artista TN = ictrl.crearArtista("tripleNelson", "La Triple", "Nelson", "tripleNelson@tuta.io", 1, 1, 1998,"La Triple Nelson es un grupo de rock uruguayo formado en enero de 1998 e integrado inicialmente por Christian Cary (guitarra y voz), Fernando \"Paco\" Pintos (bajo y coros) y Rubén Otonello (actualmente su nuevo baterista es Rafael Ugo).","");
        mu.addArtista(TN);
        Artista LL = ictrl.crearArtista("la_ley", "La", "Ley", "la_ley@tuta.io", 14, 2, 1987,"","");
        mu.addArtista(LL);
        Artista TJ = ictrl.crearArtista("tigerOfWales", "Tom", "Jones", "tigerOfWales@tuta.io", 7, 6, 1940,"Sir Thomas John, conocido por su nombre artístico de Tom Jones, es un cantante británico. Ha vendido más de 100 millones de discos en todo el mundo.1","www.tomjones.com");
        mu.addArtista(TJ);
        Artista PT = ictrl.crearArtista("chaiko", "Piotr", "Tchaikovsky", "chaiko@tuta.io", 25, 4, 1840,"Piotr Ilich Chaikovski fue un compositor ruso del período del Romanticismo","");
        mu.addArtista(PT);
        Artista NN = ictrl.crearArtista("nicoleneu", "Nicole", "Neumann", "nicoleneu@hormail.com", 31, 10, 1980,"","");
        mu.addArtista(NN);
        Artista PI = ictrl.crearArtista("lospimpi", "Pimpinela", "", "lospimpi@gmail.com", 13, 8, 1981,"","www.pimpinela.net");
        mu.addArtista(PI);
        Artista DY = ictrl.crearArtista("dyangounchained", "Dyango", "", "dyangounchained@gmail.com", 5, 3, 1940,"José Gómez Romero, conocido artísticamente como Dyango es un cantante español de música romántica","");
        mu.addArtista(DY);
        Artista AL = ictrl.crearArtista("alcides", "Alcides", "", "alcides@tuta.io", 17, 7, 1952,"Su carrera comienza en 1976 cuando forma la banda Los Playeros junto a su hermano 3 Edición 2024 Víctor. Al poco tiempo se mudan a San Luis donde comienzan a hacerse conocidos en la escena musical. Su éxito a nivel nacional llega a comienzos de los años 1990 cuando desembarca en Buenos Aires y graba el éxito \"Violeta\", originalmente compuesta e interpretada en 1985 por el músico brasileño Luiz Caldas bajo el título «Fricote».","");
        mu.addArtista(AL);
        
        //Creacion de cliente
        Cliente VC = ictrl.crearCliente("el_padrino", "Vito", "Coronele", "el_padrino@tuta.io", 8, 3, 1972);
        mu.addCliente(VC);
        Cliente SO = ictrl.crearCliente("scarlettO", "Scarlett", "O'Hara", "scarlettO@tuta.io", 27, 11, 1984);
        mu.addCliente(SO);
        Cliente PA = ictrl.crearCliente("ppArgento", "Pepe", "Argento", "ppArgento@hotmail.com", 14, 2, 1955);
        mu.addCliente(PA);
        Cliente WW = ictrl.crearCliente("Heisenberg", "Walter", "White", "Heisenber@tuta.io", 7, 3, 1956);
        mu.addCliente(WW);
        Cliente OK = ictrl.crearCliente("benKenobi", "Obi-Wan", "Kenobi", "benKenobi@gmail.com", 2, 4, 1914);
        mu.addCliente(OK);
        Cliente ML = ictrl.crearCliente("lachiqui", "Mirtha", "Legrand", "lachiqui@hotmail.com.ar", 23, 2, 1927);
        mu.addCliente(ML);
        Cliente CB = ictrl.crearCliente("cbochinche", "Cacho", "Bochinche", "cbobhinche@vera.com.uy", 8, 5, 1937);
        mu.addCliente(CB);
        Cliente EL = ictrl.crearCliente("Eleven11", "Eleven", "", "Eleven11@gmail.com", 31, 12, 1971);
        mu.addCliente(EL);
        Cliente CM = ictrl.crearCliente("Snorlax55", "Camilo", "Molina", "camilo.molina@estudiantes.utec.edu.uy", 21, 6, 2002);
        mu.addCliente(CM);
        Cliente FD = ictrl.crearCliente("DeathEyeAlpha", "Franco", "DaCosta", "franco.dacosta@estudiantes.utec.edu.uy", 1, 5, 2003);
        mu.addCliente(FD);
        Cliente TC = ictrl.crearCliente("cedrego", "Thiago", "Cedres", "thiago.cedres@estudiantes.utec.edu.uy", 23, 12, 2003);
        mu.addCliente(TC);
        Cliente EB = ictrl.crearCliente("goliat1445", "Enzo", "Brun", "enzo.brun@estudiantes.utec.edu.uy", 11, 3, 2004);
        mu.addCliente(EB);
        
        //Seguidos
        
        //Creacion de generos
        Genero Genero = mm.buscarGenero("");
        Genero ROK = ictrl.crearGenero("Rock", Genero);
        mm.addGenero(ROK);
        Genero ROKP = mm.buscarGenero("Rock");
        Genero RCL = ictrl.crearGenero("Rock Clasico", ROKP);
        mm.addGenero(RCL);
        Genero RKL = ictrl.crearGenero("Rock Latino", ROKP);
        mm.addGenero(RKL);
        Genero RAR = ictrl.crearGenero("Rock & Roll", ROKP);
        mm.addGenero(RAR);
        Genero CLA = ictrl.crearGenero("Clasica", Genero);
        mm.addGenero(CLA);
        Genero DIS = ictrl.crearGenero("Disco", Genero);
        mm.addGenero(DIS);
        Genero POP = ictrl.crearGenero("Pop", Genero);
        mm.addGenero(POP);
        Genero POPP = mm.buscarGenero("Pop");
        Genero EPO = ictrl.crearGenero("Electropop", POPP);
        mm.addGenero(EPO);
        Genero DPO = ictrl.crearGenero("Dance-pop", POPP);
        mm.addGenero(DPO);
        Genero PCL = ictrl.crearGenero("Pop Clasico", POPP);
        mm.addGenero(PCL);
        Genero BAL = ictrl.crearGenero("Balada", Genero);
        mm.addGenero(BAL);
        Genero CUM = ictrl.crearGenero("Cumbia", Genero);
        mm.addGenero(CUM);
        
        //Creacion Albumes
        
        Genero ROKG = mm.buscarGenero("Rock");
        Genero RCLG = mm.buscarGenero("Rock Clasico");
        Genero RKLG = mm.buscarGenero("Rock Latino");
        Genero RARG = mm.buscarGenero("Rock & Roll");
        Genero CLAG = mm.buscarGenero("Clasica");
        Genero DISG = mm.buscarGenero("Disco");
        Genero POPG = mm.buscarGenero("Pop");
        Genero EPOG = mm.buscarGenero("ElectroPop");
        Genero DPOG = mm.buscarGenero("Dance-pop");
        Genero PCLG = mm.buscarGenero("Pop Clasico");
        Genero BALG = mm.buscarGenero("Balada");
        Genero CUMG = mm.buscarGenero("Cumbia");
        
        List<Genero> DisDpoPcl = new ArrayList<>();
        DisDpoPcl.add(DISG);
        DisDpoPcl.add(DPOG);
        DisDpoPcl.add(PCLG);
        
        List<Genero> Epo = new ArrayList<>();
        Epo.add(EPOG);
        
        List<Genero> PclDpo = new ArrayList<>();
        PclDpo.add(PCLG);
        PclDpo.add(DPOG);
        
        List<Genero> RclRarPcl = new ArrayList<>();
        RclRarPcl.add(RCLG);
        RclRarPcl.add(RARG);
        RclRarPcl.add(PCLG);
        
        List<Genero> RclPcl = new ArrayList<>();
        RclPcl.add(RCLG);
        RclPcl.add(PCLG);
        
        List<Genero> Rkl = new ArrayList<>();
        Rkl.add(RKLG);
        
        List<Genero> RklPcl = new ArrayList<>();
        RklPcl.add(RKLG);
        RklPcl.add(PCLG);
        
        List<Genero> Cla = new ArrayList<>();
        Cla.add(CLAG);
        
        List<Genero> PclBal = new ArrayList<>();
        PclBal.add(PCLG);
        PclBal.add(BALG);
        
        List<Genero> Cum = new ArrayList<>();
        Cum.add(CUMG);
        
        List<Tema> VPLT = new ArrayList<>();
        Tema T11 = ictrl.CrearTema("YMCA", "4:28", 1, DisDpoPcl);
        VPLT.add(T11);
        Tema T12 = ictrl.CrearTema("Macho Man", "3:28", 2, DisDpoPcl);
        VPLT.add(T12);
        Tema T13 = ictrl.CrearTema("In the Navy", "3:13", 3, DisDpoPcl);
        VPLT.add(T12);
                
        List<Tema> DMVT = new ArrayList<>();
        Tema T21 = ictrl.CrearTema("Personal Jesus", "4:56", 1, Epo);
        DMVT.add(T21);
        Tema T22 = ictrl.CrearTema("Enjoy The Silence", "4:21", 2, Epo);
        DMVT.add(T22);
        
        List<Tema> CLUT = new ArrayList<>();
        Tema T31 = ictrl.CrearTema("Girls Just Want To Have Fun", "3:15", 1, PclDpo);
        CLUT.add(T31);
        Tema T32 = ictrl.CrearTema("Time After Time", "5:12", 2, PclDpo);
        CLUT.add(T32);
        
        List<Tema> USAT = new ArrayList<>();
        Tema T41 = ictrl.CrearTema("Born In The U.S.A.", "4:58", 1, RclRarPcl);
        USAT.add(T41);
        Tema T42 = ictrl.CrearTema("Glory Days", "5:23", 2, RclRarPcl);
        USAT.add(T42);
        Tema T43 = ictrl.CrearTema("Dancing In The Park", "3:58", 3, RclRarPcl);
        USAT.add(T43);
        
        List<Tema> INUT = new ArrayList<>();
        Tema T51 = ictrl.CrearTema("It's Not Unusual", "2:00", 1, RclPcl);
        INUT.add(T51);
        
        List<Tema> AYST = new ArrayList<>();
        Tema T61 = ictrl.CrearTema("Adagio De Mi Pais", "4:50", 1, Rkl);
        AYST.add(T61);
        
        List<Tema> LLUT = new ArrayList<>();
        Tema T71 = ictrl.CrearTema("El Duelo", "5:23", 1, RklPcl);
        LLUT.add(T71);
        Tema T72 = ictrl.CrearTema("Mentira", "4:48", 2, RklPcl);
        LLUT.add(T72);
        
        List<Tema> LDCT = new ArrayList<>();
        Tema T81 = ictrl.CrearTema("Acto 2, Numero 10, Escena (Moderato)", "2:40", 1, Cla);
        LLUT.add(T81);
        
        List<Tema> CPPT = new ArrayList<>();
        Tema T91 = ictrl.CrearTema("Primer Movimiento (Allegro non )", "2:40", 1, Cla);
        LLUT.add(T91);
        
        List<Tema> PAMT = new ArrayList<>();
        List<Tema> LOCT = new ArrayList<>();
        List<Tema> VIOT = new ArrayList<>();
        
        Album VPL = ictrl.CrearAlbum("Village People Live and Sleazy", 1980, DisDpoPcl, VPLT);        
        mm.addAlbum(VPL);
        mu.buscarArtista("vpeople").addAlbum(VPL);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        /*
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        
        Album DMV = ictrl.CrearAlbum("Violator", 1990, Epo, DMVT);        
        mm.addAlbum(DMV);
        mu.buscarArtista("dmode").addAlbum(DMV);
        */
    }
}