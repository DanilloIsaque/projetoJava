package DTO;

public class produtoDTO {
    private int id_produto,id_categoria,qtd_produto;
    private String nome_produto;
    private double preco_produto;
    public int getId_produto() {
        return id_produto;
    }

    public produtoDTO(){
      
    }
    
    
    public produtoDTO( int id_categoria, int qtd_produto, String nome_produto, double preco_produto) {
       
        this.id_categoria = id_categoria;
        this.qtd_produto = qtd_produto;
        this.nome_produto = nome_produto;
        this.preco_produto = preco_produto;
    }

      public String getValorExibicao() {
            return nome_produto;
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

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public int getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(int qtd_produto) {
        this.qtd_produto = qtd_produto;
    }
    public void decrementarEstoque() {
        qtd_produto--;
    }

    public void incrementarEstoque() {
       qtd_produto++;
    }
    
    @Override
    public String toString(){
        return nome_produto;
    }
}
