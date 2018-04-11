

package distance_vector_routing;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Tables extends JFrame {
    int row;
    int col;
    int graph[][];
    JTable tables;
    
    public Tables() throws IOException{
        
        setLayout (new FlowLayout());
        printTables();
    }
    
    public void printTables() throws IOException{
        int i = 0;
        int j = 0;
    
        String name;
        
        Distance_vector_routing a = new Distance_vector_routing();
        this.row = a.row;
        this.col = a.col;
        this.graph = a.graph;
        String columnNames [] = new String [row];
        Object[][] data = new Object[row][col];
        
        
        System.out.print(row);
        
        for(i=0; i < row; i++){
            name = "cost to node " + row;
            columnNames[i] = name;
        }
        
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                data[i][j] = String.valueOf(graph[i][j]);
                System.out.print(data[i][j]);
            }
        }
        
        tables = new JTable(data, columnNames);
        tables.setPreferredScrollableViewportSize(new Dimension(500,50));
        tables.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(tables);
        add(scrollPane);
    }
    
    public static void main(String args[]) throws IOException{
        Tables gui = new Tables();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(600, 200);
        gui.setVisible(true);
        gui.setTitle("Table");
    }
    
}
