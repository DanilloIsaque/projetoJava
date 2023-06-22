/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.categoriaDAO;
import DTO.categoriaDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isa
 */
public class frmCategoriaVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmCategoriaVIEW
     */
    public frmCategoriaVIEW() {
        initComponents();
        listarValoresCategoria();
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
        txtCategoriaNome = new javax.swing.JTextField();
        btnCadastrarCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCategoria = new javax.swing.JTable();
        btnCarregarValoresCategoria = new javax.swing.JButton();
        txtIdCategoria = new javax.swing.JTextField();
        btnAlterarCategoria = new javax.swing.JButton();
        btnLimparValores = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnExcluirCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CRUD categoria");

        jLabel2.setText("Nome da Categoria");

        btnCadastrarCategoria.setText("Cadastrar");
        btnCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCategoriaActionPerformed(evt);
            }
        });

        tabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nome"
            }
        ));
        jScrollPane1.setViewportView(tabelaCategoria);

        btnCarregarValoresCategoria.setText("Carregar valores");
        btnCarregarValoresCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarValoresCategoriaActionPerformed(evt);
            }
        });

        txtIdCategoria.setEnabled(false);
        txtIdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoriaActionPerformed(evt);
            }
        });

        btnAlterarCategoria.setText("Alterar");
        btnAlterarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCategoriaActionPerformed(evt);
            }
        });

        btnLimparValores.setText("Limpar");
        btnLimparValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparValoresActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnExcluirCategoria.setText("Excluir");
        btnExcluirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(txtCategoriaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrarCategoria)
                    .addComponent(btnAlterarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarregarValoresCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimparValores)
                        .addGap(12, 12, 12)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirCategoria)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoriaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarregarValoresCategoria)
                    .addComponent(btnCadastrarCategoria))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparValores)
                    .addComponent(btnAlterarCategoria))
                .addGap(18, 18, 18)
                .addComponent(btnExcluirCategoria)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCategoriaActionPerformed
        cadastrarCategoria();
        limparCategoria();
        listarValoresCategoria();
    }//GEN-LAST:event_btnCadastrarCategoriaActionPerformed

    private void txtIdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCategoriaActionPerformed

    private void btnCarregarValoresCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarValoresCategoriaActionPerformed
       carregarValoresCategoria();
    }//GEN-LAST:event_btnCarregarValoresCategoriaActionPerformed

    private void btnAlterarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCategoriaActionPerformed
        while(txtIdCategoria.getText().equals("")){
            JOptionPane.showMessageDialog(null,"É necessario ter um id para alterar");
           break;
         }
        
        alterarCategoria();
        limparCategoria();
        listarValoresCategoria();
         
    }//GEN-LAST:event_btnAlterarCategoriaActionPerformed

    private void btnLimparValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparValoresActionPerformed
       limparCategoria();
    }//GEN-LAST:event_btnLimparValoresActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
          frmMainVIEW menu = new frmMainVIEW();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCategoriaActionPerformed
        excluirCategoria();
        limparCategoria();
        listarValoresCategoria();
    }//GEN-LAST:event_btnExcluirCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(frmCategoriaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCategoriaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCategoriaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCategoriaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCategoriaVIEW().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCategoria;
    private javax.swing.JButton btnCadastrarCategoria;
    private javax.swing.JButton btnCarregarValoresCategoria;
    private javax.swing.JButton btnExcluirCategoria;
    private javax.swing.JButton btnLimparValores;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCategoria;
    private javax.swing.JTextField txtCategoriaNome;
    private javax.swing.JTextField txtIdCategoria;
    // End of variables declaration//GEN-END:variables


    private void cadastrarCategoria(){
        String categoriaNome;
        categoriaNome = txtCategoriaNome.getText();
        
         if(txtCategoriaNome.getText().equals("")){
             JOptionPane.showMessageDialog(null, "É necessário inserir um valor no campo nome");
         }else{
        
        categoriaDTO objCategoriaDto = new categoriaDTO();
        objCategoriaDto.setNomeCategoria(categoriaNome);
        
        categoriaDAO objCategoriaDao = new categoriaDAO();
        objCategoriaDao.cadastrarCategoria(objCategoriaDto);
         }
    }
    
    private void listarValoresCategoria(){
    
        try {
                   //primeiro chamamos a dao de categoria
        categoriaDAO objCategoriaDao = new categoriaDAO();
         DefaultTableModel model =(DefaultTableModel)tabelaCategoria.getModel();
         model.setNumRows(0);
         
         ArrayList<categoriaDTO> listaCategoria = objCategoriaDao.listarCategoria();
         
         for(int i =0;i<listaCategoria.size();i++ ){
              model.addRow(new Object[]{//adiciona linha e abro o objeto para montar as colunas
                listaCategoria.get(i).getIdCategoria(),
                listaCategoria.get(i).getNomeCategoria(),
               
            });
              
              
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
     
    }

    private void carregarValoresCategoria(){
         int carregar =tabelaCategoria.getSelectedRow();//vou selecionar a linha e aqi coloco qual a linha onde irá percorrer
    
    txtIdCategoria.setText(tabelaCategoria.getModel().getValueAt(carregar,0).toString()); //peguei o campo de texto da tabela, linha/coluna e transformei em string
    txtCategoriaNome.setText(tabelaCategoria.getModel().getValueAt(carregar, 1).toString());
    }
    
    public void limparCategoria(){
           txtIdCategoria.setText("");
           txtCategoriaNome.setText("");
    }
    
    private void alterarCategoria(){
        int idCategoria;
        String nomeCategoria;
        if(txtIdCategoria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Para alterar, é preciso do id da categoria");
        }else{
         idCategoria= Integer.parseInt(txtIdCategoria.getText());//conversao de inteiro para string
           nomeCategoria = txtCategoriaNome.getText();
           
           categoriaDTO objCategoriaDto = new categoriaDTO();
           
           objCategoriaDto.setIdCategoria(idCategoria);
           objCategoriaDto.setNomeCategoria(nomeCategoria);
           
           categoriaDAO objCategoriaDao = new categoriaDAO();
           objCategoriaDao.alterarCategoria(objCategoriaDto);
        }
    }
    
    private void excluirCategoria(){
         int id= Integer.parseInt(txtIdCategoria.getText());
          if(txtIdCategoria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Para excluir, é preciso do id da categoria");
        }else{
         categoriaDTO objCategoriaDto = new categoriaDTO();
         objCategoriaDto.setIdCategoria(id);
         
         categoriaDAO objCategoriaDao = new categoriaDAO();
         objCategoriaDao.excluirCategoria(objCategoriaDto);
         
         JOptionPane.showMessageDialog(null, "Categoria excluida com sucesso");
         
         }
    }
}
