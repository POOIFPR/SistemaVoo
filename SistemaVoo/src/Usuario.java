import java.util.ArrayList;

public abstract class Usuario {
    String nome;
    String cpf;
    String telefone;
    String email;
    String senha;
    public Usuario(String nome, String cpf, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public ArrayList<Voo> visualizarVoos() {
        return new ArrayList<Voo>();
    }
}
