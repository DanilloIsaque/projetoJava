
package DTO;


import java.util.Date;

public class vendasDTO {
    private int id_venda,id_produto;
    private String qtd_produto;
    private Date data_venda;

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(String qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }
    
    
}
