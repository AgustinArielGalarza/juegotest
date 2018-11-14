package juego.entidades;

import com.sun.javafx.cursor.CursorType;
import ifts16.pp.juego.componentes.personaje.Hablador;
import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import juego.entidades.PersonajePro;
import juego.sistemas.Navegacion;

public class NPC extends PersonajeAbstracto implements Hablador{

  private boolean caso = false;
  
    public NPC(String nombre) {
        super(nombre);
    }
 
    
    public void Conversacion1 (Opcion preguntar, Opcion acept ,Opcion volver,Opciones opsC) throws InterruptedException{
        Navegacion menuConv = new Navegacion();
        
        IOBase.borrar();
        IOBase.mostrarTexto("Hola mi nombre es "+this.nombre+  
                "\nBienvenido a la aldea Dalí....");
        
        IOBase.mostrarTexto(""+ "%%%%\n" +
" %%%%-(\n" +
"%%%%%_/ \\ \n" +
"_%%%%%%%% \n" +
"_%%%%%%%/ \\%    \\\n" +
"%%%%%%%%%\\\\ \\_\n" +
"%%%%%%   \\ \\\\\n" +
")    /\\_/\n" +
"/(___. \\\n" +
"'----' (\n" +
"/       )\n" +
"/        (\n" +
"/         )\n" +
",'          (\n" +
",-'            )\n" +
"'-._    '-..___(\n" +
" ``---....__)\n" +
")|)|\n" +
"'-'-.\\_  ");
        IOBase.mostrarTexto("Necesitamos de un guerrero como tu, nuestro pueblo fue conquistado por un maligno ser"+ 
                "que se encuentra en las praderas del sur. "+""+"Mi recomendacion es que juntes informacion y que explores la zona"+
                "Paraobtener objetos que te ayudaran a concluir esta mision");
        Thread.sleep(1000);
       preguntar = IOBase.elegirOpcion(opsC);
        if(preguntar.getComando().equalsIgnoreCase(acept.getComando())){
            this.caso=true;
            if (caso == true) {
                Thread.sleep(1000);
                IOBase.mostrarTexto("Gracias por animarte a aventurarte em este desafio"
                        + "Ahora... el lago se encontrara un Señor que te dara una pista de como encontrar a");
            }else{
        
                    
        }
    }
}
}
