
package juego.entidades;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
import juego.sistemas.Combate;

/**
 *
 * @author fernando
 */
public class Enemigo extends PersonajeAbstracto {
    public Combate componenteCombate;
    
    private int salud;
    private int ataque;
    private int defensa;
    private int danio;
    private int resistecia;
    private int aumentarAtaque;
    private int aumentarDefensa;


    public Enemigo(String nombre) {
        super(nombre);
        this.salud = 50;
        this.ataque = 5;
        this.defensa = 5;
        this.danio = 10;
        this.resistecia = 40;
        this.aumentarAtaque = 0;
        this.aumentarDefensa = 0;
    }    

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int sanio) {
        this.danio = sanio;
    }

    public int getResistecia() {
        return resistecia;
    }

    public void setResistecia(int resistecia) {
        this.resistecia = resistecia;
    }

    public int getAumentarAtaque() {
        return aumentarAtaque;
    }

    public void setAumentarAtaque(int aumentarAtaque) {
        this.aumentarAtaque = aumentarAtaque;
    }

    public int getAumentarDefensa() {
        return aumentarDefensa;
    }

    public void setAumentarDefensa(int aumentarDefensa) {
        this.aumentarDefensa = aumentarDefensa;
    }
    
    Enemigo() {
        super();
        this.nombre = "Enemigo " + this.getId().toString();
        this.componenteCombate = new Combate();
    }
    

}
