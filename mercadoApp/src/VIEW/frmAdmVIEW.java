package VIEW;

import DAO.admDAO;
import DTO.admDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author isa
 */
public class frmAdmVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmAdmVIEW
     */
    public frmAdmVIEW() {
        initComponents();
           //aqui eu coloco para quando abrir a tela, já estar listado, chamando o método
        listarValoresAdm();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeAdm = new javax.swing.JTextField();
        txtEmailAdm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrarAdm = new javax.swing.JButton();
        txtSenhaAdm = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAdm = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIdAdm = new javax.swing.JTextField();
        btnCarregarCamposAdm = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterarAdm = new javax.swing.JButton();
        btnExcluirAdm = new javax.swing.JButton();
        rbAdm = new javax.swing.JRadioButton();
        rbAtendente = new javax.swing.JRadioButton();
        btnVoltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Nome de Usuário");

        jLabel3.setText("Senha");

        txtNomeAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAdmActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("CRUD de Funcionário");

        btnCadastrarAdm.setText("Cadastrar");
        btnCadastrarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAdmActionPerformed(evt);
            }
        });

        tabelaAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Nome de Usuário", "Senha", "Função", "Idade"
            }
        ));
        jScrollPane1.setViewportView(tabelaAdm);

        jLabel5.setText("ID");

        txtIdAdm.setEnabled(false);
        txtIdAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAdmActionPerformed(evt);
            }
        });

        btnCarregarCamposAdm.setText("Carregar campos");
        btnCarregarCamposAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposAdmActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterarAdm.setText("Alterar");
        btnAlterarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAdmActionPerformed(evt);
            }
        });

        btnExcluirAdm.setText("Excluir");
        btnExcluirAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAdmActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAdm);
        rbAdm.setText("Administrador");
        rbAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdmActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAtendente);
        rbAtendente.setText("Atendente");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel6.setText("Idade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluirAdm))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(193, 193, 193)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCadastrarAdm)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmailAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNomeAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(76, 76, 76)
                                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(btnCarregarCamposAdm))
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLimpar)
                            .addComponent(btnAlterarAdm))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVoltar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(5, 5, 5)
                        .addComponent(txtEmailAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAdm))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAdm)
                            .addComponent(rbAtendente))))
                .addGap(3, 3, 3)
                .addComponent(btnLimpar)
                .addGap(12, 12, 12)
                .addComponent(btnCadastrarAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnAlterarAdm)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarregarCamposAdm)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAdmActionPerformed

    private void btnCadastrarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAdmActionPerformed
            cadastrarAdm();
            listarValoresAdm();
            LimparCamposAdm();
    }//GEN-LAST:event_btnCadastrarAdmActionPerformed

    private void txtIdAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAdmActionPerformed

    private void btnCarregarCamposAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposAdmActionPerformed
        CarregarCamposAdm();
    }//GEN-LAST:event_btnCarregarCamposAdmActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCamposAdm();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAdmActionPerformed
      
      //fazer validacao para n aceitar
         while(txtIdAdm.getText().equals("")){
            JOptionPane.showMessageDialog(null,"É necessario ter um id para alterar");
           break;
         }
        alterarAdm();
       listarValoresAdm();
       LimparCamposAdm();
    }//GEN-LAST:event_btnAlterarAdmActionPerformed

    private void btnExcluirAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAdmActionPerformed
        
          while(txtIdAdm.getText().equals("")){
            JOptionPane.showMessageDialog(null,"É necessario ter um id para excluir");
           break;
         }
        excluirAdm();
        listarValoresAdm();
        LimparCamposAdm();
    }//GEN-LAST:event_btnExcluirAdmActionPerformed

    private void rbAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAdmActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frmMainVIEW menu = new frmMainVIEW();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAdmVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAdm;
    private javax.swing.JButton btnCadastrarAdm;
    private javax.swing.JButton btnCarregarCamposAdm;
    private javax.swing.JButton btnExcluirAdm;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAdm;
    private javax.swing.JRadioButton rbAtendente;
    private javax.swing.JTable tabelaAdm;
    private javax.swing.JTextField txtEmailAdm;
    private javax.swing.JTextField txtIdAdm;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNomeAdm;
    private javax.swing.JPasswordField txtSenhaAdm;
    // End of variables declaration//GEN-END:variables

