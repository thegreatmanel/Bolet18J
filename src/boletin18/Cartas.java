/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

/**
 *
 * @author propa
 */
public class Cartas {
    private String mensaxe;
    private boolean leido=false;

    public String getMensaxe() {
        return mensaxe;
    }

    public void setMensaxe(String mensaxe) {
        this.mensaxe = mensaxe;
    }

    public boolean isLido() {
        return leido;
    }

    public void setLido(boolean leido) {
        this.leido = leido;
        
    }

    public Cartas() {
    }

    public Cartas(String mensaxe, boolean leido) {
        this.mensaxe = mensaxe;
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Correo{" + "mensaxe=" + mensaxe + ", leido=" + leido + '}';
    }
    
}
