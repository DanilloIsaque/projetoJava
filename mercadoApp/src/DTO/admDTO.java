package DTO;

 
public class admDTO {
    //transferencia de objeto, onde recebemos e enviamos a qualquer momento
    private int idAdm; //para listar
    
    // só a minha classe consegue ver
    private String nomeAdm;
     private String emailAdm;
     private String senhaAdm;
     
     
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
}
