/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uni.aed.gui;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import uni.aed.doublelinkedlist.DoubleLinkedList;
import uni.aed.doublelinkedlist.Nodo;
import uni.aed.ordenamiento.Ordenamiento;

/**
 *
 * @author kikhe
 */
public class FrmLinkedListHeapSort extends javax.swing.JFrame {
    private final DefaultListModel modeloList1 = new DefaultListModel();
    private final DefaultListModel modeloList2 = new DefaultListModel();
    private DoubleLinkedList doubleLinkedList;
    private final String CADENA_VACIA="";
    /**
     * Creates new form FrmLinkedListHeapSort
     */
    public FrmLinkedListHeapSort() {
        initComponents();
        doubleLinkedList=new DoubleLinkedList();
        ListaInicial.setModel(modeloList1);
        ListaOrdenada.setModel(modeloList2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbMetodo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaInicial = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaOrdenada = new javax.swing.JList<>();
        BtnOrdenar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbFirst = new javax.swing.JRadioButton();
        rbLast = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Metodo de Ordenamiento:");

        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HeapSort" }));

        jLabel2.setText("Ingrese los valores a ordenar:");

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

        ListaInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Inicial:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        jScrollPane1.setViewportView(ListaInicial);

        ListaOrdenada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Ordenada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 8))); // NOI18N
        jScrollPane2.setViewportView(ListaOrdenada);

        BtnOrdenar.setText("Ordenar");
        BtnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrdenarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de Insercion:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N

        rbFirst.setText("First");
        rbFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFirstActionPerformed(evt);
            }
        });

        rbLast.setSelected(true);
        rbLast.setText("Last");
        rbLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbLast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbFirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbLast)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnOrdenar)
                            .addComponent(BtnLimpiar))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(BtnOrdenar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BtnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrdenarActionPerformed
        Integer N=modeloList1.size();//aquie esta los elementos a ordenar
        if(N<=1) return;

        Ordenamiento o=new Ordenamiento();
        Integer[] Y=null;
        switch(cbMetodo.getSelectedIndex()){
            case 0->{
                o.heapSortLinkedList(doubleLinkedList);
            }
        }

        modeloList2.removeAllElements();
        Nodo Current=doubleLinkedList.head;
        for(int i=0;i<(N+1)*2;i++){
            if(i==0 || i==N*2+1){
                modeloList2.addElement("null");
            }
            if(i%2==0){
                modeloList2.addElement("¡!");
            }else{
                if(Current != null){
                    String elemento=Integer.toString(Current.data);
                    modeloList2.addElement(elemento);
                    Current=Current.next;
                }
                
            }

        }

    }//GEN-LAST:event_BtnOrdenarActionPerformed
    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        modeloList1.removeAllElements();
        modeloList2.removeAllElements();
        txtValor.setText(CADENA_VACIA);
        doubleLinkedList.clear();
        doubleLinkedList.clear();   
    }//GEN-LAST:event_BtnLimpiarActionPerformed
    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:
        int key =evt.getKeyChar();
        boolean numero=key>=48 && key<=57;
        if(!numero)
            evt.consume();
    }//GEN-LAST:event_txtValorKeyTyped
    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
        Registrar();
    }//GEN-LAST:event_txtValorActionPerformed
    private void rbFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFirstActionPerformed
        rbLast.setSelected(false);
    }//GEN-LAST:event_rbFirstActionPerformed
    private void rbLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLastActionPerformed
        rbFirst.setSelected(false);
    }//GEN-LAST:event_rbLastActionPerformed
    private void Registrar(){
        if (txtValor.getText().trim().isEmpty() ) return;        //
        
        if(rbFirst.isSelected()){
            doubleLinkedList.addFirst(Integer.parseInt(txtValor.getText()));
            modeloList1.add(0, txtValor.getText());
        }else{
            doubleLinkedList.addLast(Integer.parseInt(txtValor.getText()));
            modeloList1.addElement(txtValor.getText());
        }
        txtValor.setText(CADENA_VACIA);
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
            java.util.logging.Logger.getLogger(FrmLinkedListHeapSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLinkedListHeapSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLinkedListHeapSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLinkedListHeapSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLinkedListHeapSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnOrdenar;
    private javax.swing.JList<String> ListaInicial;
    private javax.swing.JList<String> ListaOrdenada;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbFirst;
    private javax.swing.JRadioButton rbLast;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
