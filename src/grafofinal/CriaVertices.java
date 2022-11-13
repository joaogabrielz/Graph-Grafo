/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafofinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaliez
 */
public class CriaVertices {
    
    // Só Cria os vertices padroes o nome de 'conexoes' poderia ser outro...
    
    Scanner scan = new Scanner(System.in);
    
    private ArrayList<Vertice> conexoes = new ArrayList<Vertice>();
    
    
    
    public CriaVertices(Integer qtd){
               
        for (int i = 0; i < qtd; i++) {
            System.out.println("\nDado/Nome: ");
            String n = scan.next();
            conexoes.add(new Vertice(n));
        }
       
    }
    
    public CriaVertices(){
        
        conexoes.add(new Vertice("Joao")); // 0
        conexoes.add(new Vertice("Matheus")); 
        conexoes.add(new Vertice("Vitor")); 
        conexoes.add(new Vertice("Gabriel")); 
        conexoes.add(new Vertice("Junior")); 
        conexoes.add(new Vertice("Sandro")); // 5
        conexoes.add(new Vertice("Carla")); 
        conexoes.add(new Vertice("Lisa"));
        
    }

    public ArrayList<Vertice> getConexoes() {
        return conexoes;
    }

    public void setConexoes(ArrayList<Vertice> conexoes) {
        this.conexoes = conexoes;
    }
    
    
}
