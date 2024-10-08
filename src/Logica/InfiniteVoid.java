/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.GeneroJpaController;
import Persistencia.exceptions.NonexistentEntityException;
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
        ManejadorPlaylist mp = ManejadorPlaylist.getInstance();
        ictrl = ic;
        /*
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
        Cliente TC = ictrl.crearCliente("Abel", "Thiago", "Cedrés", "thiago.cedres@estudiantes.utec.edu.uy", 23, 12, 2003);
        mu.addCliente(TC);
        Cliente EB = ictrl.crearCliente("goliat1445", "Enzo", "Brun", "enzo.brun@estudiantes.utec.edu.uy", 11, 3, 2004);
        mu.addCliente(EB);
        //Seguidos
        
        //Creacion de generos
        Genero enero = ictrl.crearGenero("Genero", null);
        Genero Genero = mm.buscarGenero("Genero");
        mm.addGenero(Genero);
        Genero ROK = ictrl.crearGenero("Rock", Genero);
        mm.addGenero(ROK);
        Genero ROKP = mm.buscarGenero("Rock");
        Genero RCL = ictrl.crearGenero("Rock Clasico", ROK);
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
        Tema T11 = ictrl.CrearTema("YMCA", "4:28", 1,"bit.ly/SCvpymca", DisDpoPcl);
        VPLT.add(T11);
        Tema T12 = ictrl.CrearTema("Macho Man", "3:28", 2,"picosong.com/download/zf8T", DisDpoPcl);
        VPLT.add(T12);
        Tema T13 = ictrl.CrearTema("In the Navy", "3:13", 3,"bit.ly/SCvpinthenavy", DisDpoPcl);
        VPLT.add(T13);
        
                
        List<Tema> DMVT = new ArrayList<>();
        Tema T21 = ictrl.CrearTema("Personal Jesus", "4:56", 1,"picosong.com/download/zfQ3", Epo);
        DMVT.add(T21);
        Tema T22 = ictrl.CrearTema("Enjoy The Silence", "4:21", 2,"picosong.com/download/zfQX", Epo);
        DMVT.add(T22);

        List<Tema> CLUT = new ArrayList<>();
        Tema T31 = ictrl.CrearTema("Girls Just Want To Have Fun", "3:15", 1,"bit.ly/SCclgirlsjustwant", PclDpo);
        CLUT.add(T31);
        Tema T32 = ictrl.CrearTema("Time After Time", "5:12", 2,"picosong.com/download/zfER", PclDpo);
        CLUT.add(T32);

        List<Tema> USAT = new ArrayList<>();
        Tema T41 = ictrl.CrearTema("Born In The U.S.A.", "4:58", 1,"bit.ly/SCbsborninusa", RclRarPcl);
        USAT.add(T41);
        Tema T42 = ictrl.CrearTema("Glory Days", "5:23", 2,"bit.ly/SCbsglorydays", RclRarPcl);
        USAT.add(T42);
        Tema T43 = ictrl.CrearTema("Dancing In The Park", "3:58", 3,"picosong.com/download/zf86", RclRarPcl);
        USAT.add(T43);

        List<Tema> INUT = new ArrayList<>();
        Tema T51 = ictrl.CrearTema("It's Not Unusual", "2:00", 1,"picosong.com/download/zfbS", RclPcl);
        INUT.add(T51);

        List<Tema> AYST = new ArrayList<>();
        Tema T61 = ictrl.CrearTema("Adagio De Mi Pais", "4:50", 1,"bit.ly/SCtnadagiopais", Rkl);
        AYST.add(T61);

        List<Tema> LLUT = new ArrayList<>();
        Tema T71 = ictrl.CrearTema("El Duelo", "5:23", 1,"picosong.com/download/zfh6", RklPcl);
        LLUT.add(T71);
        Tema T72 = ictrl.CrearTema("Mentira", "4:48", 2,"picosong.com/download/zfAe", RklPcl);
        LLUT.add(T72);

        List<Tema> LDCT = new ArrayList<>();
        Tema T81 = ictrl.CrearTema("Acto 2, Numero 10, Escena (Moderato)", "2:40", 1,"bit.ly/SCptswanlake", Cla);
        LDCT.add(T81);

        List<Tema> CPPT = new ArrayList<>();
        Tema T91 = ictrl.CrearTema("Primer Movimiento (Allegro non troppo e molto maestoso – Allegro con spirito) ", "21:58", 1,"bit.ly/SCptpiano", Cla);
        CPPT.add(T91);

        List<Tema> PAMT = new ArrayList<>();
        Tema T101 = ictrl.CrearTema("No Quiero Estudiar", "2:12", 1,"picosong.com/download/zfZN", Epo);
        PAMT.add(T101);

        List<Tema> AMAT = new ArrayList<>();
        Tema T111 = ictrl.CrearTema("Por Ese Hombre", "4:45", 1,"picosong.com/download/zfa4", PclBal);
        AMAT.add(T111);

        List<Tema> LOCT = new ArrayList<>();
        Tema T121 = ictrl.CrearTema("Por Ese Hombre", "5:13", 1,"bit.ly/SCdyporesehombre", PclBal);
        LOCT.add(T121);

        List<Tema> VIOT = new ArrayList<>();
        Tema T131 = ictrl.CrearTema("Violeta", "1:56", 1,"bit.ly/SCvioleta", Cum);
        VIOT.add(T131);

        Album VPL = ictrl.CrearAlbum("Village People Live and Sleazy", VP.getNickname(), 1980, DisDpoPcl, VPLT);        
        mm.addAlbum(VPL);
        VP.addAlbum(VPL);

        Album DMV = ictrl.CrearAlbum("Violator", DM.getNickname(), 1990, Epo, DMVT);
        mm.addAlbum(DMV);
        DM.addAlbum(DMV);

        Album CLU = ictrl.CrearAlbum("She's so Unusual", CL.getNickname(), 1983, PclDpo, CLUT);
        mm.addAlbum(CLU);
        CL.addAlbum(CLU);

        Album USA = ictrl.CrearAlbum("Born In The U.S.A.", BS.getNickname(), 1984, RclRarPcl, USAT);        
        mm.addAlbum(USA);
        BS.addAlbum(USA);

        Album INU = ictrl.CrearAlbum("It’s Not Unusual", TJ.getNickname(), 1965, RclPcl, INUT);        
        mm.addAlbum(INU);
        TJ.addAlbum(INU);

        Album AYS = ictrl.CrearAlbum("Agua Y Sal", TN.getNickname(), 2012, Rkl, AYST);
        mm.addAlbum(AYS);
        TN.addAlbum(AYS);

        Album LLU = ictrl.CrearAlbum("MTV Unplugged", LL.getNickname(), 2001, RklPcl, LLUT);        
        mm.addAlbum(LLU);
        LL.addAlbum(LLU);

        Album LDC = ictrl.CrearAlbum("El Lago De Los Cisnes", PT.getNickname(), 1875, Cla, LDCT);
        mm.addAlbum(LDC);
        PT.addAlbum(LDC);

        Album CPP = ictrl.CrearAlbum("Concierto Para Piano No.1 En Si Menor, Opus 23", PT.getNickname(), 1875, Cla, CPPT);        
        mm.addAlbum(CPP);
        PT.addAlbum(CPP);

        Album PAM = ictrl.CrearAlbum("Primer Amor", NN.getNickname(), 1994, Epo, PAMT);
        mm.addAlbum(PAM);
        NN.addAlbum(PAM);

        Album AMA = ictrl.CrearAlbum("Hay Amores Que Matan", PI.getNickname(), 1993, PclBal, AMAT);        
        mm.addAlbum(AMA);
        PI.addAlbum(AMA);

        Album LOC = ictrl.CrearAlbum("Un Loco Como Yo", DY.getNickname(), 1993, PclBal, LOCT);
        mm.addAlbum(LOC);
        DY.addAlbum(LOC);

        Album VIO = ictrl.CrearAlbum("20 Grandes Éxitos", AL.getNickname(), 1989, Cum, VIOT);        
        mm.addAlbum(VIO);
        AL.addAlbum(VIO);

        ictrl.agregarSeguidorA(VP, VC);
        ictrl.agregarSeguidorA(DM, VC);
        ictrl.agregarSeguidorA(DM, VC);
        ictrl.agregarSeguidorA(CL, VC);
        ictrl.agregarSeguidorC(OK, VC);
        ictrl.agregarSeguidorC(ML, VC);
        ictrl.agregarSeguidorC(CB, VC);
        ictrl.agregarSeguidorC(EL, VC);

        ictrl.agregarSeguidorA(DM, SO);
        ictrl.agregarSeguidorA(BS, SO);
        ictrl.agregarSeguidorA(TJ, SO);
        ictrl.agregarSeguidorA(TN, SO);
        ictrl.agregarSeguidorC(WW, SO);
        ictrl.agregarSeguidorC(OK, SO);
        ictrl.agregarSeguidorC(ML, SO);

        ictrl.agregarSeguidorA(DM, PA);
        ictrl.agregarSeguidorA(BS, PA);
        ictrl.agregarSeguidorA(TN, PA);
        ictrl.agregarSeguidorC(OK, PA);
        ictrl.agregarSeguidorC(ML, PA);
        ictrl.agregarSeguidorC(CB, PA);
        ictrl.agregarSeguidorC(EL, PA);

        ictrl.agregarSeguidorA(DM, WW);
        ictrl.agregarSeguidorA(BS, WW);
        ictrl.agregarSeguidorA(TJ, WW);
        ictrl.agregarSeguidorA(TN, WW);
        ictrl.agregarSeguidorA(PI, WW);
        ictrl.agregarSeguidorA(DY, WW);
        ictrl.agregarSeguidorA(AL, WW);
        ictrl.agregarSeguidorC(VC, WW);
        ictrl.agregarSeguidorC(SO, WW);
        ictrl.agregarSeguidorC(PA, WW);
        ictrl.agregarSeguidorC(OK, WW);
        ictrl.agregarSeguidorC(ML, WW);
        ictrl.agregarSeguidorC(EL, WW);

        ictrl.agregarSeguidorA(DM, OK);
        ictrl.agregarSeguidorA(BS, OK);
        ictrl.agregarSeguidorA(LL, OK);
        ictrl.agregarSeguidorA(PT, OK);
        ictrl.agregarSeguidorA(NN, OK);
        ictrl.agregarSeguidorA(PI, OK);
        ictrl.agregarSeguidorA(AL, OK);
        ictrl.agregarSeguidorC(VC, OK);
        ictrl.agregarSeguidorC(PA, OK);
        ictrl.agregarSeguidorC(ML, OK);
        ictrl.agregarSeguidorC(CB, OK);
        ictrl.agregarSeguidorC(EL, OK);

        ictrl.agregarSeguidorA(BS, ML);
        ictrl.agregarSeguidorA(LL, ML);
        ictrl.agregarSeguidorA(PI, ML);
        ictrl.agregarSeguidorA(AL, ML);
        ictrl.agregarSeguidorC(VC, ML);
        ictrl.agregarSeguidorC(SO, ML);
        ictrl.agregarSeguidorC(PA, ML);

        ictrl.agregarSeguidorA(LL, CB);
        ictrl.agregarSeguidorA(PI, CB);
        ictrl.agregarSeguidorA(DY, CB);
        ictrl.agregarSeguidorA(AL, CB);
        ictrl.agregarSeguidorC(PA, CB);

        ictrl.agregarSeguidorA(LL, EL);
        ictrl.agregarSeguidorC(VC, EL);
        ictrl.agregarSeguidorC(SO, EL);
        ictrl.agregarSeguidorC(PA, EL);
        
        Logica.CrearLista crearlista = new CrearLista(ictrl, "Noche De La Nostalgia", "porDefecto", PCL.getNombre());
        porDefecto LD1 = ictrl.CrearListPorDefecto("Noche De La Nostalgia",PCL.getNombre());
        mp.addPorDefecto(LD1);
        
         Logica.CrearLista crearlista2 = new CrearLista(ictrl, "Rock En Español", "porDefecto", RKL.getNombre());
        porDefecto LD2 = ictrl.CrearListPorDefecto("Rock En Español",RKL.getNombre());
        mp.addPorDefecto(LD2);
        
        Logica.CrearLista crearlista3 = new CrearLista(ictrl, "Musica Clasica", "porDefecto", CLA.getNombre());
        porDefecto LD3 = ictrl.CrearListPorDefecto("Musica Clasica",CLA.getNombre());
        mp.addPorDefecto(LD3);
        
        
        
        Logica.CrearLista crearlista4 = new CrearLista(ictrl, "Musica Inspiradora", "Particular", VC.getNickname());
        Particular LP1 = mp.buscarListP("Musica Inspiradora", VC.getNickname());
        mp.addPartList(LP1);
        
        Logica.CrearLista crearlista5 = new CrearLista(ictrl, "De Todo Un Poco", "Particular", SO.getNickname());
        Particular LP2 = mp.buscarListP("De Todo Un Poco", SO.getNickname());
        mp.addPartList(LP2);
        
        Logica.CrearLista crearlista6 = new CrearLista(ictrl, "Para Cocinar", "Particular",WW.getNickname());
        Particular LP3 = mp.buscarListP("Para Cocinar", WW.getNickname());
        mp.addPartList(LP3);
        
        Logica.CrearLista crearlista7 = new CrearLista(ictrl, "Para Las Chicas", "Particular",ML.getNickname());
        Particular LP4 = mp.buscarListP("Para Las Chicas", ML.getNickname());
        mp.addPartList(LP4);
        
        Logica.CrearLista crearlista8 = new CrearLista(ictrl, "Fiesteras", "Particular", CB.getNickname());
        Particular LP5 = mp.buscarListP("Fiesteras", CB.getNickname());
        mp.addPartList(LP5);
        
        Logica.CrearLista crearlista9 = new CrearLista(ictrl, "Mis Favoritas", "Particular", CB.getNickname());
        Particular LP6 = mp.buscarListP("Mis Favoritas", CB.getNickname());
        mp.addPartList(LP6);

        ictrl.Publicar("Musica Inspiradora",VC.getNickname());
        ictrl.Publicar("De Todo Un Poco",SO.getNickname());
        ictrl.Publicar("Para Las Chicas",ML.getNickname());
        ictrl.Publicar("Fiesteras",CB.getNickname());
        
        LP1.addTema(T21);
        
        LP2.addTema(T31);
        LP2.addTema(T32);
        LP2.addTema(T51);
        LP2.addTema(T81);
        
        LP3.addTema(T21);
        LP3.addTema(T22);
        LP3.addTema(T41);
        LP3.addTema(T42);
        
        LP4.addTema(T31);
        LP4.addTema(T51);
        LP4.addTema(T91);
        LP4.addTema(T101);
        LP4.addTema(T121);
        
        LP5.addTema(T11);
        LP5.addTema(T12);
        LP5.addTema(T13);
        LP5.addTema(T42);
        LP5.addTema(T131);
        
        LP6.addTema(T61);
        LP6.addTema(T91);
        LP6.addTema(T111);
        
        VC.addTemaFav(T71);
        VC.addPDFav(LD1);
        VC.addPDFav(LD3);
        VC.addAlbumFav(DMV);
        VC.addAlbumFav(LDC);
        VC.addAlbumFav(CPP);
        
        SO.addPDFav(LD3);
        
        PA.addTemaFav(T61);
        PA.addPDFav(LD1);
        PA.addPDFav(LD2);
        
        WW.addParticularFav(LP1);
        
        OK.addAlbumFav(LDC);
        OK.addAlbumFav(CPP);
        
        CB.addTemaFav(T91);
        CB.addPDFav(LD1);
        CB.addPDFav(LD2);
        CB.addAlbumFav(AMA);
        
        EL.addTemaFav(T101);
        */
    }
}