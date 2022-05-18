/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bromelliti.odysseus;

/**
 *
 * @author Neri
 */
public class Frame extends javax.swing.JFrame implements Runnable{

   Ugo giocatore;
   Ugo nemico;
   int n, n1;
   byte MORTE; // -1 se nemico morto, 0 se nessuno, 1 se giocatore
   AlphaCore omega;
    
    public Frame() {
        initComponents();
        setVisibleAll(false);
        giocatore = new Ugo(true, 100, 100, 100, 10, "Sannio");
        nemico = new Ugo(false, 100, 100, 100, 0, "placeholder");
        MORTE=0;
        jLabelSP.setVisible(false);
    }
    
    
    
    private void setVisibleAll(boolean visible){ //Rende invisibile/visible i bottoni e i label
        jButtonCura.setVisible(visible);
        jButtonAttacca.setVisible(visible);
        jButtonRicarica.setVisible(visible);
        jLabelCHP.setVisible(visible);
        jLabelCMP.setVisible(visible);
        //jLabelCSP.setVisible(visible);
        jLabelHP.setVisible(visible);
        //jLabelSP.setVisible(visible);
        jLabelMP.setVisible(visible);
        jLabelEHP.setVisible(visible);
        jLabelEMP.setVisible(visible);
        //jLabelESP.setVisible(visible);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRicarica = new javax.swing.JButton();
        jButtonAttacca = new javax.swing.JButton();
        jButtonCura = new javax.swing.JButton();
        jLabelMP = new javax.swing.JLabel();
        jLabelHP = new javax.swing.JLabel();
        jLabelSP = new javax.swing.JLabel();
        jLabelCHP = new javax.swing.JLabel();
        jLabelCSP = new javax.swing.JLabel();
        jLabelCMP = new javax.swing.JLabel();
        jButtonInizia = new javax.swing.JButton();
        jLabelEHP = new javax.swing.JLabel();
        jLabelESP = new javax.swing.JLabel();
        jLabelEMP = new javax.swing.JLabel();
        jLabelEvent1 = new javax.swing.JLabel();
        jLabelEvent2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setResizable(false);

        jButtonRicarica.setText("Ricarica");
        jButtonRicarica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRicaricaActionPerformed(evt);
            }
        });

        jButtonAttacca.setText("Attacca");
        jButtonAttacca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAttaccaActionPerformed(evt);
            }
        });

        jButtonCura.setText("Cura");
        jButtonCura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuraActionPerformed(evt);
            }
        });

        jLabelMP.setForeground(new java.awt.Color(0, 0, 255));
        jLabelMP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMP.setText("MP");

        jLabelHP.setForeground(new java.awt.Color(255, 0, 0));
        jLabelHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHP.setText("HP");

        jLabelSP.setBackground(new java.awt.Color(51, 51, 51));
        jLabelSP.setForeground(new java.awt.Color(0, 255, 0));
        jLabelSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSP.setText("SP");

        jLabelCHP.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelCSP.setForeground(new java.awt.Color(0, 255, 0));
        jLabelCSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelCMP.setForeground(new java.awt.Color(0, 0, 255));
        jLabelCMP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonInizia.setText("Inizia");
        jButtonInizia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inizia(evt);
            }
        });

        jLabelEHP.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelESP.setForeground(new java.awt.Color(0, 255, 0));
        jLabelESP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelEMP.setForeground(new java.awt.Color(0, 0, 255));
        jLabelEMP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelEvent1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEvent1.setMaximumSize(new java.awt.Dimension(34, 15));
        jLabelEvent1.setMinimumSize(new java.awt.Dimension(34, 15));
        jLabelEvent1.setPreferredSize(new java.awt.Dimension(34, 15));

        jLabelEvent2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEvent2.setMaximumSize(new java.awt.Dimension(34, 15));
        jLabelEvent2.setMinimumSize(new java.awt.Dimension(34, 15));
        jLabelEvent2.setPreferredSize(new java.awt.Dimension(34, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEvent1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAttacca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEHP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonInizia, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(jLabelSP, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(jButtonCura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelESP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelCSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelMP, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(jLabelCMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonRicarica, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEMP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelEvent2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMP)
                    .addComponent(jLabelHP)
                    .addComponent(jLabelSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelESP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelEHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jButtonInizia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabelEvent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEvent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCMP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRicarica)
                    .addComponent(jButtonCura)
                    .addComponent(jButtonAttacca))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Atrocisofferenze(short M){
        jButtonAttacca.setEnabled(false);
        jButtonCura.setEnabled(false);
        jButtonRicarica.setEnabled(false);
        switch (M){
            case 1:
                jLabelEvent1.setText("Hai perso!");
                break;
            case -1:
                jLabelEvent2.setText("Hai sconfitto Bob!");
                break;
        }
    }
    
    private void Turnonemico(){
        if (nemico.HP <=0 || nemico.MP <=0){
            MORTE = -1;
            Atrocisofferenze(MORTE);
        }
        if (MORTE==0) {
            
            nemico.check();
            giocatore.setSP(giocatore.getSP()+10);
            
            switch (nemico.getAzionenemico()) {
                case 1: //Nemico attacca
                    giocatore.HP -= nemico.getAA();
                    jLabelCHP.setText(Integer.toString(giocatore.HP));
                    jLabelEvent1.setText("Bob ti infligge " + nemico.getAA() + " danno!");
                    break;
                case 2: //Nemico si cura
                    jLabelEHP.setText(Integer.toString(nemico.HP));
                    jLabelEMP.setText(Integer.toString(nemico.MP));
                    jLabelEvent1.setText("Bob utilizza " + nemico.getMU() + " MP per curare " + nemico.getHA() + " HP!");
                    break;
                case 3: //Nemico ruba MP al giocatore
                    giocatore.MP -= nemico.getMS();
                    jLabelEMP.setText(Integer.toString(nemico.MP));
                    jLabelCMP.setText(Integer.toString(giocatore.MP));
                    jLabelEvent1.setText("Bob ti ruba " + nemico.getMS() + " MP!");
                    break;
            }
        }
        if (giocatore.HP <=0 || giocatore.MP <=0){
            MORTE = 1;
            Atrocisofferenze(MORTE);
        }
    }
    
    private void Inizia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inizia
        setVisibleAll(true);
        jButtonInizia.setVisible(false);
        jLabelCHP.setText(Integer.toString(giocatore.getHPMAX()));
        //jLabelCSP.setText(Integer.toString(giocatore.getSPMAX()));
        jLabelCMP.setText(Integer.toString(giocatore.getMPMAX()));
        jLabelEHP.setText(Integer.toString(nemico.getHPMAX()));
        //jLabelESP.setText(Integer.toString(nemico.getSPMAX()));
        jLabelEMP.setText(Integer.toString(nemico.getMPMAX()));
        jLabelEvent1.setText("Sconfiggi Bob!");
    }//GEN-LAST:event_Inizia

    private void jButtonAttaccaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAttaccaActionPerformed
        n = giocatore.attack(0);
        nemico.HP-=n;
        jLabelEHP.setText(Integer.toString(nemico.HP));
        jLabelEvent2.setText("Attacchi Bob per " + n + " danno!");
        Turnonemico();
    }//GEN-LAST:event_jButtonAttaccaActionPerformed

    private void jButtonCuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuraActionPerformed
        giocatore.heal();
        n = giocatore.getHA();
        n1 = giocatore.getMU();
        if (giocatore.HP > 100){
            giocatore.HP = 100;
            jLabelCHP.setText("100");
        } else {
            jLabelCHP.setText(Integer.toString(giocatore.HP));
        }
        jLabelCMP.setText(Integer.toString(giocatore.MP));
        jLabelEvent2.setText("Usi " + n1 + " MP e ti curi per " + n + " HP!");
        Turnonemico();
    }//GEN-LAST:event_jButtonCuraActionPerformed

    private void jButtonRicaricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRicaricaActionPerformed
        giocatore.recharge();
        n = giocatore.getMG();
        if(giocatore.MP > 100){
            giocatore.MP = 100;
            jLabelCMP.setText("100");
        } else {
            jLabelCMP.setText(Integer.toString(giocatore.MP));
        }
        jLabelCMP.setText(Integer.toString(giocatore.MP));
        jLabelEvent2.setText("Ricarichi " + giocatore.getMG() + " MP!");
        Turnonemico();
    }//GEN-LAST:event_jButtonRicaricaActionPerformed

    public void start() {
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAttacca;
    private javax.swing.JButton jButtonCura;
    private javax.swing.JButton jButtonInizia;
    private javax.swing.JButton jButtonRicarica;
    private javax.swing.JLabel jLabelCHP;
    private javax.swing.JLabel jLabelCMP;
    private javax.swing.JLabel jLabelCSP;
    private javax.swing.JLabel jLabelEHP;
    private javax.swing.JLabel jLabelEMP;
    private javax.swing.JLabel jLabelESP;
    private javax.swing.JLabel jLabelEvent1;
    private javax.swing.JLabel jLabelEvent2;
    private javax.swing.JLabel jLabelHP;
    private javax.swing.JLabel jLabelMP;
    private javax.swing.JLabel jLabelSP;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
    }
}
