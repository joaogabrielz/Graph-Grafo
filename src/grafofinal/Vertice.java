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

public class Vertice {
    
    private String dado;     
    private ArrayList<Vertice> conexoes = new ArrayList<>();    
    private ArrayList<Integer> arestaDesteVertice;
    
    public Vertice(String dado){
        this.dado = dado;
        this.arestaDesteVertice = new ArrayList<>();
    }
    
    public void addConexao(Integer peso, Vertice verticeParam){
       if(!isConected(verticeParam)){
           this.conexoes.add(verticeParam);
           Aresta novaAresta = new Aresta(peso, this, verticeParam);
           this.arestaDesteVertice.add(novaAresta.getPeso());
       }
    }
    
    public boolean isConected(Vertice verticeParam){
        
        for(Vertice VtIterator : this.conexoes){
            if(VtIterator == verticeParam){
                return true;
            }
        }
     return false;
    }
    
    
    public void getDadosConexoes(){
        System.out.println("Conexões:");
        System.out.println(" [");
        for(Vertice v : this.conexoes){
            System.out.println(v.getDado());
        }     
        System.out.println(" ]");
    }
    
    
    public ArrayList<Vertice> getConexoes(){
        return this.conexoes;
    }
    
    public String getDado(){
        return this.dado;
    }

    public ArrayList<Integer> getArestaDesteVertice() {
        return arestaDesteVertice;
    }

    public void setArestaDesteVertice(ArrayList<Integer> arestaDesteVertice) {
        this.arestaDesteVertice = arestaDesteVertice;
    }
    
    
}
