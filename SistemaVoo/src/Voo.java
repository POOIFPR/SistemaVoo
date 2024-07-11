import java.time.LocalDateTime;

public class Voo {
    String companhiaAerea;
    String origem;
    String destino;
    LocalDateTime horarioPartida;
    LocalDateTime horarioChegada;
    Double precoBilhete;
    Integer quantidadeAssentos;
    public Voo(String companhiaArea,
    String origem,
     String destino,
      LocalDateTime horarioPartida,
       LocalDateTime horarioChegada,
        Double precoBilhete,
         Integer quantidadeAssentos) {
        this.companhiaAerea = companhiaArea;
        this.origem = origem;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.precoBilhete = precoBilhete;
        this.quantidadeAssentos = quantidadeAssentos;
    }
}
