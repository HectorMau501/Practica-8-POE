
package Clases;


public class Numero 
{
    private int numero;
    private String respuesta;
    private Numero siguiente;

    public Numero(int numero, String respuesta) {
        this.numero = numero;
        this.respuesta = respuesta;
        this.siguiente = siguiente;
    }

    public Numero() {
        this.numero = 0;
        this.respuesta = "";
        this.siguiente = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }


    public Numero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Numero siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
