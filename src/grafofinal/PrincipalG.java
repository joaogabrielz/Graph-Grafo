/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafofinal;

import java.util.ArrayList;
import java.util.Scanner;


public class PrincipalG {

    
    public static void makeConexionsAuto(CriaVertices vertices , Graph grafo){
       Scanner scan = new Scanner(System.in);  
        
       grafo.makeConexion(1, vertices.getConexoes().get(0), vertices.getConexoes().get(1));
       grafo.makeConexion(1, vertices.getConexoes().get(0), vertices.getConexoes().get(2));
       grafo.makeConexion(1, vertices.getConexoes().get(0), vertices.getConexoes().get(3));
       grafo.makeConexion(1, vertices.getConexoes().get(1), vertices.getConexoes().get(4));
       grafo.makeConexion(2, vertices.getConexoes().get(2), vertices.getConexoes().get(4));
       grafo.makeConexion(2, vertices.getConexoes().get(3), vertices.getConexoes().get(5));
       grafo.makeConexion(3, vertices.getConexoes().get(5), vertices.getConexoes().get(6));
       grafo.makeConexion(3, vertices.getConexoes().get(5), vertices.getConexoes().get(7));
       grafo.makeConexion(4, vertices.getConexoes().get(6), vertices.getConexoes().get(7));
       
       int opt = -1;
       while(opt != 0){
           
           System.out.println("Busca por Profundidade[0] ou Largura[1]");
           opt = scan.nextInt();
           if(opt == 0){
              grafo.DFSrec(vertices.getConexoes().get(0)); // Profundidade DFS
           }
           else if(opt == 1){
              grafo.BFS(vertices.getConexoes().get(0)); // largura 
           }
       }
    }
    
    
    public static void makeConexionsManual(){
       Scanner scan = new Scanner(System.in); 
       
        System.out.println("\n Criar os Vertices: \n");
        System.out.println("Quantos Vertices/Pessoas deseja Criar?");
        int qtd = scan.nextInt();
        
        CriaVertices vertices = new CriaVertices(qtd);
        Graph grafo = new Graph();
        
        System.out.println("Deseja fazer conexoes? Nao[0] ou Sim[1]");
        int opt = scan.nextInt();
        if(opt == 0){
            return;
        }
        else{
            System.out.println("\n Vertices Atuais");
            int i = 0;
            for(Vertice v : vertices.getConexoes()){
                System.out.println(i + "- "+ v.getDado());
                i++;
            }
            
            System.out.println("\n Deseja conectar alguem? Nao[0] ou Sim[1]");
            opt = scan.nextInt();
            
            while(opt == 1){
              System.out.println("> Quem? (Posicoes ex: conexao entre 0 e 3)\n");
              
              System.out.print("Digite Posição do Vertice/Pessoa: ");
              int PosPess1 = scan.nextInt();
              
              System.out.print("Qual peso desta conexao: ");
              int peso = scan.nextInt();
              
              System.out.print("Digite Posição do outro Vertice/Pessoa: ");
              int PosPess2 = scan.nextInt();
              
              grafo.makeConexion(peso, vertices.getConexoes().get(PosPess1), vertices.getConexoes().get(PosPess2));
              
              System.out.println("\n Deseja conectar mais alguem? N[0] ou S[1] ");
              opt = scan.nextInt();
            }
            
            opt = -1;
            while(opt != 2){
           
            System.out.println("Busca por Profundidade[0] ou Largura[1] ou SAIR[2]");
            opt = scan.nextInt();
                if(opt == 0){
                   grafo.DFSrec(vertices.getConexoes().get(0)); // Profundidade DFS
                }
                else if(opt == 1){
                   grafo.BFS(vertices.getConexoes().get(0)); // largura 
                }
                else{
                    opt = 2;
                }
            }
            
        }
        
        
    }
   
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);   
                 
       // CriaVertices montado:
       
       CriaVertices vertices = new CriaVertices();
       Graph grafo1 = new Graph();
       
       
        System.out.println("** Grafo ***");
        int opt = -1;
        System.out.println("Conexao Automatica? [0]-Sim [1]-Nao");
        opt = scan.nextInt();
        switch(opt){
            case 1 : 
              makeConexionsManual();
            break;
            
            default:
             makeConexionsAuto(vertices, grafo1);
            break;
        }      
  
    }
    
    
}
