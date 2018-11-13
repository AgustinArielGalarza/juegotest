package juego.entidades;

import ifts16.pp.juego.componentes.Referencia;
import ifts16.pp.juego.entidades.Entidad;
import ifts16.pp.juego.entidades.Tipo;
import ifts16.pp.juego.sistemas.IOBase;
import java.util.ArrayList;
import juego.sistemas.Combate;
import juego.sistemas.Items;

public class PersonajePro extends Entidad {
    private Combate CombatePrincipal;
    private int salud;
    private int ataque;
    private int defensa;
    private int danio;
    private int resistecia;
    private int aumentarAtaque;
    private int aumentarDefensa;
    private ArrayList <Items> ListitaPrincipal;

    
    public PersonajePro(ArrayList <Items> Lp) {
        this.ListitaPrincipal=Lp;
    }
    public void agregarLP (Items i){
        this.ListitaPrincipal.add(i);
    }

    public PersonajePro(String nombre) {
        super(nombre);
        this.salud = 60;
        this.ataque = 10;
        this.defensa = 10;
        this.danio = 15;
        this.resistecia = 20;
        this.aumentarAtaque = 0;
        this.aumentarDefensa = 0;
    }

    public ArrayList<Items> getListitaPrincipal() {
        return ListitaPrincipal;
    }
    

   

    public Combate getCombatePrincipal() {
        return CombatePrincipal;
    }

    public void setCombatePrincipal(Combate CombatePrincipal) {
        this.CombatePrincipal = CombatePrincipal;
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
        this.danio = danio;
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

    @Override
    public Referencia referencia() {
     return new Referencia (this.id,Tipo.Jugador,this.nombre) {}; 
    }

    @Override
    public Referencia referencia(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String Imagen(){
        return "\n" +
"░░░░░░░░░▄▄▄▄░▄▄▄░░░\\n\" +\n" +
"░░░░░░▄▀▀░░░▀█░░░█░░\\n\" +\n" +
"░░░░▄▀░░▄██████▄░█░░\\n\" +\n" +
"░░░▄█▄█▀░░▄░▄░█▀▀▄░░\\n\" +\n" +
"░░▄▀░██▄░░▀░▀░▀▄░█░░\\n\" +\n" +
"░░▀▄░░▀░▄█▄▄░░▄█▄▀░░\\n\" +\n" +
"░░░░▀█▄▄░░▀▀▀█▀░█░░░\\n\" +\n" +
"░░░▄▀░░░▀██▀▀█▄▀░░░░\\n\" +\n" +
"░░█░░▄▀▀▀▄█▄░░▀█░░░░\\n\" +\n" +
"░░▀▄█░░░░░█▀▀▄▄▀█░░░\\n\" +\n" +
"░░░▄▀▀▄▄▄██▄▄█▀░░█░░\\n\" +\n" +
"░░█▀░█████████░░░█░░\\n\" +\n" +
"░░█░░██▀▀▀░░░▀▄▄█▀░░\\n\" +\n" +
"░░░▀▀░░░░░░░░░░░░░░░\");";
    }
   

    
}
