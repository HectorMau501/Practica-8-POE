/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR MAURICIO
 */
public class Pila
{
    public Numero pilaNumero; 

    public Pila() {
        pilaNumero = null;
    }
    
    public void push(int numero, String respuesta)
    {
        Numero nuevo = new Numero(numero,respuesta);
        
        if(pilaNumero == null)
        {
            pilaNumero = nuevo;
        }
        else
        {
            Numero aux = pilaNumero;
            pilaNumero = nuevo;
            nuevo.setSiguiente(aux);
        }
    }
    
    public String recorrerPila()
    {
        Numero aux = pilaNumero;
        String valor = "Numero: \n" ;
        
        
        if(pilaNumero == null)
        {
            System.out.println("Esta vacia la pila");
            return "Pila vacia";
        }
        else
        {
           while(aux != null)
           {
               valor += "\n"+aux.getNumero();
               
               aux = aux.getSiguiente();
           } 
        }
        
        return valor;
    }
    
    public void pop()
    {
        Numero aux = pilaNumero;
      
        
        if(pilaNumero == null)
        {
            System.out.println("Esta vacia la pila");
            
        }
        else
        {
            if(aux.getSiguiente() == null)
            {
                pilaNumero = null;
            }
            else
            {
                pilaNumero = aux.getSiguiente();
            }
            
            System.out.println("Primer elemento de la Pila eliminado");
        }
                
    }
    
    
}
