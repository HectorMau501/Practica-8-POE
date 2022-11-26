/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Cola;
import Clases.Pila;
import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR MAURICIO
 */
public class frmMenu extends javax.swing.JFrame {
    
        
    Pila valorPila = new Pila();
    Cola valorCola = new Cola();

    String respuesta;
    int numero;
    int numero2;
    
    public frmMenu() {
        initComponents();
        
        String respuesta = "";
         int numero = 0;
         int numero2 = 0;
        
        
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiPush = new javax.swing.JMenuItem();
        jmiRecorrer = new javax.swing.JMenuItem();
        jmPop = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmEconlar = new javax.swing.JMenu();
        jmiEnconlar = new javax.swing.JMenuItem();
        jmRecorrer = new javax.swing.JMenuItem();
        jmDesencolar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Pila");

        jmiPush.setText("Push");
        jmiPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPushActionPerformed(evt);
            }
        });
        jMenu1.add(jmiPush);

        jmiRecorrer.setText("Recorrer");
        jmiRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRecorrerActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRecorrer);

        jmPop.setText("Pop");
        jmPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPopActionPerformed(evt);
            }
        });
        jMenu1.add(jmPop);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jmEconlar.setText("Cola");

        jmiEnconlar.setText("Encolar");
        jmiEnconlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEnconlarActionPerformed(evt);
            }
        });
        jmEconlar.add(jmiEnconlar);

        jmRecorrer.setText("Recorrer");
        jmRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRecorrerActionPerformed(evt);
            }
        });
        jmEconlar.add(jmRecorrer);

        jmDesencolar.setText("Desencolar");
        jmDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDesencolarActionPerformed(evt);
            }
        });
        jmEconlar.add(jmDesencolar);

        jMenuBar1.add(jmEconlar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(633, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPushActionPerformed
        
        
        respuesta = JOptionPane.showInputDialog(this, "Capturar Numero");
        numero = Integer.parseInt(respuesta);
        valorPila.push(numero, respuesta);
        
       
    }//GEN-LAST:event_jmiPushActionPerformed

    private void jmPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPopActionPerformed
        // TODO add your handling code here:
        String valor = valorPila.recorrerPila();
        System.out.println(valor);
        if(valor.equals("Pila vacia"))
        {
            JOptionPane.showMessageDialog(this, "Mensaje informativo", "!Notificacion", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null,"La pila esta vacia");
        }
        else
        {
            numero = JOptionPane.showConfirmDialog(this,"Borrar Dato?","Eliminar infomacion",JOptionPane.OK_CANCEL_OPTION);
                valorPila.pop();
        }
        
    
    }//GEN-LAST:event_jmPopActionPerformed

    private void jmiRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRecorrerActionPerformed
       
        if(valorPila.recorrerPila() == null)
        {
            JOptionPane.showMessageDialog(this,"Esta es una advertencia","Informativo",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
        else if(valorPila.recorrerPila() != null)
        {
            numero = JOptionPane.showConfirmDialog(this,valorPila.recorrerPila(),"El dato es",JOptionPane.OK_CANCEL_OPTION); 
        }   
        
    }//GEN-LAST:event_jmiRecorrerActionPerformed

    private void jmiEnconlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEnconlarActionPerformed
        // TODO add your handling code here:
        respuesta = JOptionPane.showInputDialog(this, "Capturar Numero");
        numero = Integer.parseInt(respuesta);
        valorCola.encolar(numero, respuesta);
    }//GEN-LAST:event_jmiEnconlarActionPerformed

    private void jmRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRecorrerActionPerformed
        // TODO add your handling code here:
        if(valorCola.recorrerCola() == null)
        {
            //JOptionPane.showMessageDialog(this,"Esta es una advertencia","Informativo",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null,"La pila esta vacia");
        }
        else if(valorCola.recorrerCola() != null)
        {
            numero = JOptionPane.showConfirmDialog(this,valorCola.recorrerCola(),"El dato es",JOptionPane.OK_CANCEL_OPTION);
        } 
    }//GEN-LAST:event_jmRecorrerActionPerformed

    private void jmDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDesencolarActionPerformed
        
        String valor = valorCola.recorrerCola();
        System.out.println(valor);
        
        if(valorCola.estaVacia())
        {
            JOptionPane.showMessageDialog(this,"Esta es una advertencia","Informativo",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
        else
        {
            numero = JOptionPane.showConfirmDialog(this,"Borrar Dato?","Eliminar infomacion",JOptionPane.OK_CANCEL_OPTION);
            valorCola.desencolar();
        }
    }//GEN-LAST:event_jmDesencolarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmDesencolar;
    private javax.swing.JMenu jmEconlar;
    private javax.swing.JMenuItem jmPop;
    private javax.swing.JMenuItem jmRecorrer;
    private javax.swing.JMenuItem jmiEnconlar;
    private javax.swing.JMenuItem jmiPush;
    private javax.swing.JMenuItem jmiRecorrer;
    // End of variables declaration//GEN-END:variables
}