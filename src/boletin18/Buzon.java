/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Buzon {
     private ArrayList <Cartas>Buzon;

    
    
    public Buzon (){
        Buzon = new ArrayList <Cartas>(); 
    }
    
    public String meterMensaxe(){
        String mensaxe=JOptionPane.showInputDialog("Escribe o teu mensaxe para enviar: ");
        return mensaxe;
    }
    public void engadirCorreo(){
        Cartas c=new Cartas();
        
        c.setMensaxe(meterMensaxe());
        Buzon.add(c);
    }
    public void calcularNumCorreos(){
      System.out.println("Correos totales " + Buzon.size());
    }
    public void porLer(){
        Cartas mail=new Cartas();
        int contar=0;
       for(int i=0;i<Buzon.size();i++){
           mail=Buzon.get(i);
           if(mail.isLido()==false)
               contar++;
       }
        System.out.println("Correos por leer: "+contar);
    }
    
    public void Amosa(int k){
        Cartas mail=new Cartas();
        mail=Buzon.get(k);
        mail.setLido(true);
        System.out.println("Correo elixido: " +mail.getMensaxe()); 
    }
    
    
    
    
    
    public void primerNONlid(){
        Cartas cart=new Cartas();
        int i=Buzon.size();
       
        do{
            
            i--;
            cart=Buzon.get(i);
            
        }while(cart.isLido()==true || i==0);
        if(i>=0){
        
        System.out.println("Primeiro correo non leido: " + cart.getMensaxe());
        cart.setLido(true);
        }
        else
            System.out.println("Non hai mensaxes que mostrar");
        
          
}
    public void elimina(int k){
        Buzon.remove(k);
        System.out.println("Correo "+ k +" eliminado");
    }

   
    
    
}
