
package juego.sistemas;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;

/**
 *
 * @author fernando
 */
public class Fabrica extends FabricaPrincipal {

    public static void crearLugares() {
        LugarBase inicio = new LugarBase("Aldea inicial", 
            "El lugar donde comienza la aventura, apto para todo tipo de actividades");
        
        LugarBase practica = new LugarBase("Campo de practica",
            "Lugar de practica para el heroe de esta aventura");
        
        LugarBase desierto = new LugarBase("Desierto", "Lugar desolado, aqui hay un portal");
        
        inicio.agregarVecino(practica.referencia("Campo de Practica"));
        inicio.agregarVecino(desierto.referencia("Desierto desolador"));
        practica.agregarVecino(inicio.referencia("La aldea de inicio"));
        desierto.agregarVecino(inicio.referencia("Aldea de inicio"));
        desierto.agregarAPortal(inicio.referencia("Teletransportacion al inicio"));
        
        RepositorioPrincipal.agregar(inicio, "inicio");
        Fabrica.agregarIdLugar(inicio.getId());
        RepositorioPrincipal.agregar(practica, "practica");
        //Fabrica.agregarIdLugar(practica.getId());
        RepositorioPrincipal.agregar(desierto, "desierto");
    }
    
}
