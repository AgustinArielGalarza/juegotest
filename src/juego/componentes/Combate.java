/*
 * The MIT License
 *
 * Copyright 2018 fernando.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package juego.componentes;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Luchador;
import ifts16.pp.juego.componentes.personaje.Saludable;
import ifts16.pp.juego.utiles.ConOpciones;
import ifts16.pp.juego.utiles.Opciones;
import java.util.Random;

/**
 *
 * @author fernando
 */
public class Combate extends Componente implements Luchador, Saludable, ConOpciones {
    protected int ataque;
    protected int defensa;
    protected int danio;
    protected int resistencia;
    protected int salud;
    protected int saludMaxima;
    protected Random dado;
    
    Combate() {
        this.dado = new Random();
        this.ataque = 5;
        this.defensa = 5;
        this.danio = 4;
        this.resistencia = 0;
        this.salud = 10;
        this.saludMaxima = 10;
    }
    @Override
    public int ataque() {
        return this.ataque + dado.nextInt(6);
    }

    @Override
    public int defensa() {
        return this.defensa + dado.nextInt(4);
    }

    @Override
    public int danio() {
        return dado.nextInt(this.danio);
    }

    @Override
    public int resistencia() {
        return dado.nextInt(this.resistencia);
    }

    @Override
    public int aumentarAtaque(int valor) {
       this.ataque = this.ataque + valor;
       return this.ataque;
    }

    @Override
    public int aumentarDefensa(int valor) {
        this.defensa = this.defensa + valor;
        return this.defensa;
    }

    @Override
    public int aumentarDanio(int valor) {
       this.danio = this.danio + valor;
       return this.danio;
    }

    @Override
    public int aumentarResistencia(int valor) {
       this.resistencia = this.resistencia + valor;
       return this.resistencia;
    }

    @Override
    public int disminuirAtaque(int valor) {
       this.ataque = this.ataque - valor;
       return this.ataque;
    }

    @Override
    public int disminuirDefensa(int valor) {
       this.defensa = this.defensa - valor;
        return this.defensa;
    }

    @Override
    public int disminuirDanio(int valor) {
       this.danio = this.danio - valor;
       return this.danio;
    }

    @Override
    public int disminuirResistencia(int valor) {
        this.resistencia = this.resistencia - valor;
       return this.resistencia;
    }

    @Override
    public int saludActual() {
        return this.salud;
    }

    @Override
    public int saludMaxima() {
        return this.saludMaxima;
    }

    @Override
    public int curarMaximo() {
         this.salud = this.saludMaxima;
         return this.salud;
    }

    @Override
    public int daniarMaximo() {
        this.salud = 0;
        return this.salud;
    }

    @Override
    public int curar(int puntos) {
        this.salud = this.salud + puntos;
        return this.salud;
    }

    @Override
    public int daniar(int puntos) {
        this.salud = this.salud - puntos;
        return this.salud;
    }

    @Override
    public Opciones opciones() {
        Opciones ops = this.opciones("Que desea hacer este turno");
        return ops;
    }

    @Override
    public Opciones opciones(String texto) {
       Opciones ops = new Opciones(texto);
       ops.agregar("ataque", "Atacar al enemigo");
       ops.agregar("curar", "Esperar este turno y curarse");
       ops.agregar("escapar", "Escapar y volver atras");
       return ops;
    }
    
}
