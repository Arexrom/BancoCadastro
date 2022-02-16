/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroBanco;
eith
/**
 *
 * @author user
 */
public class AdministradorDTO {
    // Conceitua-se encapsulamento permitindo que apenas os membros públicos 
    // Java métodos Get / Set - sejam acessados pelos usuários de determinada classe.
    // Ocultação de informações: um objeto possui uma interface pública que 
    // outros objetos podem utilizar para comunicarem-se com ele.
    // O get serve para que outra classe consiga ler o valor da variável de outra classe.
    // Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.
    
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String rg;
    String password;
    String endereço;
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getTelefone() { 
        return telefone;
    } 
    public void setTelefone(String telefone) { 
        this.telefone = telefone;
    } 
    
     
    
    public  String getPassword(){
        return password;
    } 
    public void setPassword(String password){
        this.password = password;
    
}
}
       
    
    
    

