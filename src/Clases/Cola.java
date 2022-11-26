
package Clases;


public class Cola 
{
    public Numero colaNumero;

    public Cola() 
    {
       colaNumero = null;
    }
    
    public void  encolar(int numero, String respuesta)
    {
        Numero nuevo = new Numero(numero,respuesta);
        
        if(colaNumero == null)
        {
            colaNumero = nuevo;
        }
        else
        {
            Numero aux = colaNumero;
            
            while(aux.getSiguiente() != null)
            {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public String recorrerCola()
    {
        String valor = "\n";
        Numero aux = colaNumero;
        
        
        if(colaNumero == null)
        {
            System.out.println("No hay elemento en la pila");
            return "Cola vacia";
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
    
    public void desencolar()
    {
        Numero aux = colaNumero;
        
        if(colaNumero == null)
        {
            System.out.println("Cola esta vacia");
        }
        else
        {
            if(aux.getSiguiente() == null)
            {
                colaNumero = null;
            }
            else
            {
                colaNumero = aux.getSiguiente();
            }
            System.out.println("El primer elemento a sido eliminado");
        }
        
    }
    
         public boolean estaVacia()
     {
         if(colaNumero == null)
         {
            return true; 
         }
         else
         {
             return false;
         }
         
     }
    
    
    
}
