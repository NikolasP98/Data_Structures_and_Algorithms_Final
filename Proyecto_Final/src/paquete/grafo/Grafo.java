/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.grafo;

/**
 *
 * @author Juan Diego Rojas
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Grafo {
    
    static final int cant_Vertices = 15;

    int minDistancia(int dist[], Boolean camino_valido[]) 
    { 
        // int min, al final de ejecutar el algoritmo, tiene que contener la distancia minima para llegar de un punto a otro
        int min = Integer.MAX_VALUE;
        int indice_min = -1; 
  
        for (int j = 0; j < cant_Vertices; j++) {
            if (camino_valido[j] == false && dist[j] <= min) { 
                min = dist[j]; 
                indice_min = j; 
            }
        }
        return indice_min; 
    } 
  
    // A utility function to print the constructed distance array 
    void printSolution(int dist[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < cant_Vertices; i++) 
            System.out.println(i + " \t\t " + dist[i]); 
    } 
  
    // Aplicar algoritmo a grafo de adyacencia
    void caminoOptimo(int grafo[][], int src) 
    { 
        int dist[] = new int[cant_Vertices];
  
        // camino_valido[i] will true if vertex i is included in shortest 
        // path tree or shortest distance from src to i is finalized 
        Boolean camino_valido[] = new Boolean[cant_Vertices]; 
  
        // Initialize all distances as INFINITE and stpSet[] as false 
        for (int i = 0; i < cant_Vertices; i++) { 
            dist[i] = Integer.MAX_VALUE; 
            camino_valido[i] = false; 
        } 
  
        // Distance of source vertex from itself is always 0 
        dist[src] = 0; 
  
        // Find shortest path for all cant_Verticess 
        for (int count = 0; count < cant_Vertices - 1; count++) { 
            // Pick the minimum distance vertex from the set of cant_Verticess 
            // not yet processed. u is always equal to src in first 
            // iteration. 
            int u = minDistancia(dist, camino_valido); 
  
            // Mark the picked vertex as processed 
            camino_valido[u] = true; 
  
            // Update dist value of the adjacent cant_Verticess of the 
            // picked vertex. 
            for (int v = 0; v < cant_Vertices; v++) 
  
                // Update dist[v] only if is not in camino_valido, there is an 
                // edge from u to v, and total weight of path from src to 
                // v through u is smaller than current value of dist[v] 
                if (!camino_valido[v] && grafo[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + grafo[u][v] < dist[v]) 
                    dist[v] = dist[u] + grafo[u][v]; 
        } 
  
        // print the constructed distance array 
        printSolution(dist); 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        /* Let us create the example grafo discussed above */
        int grafo[][] = new int[][] {
            /*SAN MIGUEL*/  { 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*MAGDALENA*/   { 2, 0, 2, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*SAN ISIDRO*/  { 0, 2, 0, 1, 0, 0, 2, 0, 2, 3, 0, 0, 0, 0, 0},
            /*MIRAFLORES*/  { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 4, 0, 0, 0},
            /*PUEBLO LIBRE*/{ 1, 2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*JESUS MARIA*/ { 0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            /*SURQUILLO*/   { 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0},
            /*BARRANCO*/    { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0},
            /*LINCE*/       { 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*SAN BORJA*/   { 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0},
            /*CHORRILLOS*/  { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
            /*SURCO*/       { 0, 0, 0, 4, 0, 0, 3, 2, 0, 2, 1, 0, 0, 3, 4},
            /*ATE*/         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0},
            /*LA MOLINA*/   { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 3},
            /*SJM*/         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 3, 0},
                                    }; 
        Grafo t = new Grafo(); 
        t.caminoOptimo(grafo, 0); 
    } 
} 

    


