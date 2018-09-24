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
public class Codigo {
    private String cadena;
    private int codigo;
    
    public Codigo(String cadena, int codigo){
        this.cadena = cadena;
        this.codigo = codigo;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        return cadena + " " + codigo;
    }
}
