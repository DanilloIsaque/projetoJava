package DTO;

 
public class admDTO {

  
    //transferencia de objeto, onde recebemos e enviamos a qualquer momento
    private int idAdm; //para listar
    
    // só a minha classe consegue ver
    private String nomeAdm;
     private String emailAdm;
     private String senhaAdm;
     private int identificacaoAdm;
     private int idade;
     
     
    public String getNomeAdm(){
        return nomeAdm;
    }
    public void setNome(String nomeAdm){
        this.nomeAdm= nomeAdm;
    }
   
    public String getEmailAdm(){
        return emailAdm;
    }
    
    public void setEmail(String emailAdm){
        this.emailAdm= emailAdm;
    }
   
     public String getSenhaAdm(){
        return senhaAdm;
    }
    
    public void setSenha(String senhaAdm){
        this.senhaAdm= senhaAdm;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    /**
     * @return the idAdm
     */
    public int getIdAdm() {
        return idAdm;
    }

    /**
     * @param idAdm the idAdm to set
     */
    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }
    
      /**
     * @return the identificacaoAdm
     */
    public int getIdentificacaoAdm() {
        return identificacaoAdm;
    }

    /**
     * @param identificacaoAdm the identificacaoAdm to set
     */
    public void setIdentificacaoAdm(int identificacaoAdm) {
        this.identificacaoAdm = identificacaoAdm;
    }
}
