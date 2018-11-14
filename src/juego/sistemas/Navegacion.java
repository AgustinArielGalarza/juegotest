
package juego.sistemas;

import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.NavegacionBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import juego.entidades.Enemigo;
import juego.entidades.NPC;
import juego.sistemas.Items;
import juego.sistemas.ListaDeItems;
import juego.entidades.PersonajePro;
/**
 *
 * @author fernando
 */
public class Navegacion extends NavegacionBase {

    public void RealizarViajePrincipal(PersonajePro Protago, Enemigo Enem ) throws InterruptedException{
        //menu
        Opcion OP = new Opcion("1", "Buscar Informacion");
        Opcion OP2 = new Opcion("2", "Ir a luchar");
        Opcion OP3 =new Opcion("3","Explorar");
        Opciones ops = new Opciones();
        ops.agregar(OP);
        ops.agregar(OP2);
        ops.agregar(OP3);
        Opcion op = IOBase.elegirOpcion(ops);
        IOBase.mostrarTexto("Eligio: "+ op.getTexto());
       do{
           switch (op.getComando()){
           case "1":
               BuscarInformacion();;
               break;
           case "2":
               Combate cbt = new Combate();
               cbt.Luchar(Protago ,Enem );
               break;   
           case "3":
               Explorar(Protago);
            break;
           case "0":default:break;
        }
        }while(op.getComando().equals("0"));
       }
       
    
    
    public void Explorar (PersonajePro p){
               Items it = new Items("carabina", "Fusil de alto calibre", 5);
               Items it2 = new Items("Espada", "corta como la concha de la madre", 10);
               ListaDeItems lb = new ListaDeItems();
               lb.agregar(it);
               lb.agregar(it2);
               
               
               Opcion opp = new Opcion("1", "para explorar");
               Opcion opp2 = new Opcion("0", "para salir");
               Opciones opss = new Opciones();
               opss.agregar(opp);
               opss.agregar(opp2);
               IOBase.mostrarTexto("Se dice que hay 2 objetos en este lugar");
               Opcion opcion = IOBase.elegirOpcion(opss);
               
        
                do{
                   Items resultado = lb.Azaroso();
                   if(resultado!=null){
                   p.agregarLP(resultado);
                   opcion = IOBase.elegirOpcion(opss);
                   }else{
                   opcion = IOBase.elegirOpcion(opss);
                   }
               }while(opcion.getComando().equalsIgnoreCase(opp2.getComando()));
                
    }

    
    
    
    public void BuscarInformacion (){
                NPC npc1 = new NPC("Cleira");
                NPC npc2= new NPC("Sr. blake");
                NPC npc3 = new NPC("Skipper");
                RepositorioPrincipal.agregar(npc1);
                RepositorioPrincipal.agregar(npc2);
                RepositorioPrincipal.agregar(npc3);

    }
}



