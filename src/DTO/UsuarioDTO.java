
package DTO;

public class UsuarioDTO {
    private int Id_usuario;
    private String nome, senha;

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
