/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controlers.FileReader;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Level;

/**
 *
 * @author 0101220
 */
public class SplashScreen extends JFrame {

    static FileReader a = new FileReader();
    static ArrayList<Level> Levels = new ArrayList();
    private static final int DEFAULT_WIDTH = 480;
    private static final int DEFAULT_HEIGHT = (DEFAULT_WIDTH / 12) * 9;
    private static final int SCALE = 2;

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        this.setUndecorated(true);
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH * SCALE, DEFAULT_HEIGHT * SCALE));
        this.setMinimumSize(new Dimension(DEFAULT_WIDTH * SCALE, DEFAULT_HEIGHT * SCALE));
        this.setMaximumSize(new Dimension(DEFAULT_WIDTH * SCALE, DEFAULT_HEIGHT * SCALE));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        Levels = a.GetAllLevels();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        buttonGroup = new javax.swing.JPanel();
        newBtn = new javax.swing.JButton();
        loadBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup.setMaximumSize(new java.awt.Dimension(320, 240));
        buttonGroup.setMinimumSize(new java.awt.Dimension(320, 240));
        buttonGroup.setPreferredSize(new java.awt.Dimension(320, 240));

        newBtn.setText("New Game");
        newBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newBtn.setMaximumSize(new java.awt.Dimension(50, 19));
        newBtn.setMinimumSize(new java.awt.Dimension(50, 19));
        newBtn.setPreferredSize(new java.awt.Dimension(50, 19));
        newBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newBtnMouseClicked(evt);
            }
        });
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        loadBtn.setText("Load Game");
        loadBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loadBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loadBtn.setMaximumSize(new java.awt.Dimension(57, 30));
        loadBtn.setMinimumSize(new java.awt.Dimension(57, 30));
        loadBtn.setPreferredSize(new java.awt.Dimension(50, 19));
        loadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadBtnMouseClicked(evt);
            }
        });

        exitBtn.setText("Exit Game");
        exitBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        aboutBtn.setText("About");
        aboutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aboutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutBtnMouseClicked(evt);
            }
        });
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonGroupLayout = new javax.swing.GroupLayout(buttonGroup);
        buttonGroup.setLayout(buttonGroupLayout);
        buttonGroupLayout.setHorizontalGroup(
            buttonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonGroupLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(buttonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(newBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(loadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aboutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        buttonGroupLayout.setVerticalGroup(
            buttonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonGroupLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(loadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(buttonGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(buttonGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBtnMouseClicked
        List<Object> options = new ArrayList<>();

        for (Level l : Levels) {
            options.add(l.getLevelId());
        };
        int option = JOptionPane.showOptionDialog(this, "Qual Nivel quer escolher?", "Escolha um nível", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options.toArray(), options.get(0));

        if (option > -1) {
            GameBoard game = new GameBoard(Levels.get(option));
            Runnable runner = () -> {
                /* Create and display the form */
                game.setVisible(true);
            };

            EventQueue.invokeLater(runner);
        }

    }//GEN-LAST:event_newBtnMouseClicked

    private void loadBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            //This is where a real application would open the file.
            try {
                GameBoard game = new GameBoard(a.GetSavedLevel(file.getPath()), true);

                Runnable runner = () -> {
                    /* Create and display the form */
                    game.setVisible(true);
                };
                EventQueue.invokeLater(runner);
            } catch (Exception ex) {
                Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loadBtnMouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newBtnActionPerformed

    private void aboutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutBtnMouseClicked

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
                Runnable runner = () -> {
                    /* Create and display the form */
                    new AboutScreen().setVisible(true);
                };
                EventQueue.invokeLater(runner);
    }//GEN-LAST:event_aboutBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JPanel buttonGroup;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton loadBtn;
    private javax.swing.JPanel main;
    private javax.swing.JButton newBtn;
    // End of variables declaration//GEN-END:variables
}
