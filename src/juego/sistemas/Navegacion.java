
package juego.sistemas;

import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.NavegacionBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import java.util.Random;
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
               ListaDeItems lista = new ListaDeItems();
               
               IOBase.mostrarTexto("Se dice que hay 2 objetos en este lugar");
               IOBase.ingresarTexto("Ingresa cualquier tecla para comenzar a explorar");
               Random r = new Random();
               int r1;
               int r2;
               boolean coinciden = false;
               while(coinciden == false){
                   r1 = r.nextInt(2);
                   r2 = r.nextInt(2);
                   if(r1 == r2){
                       int r3 = r.nextInt(5);
                       lista.conseguirItemRandom(r3);
                       coinciden = true;
                   }
               }
               
               
                
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