private void cadastrarAdm(){
    // recebemos do usuário e passamos para dto , dpois executamos um método para DAO
            String nomeAdm, emailAdm, senhaAdm;
            int identificacaoAdm = 0,idade ;
            
            if(txtNomeAdm.getText().equals("")||txtIdade.getText().equals("")||txtSenhaAdm.getPassword().equals("") || txtEmailAdm.getText().equals("")||rbAdm.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Alguns faltaram ser preenchidos.");
            }else{
            
            nomeAdm= txtNomeAdm.getText();
            emailAdm = txtEmailAdm.getText();
            senhaAdm= new String(txtSenhaAdm.getPassword()).trim();
            idade = Integer.parseInt(txtIdade.getText());
            if(rbAdm.isSelected()){
                identificacaoAdm = 1;
            }else if(rbAtendente.isSelected()){
                identificacaoAdm = 0;
            }else{
                JOptionPane.showMessageDialog(null, "É necessário selecionar um campo");
            }
            //acessando a classe
            admDTO objAdmDto = new admDTO();
            
           //acesso pelo objeto e consigo acessar todos os metodos 
           
            objAdmDto.setNome(nomeAdm);
            objAdmDto.setEmail(emailAdm);
            objAdmDto.setSenha(senhaAdm);
            objAdmDto.setIdentificacaoAdm(identificacaoAdm);
            objAdmDto.setIdade(idade);
            //mandar o que precisa para dao
            admDAO objAdmDao = new admDAO();
            objAdmDao.cadastrarAdm(objAdmDto);
            }
}
    
    
private void listarValoresAdm(){
    try {
        admDAO  objAdmDao = new admDAO();
        DefaultTableModel model =(DefaultTableModel)tabelaAdm.getModel();
        model.setNumRows(0);
        
        ArrayList<admDTO> listaAdm = objAdmDao.listarAdm();
        
        
        
        for(int i=0;i<listaAdm.size();i++){
            model.addRow(new Object[]{//adiciona linha e abro o objeto para montar as colunas
                listaAdm.get(i).getIdAdm(),
                listaAdm.get(i).getNomeAdm(),
                listaAdm.get(i).getEmailAdm(),
                listaAdm.get(i).getSenhaAdm(),
                listaAdm.get(i).getIdentificacaoAdm(),
                listaAdm.get(i).getIdade(),
                   
               
            });
           
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"erro no método listarValores em consultaAdm"+ e);
    }
}

private void CarregarCamposAdm(){
    //aqui é o q será selecionado 
    int carregar =tabelaAdm.getSelectedRow();//vou selecionar a linha e aqi coloco qual a linha onde irá percorrer
    
    txtIdAdm.setText(tabelaAdm.getModel().getValueAt(carregar,0).toString()); //peguei o campo de texto da tabela, linha/coluna e transformei em string
    txtNomeAdm.setText(tabelaAdm.getModel().getValueAt(carregar, 1).toString());
    txtEmailAdm.setText(tabelaAdm.getModel().getValueAt(carregar,2).toString());
    txtSenhaAdm.setText(tabelaAdm.getModel().getValueAt(carregar,3).toString());
    txtIdade.setText(tabelaAdm.getModel().getValueAt(carregar, 4).toString());
}

private void LimparCamposAdm(){
    txtIdAdm.setText("");
    txtNomeAdm.setText("");
    txtEmailAdm.setText("");
    txtSenhaAdm.setText("");
    txtIdade.setText("");
    txtNomeAdm.requestFocus();//limpou e ira para o campo de nome para editar
}

private void alterarAdm(){
    int idAdm, idade;
    String nomeAdm , emailAdm , senhaAdm;
    int identificacaoAdm = 1;
    
    if(txtIdAdm.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Para alterar, é preciso o id do funcionário");
    }else{
    idAdm= Integer.parseInt(txtIdAdm.getText());//conversao de inteiro para string
    nomeAdm = txtNomeAdm.getText();
    emailAdm = txtEmailAdm.getText();
    senhaAdm = new String(txtSenhaAdm.getPassword()).trim();
    idade=Integer.parseInt(txtIdade.getText());
   admDTO objAdmDto = new admDTO();
   objAdmDto.setIdAdm(idAdm);
   objAdmDto.setNome(nomeAdm);
   objAdmDto.setEmail(emailAdm);
   objAdmDto.setSenha(senhaAdm);
   objAdmDto.setIdentificacaoAdm(identificacaoAdm);
   objAdmDto.setIdade(idade);
   admDAO objAdmDao = new admDAO();
   objAdmDao.alterarAdm(objAdmDto);
    }
    }

private void excluirAdm(){
    int idAdm;
    if(txtIdAdm.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Para excluir, é preciso do id do funcionário");
    }else{
    idAdm = Integer.parseInt(txtIdAdm.getText());
    admDTO objAdmDto = new admDTO();
    
    objAdmDto.setIdAdm(idAdm);
    
    admDAO objAdmDao = new admDAO();
    objAdmDao.excluirAdm(objAdmDto);
    }
   }
}
