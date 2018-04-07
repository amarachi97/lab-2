

package distance_vector_routing;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Tables extends JFrame {
    int row;
    int col;
    int graph[][];
    JTable tables;
    
    public Tables(int row, int col, int graph[][]){
        this.row = row;
        this.col = col;
        this.graph = graph;
        setLayout (new FlowLayout());
        printTables();
    }
    
    public void printTables(){
        int i = 0;
        int j = 0;
        String name;
        String columnNames [] = new String [row];
        Object[][] data = new Object[row][col];
        
        for(i=0; i < row; i++){
            name = "cost to node " + row;
            columnNames[i] = name;
        }
        
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                data[i][j] = graph[i][j];
            }
        }
        
        tables = new JTable(data, columnNames);
        tables.setPreferredScrollableViewportSize(new Dimension(500,50));
        tables.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(tables);
    }
    
    public static void main(String args[]) throws IOException{
        Distance_vector_routing a = new Distance_vector_routing(row, col, graph);
    }
    
}
