/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lempelziv;

/**
 *
 * @author Juárez Cruz Oscar Daniel | Student from ESCOM IPN | Mail:
 * danafront0@gmail.com
 */
public class LWZ {
    private String palabra, w, k, wk, output;
    private Diccionario diccionario;
    private Codigo codigo;
    private int nmbMonogramas;
    
    public LWZ(String palabra){
        this.palabra = palabra;
        diccionario = new Diccionario();
        output = "";
    }
    
    /**
     * Esta funcion recursiva realiza el algoritmo hasta que termine de leer la cadena.
     * Cuando eso sucede manda el último corrimiento al output para no perder información
     */
    public void comprimir(String w, int index){
        if( index == palabra.length() ){
            output += diccionario.getCodigo(w) + "\n";
            return;
        }
        
        k = Character.toString( palabra.charAt(index) );
        wk = w + k;
        codigo = new Codigo( wk,  nmbMonogramas );
        if( !diccionario.buscarElemento(codigo) ){
            
            nmbMonogramas++;
            int out = diccionario.getCodigo(w);
            
            if( out == -1 ){
                System.out.println("Inicio...");
            }else
                output += out + "\n";
            
            comprimir( k, index + 1 );
            
        }else{
            comprimir( wk, index + 1);
        }
    }
    
    
    /**
     * Esta función nos da el primer recorrido a la palabra por lo que 
     * nos permite conocer el alfabeto de la palabra (le llame palabra
     * pero en realidad puede ser un texto completo )
     */
    public void recorrer(){
        int i, j;
        for( i = 0, j  = 0; i < palabra.length(); i++ ){
            codigo = new Codigo( Character.toString( palabra.charAt(i) ), j );
            if( !diccionario.buscarElemento(codigo) ){
                j++;
            }   
        }
        nmbMonogramas = j;
        w = "";
        comprimir(w, 0);
        System.out.println("Output: \n" + output );
        System.out.println("\n\n\n\n\nDiccionario:");
        diccionario.imprimirDiccionario();
    }
}

