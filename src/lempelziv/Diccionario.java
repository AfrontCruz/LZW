/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lempelziv;

import java.util.LinkedList;

/**
 *
 * @author Juárez Cruz Oscar Daniel | Student from ESCOM IPN | Mail:
 * danafront0@gmail.com
 * 
 */
public class Diccionario {
    private LinkedList<Codigo> diccionario;
    
    public Diccionario(){
        diccionario = new LinkedList<Codigo>();
    }
    
    
    /**
     * Esta función busca si el elemento ya se encuentra dentro del
     * diccionario, en caso de que NO, lo agrega.
     * Regresa True or False según sea el caso.
     */
    public boolean buscarElemento(Codigo elemento){
        for(Codigo aux : diccionario ){
            if( aux.getCadena().equals( elemento.getCadena() ) ){
                return true;
            }
        }
        diccionario.add(elemento);
        return false;
    }
    
    /**
     * Esta función sólo imprime el diccionario
     * para corroborar que todo fue correcto
     */
    public void imprimirDiccionario(){
        for(Codigo aux : diccionario ){
            System.out.println( aux );
        }
    }

    /**
     * Esta función nos devuelve el código de un elemento
     * que ya está dentro del diccionario. En caso de que 
     * queramos encontrar un elemento que NO ESTÁ nos devuelve
     * un -1
     */
    public int getCodigo( String elemento ){
        for(Codigo aux : diccionario ){
            if( aux.getCadena().equals( elemento ) )
                return aux.getCodigo();
        }
        return -1;
    }
}
