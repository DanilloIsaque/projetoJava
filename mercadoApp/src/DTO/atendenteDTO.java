package DTO;

public class atendenteDTO {
    private String nome_atendente,email_atendente,senha_atendente;
    private int id_atendente;
    private byte identificacao;

    /**
     * @return the nome_atendente
     */
    public String getNome_atendente() {
        return nome_atendente;
    }

    /**
     * @param nome_atendente the nome_atendente to set
     */
    public void setNome_atendente(String nome_atendente) {
        this.nome_atendente = nome_atendente;
    }

    /**
     * @return the email_atendente
     */
    public String getEmail_atendente() {
        return email_atendente;
    }

    /**
     * @param email_atendente the email_atendente to set
     */
    public void setEmail_atendente(String email_atendente) {
        this.email_atendente = email_atendente;
    }

    /**
     * @return the senha_atendente
     */
    public String getSenha_atendente() {
        return senha_atendente;
    }

    /**
     * @param senha_atendente the senha_atendente to set
     */
    public void setSenha_atendente(String senha_atendente) {
        this.senha_atendente = senha_atendente;
    }

    /**
     * @return the identificacao
     */
    public byte getIdentificacao() {
        return identificacao;
    }

    /**
     * @param identificacao the identificacao to set
     */
    public void setIdentificacao(byte identificacao) {
        this.identificacao = identificacao;
    }

    /**
     * @return the id_atendente
     */
    public int getId_atendente() {
        return id_atendente;
    }

    /**
     * @param id_atendente the id_atendente to set
     */
    public void setId_atendente(int id_atendente) {
        this.id_atendente = id_atendente;
    }
    
}
