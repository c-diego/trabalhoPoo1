package modelo;

//@author diego

public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private int permissao;

    //setters
    public void setId(int id) { this.id = id; }

    public void setNome(String nome) { this.nome = nome; }

    public void setLogin(String login) { this.login = login; }

    public void setSenha(String senha) { this.senha = senha; }

    public void setPermissao(int permissao) { this.permissao = permissao; }
    
    
    //getters
    public int getId() { return id; }

    public String getNome() { return nome; }
    
    public String getLogin() { return login; }    
    
    public String getSenha() { return senha; }
    
    public int getPermissao() { return permissao; }
        
}
