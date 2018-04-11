/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance_vector_routing;

import java.io.*;
import java.util.*;


public class Distance_vector_routing {
        int graph [][];
        int row = 0;
        int col = 3;
    
    public Distance_vector_routing() throws IOException{
        File file = new File("graph.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> entry = new ArrayList<String>();
        Tables table;
        
        String line;
        
        int num;
        
        while ((line= br.readLine()) != null){
            entry.add(line);
            row++;
        }
        
        graph = new int[row][col];
        
        int i =0;
        int j =0;
        for (i = 0; i<row; i++){
            StringTokenizer str = new StringTokenizer(entry.get(i), " "); 
            for (j =0; j<col; j++){
                num = Integer.parseInt(str.nextToken());
                graph[i][j] = num;
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
        //table = new Tables(row,col,graph);
    }
    
}
