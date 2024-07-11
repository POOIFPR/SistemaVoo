public class Admin extends Usuario{
    String nivelAcesso = "2";

    public Admin(String nome, String cpf, String telefone, String email, String senha) {
        super(nome, cpf, telefone, email, senha);
    }

    public String enviarConfirmação(Cliente cliente) {
        return "Parabéns! Seu voo está confirmado";
    } 
}
