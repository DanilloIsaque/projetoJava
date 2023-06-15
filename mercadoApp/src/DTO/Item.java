/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author isa
 */
public class Item {
    private int IDproduto;
    private int idVenda;
    int quantidade;
    double valor;
    private produtoDTO produto;
    private vendaDTO venda;

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    
    public int getIDproduto() {
        return IDproduto;
    }

    public void setIDproduto(int IDproduto) {
        this.IDproduto = IDproduto;
    }
    
   
    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public produtoDTO getProduto() {
        return produto;
    }

    public void setProduto(produtoDTO produto) {
        this.produto = produto;
    }

    public vendaDTO getVenda() {
        return venda;
    }

    public void setVenda(vendaDTO venda) {
        this.venda = venda;
    }
    
    
    
    
}
