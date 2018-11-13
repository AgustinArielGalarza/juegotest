package juego.sistemas;

import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import juego.entidades.Enemigo;
import juego.entidades.PersonajePro;

public class Combate {

    
public void Luchar (PersonajePro p, Enemigo e) throws InterruptedException{
    Opcion atac = new Opcion("1","atacar");
    Opcion cura = new Opcion("2","curarse\n");
    Opciones opsL = new Opciones();
    opsL.agregar(atac);
    opsL.agregar(cura);
    IOBase.borrar();
    IOBase.mostrarTexto("-------------------Empiza la batalla-----------------");
    Opcion eleccionDeLucha = IOBase.elegirOpcion(opsL);
    
    if(RepositorioPrincipal.existe(p.getId()) && RepositorioPrincipal.existe(e.getId())){
        
    while(e.getSalud() >= 0 || p.getSalud() >= 0 ){
        
    if(atac.getComando().equalsIgnoreCase(eleccionDeLucha.getComando())){
    e.setSalud(e.getSalud() - p.getAtaque());
    Thread.sleep(1500);
    IOBase.mostrarTexto("Has hecho un Daño: \n"+p.getDanio()+"\n Salud del Enemigo :\n "+e.getSalud());
    Thread.sleep(1500);
    IOBase.mostrarTexto("\tTurno del Enemigo\n");
    Thread.sleep(1500);
    p.setSalud(p.getSalud()-e.getAtaque());
    IOBase.mostrarTexto("Te han causado un Daño: \n"+p.getDanio()+"\n Salud actual:\n "+e.getSalud());
    eleccionDeLucha = IOBase.elegirOpcion(opsL);
    
    }else if (cura.getComando().equalsIgnoreCase(eleccionDeLucha.getComando())){
    p.setSalud(p.getSalud()+ 25);
    Thread.sleep(1500);
    IOBase.mostrarTexto( "Te has curado:"+p.getSalud());
    IOBase.mostrarTexto("\tTurno del Enemigo\n");
    Thread.sleep(1500);
    p.setSalud(p.getSalud()-e.getAtaque());
    IOBase.mostrarTexto("Te han causado un Daño: \n"+p.getDanio()+"\n Salud actual:\n "+e.getSalud());
    eleccionDeLucha = IOBase.elegirOpcion(opsL);
    }
    
    if (e.getSalud()<= 0){
    IOBase.mostrarTexto("\t\nHAS GANADO\t\n");
    eleccionDeLucha = IOBase.elegirOpcion(opsL);
    } 
    }

}
}
}




