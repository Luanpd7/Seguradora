/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controler.ServicoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.Servico;

/**
 *
 * @author Luan Pereira
 */
public class ViewServico extends javax.swing.JFrame {

    /**
     * Creates new form ViewServico
     */
    public ViewServico() {
        initComponents();
        restaurarDadosClientes();
        restaurarDadosFuncionario();
        restaurarDadosTipoSeguro();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        opcaoFuncionario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        opcaoCliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        opcaoTipoSeguro = new javax.swing.JComboBox<>();
        CadastrarClienteVeiculo2 = new javax.swing.JButton();
        CadastrarClienteVeiculo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(40, 111, 199));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Numero Da Apólice");

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Funcionário");

        opcaoFuncionario.setFont(new java.awt.Font("Segoe UI Variable", 2, 12)); // NOI18N
        opcaoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("Cliente");

        opcaoCliente.setFont(new java.awt.Font("Segoe UI Variable", 2, 12)); // NOI18N
        opcaoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Tipo de Seguro");

        opcaoTipoSeguro.setFont(new java.awt.Font("Segoe UI Variable", 2, 12)); // NOI18N
        opcaoTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        CadastrarClienteVeiculo2.setText("Efetuar Cadastro");
        CadastrarClienteVeiculo2.setBorder(null);
        CadastrarClienteVeiculo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClienteVeiculo2ActionPerformed(evt);
            }
        });

        CadastrarClienteVeiculo.setText("Limpar Campos");
        CadastrarClienteVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClienteVeiculoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Cadastrar Serviço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addComponent(CadastrarClienteVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(opcaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(CadastrarClienteVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opcaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(opcaoTipoSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcaoTipoSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarClienteVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarClienteVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarClienteVeiculo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarClienteVeiculo2ActionPerformed
        cadastrarServico();
       // LimparCampos();
    }//GEN-LAST:event_CadastrarClienteVeiculo2ActionPerformed

    private void CadastrarClienteVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarClienteVeiculoActionPerformed
       // LimparCampos();
    }//GEN-LAST:event_CadastrarClienteVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarClienteVeiculo;
    private javax.swing.JButton CadastrarClienteVeiculo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> opcaoCliente;
    private javax.swing.JComboBox<String> opcaoFuncionario;
    private javax.swing.JComboBox<String> opcaoTipoSeguro;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    public void cadastrarServico() {
        int codigo_Cliente = id_Cliente.get(opcaoCliente.getSelectedIndex() -1 );
        int codigo_Funcionario = id_Funcionario.get(opcaoFuncionario.getSelectedIndex() -1 );
        int codigo_TipoSeguro = id_TipoSeguro.get(opcaoTipoSeguro.getSelectedIndex() -1  );
        
        ServicoDAO servicoDao = new ServicoDAO();
        
        try{Servico servico = new Servico(Integer.parseInt(txtNumero.getText()),codigo_Cliente,codigo_Funcionario,codigo_TipoSeguro);
            servicoDao.insert(servico);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro "+e.toString());
        } 
                
                
            
            
    }

    
    Vector<Integer> id_Cliente = new Vector<Integer>();
    Vector<Integer> id_Funcionario = new Vector<Integer>();
    Vector<Integer> id_TipoSeguro = new Vector<Integer>();
    
     public void restaurarDadosClientes(){
        try{
           ServicoDAO servicoDao = new ServicoDAO();
            ResultSet rs = servicoDao.listarCliente();
            
            while (rs.next()) {
                id_Cliente.addElement(rs.getInt(1));
                
                String clientes = rs.getString(2).trim();
                opcaoCliente.addItem(clientes);
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro para inserir cliente "+ e);
        }
    }
     
     public void restaurarDadosFuncionario(){
        try{
           ServicoDAO servicoDao = new ServicoDAO();
            ResultSet rs = servicoDao.listarFuncionario();
            
            while (rs.next()) {
                id_Funcionario.addElement(rs.getInt(1));
                
                String funcionarios = rs.getString(2).trim();
                opcaoFuncionario.addItem(funcionarios);
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro para inserir cliente "+ e);
        }
    }
     
     public void restaurarDadosTipoSeguro(){
         try{
            ServicoDAO servicoDao = new ServicoDAO();
            ResultSet rs = servicoDao.listarTipoSeguro();
             
            while (rs.next()){
                id_TipoSeguro.addElement(rs.getInt(1));
                 
                String tipoSeguro = rs.getString(2).trim();
                opcaoTipoSeguro.addItem(tipoSeguro);
               }
            
            } catch (Exception e){
               JOptionPane.showMessageDialog(null,"Erro para inserir tipo seguro "+ e);
            }
          }
     
}
