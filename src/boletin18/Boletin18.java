/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Buzon listaCorreo =new Buzon();
       
        int opcion;
        
        do{ 
            opcion=Integer.parseInt(JOptionPane.showInputDialog("MENÚ \n1.Meter novo correo \n2.Número de correos existentes \n3.Correos non leidos \n4.Amosar un email \n5.Último correo non leido \n6.Eliminar correo \n7.Salir " ));
       
            switch(opcion){
                case 1:listaCorreo.engadirCorreo();
                       break;
                case 2:listaCorreo.calcularNumCorreos();
                    break;
                case 3:listaCorreo.porLer();
                    break;
                case 4:listaCorreo.Amosa(Integer.parseInt(JOptionPane.showInputDialog("Qué nº de correo queres leer?")));
                    
                    break;
                case 5:listaCorreo.primerNONlid();
                    break;
                case 6:listaCorreo.elimina(Integer.parseInt(JOptionPane.showInputDialog("Qué nº de correo queres eliminar?")));
                    break;
                case 7:System.exit(0);
                    
                    
                       
            }       
        }while(opcion<7);
    
}
        // TODO code application logic here
    
    
}
