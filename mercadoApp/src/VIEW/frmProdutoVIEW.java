/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.produtoDAO;
import DTO.produtoDTO;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.Vector;
import java.sql.SQLException;

/**
 *
 * @author BestTelecom
 */
public class frmProdutoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmProdutoVIEW
     */
    public frmProdutoVIEW() {
        initComponents();
        listarValoresProduto();
        dadosComboBox();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtPrecoProduto = new javax.swing.JTextField();
        txtQtdProduto = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnCadastrarProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIdAdm = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Preço:");

        jLabel3.setText("Quantidade:");

        jLabel4.setText("Categoria:");

        txtPrecoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoProdutoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecoProdutoKeyTyped(evt);
            }
        });

        txtQtdProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtdProdutoKeyTyped(evt);
            }
        });

        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço", "Quantidade","Categoria"
            }
        ));
        jScrollPane1.setViewportView(tabelaProduto);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tela de Produto");

        txtIdAdm.setEnabled(false);

        btnCarregar.setText("Carregar campos");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeProduto)
                                    .addComponent(txtPrecoProduto)
                                    .addComponent(txtQtdProduto)
                                    .addComponent(cbxCategoria, 0, 160, Short.MAX_VALUE)
                                    .addComponent(btnCadastrarProduto))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btnCarregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterarProduto)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnExcluirProduto)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131)
                        .addComponent(txtIdAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5))
                            .addComponent(btnVoltar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnExcluirProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIdAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarProduto)
                    .addComponent(btnCarregar)
                    .addComponent(btnAlterarProduto))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdProdutoKeyTyped
        caracter(evt);
    }//GEN-LAST:event_txtQtdProdutoKeyTyped

    private void txtPrecoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoProdutoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdutoKeyPressed

    private void txtPrecoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoProdutoKeyTyped
           caracterP(evt);
    }//GEN-LAST:event_txtPrecoProdutoKeyTyped

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        cadastrarProduto();
        listarValoresProduto();
        LimparCamposProduto();
        
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        carregarCampos();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        alterarProduto();
        listarValoresProduto();
        LimparCamposProduto();
        
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        excluirProduto();
        listarValoresProduto();
        LimparCamposProduto();
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(frmProdutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProdutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProdutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProdutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProdutoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtIdAdm;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtQtdProduto;
    // End of variables declaration//GEN-END:variables

    private void listarValoresProduto() {

        try {
            //primeiro chamamos a dao de categoria
            produtoDAO objprodutodao = new produtoDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
            model.setNumRows(0);

            ArrayList<produtoDTO> listaProduto = objprodutodao.listarProduto();

            for (int i = 0; i < listaProduto.size(); i++) {
                model.addRow(new Object[]{//adiciona linha e abro o objeto para montar as colunas
                    listaProduto.get(i).getId_produto(),
                    listaProduto.get(i).getNome_produto(),
                    listaProduto.get(i).getPreco_produto(),
                    listaProduto.get(i).getQtd_produto(),
                    listaProduto.get(i).getCategoria().getNomeCategoria()});

            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no listar produto frmProdutoView" + erro);
        }
        

    }
   
    Vector<Integer> id_categoria=new Vector<Integer>();//pegar o vetor e acrescentar a chave primaria de categoria
    private void dadosComboBox(){
        try {
            produtoDAO objProdutoDao = new produtoDAO();
            ResultSet rs = objProdutoDao.listarCategoria();
            
            while(rs.next()){
                id_categoria.addElement(rs.getInt(1));//armazeno no vetor o id para salvar isso
                cbxCategoria.addItem(rs.getString(2));//pegar o item do resultado do sql e mandar pra combobox, no caso o nome
                    //esse 1 e 2 entre parenteses são as ordens dos elementos encontrados nobanco
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro ao carregar valores na combobox"+ e);
        }
    }

    private void caracter(KeyEvent e){
        String caracter="0123456789";
        if(!caracter.contains(e.getKeyChar() +"" )){
            e.consume();//ao pressionar a tecla, ele analisará os caracteres selecionados
            JOptionPane.showMessageDialog(null, "Só é aceito números nesse campo");
        }  
    }
    private void caracterP(KeyEvent e){
        String caracter="0123456789.,";
        if(!caracter.contains(e.getKeyChar() +"" )){
            e.consume();//ao pressionar a tecla, ele analisará os caracteres selecionados
            JOptionPane.showMessageDialog(null, "Só é aceito números nesse campo");
        }
    }
    
    private void cadastrarProduto(){
        String nomeProduto;
        int qtdProduto;
        double precoProduto;
        int idCategoria;
        
        if(txtNomeProduto.getText().equals("")|| txtPrecoProduto.getText().equals("")||txtQtdProduto.getText().equals("")){
        
            JOptionPane.showMessageDialog(null, "Algum campo faltou ser preenchido");
        }else{
        nomeProduto = txtNomeProduto.getText();
        precoProduto =Double.parseDouble(txtPrecoProduto.getText());
        qtdProduto=Integer.parseInt(txtQtdProduto.getText());
        idCategoria=id_categoria.get(cbxCategoria.getSelectedIndex());//pegqamoso elemento do vetor na funcao de dadosCategoria
        
        produtoDTO objProdutoDto = new produtoDTO(idCategoria,qtdProduto,nomeProduto,precoProduto);
        objProdutoDto.setNome_produto(nomeProduto);
        objProdutoDto.setPreco_produto(precoProduto);
        objProdutoDto.setQtd_produto(qtdProduto);
        objProdutoDto.setId_categoria(idCategoria);
        
        produtoDAO objProdutoDao = new produtoDAO();
        objProdutoDao.cadastrarPoduto(objProdutoDto);
        }
    }
    
    private void carregarCampos(){
        int carregar = tabelaProduto.getSelectedRow();
        
         //txtIdAdm.setText(tabelaAdm.getModel().getValueAt(carregar,0).toString()); //peguei o campo de texto da tabel
         txtIdAdm.setText(tabelaProduto.getModel().getValueAt(carregar, 0).toString());
         txtNomeProduto.setText(tabelaProduto.getModel().getValueAt(carregar, 1).toString());
         txtPrecoProduto.setText(tabelaProduto.getModel().getValueAt(carregar, 2).toString());
         txtQtdProduto.setText(tabelaProduto.getModel().getValueAt(carregar, 3).toString());
         cbxCategoria.setSelectedIndex((int) tabelaProduto.getModel().getValueAt(carregar,4));
    }

    private void alterarProduto(){
        
        
        int idProduto,idCategoria,qtd;
        String nome;
        double valor;
        if(txtIdAdm.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Para alterar, é preciso do id do produto");
        }else{
        
        idProduto=Integer.parseInt(txtIdAdm.getText());
        nome = txtNomeProduto.getText();
        valor = Double.parseDouble(txtPrecoProduto.getText());
         qtd=Integer.parseInt(txtQtdProduto.getText());
        idCategoria=id_categoria.get(cbxCategoria.getSelectedIndex());
    
        produtoDTO objProdutoDto = new produtoDTO();
        objProdutoDto.setId_produto(idProduto);
        objProdutoDto.setNome_produto(nome);
        objProdutoDto.setPreco_produto(valor);
        objProdutoDto.setId_categoria(idCategoria);
        objProdutoDto.setQtd_produto(qtd);
        
        produtoDAO objProdutoDao= new produtoDAO();
        objProdutoDao.alterarProduto(objProdutoDto);
        }
        
    }
            
    private void LimparCamposProduto(){
    txtIdAdm.setText("");
    txtNomeProduto.setText("");
    txtPrecoProduto.setText("");
    txtQtdProduto.setText("");
    cbxCategoria.setSelectedIndex(0);
    txtNomeProduto.requestFocus();//limpou e ira para o campo de nome para editar
}
    
    private void excluirProduto(){
        
        if(txtIdAdm.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Para excluir, é preciso o id do produto");
        }else{
        int id= Integer.parseInt(txtIdAdm.getText());
        
        produtoDTO objProdutoDto= new produtoDTO();
        objProdutoDto.setId_produto(id);
        
        produtoDAO objProdutoDao= new produtoDAO();
        objProdutoDao.excluirProduto(objProdutoDto);
    }
    }

}
