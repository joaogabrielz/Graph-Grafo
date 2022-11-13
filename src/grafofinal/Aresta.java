/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafofinal;

import java.util.ArrayList;

/**
 *
 * @author kaliez
 */
public class Aresta {
    
    
    // Not using at now ------------ :)
    //Linha
    private Integer peso; 
    private Vertice Verticeinicio;
    private Vertice Verticefim;
    
    
    
    public Aresta(Integer peso, Vertice nInicio, Vertice mFim){
        this.peso = peso;
        this.Verticeinicio = nInicio;
        this.Verticefim = mFim;
    }
 
      
    
    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }


    public Vertice getVerticeinicio() {
        return Verticeinicio;
    }

    public void setVerticeinicio(Vertice Verticeinicio) {
        this.Verticeinicio = Verticeinicio;
    }

    public Vertice getVerticefim() {
        return Verticefim;
    }

    public void setVerticefim(Vertice Verticefim) {
        this.Verticefim = Verticefim;
    }
    
    
    
}
