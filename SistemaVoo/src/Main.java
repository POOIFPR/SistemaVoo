import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João",
     "05907948967",
      "44 9 94568122",
       "joao@email.com",
        "cliente1234");   
    Admin admin = new Admin("Lucas",
     "0123456789",
      "44 9 95684217",
       "lucas@email.com",
        "admin1234");
    Voo voo = new Voo("Azul",
    "São Paulo",
     "Ibiza",
      LocalDateTime.now(),
       LocalDateTime.of(2024, 12, 11, 15, 17, 25),
        2500.00,
         70);
    Reserva reserva = new Reserva(new Date(),
     cliente,
      14000.00,
      "B7-19",
     new Classe("Primeira Classe", "Classe mais luxuosa do voo"),
    voo);
    BagagemDespachada bagagem = new BagagemDespachada(30.15, "Azul", "145B-25A", cliente);
    }
}
