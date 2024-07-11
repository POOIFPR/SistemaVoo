import java.util.Date;

public class Reserva {
    Date dataReserva;
    Usuario usuario;
    Double valorReserva;
    String posicaoBanco;
    Classe classeAssento;
    Voo voo;
    public Reserva(Date dataReserva,
     Usuario usuario,
      Double valorReserva,
       String posicaoBanco,
        Classe classeAssento,
        Voo voo) {
        this.dataReserva = dataReserva;
        this.usuario = usuario;
        this.valorReserva = valorReserva;
        this.posicaoBanco = posicaoBanco;
        this.classeAssento = classeAssento;
        this.voo = voo;
    }
}
