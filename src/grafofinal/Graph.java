/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafofinal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author kaliez
 */
public class Graph {
    
   
    ArrayList<Vertice> visitados;
    
    
    public void makeConexion(Integer peso, Vertice n, Vertice m){
        n.addConexao(peso, m);
        m.addConexao(peso, n);
    }
    
    
     public void DFSrec (Vertice startVertice) {
        System.out.println("> Busca em Profundidade");
        this.visitados = new ArrayList<>();
        DFSrecursive(startVertice);
    }
    public void DFSrecursive(Vertice vertice){
        
        if(!this.visitados.contains(vertice)){
          System.out.println(vertice.getDado() + " -> " );
          vertice.getDadosConexoes();
          System.out.println("pesos: " + vertice.getArestaDesteVertice());
          System.out.println("size:" + vertice.getConexoes().size() + "\n");
          
          this.visitados.add(vertice);          
            for(Vertice Viterator : vertice.getConexoes()){
                DFSrecursive(Viterator);
            }        
        }
    }
    
    
    public void BFS(Vertice vertice){
        System.out.println("> Busca em largura");
        ArrayDeque<Vertice> fila = new ArrayDeque<Vertice>();
        this.visitados = new ArrayList<Vertice>();
        this.visitados.add(vertice);
        fila.addFirst(vertice);
        
        System.out.println(vertice.getDado() + " -> " );
        vertice.getDadosConexoes();
        System.out.println("pesos: " + vertice.getArestaDesteVertice());
        System.out.println("size:" + vertice.getConexoes().size() + "\n");
        
        while(!fila.isEmpty()){
            
            Vertice verticeFila = fila.removeLast();
            
            for(Vertice Viterator : verticeFila.getConexoes()){
                if(!this.visitados.contains(Viterator)){
                    System.out.println(Viterator.getDado() + " -> " );
                    Viterator.getDadosConexoes();
                    System.out.println("pesos: " + Viterator.getArestaDesteVertice());
                    System.out.println("size:" + Viterator.getConexoes().size() + "\n");
                    fila.push(Viterator);
                    this.visitados.add(Viterator);
                }
            }
        }
    }
     

    
    
}
