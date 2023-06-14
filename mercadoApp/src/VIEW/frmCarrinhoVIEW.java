/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.produtoDAO;
import DTO.produtoDTO;
import DTO.vendaDTO;
import DAO.vendaItemDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import DAO.vendaDAO;
import DTO.Item;


public final class frmCarrinhoVIEW extends javax.swing.JFrame {

Connection conn;

  produtoDAO objProdutoDao = new produtoDAO();
  produtoDTO objProdutoDto = new produtoDTO();
  vendaDTO objVendaDto = new vendaDTO();
  vendaDAO objVendaDao = new vendaDAO();
  Item objItem = new Item();
  private ArrayList<produtoDTO> produtos;
  ArrayList<Item> listaCompra = new ArrayList<>();
    public frmCarrinhoVIEW() {
       
        initComponents();
         listarProdutos();
       // dadosComboBox();
       
        
    
        
    }

   public void carregarProdutos(){
 
       
   }  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxProduto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnAddCarrinho = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCarrinho = new javax.swing.JTable();
        txtxIdProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLimparForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escolha o produto");

        cbxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha" }));
        cbxProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProdutoItemStateChanged(evt);
            }
        });
        cbxProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbxProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Escolha a quantidade");

        btnAddCarrinho.setText("Adicionar no carrinho");
        btnAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarrinhoActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setText("Finalizar Compra");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        jButton3.setText("Remover");

        jButton4.setText("Voltar para o menu principal");

        tbCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(tbCarrinho);

        txtxIdProduto.setEnabled(false);

        jLabel5.setText("Id");

        txtValorTotal.setEnabled(false);

        jLabel3.setText("Valor total da compra");

        btnLimparForm.setText("Limpar");
        btnLimparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnLimparForm)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(110, 110, 110))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAddCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(47, 47, 47))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtxIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(114, 114, 114))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(txtxIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnAddCarrinho)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3)
                        .addGap(32, 32, 32)
                        .addComponent(btnFinalizarCompra))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnLimparForm)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarrinhoActionPerformed
     
        if(txtQtd.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Necessário preencher a quantidade para prosseguir.");
        }else{
            objProdutoDto = objProdutoDao.retornarValores(Integer.parseInt(txtxIdProduto.getText()));
           //adicionar linha na tabela
            DefaultTableModel modelo = (DefaultTableModel)tbCarrinho.getModel();
            int cont = 0;
            int quantidade = Integer.parseInt(txtQtd.getText());
          
            for(int i=0;i<cont;i++){
                modelo.setNumRows(0);
            }
            
            modelo.addRow(new Object[]{
                objProdutoDto.getId_produto(),
                objProdutoDto.getNome_produto(),
                txtQtd.getText(),
               objProdutoDto.getPreco_produto(),  
              quantidade * objProdutoDto.getPreco_produto(),
            });
            somaCarrinhoTotal();
        }   
   
       
        
        
    }//GEN-LAST:event_btnAddCarrinhoActionPerformed

    private void somaCarrinhoTotal(){
        double soma = 0,valor;
                int cont= tbCarrinho.getRowCount();
        
        for(int i=0 ; i< cont ;i++){
            valor = (double) tbCarrinho.getValueAt(i, 4);//pega o valor da coluna 4
            soma +=valor;
        }
        txtValorTotal.setText(String.valueOf(soma));
    }
    
    public void listarProdutos(){
        produtos = objProdutoDao.listarProduto();
        cbxProduto.removeAllItems();
     
        for(int i =0;i<produtos.size();i++){
            cbxProduto.addItem(produtos.get(i).getNome_produto());
        }
    }
    private void cbxProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProdutoItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_cbxProdutoItemStateChanged

    private void cbxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProdutoActionPerformed
  
    }//GEN-LAST:event_cbxProdutoActionPerformed

    private void cbxProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxProdutoPopupMenuWillBecomeInvisible
        if(cbxProduto.isPopupVisible()){
             objProdutoDto = objProdutoDao.getProduto(cbxProduto.getSelectedItem().toString());
             txtxIdProduto.setText(String.valueOf(objProdutoDto.getId_produto())); 
        }
    }//GEN-LAST:event_cbxProdutoPopupMenuWillBecomeInvisible

    private void btnLimparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFormActionPerformed
       limparFormulario();
    }//GEN-LAST:event_btnLimparFormActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        listaCompra = new ArrayList<>(); //zerar
        
    try {
        objVendaDto.setDataVenda(conversaoDataEua(new java.util.Date(System.currentTimeMillis())));
   
    
    } catch (Exception ex) {
    }
    
    objVendaDto.setValorTotal(Double.parseDouble(txtValorTotal.getText()));
        objVendaDao.cadastrarVenda(objVendaDto);

  
    
    int cont = tbCarrinho.getRowCount();
    for(int i =0; i<cont;i++){
       objItem=new Item();
        objItem.setIDproduto((int)tbCarrinho.getValueAt(i,0));
         objItem.setQuantidade((int)tbCarrinho.getValueAt(i, 2));
         objItem.setValor((double)tbCarrinho.getValueAt(i, 3));
         listaCompra.add(objItem);
     
    }
    
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    public java.sql.Date conversaoDataEua(Date pData) throws Exception{
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy/MM/dd");
        String data = formatarDate.format(pData);
        
        if(pData==null||pData.equals(""))
            return null;
        
            java.sql.Date date = null;
            try {
                DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
                date = new java.sql.Date(((java.util.Date)formatter.parse(data)).getTime());
            } catch (ParseException e) {
                throw e;
            }
            return date;
    
    }
    private void limparFormulario(){
        txtQtd.setText("");
        txtValorTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel)tbCarrinho.getModel();
        modelo.setNumRows(0);//coloca o numero de linhas para 0
    }   /**
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
            java.util.logging.Logger.getLogger(frmCarrinhoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCarrinhoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCarrinhoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCarrinhoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCarrinhoVIEW().setVisible(true);
            }
        });
    }
    
     Vector<Integer> id_produto=new Vector<Integer>();//pegar o vetor e acrescentar a chave primaria de categoria
    private void dadosComboBox(){
        try {
            produtoDAO objProdutoDao = new produtoDAO();
            ResultSet rs = objProdutoDao.listarProdutoCbx();
            
            while(rs.next()){
                id_produto.addElement(rs.getInt(1));//armazeno no vetor o id para salvar isso
                cbxProduto.addItem(rs.getString(2));//pegar o item do resultado do sql e mandar pra combobox, no caso o nome
                    //esse 1 e 2 entre parenteses são as ordens dos elementos encontrados nobanco
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro ao carregar valores na combobox"+ e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddCarrinho;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnLimparForm;
    private javax.swing.JComboBox<String> cbxProduto;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbCarrinho;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtxIdProduto;
    // End of variables declaration//GEN-END:variables


}