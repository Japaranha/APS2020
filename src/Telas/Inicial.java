/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas;

/**
 *
 * @author kazuo
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        setSize(850,580);
        setResizable(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Tabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        lbl_Icone = new javax.swing.JLabel();
        lbl_Georganizacao = new javax.swing.JLabel();
        pnl_Btn = new javax.swing.JPanel();
        btn_Nome = new javax.swing.JButton();
        btn_Latitude = new javax.swing.JButton();
        btn_Longitude = new javax.swing.JButton();
        btn_Regiao = new javax.swing.JButton();
        btn_Pais = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();
        PlanoDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnl_Tabela.setBackground(new java.awt.Color(204, 255, 204));

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nomes", "Latitudes", "Longitudes", "Região", "País", "Municipio", "Bioma"
            }
        ));
        jScrollPane1.setViewportView(tabela1);

        lbl_Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/map (2).png"))); // NOI18N

        lbl_Georganizacao.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_Georganizacao.setText("Georganização");

        javax.swing.GroupLayout pnl_TabelaLayout = new javax.swing.GroupLayout(pnl_Tabela);
        pnl_Tabela.setLayout(pnl_TabelaLayout);
        pnl_TabelaLayout.setHorizontalGroup(
            pnl_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TabelaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnl_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_TabelaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_TabelaLayout.createSequentialGroup()
                        .addComponent(lbl_Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Georganizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnl_TabelaLayout.setVerticalGroup(
            pnl_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TabelaLayout.createSequentialGroup()
                .addGroup(pnl_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_TabelaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbl_Georganizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_TabelaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Tabela);
        pnl_Tabela.setBounds(20, 20, 790, 390);

        pnl_Btn.setBackground(new java.awt.Color(204, 255, 204));

        btn_Nome.setText("Nome");
        btn_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NomeActionPerformed(evt);
            }
        });

        btn_Latitude.setText("Latitude");

        btn_Longitude.setText("Longitude");

        btn_Regiao.setText("Região");

        btn_Pais.setText("País");

        btn_Sair.setText("Sair");

        javax.swing.GroupLayout pnl_BtnLayout = new javax.swing.GroupLayout(pnl_Btn);
        pnl_Btn.setLayout(pnl_BtnLayout);
        pnl_BtnLayout.setHorizontalGroup(
            pnl_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BtnLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btn_Latitude)
                .addGap(63, 63, 63)
                .addComponent(btn_Longitude)
                .addGap(48, 48, 48)
                .addComponent(btn_Regiao)
                .addGap(72, 72, 72)
                .addComponent(btn_Pais)
                .addGap(72, 72, 72)
                .addComponent(btn_Sair)
                .addGap(42, 42, 42))
        );
        pnl_BtnLayout.setVerticalGroup(
            pnl_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BtnLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnl_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Nome)
                    .addComponent(btn_Latitude)
                    .addComponent(btn_Longitude)
                    .addComponent(btn_Regiao)
                    .addComponent(btn_Pais)
                    .addComponent(btn_Sair))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Btn);
        pnl_Btn.setBounds(20, 420, 790, 70);

        PlanoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Floresta-min.png"))); // NOI18N
        getContentPane().add(PlanoDeFundo);
        PlanoDeFundo.setBounds(0, 0, 1500, 842);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NomeActionPerformed
        
    }//GEN-LAST:event_btn_NomeActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlanoDeFundo;
    private javax.swing.JButton btn_Latitude;
    private javax.swing.JButton btn_Longitude;
    private javax.swing.JButton btn_Nome;
    private javax.swing.JButton btn_Pais;
    private javax.swing.JButton btn_Regiao;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Georganizacao;
    private javax.swing.JLabel lbl_Icone;
    private javax.swing.JPanel pnl_Btn;
    private javax.swing.JPanel pnl_Tabela;
    private javax.swing.JTable tabela1;
    // End of variables declaration//GEN-END:variables
}
