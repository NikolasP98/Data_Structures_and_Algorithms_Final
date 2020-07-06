/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.grafo;

/**
 *
 * @author Nikolas Pinon
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Grafo {

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

    static final int cant_Vertices = 15;
    String distritos[] = new String[] {
        "SAN MIGUEL", "MAGDALENA", "SAN ISIDRO", "MIRAFLORES", "PUEBLO LIBRE", "JESUS MARIA", "SURQUILLO", "BARRANCO", "LINCE", "SAN BORJA", "CHORRILLOS", "SURCO", "ATE", "LA MOLINA", "SJM"
    };
    int minDistancia(int dist[], Boolean camino_procesado[]) { 
        // int min, al final de ejecutar el algoritmo, tiene que contener la distancia minima para llegar de un punto a otro
        int min = Integer.MAX_VALUE;
        int indice_min = -1; 
  
        for (int j = 0; j < cant_Vertices; j++) {
            if (camino_procesado[j] == false && dist[j] <= min) { 
                min = dist[j]; 
                indice_min = j; 
            }
        }
        return indice_min; 
    }
  
    // Aplicar algoritmo a grafo de adyacencia
    public int caminoOptimo(String src, String end) { 
        int dist[] = new int[cant_Vertices];
  
        // camino_procesado[i] will true if vertex i is included in shortest 
        // path tree or shortest distance from src to i is finalized 
        Boolean camino_procesado[] = new Boolean[cant_Vertices]; 
  
        // Inicializar arreglo de distancia[] y arreglo booleano de camino_procesado[]
        for (int i = 0; i < cant_Vertices; i++) { 
            dist[i] = Integer.MAX_VALUE; 
            camino_procesado[i] = false; 
        } 
  
        // Parsear el texto ingresado por el usuario a mayusculas para evitar errores
        int indice_origen = java.util.Arrays.asList(distritos).indexOf(src.toUpperCase());
        int indice_fin = java.util.Arrays.asList(distritos).indexOf(end.toUpperCase());

        dist[indice_origen] = 0; 
  
        // buscar el camino mas corto del origen a todos los demas destinos
        for (int contador = 0; contador < cant_Vertices - 1; contador++) { 
            int u = minDistancia(dist, camino_procesado); 
  
            // Indica si el vertice ha sido procesado en el paso anterior
            camino_procesado[u] = true; 
            for (int v = 0; v < cant_Vertices; v++) 
  
                if (!camino_procesado[v] && grafo[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + grafo[u][v] < dist[v]) 
                    dist[v] = dist[u] + grafo[u][v]; 
        } 
  
        // devolver la distancia minima del origen al destino
        System.out.println(dist[indice_fin]);
        return dist[indice_fin];
    } 
  
    public static void main(String[] args) 
    {
        Grafo t = new Grafo(); 
        t.caminoOptimo("SJM", "LA MOLINA");
    } 
} 

    


