package DTO;

public class produtoDTO {

    private int id_produto, id_categoria;
    private String nome_produto, preco_produto, qtd_produto, nome_categoria;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(String preco_produto) {
        this.preco_produto = preco_produto;
    }

    public String getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(String qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }
}
