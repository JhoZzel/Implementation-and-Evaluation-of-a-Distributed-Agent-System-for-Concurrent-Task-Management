/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concurrentdistributed.final2024.concurrentdistributedprogramming.Client;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fespa
 */
public class ClientGUI extends javax.swing.JFrame {
    
    // Variables 
    //private int nFiles = 100;
    private int c = 0; //Contador de archivos
    private List<String> list_contents = new ArrayList<>();
    private List<Integer> list_tasks = new ArrayList<>();
    private List<String> list_input = new ArrayList<>();
    private List<Integer> list_nLines = new ArrayList<>();
    
    String filePathToRead = "";
    String filePathToMaster = "/home/fespa/Desktop/Files/fileToLeader.txt";
        
    public ClientGUI() {        
        initComponents();
        
        setTitle("Maquina de Tareas");
        // Agregamos los botones a nuestro taskButtonGroup
        taskButtonGroup.add(wordCountOption);
        taskButtonGroup.add(keywordSearchOption);
        taskButtonGroup.add(repeatedKeywordOption);
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        taskButtonGroup = new javax.swing.ButtonGroup();
        PanelMain = new javax.swing.JPanel();
        sendButton = new javax.swing.JButton();
        filePathLabel = new javax.swing.JLabel();
        wordCountOption = new javax.swing.JRadioButton();
        keywordSearchOption = new javax.swing.JRadioButton();
        repeatedKeywordOption = new javax.swing.JRadioButton();
        textFieldFilePath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addFileButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaInput = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaOutput = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jTextPane1);

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMain.setPreferredSize(new java.awt.Dimension(600, 750));

        sendButton.setText("Send Task");
        sendButton.setActionCommand("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        filePathLabel.setText("File Path");

        wordCountOption.setText("Word Count");

        keywordSearchOption.setText("Keyword Search");
        keywordSearchOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keywordSearchOptionActionPerformed(evt);
            }
        });

        repeatedKeywordOption.setText("Repeated Keyword");

        textFieldFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFilePathActionPerformed(evt);
            }
        });

        jLabel1.setText("Input");

        addFileButton.setText("Add File");
        addFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Output");

        textAreaInput.setColumns(20);
        textAreaInput.setRows(5);
        jScrollPane2.setViewportView(textAreaInput);

        textAreaOutput.setColumns(20);
        textAreaOutput.setRows(5);
        jScrollPane3.setViewportView(textAreaOutput);

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(addFileButton)
                .addGap(50, 50, 50)
                .addComponent(sendButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addComponent(filePathLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(textFieldFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(repeatedKeywordOption)
                                .addComponent(keywordSearchOption)
                                .addComponent(wordCountOption)
                                .addComponent(jScrollPane2)))
                        .addGap(0, 83, Short.MAX_VALUE))))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(filePathLabel)
                .addGap(18, 18, 18)
                .addComponent(textFieldFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wordCountOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keywordSearchOption)
                .addGap(13, 13, 13)
                .addComponent(repeatedKeywordOption)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendButton)
                    .addComponent(addFileButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keywordSearchOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keywordSearchOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keywordSearchOptionActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:        
        
        
        try {
            FileWriter fileWriter = new FileWriter(filePathToMaster);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(Integer.toString(c)); // Cantidad de archivos
            bw.newLine();
            for(int i=0; i<c; i++){
                bw.write(Integer.toString(list_nLines.get(i))); bw.newLine();
                bw.write(list_contents.get(i)); bw.newLine();
                bw.write(Integer.toString(list_tasks.get(i))); bw.newLine();
                String[] splitArray = list_input.get(i).split("-"); 
                for(String s : splitArray){
                    bw.write(s); bw.newLine();
                }                  
            }
            
            bw.close();
            System.out.println("Archivo guardado exitosamente.");
            
            
        } catch (IOException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_sendButtonActionPerformed

    private void textFieldFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFilePathActionPerformed
        
    }//GEN-LAST:event_textFieldFilePathActionPerformed

    private void addFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileButtonActionPerformed
        System.out.println("Se agrego el archivo : " + Integer.toString(c+1));

        // Para el archivo actual obtenemos su nLineas, Contenido, tarea-input.
        filePathToRead = textFieldFilePath.getText();
        System.out.println("Ruta del archivo a leer : " + filePathToRead);
        String fileContent = getFileContent(filePathToRead);
        list_contents.add(fileContent);

        // Tareas 1-2-3
        if(wordCountOption.isSelected()){
            // Entradas : #Palabras, Palabras_i
            list_tasks.add(1);

        } else if(keywordSearchOption.isSelected()){
            // Entradas : #Palabras Clave, PalClave_i
            list_tasks.add(2);

        } else if(repeatedKeywordOption.isSelected()) {
            // Entradas : #Palabras Clave, Frecuencia de repeticion, PalClave_i
            list_tasks.add(3);
        }

        // Guardamos el input todo en un solo String separados por ','
        list_input.add(getInput());
        
        // Impresion
        StringBuilder sb = new StringBuilder();
        sb.append("nFiles: ").append(c).append("\n");
        sb.append("Contents: ").append(list_contents.toString()).append("\n");
        sb.append("Tasks: ").append(list_tasks.toString()).append("\n");
        sb.append("Input: ").append(list_input.toString()).append("\n");
        sb.append("Number of Lines: ").append(list_nLines.toString()).append("\n");
        System.out.println(sb.toString());
        
        // Aumenta el contador de archivos
        c++;

    }//GEN-LAST:event_addFileButtonActionPerformed

    
    // ------------------------------------------------------------------------------------
    
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
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMain;
    private javax.swing.JButton addFileButton;
    private javax.swing.JLabel filePathLabel;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton keywordSearchOption;
    private javax.swing.JRadioButton repeatedKeywordOption;
    private javax.swing.JButton sendButton;
    private javax.swing.ButtonGroup taskButtonGroup;
    private javax.swing.JTextArea textAreaInput;
    private javax.swing.JTextArea textAreaOutput;
    private javax.swing.JTextField textFieldFilePath;
    private javax.swing.JRadioButton wordCountOption;
    // End of variables declaration//GEN-END:variables

    
    private String getFileContent(String filePath) {        
        // Lectura del contenido del archivo txt
        StringBuilder fileContent = new StringBuilder();
        int lineCount = 0;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                if (lineCount > 0) {
                    fileContent.append(" ");
                }
                fileContent.append(line);
                lineCount++;
            }

            reader.close();

            // Actualizar list_nLines con el número de líneas leídas
            list_nLines.add(lineCount);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error en el archivo: " + e.getMessage());
        }

        return fileContent.toString();
                
    }
    
    private String getInput(){
        StringBuilder str = new StringBuilder();
        String[] lines = textAreaInput.getText().split("\n");

        for (int i = 0; i < lines.length; i++) {
            str.append(lines[i]);
            if (i < lines.length - 1) {
                str.append("-");
            }
        }

        return str.toString();
    }
       
       
    
}