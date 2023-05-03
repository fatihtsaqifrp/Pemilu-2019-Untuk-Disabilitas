/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.View;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import mvc.Controller.ControllerPemilih2;

/**
 *
 * @author Sato
 */
public class FormYakinPilih2 extends javax.swing.JFrame {
    ControllerPemilih2 cp2;
    /**
     * Creates new form FormYakinPilih2
     */
    public FormYakinPilih2() {
        initComponents();
        
        //set icon
        ImageIcon img = new ImageIcon("epemilu.png");
        setIconImage(img.getImage());
        
        //set window ke tengah
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        //set hotkey
        String mapKey = "KEY_1";
        String mapKey2 = "KEY_2";
        String mapKey3 = "";
        InputMap inputMap = ButtonYa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        InputMap inputMap2 = ButtonBatal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("1"), mapKey);
        inputMap2.put(KeyStroke.getKeyStroke("2"), mapKey2);
        ButtonYa.getActionMap().put(mapKey, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ButtonYaActionPerformed(evt);
            }
        });
        ButtonBatal.getActionMap().put(mapKey2, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ButtonBatalActionPerformed(evt);
            }
        });
        
        cp2 = new ControllerPemilih2(this);
    }
    
    //method suara
    public void playStart() {
        try {
            File file = new File("SoundStart.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void playEnd() {
        try {
            File file = new File("SoundEnd.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    //getter untuk button & textfield
    public JButton getButtonYa()
    {
        return ButtonYa;
    }
    
    public JTextField getTfId()
    {
        return tfid;
    }
    
    public JTextField getTfPilih()
    {
        return tfpilih;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonYa = new javax.swing.JButton();
        ButtonBatal = new javax.swing.JButton();
        tfid = new javax.swing.JTextField();
        tfpilih = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Konfirmasi");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Apakah anda yakin untuk memilih pasangan Prabowo - Sandiaga Uno?");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvc/View/Mini2.jpg"))); // NOI18N

        ButtonYa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ButtonYa.setText("1. IYA");
        ButtonYa.setPreferredSize(new java.awt.Dimension(70, 23));
        ButtonYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonYaActionPerformed(evt);
            }
        });

        ButtonBatal.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ButtonBatal.setText("2. BATAL");
        ButtonBatal.setPreferredSize(new java.awt.Dimension(69, 23));
        ButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBatalActionPerformed(evt);
            }
        });

        tfid.setPreferredSize(new java.awt.Dimension(0, 0));

        tfpilih.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonYa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(176, Short.MAX_VALUE)
                    .addComponent(tfpilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(177, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonYa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(113, Short.MAX_VALUE)
                    .addComponent(tfpilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonYaActionPerformed
        tfpilih.setText("2");
        dispose();
        cp2.insert();
        new Sukses().setVisible(true);
        playEnd();
    }//GEN-LAST:event_ButtonYaActionPerformed

    private void ButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBatalActionPerformed
        playStart();
        dispose();
    }//GEN-LAST:event_ButtonBatalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBatal;
    private javax.swing.JButton ButtonYa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfpilih;
    // End of variables declaration//GEN-END:variables
}