/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_19130539_proyecto4;


import Utilerias.JTable.ColorCeldas;
import java.awt.Color;
import java.util.Arrays;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa504
 */
public class NewJFramePRICIPAL4 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFramePRICIPAL
     */
    public NewJFramePRICIPAL4() {
        initComponents();
        
        jTabPRECIOS.setShowGrid(true);
        jTabPRODUCTOS.setShowGrid(true);
        jTabORDENADOS.setShowGrid(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabPRECIOS = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSpinPRODUCTOS = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jSpinPRECIOS = new javax.swing.JSpinner();
        jButALEATORIOS = new javax.swing.JButton();
        jButCALCULAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabMENOR = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabMAYOR = new javax.swing.JLabel();
        jLaBPROMEDIO = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabPRODUCTOS = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabORDENADOS = new javax.swing.JTable();
        jButORDENAR = new javax.swing.JButton();
        jButCOLORES = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabPRECIOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabPRECIOS);

        jLabel1.setText("PRODUCTOS");

        jSpinPRODUCTOS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinPRODUCTOSStateChanged(evt);
            }
        });

        jLabel2.setText("PRECIOS");

        jSpinPRECIOS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinPRECIOSStateChanged(evt);
            }
        });

        jButALEATORIOS.setText("ALEATORIOS");
        jButALEATORIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButALEATORIOSActionPerformed(evt);
            }
        });

        jButCALCULAR.setText("CALCULAR");
        jButCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCALCULARActionPerformed(evt);
            }
        });

        jLabel3.setText("PROMEDIO");

        jLabMENOR.setBackground(new java.awt.Color(255, 0, 153));
        jLabMENOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabMENOR.setOpaque(true);

        jLabel5.setText("MAYOR");

        jLabMAYOR.setBackground(new java.awt.Color(255, 0, 153));
        jLabMAYOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabMAYOR.setOpaque(true);

        jLaBPROMEDIO.setBackground(new java.awt.Color(255, 0, 153));
        jLaBPROMEDIO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLaBPROMEDIO.setOpaque(true);

        jLabel8.setText("MAYOR2");

        jTabPRODUCTOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTOS"
            }
        ));
        jScrollPane2.setViewportView(jTabPRODUCTOS);

        jTabORDENADOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTabORDENADOS);

        jButORDENAR.setText("ASCENDENTE");
        jButORDENAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButORDENARActionPerformed(evt);
            }
        });

        jButCOLORES.setText("COLORES");
        jButCOLORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCOLORESActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\fundamentos de programacion\\FL_19130539_PROYECTO4\\ASIGNACION.jpeg")); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinPRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLaBPROMEDIO, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jSpinPRECIOS, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButALEATORIOS)
                            .addComponent(jLabMAYOR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(53, 53, 53)
                                .addComponent(jLabMENOR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButCALCULAR)
                                .addGap(53, 53, 53)
                                .addComponent(jButORDENAR)
                                .addGap(32, 32, 32)
                                .addComponent(jButCOLORES)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSpinPRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinPRECIOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButALEATORIOS)
                            .addComponent(jButCALCULAR)
                            .addComponent(jButORDENAR)
                            .addComponent(jButCOLORES))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLaBPROMEDIO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabMAYOR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabMENOR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinPRODUCTOSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinPRODUCTOSStateChanged
        // TODO add your handling code here:
        int productos = Integer.parseInt(jSpinPRODUCTOS.getValue()+"");
        
        DefaultTableModel modelo =  (DefaultTableModel)jTabPRECIOS.getModel();
        modelo.setRowCount(productos);
        
        DefaultTableModel modeloNom =  (DefaultTableModel)jTabPRODUCTOS.getModel();
        modeloNom.setRowCount(productos);
        
         DefaultTableModel modeloOrd =  (DefaultTableModel)jTabORDENADOS.getModel();
        modeloOrd.setRowCount(productos);
        
        String [] producto = {"BROCHAS","MAQUILLAJE","SOMBRAS","PRIMER",
            "RUBOR","ILUMINADOR","CONTORNEADOR","SEÑADOR DE MAQUILLAJE","CORRECTOR","BASE",
            "RIMEL","ENCHINADOR","DELINEADOR NEGRO","DELINEADOR PLATA","BRILLOS",
            "SOMBRA DE CEJA","LABIALES","ESPONJA","POLVO",
            "PESTAÑAS"};
        
        for(int r=0; r<producto.length; r++)
            jTabPRODUCTOS.setValueAt(producto[r], r, 0);
    }//GEN-LAST:event_jSpinPRODUCTOSStateChanged

    private void jSpinPRECIOSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinPRECIOSStateChanged
        // TODO add your handling code here:
        int precios = Integer.parseInt(jSpinPRECIOS.getValue()+"");
        
        DefaultTableModel modelo =  (DefaultTableModel)jTabPRECIOS.getModel();
        
        String [] precio = {"bissu","mary kay","maybeline","MAC","loreal","avon",
            "sephora","kylie","gelish","chanel"};
        
        modelo.setColumnIdentifiers(precio);
        modelo.setColumnCount(precios);
        
        DefaultTableModel modeloOrd =  (DefaultTableModel)jTabORDENADOS.getModel();
        modeloOrd.setColumnIdentifiers(precio);
        modeloOrd.setColumnCount(precios);
    }//GEN-LAST:event_jSpinPRECIOSStateChanged

    private void jButALEATORIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButALEATORIOSActionPerformed
        // TODO add your handling code here:
        
        Random azar = new Random();
        
        for(int r=0; r<jTabPRECIOS.getRowCount(); r++)
            for(int c=0; c<jTabPRECIOS.getColumnCount(); c++)
                jTabPRECIOS.setValueAt(azar.nextInt(101), r, c);
    }//GEN-LAST:event_jButALEATORIOSActionPerformed

    private void jButCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCALCULARActionPerformed
        // TODO add your handling code here:
        //creamos una matriz de la misma dimension que el JTable
        int[][] productos = new int [jTabPRECIOS.getRowCount()][jTabPRECIOS.getColumnCount()];
        
        //copiamos los valores de cada celda del JTable a cada elemento de la matri
        int r,c;
        
        for(r=0; r<jTabPRECIOS.getRowCount(); r++)
            for(c=0; c<jTabPRECIOS.getColumnCount(); c++)
                productos[r][c] = Integer.parseInt(jTabPRECIOS.getValueAt(r,c)+"");
        
        //calculamos el promedio de los mayores
        int suma = 0;
        int mayor = productos[0][0];
        int mayor2 = productos[0][0];
        
        int renMayor = 0, colMayor = 0, renMayor2 = 0,colMayor2 = 0;
        
        for(r=0; r<productos.length; r++)
            for(c=0; c<productos[0].length; c++)
            {
                suma += productos[r][c];
                
                if(productos[r][c] > mayor)
                {
                    mayor = productos[r][c];
                    renMayor = r;
                    colMayor = c;
                }
                
                if(productos[r][c] > mayor2)
                {
                    mayor2 = productos[r][c];
                    renMayor2 = r;
                    colMayor2 = c;
                }
            }   
        
        ColorCeldas celdas = new ColorCeldas(jTabPRECIOS);
        celdas.addCelda(renMayor2, colMayor2, Color.RED);
        celdas.addCelda(renMayor, colMayor, Color.pink);
        
        celdas.repaint();
        
        double promedio = suma*1.0 / (productos.length * productos[0].length);
        
        jLaBPROMEDIO.setText(promedio+"");
        jLabMAYOR.setText(mayor+"");
        jLabMENOR.setText(mayor2+"");
    }//GEN-LAST:event_jButCALCULARActionPerformed

    private void jButORDENARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButORDENARActionPerformed
        // TODO add your handling code here:
         //creamos una matriz de la misma dimension que el JTable
        int[][] productos = new int [jTabPRECIOS.getRowCount()][jTabPRECIOS.getColumnCount()];
        
        //copiamos los valores de cada celda del JTable a cada elemento de la matri
        int r,c;
        
        for(r=0; r<jTabPRECIOS.getRowCount(); r++)
            for(c=0; c<jTabPRECIOS.getColumnCount(); c++)
                productos[r][c] = Integer.parseInt(jTabPRECIOS.getValueAt(r,c)+"");
        
        int [] lista = new int[productos.length * productos[0].length];
        
       //copiamos los valores de la matriz al arreglo unidimensional
       int n = 0;
       
       for(r=0; r<productos.length; r++)
            for(c=0; c<productos[0].length; c++)
            {
               lista[n] = productos[r][c];
               n++;
            }
       
       //odenamos el arreglo unidimensional
       Arrays.sort(lista);
       
       //copiamos los valores del arreglo unidimensional ya ordenados, al JTabOrdenados
       n = 0;
       
       for(r=0; r<jTabORDENADOS.getRowCount(); r++)
            for(c=0; c<jTabORDENADOS.getColumnCount(); c++)
            {
                jTabORDENADOS.setValueAt(lista[n], r, c);
                n++;
            }
    }//GEN-LAST:event_jButORDENARActionPerformed

    private void jButCOLORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCOLORESActionPerformed
        // TODO add your handling code here:
        ColorCeldas celdas = new ColorCeldas(jTabORDENADOS);
         for(int r=0; r<jTabPRECIOS.getRowCount(); r++)
            for(int c=0; c<jTabPRECIOS.getColumnCount(); c++)
            {
                if (r==0)//primer renglon
                    celdas.addCelda(r, c, Color.yellow);
                
                if (r==jTabORDENADOS.getRowCount()-1)//ultimo renglon
                    celdas.addCelda(r, c, Color.red);
                
                if (r==0)//primera columna
                    celdas.addCelda(r, c, Color.orange);
                 
                if (r==jTabORDENADOS.getColumnCount()-1)//ultima columna
                    celdas.addCelda(r, c, Color.pink);
                 
                if (r==c)//diagonal principal
                    celdas.addCelda(r, c, Color.blue);
                
            }
         
        celdas.repaint();
    }//GEN-LAST:event_jButCOLORESActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFramePRICIPAL4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFramePRICIPAL4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFramePRICIPAL4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFramePRICIPAL4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFramePRICIPAL4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButALEATORIOS;
    private javax.swing.JButton jButCALCULAR;
    private javax.swing.JButton jButCOLORES;
    private javax.swing.JButton jButORDENAR;
    private javax.swing.JLabel jLaBPROMEDIO;
    private javax.swing.JLabel jLabMAYOR;
    private javax.swing.JLabel jLabMENOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinPRECIOS;
    private javax.swing.JSpinner jSpinPRODUCTOS;
    private javax.swing.JTable jTabORDENADOS;
    private javax.swing.JTable jTabPRECIOS;
    private javax.swing.JTable jTabPRODUCTOS;
    // End of variables declaration//GEN-END:variables
}