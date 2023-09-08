package uni.aed.gui;

import javax.swing.DefaultListModel;
import uni.aed.ordenamiento.Burbuja;
import uni.aed.ordenamiento.Burbuja.*;
import uni.aed.ordenamiento.Ordenamiento;

public class SortJFrame extends javax.swing.JFrame {
    DefaultListModel modeloList1=new DefaultListModel();
    DefaultListModel modeloList2=new DefaultListModel();
    public SortJFrame() {
        initComponents();
        ListaInicial.setModel(modeloList1);
        ListaOrdenada.setModel(modeloList2);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaInicial = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaOrdenada = new javax.swing.JList<>();
        BtnOrdenar = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        lblIntercambios = new javax.swing.JLabel();
        lblComparaciones = new javax.swing.JLabel();
        txtIntercambios = new javax.swing.JTextField();
        txtComparaciones = new javax.swing.JTextField();
        cbMetodo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CheckBoxAscending = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtEjecucion = new javax.swing.JTextField();
        cbCarga = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmo de Ordenamiento de la burbuja");

        jLabel1.setText("Ingrese los valores a ordenar:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(ListaInicial);

        jScrollPane2.setViewportView(ListaOrdenada);

        BtnOrdenar.setText("Ordenar");
        BtnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrdenarActionPerformed(evt);
            }
        });

        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        lblIntercambios.setText("#intercambios");

        lblComparaciones.setText("#comparaciones");

        txtIntercambios.setEditable(false);
        txtIntercambios.setText("jTextField1");

        txtComparaciones.setEditable(false);
        txtComparaciones.setText("jTextField1");

        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Burbuja", "Insercion", "BinaryInsercion", "Seleccion", "QuickSort", "ShellSort" }));

        jLabel2.setText("Mtodo Ordenamiento:");

        CheckBoxAscending.setText("ascendente?");
        CheckBoxAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxAscendingActionPerformed(evt);
            }
        });

        jLabel3.setText("Tiempo de ejecucion");

        txtEjecucion.setText("jTextField1");

        cbCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Aleatoria" }));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                .addComponent(BtnLimpiar)
                                .addGap(452, 452, 452)
                                .addComponent(BtnCerrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BtnOrdenar)
                                                .addGap(126, 126, 126))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CheckBoxAscending, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(103, 103, 103)))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblComparaciones))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(95, 95, 95)))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73)
                                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(cbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(BtnOrdenar)
                                .addGap(41, 41, 41)
                                .addComponent(CheckBoxAscending))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIntercambios))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComparaciones))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCerrar)
                    .addComponent(BtnLimpiar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        modeloList1.removeAllElements();
        modeloList2.removeAllElements();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        modeloList1.addElement(txtValor.getText());
        txtValor.setText("");
    }//GEN-LAST:event_txtValorActionPerformed

    private void BtnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrdenarActionPerformed
        Integer N=ListaInicial.getModel().getSize();
        Integer[] X=new Integer[N];
        for(int i=0;i<N;i++){
            X[i]=Integer.parseInt(ListaInicial.getModel().getElementAt(i));
        }
        Ordenamiento algo =new Ordenamiento();
        
        String selectedAlgorithm = (String) cbMetodo.getSelectedItem();
        switch (selectedAlgorithm) {
            case "Burbuja":
                algo.burbuja(X);
               
                break;
            case "ShellSort":
                algo.shellSort(X);
                
            case "Insercion":
                algo.insercion(X);
                break;
                
            case "BinaryInsercion":
                algo.binaryInsertion(X);
                break;
            case "QuickSort":
                algo.Callquicksort(X);
            case "Seleccion":
                algo.seleccion4c(X);
                break;
            default:
                break;
        }
        modeloList2.removeAllElements();
        if(CheckBoxAscending.isSelected()){
            for(int i=0;i<N;i++){
                modeloList2.addElement(X[i]);
            }
        }else{
            for(int i=N-1;i>=0;i--){
                modeloList2.addElement(X[i]);
            }
        }
       txtComparaciones.setText(Integer.toString(algo.getnComparaciones()));
        txtIntercambios.setText(Integer.toString(algo.getnIntercambios()));
        txtEjecucion.setText(Double.toString(algo.getTiempoEjecucion()));
    }//GEN-LAST:event_BtnOrdenarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        int key =evt.getKeyChar();
        boolean numero=key>=48 && key<=57;
        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void CheckBoxAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxAscendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxAscendingActionPerformed

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
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnOrdenar;
    private javax.swing.JCheckBox CheckBoxAscending;
    private javax.swing.JList<String> ListaInicial;
    private javax.swing.JList<String> ListaOrdenada;
    private javax.swing.JComboBox<String> cbCarga;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblComparaciones;
    private javax.swing.JLabel lblIntercambios;
    private javax.swing.JTextField txtComparaciones;
    private javax.swing.JTextField txtEjecucion;
    private javax.swing.JTextField txtIntercambios;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
