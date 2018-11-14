package juego;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import java.awt.Color;
import java.awt.EventQueue;
import juego.entidades.Enemigo;
import juego.entidades.NPC;
import juego.entidades.PersonajePro;
import juego.sistemas.Fabrica;
import juego.sistemas.Navegacion;

public class Juegoant {

    public static void main(String[] args) throws InterruptedException {
        IOBase ventana = new IOBase();
        EventQueue.invokeLater(ventana);
        Fabrica.crearLugares();
        LugarBase lugarDeInicio = (LugarBase) RepositorioPrincipal.traer("inicio");
        // se agrega lugar de inicio
       
        // Precentacion
        IOBase.mostrarTexto("\tBienvenido a esta pequeña Aventura!",Color.GREEN,Color.BLACK);
        IOBase.mostrarTexto("\t\nPUEBLO DALI\t\n");
        IOBase.mostrarTexto("-------------------------------------------------------------------------------\n" +
"_,-':IWWWW\\___           _____                       .    .     . . . .__  .\n" +
" .:IIIIWWWWWWW\\__   _,--'.;IWW\\_                           _,-----_ ,-'  `--.\n" +
" .:;IIIIIWWWWWWWW\\_/    .;IIWWIW\\                 .   .  ,'  ,, _  \\     __--\n" +
"  :;IIIWWWWWWWWWW;:   .:;IIIIWWWW\\                      /,,__--'  ,--_ _'  \\.\n" +
"   .:;IIWWWWWWWWWW;.   :;IIIIIWWWW\\__             .   ._--' _-   /   )`__  `-.\n" +
"    ::IIIWWWWWWWWW:.   .;IIIWWWWWWI:M\\_       .     _-'  /    /||@   /@@`__\n" +
"     ::;;;IIIIW;:.        .:;IIMMMWI:WW\\           /  /    /||@@@@@ee@@@@@`__\n" +
"       .:;;III:             ..:::II::WWW\\       .,' /   /||@@@@@@@@@@@@@@@@@\\_\n" +
"                             .........===~~~~~~~/ /  /||~~~~~~~~~~~~~~~~~~~~~\\_\n" +
"                 ....... __  _ .--- '     -    /  /||-  - -_ --__----__-- _- _\\\n" +
"  ...     .........._ - '                      |||    -_  -  -- __-- _ -- -_\n" +
"..............@@...'_                              _    -   __ - __  -_  --  -\n" +
".............<X|\\...__   _     _                       _ -   - __- _-_ --   -_\n" +
"............ /||........--- -____-- ____    _            -      -- __- -    _\n" +
".......      ...........................~~ -----_--_--.- __- ___ _.__ _._ ____-\n" +
"..... .............  ..........................................................");
        Thread.sleep(2000);
        IOBase.borrar();
        IOBase.mostrarTexto("Tu seras...");
        Thread.sleep(1000);
        
        //Creacion de Personajes
        
        PersonajePro Protago = new PersonajePro("Mario Bros");
        RepositorioPrincipal.agregar(Protago);
        
        IOBase.mostrarTexto(Protago.getNombre());
        IOBase.mostrarTexto(Protago.Imagen());
        Thread.sleep(1700);
        

        //menu principal
        Navegacion Menu = new Navegacion();
        Menu.RealizarViajePrincipal(Protago);
    
     
}
       
        
    }



