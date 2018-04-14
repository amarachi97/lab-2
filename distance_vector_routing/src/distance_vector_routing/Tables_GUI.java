/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance_vector_routing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amarachi
 */
public class Tables_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Tables_GUI
     */
    int row = 0;
    int initial = 1;
    Object[] temp1 = {"1", "-", "-", "-", "-", "-", "-"};
    Object[] temp2 = {"2", "-", "-", "-", "-", "-", "-"};
    Object[] temp3 = {"3", "-", "-", "-", "-", "-", "-"};
    Object[] temp4 = {"4", "-", "-", "-", "-", "-", "-"};
    Object[] temp5 = {"5", "-", "-", "-", "-", "-", "-"};
    Object[] temp6 = {"6", "-", "-", "-", "-", "-", "-"};
    String columnNames [];
    Object[] tableLines;
    Object[] table1 = {"1", "-", "-", "-", "-", "-", "-"};
    Object[] table2 = {"2", "-", "-", "-", "-", "-", "-"};
    Object[] table3 = {"3", "-", "-", "-", "-", "-", "-"};
    Object[] table4 = {"4", "-", "-", "-", "-", "-", "-"};
    Object[] table5 = {"5", "-", "-", "-", "-", "-", "-"};
    Object[] table6 = {"6", "-", "-", "-", "-", "-", "-"};
    public Tables_GUI() throws FileNotFoundException, IOException {
        String columnNames [] = new String [row];
        
        initComponents();
        readFile();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("RUN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("File");

        jMenuItem1.setText("node 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("node 2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("node 3");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("node 4");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("node 5");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("node 6");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (initial == 1){
            model.addRow(temp1);
            model.addRow(temp2);
            model.addRow(temp3);
            model.addRow(table4);
            model.addRow(temp5);
            model.addRow(temp6);
        }
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (initial == 1){
            model.addRow(table1);
            model.addRow(temp2);
            model.addRow(temp3);
            model.addRow(temp4);
            model.addRow(temp5);
            model.addRow(temp6);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (initial == 1){
            model.addRow(temp1);
            model.addRow(table2);
            model.addRow(temp3);
            model.addRow(temp4);
            model.addRow(temp5);
            model.addRow(temp6);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (initial == 1){
            model.addRow(temp1);
            model.addRow(temp2);
            model.addRow(table3);
            model.addRow(temp4);
            model.addRow(temp5);
            model.addRow(temp6);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (initial == 1){
            model.addRow(temp1);
            model.addRow(temp2);
            model.addRow(temp3);
            model.addRow(temp4);
            model.addRow(table5);
            model.addRow(temp6);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (initial == 1){
            model.addRow(temp1);
            model.addRow(temp2);
            model.addRow(temp3);
            model.addRow(temp4);
            model.addRow(temp5);
            model.addRow(table6);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public void readFile() throws FileNotFoundException, IOException{
        File file = new File("graph.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        tableLines = br.lines().toArray();
        
        String line, name;
        
        row = tableLines.length + 1;
        
        System.out.print(row);
        
        columnNames = new String [row];
        int i;
        columnNames[0] = " ";
        for(i=1; i < row; i++){
            name = Integer.toString(i);
            columnNames[i] = name;
        }
        populate();
        
    }
    
    public void populate(){
        int i;
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setColumnIdentifiers(columnNames);
        
        for( i = 0; i < tableLines.length; i++)
            {
                String l = tableLines[i].toString().trim();
                String[] dataRow = l.split(" ");
                System.out.print(dataRow[0]);
                switch (dataRow[0]) {
                    case "1":
                        table1[1] = "0";
                        table1[Integer.parseInt(dataRow[1])] = dataRow[2];
                    case "2":
                        table2[2] = "0";
                        table2[Integer.parseInt(dataRow[1])] = dataRow[2];
                    case "3":
                        table3[3] = "0";
                        table3[Integer.parseInt(dataRow[1])] = dataRow[2];
                    case "4":
                        table4[4] = "0";
                        table4[Integer.parseInt(dataRow[1])] = dataRow[2];
                    case "5":
                        table5[5] = "0";
                        table5[Integer.parseInt(dataRow[1])] = dataRow[2];
                    case "6":
                        table6[6] = "0";
                        table6[Integer.parseInt(dataRow[1])] = dataRow[2];
                }

                switch (dataRow[1]) {
                    case "1":
                        table1[1] = "0";
                        table1[Integer.parseInt(dataRow[0])] = dataRow[2];
                    case "2":
                        table2[2] = "0";
                        table2[Integer.parseInt(dataRow[0])] = dataRow[2];
                    case "3":
                        table3[3] = "0";
                        table3[Integer.parseInt(dataRow[0])] = dataRow[2];
                    case "4":
                        table4[4] = "0";
                        table4[Integer.parseInt(dataRow[0])] = dataRow[2];
                    case "5":
                        table5[5] = "0";
                        table5[Integer.parseInt(dataRow[0])] = dataRow[2];
                    case "6":
                        table6[6] = "0";
                        table6[Integer.parseInt(dataRow[0])] = dataRow[2];
                }
            }
        //model.addRow(table1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tables_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tables_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tables_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tables_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tables_GUI().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Tables_GUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Tables_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    //private javax.swing.JMenuItem jMenuItem2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}



