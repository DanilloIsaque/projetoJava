/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author isa
 */
public class funcionarioDTO {

           //transferencia de objeto, onde recebemos e enviamos a qualquer momento
    private int idFuncionario; //para listar
    
    // só a minha classe consegue ver
    private String nomeFuncionario;
     private String emailFuncionario;
     private String senhaFuncionario;
     private int identificacaoFuncionario;
     
     
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the nomeFuncionario
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the emailFuncionario
     */
    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    /**
     * @param emailFuncionario the emailFuncionario to set
     */
    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    /**
     * @return the senhaFuncionario
     */
    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    /**
     * @param senhaFuncionario the senhaFuncionario to set
     */
    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    /**
     * @return the identificacaoFuncionario
     */
    public int getIdentificacaoFuncionario() {
        return identificacaoFuncionario;
    }

    /**
     * @param identificacaoFuncionario the identificacaoFuncionario to set
     */
    public void setIdentificacaoFuncionario(int identificacaoFuncionario) {
        this.identificacaoFuncionario = identificacaoFuncionario;
    }

}
