/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles.binarios.de.busqueda.parte1;
/**
 *
 * @author JOSE JAVIER
 */
public class NodoArbolAV {
 int dato, fe;
    NodoArbolAVL hijoIzquierdo,hijoDerecho;
    public  NodoArbolAV (int d) {
        this.dato=d;
        this.fe=0;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;   
}
}
