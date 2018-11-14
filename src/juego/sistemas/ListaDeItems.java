package juego.sistemas;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.random;
import ifts16.pp.juego.sistemas.IOBase;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;
import juego.Juegoant;
import juego.sistemas.Items;
import juego.entidades.PersonajePro;


public class ListaDeItems {
    private ArrayList <Items> Listita = new ArrayList<Items>();

    public ListaDeItems() {
        
    }
    public void agregar(Items t){
        this.Listita.add(t);
    }
    public void eliminar(Items t){
        this.Listita.remove(t);
    }
    public boolean comprobar (Items t){
        if (this.Listita.contains(t)){
            return true;
        }else{
            return false;
        }
        
    }
    public Items Azaroso(){
        Random azar= new Random(5);
        int azarlo = azar.nextInt();
        Items seleccionado = null;
        for (int i=0; i<this.Listita.size();i++){
        if (this.Listita.get(i).getID() == azarlo){
            IOBase.mostrarTexto("Se encontro un Objeto: " +this.Listita.get(i));
            seleccionado = this.Listita.get(i);
        }else{
           seleccionado = null;
        }
        }
        return seleccionado ;
    }
  public boolean consegirItemsRandom(int r3,PersonajePro p) throws InterruptedException{
      boolean resultado = false;
      for( int i =  0 ; i <  this . Listita . size (); i ++ ) {
            if(i == r3){
                IOBase . mostrarTexto ( " Se encontro el objeto: "  +  this. Listita . get (i) . getNombre ());
                p.agregarLP(this.Listita.get(i));
                this . Listita . remove(i);
                resultado = true;
            }else{
                IOBase.mostrarTexto("no se encontro nada...");
                resultado=false;
                if(resultado == false){
                    
                    Navegacion nv = new Navegacion();
                    nv.Explorar(p);
                }
            }
        }
      return resultado;
    }
  }

