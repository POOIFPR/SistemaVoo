import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Usuario {
    String nivelAcesso = "1";

    public Cliente(String nome, String cpf, String telefone, String email, String senha) {
        super(nome, cpf, telefone, email, senha);
    }

    public ArrayList<Voo> buscarVoosPorDataSaida(LocalDateTime horarioSaida) {
        ArrayList<Voo> lista = new ArrayList<>();
        return lista;
    }
    public ArrayList<Voo> buscarVoosPorDataChegada(LocalDateTime horarioChegada) {
        ArrayList<Voo> lista = new ArrayList<>();
        return lista;
    }
    public ArrayList<Voo> buscarVoosPorDestino(String destino) {
        ArrayList<Voo> lista = new ArrayList<>();
        return lista;
    }
    public Reserva efetuarReserva(Date dataReserva, Usuario usuario, Double valorReserva, String posicaoBanco, Classe classeAssento, Voo voo) {
        return new Reserva(dataReserva, usuario, valorReserva, posicaoBanco, classeAssento, voo);
    }
    public void selecionarAssento() {
    }
    public BagagemDespachada despacharBagagem(Double peso, String cor, String etiqueta, Cliente cliente) {
        return new BagagemDespachada(peso, cor, etiqueta, this);
    }
    public void alterarReserva(){
    }
    public void excluirReserva(){
    }
}
