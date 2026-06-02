package StreamsApi;

import ticket.AudioType;
import ticket.Family;
import ticket.HalfPrice;
import ticket.Ticket;


import java.util.List;
import java.util.stream.Stream;

public class MyStream {
  static void main() {
    Stream<String> value = Stream.of("Luciano", "Vanessa", "Julia", "Heitor", "Dante");
    value.forEach(System.out::println);

    System.out.println("==== Reduce ====");
    Stream<Double> value2 = Stream.of(5.0, 26.6, 70.0);
    var result = value2.reduce(0.0, Double::sum);

    System.out.println(result);

    System.out.println("==== Tickets ====");

    Ticket ticket1 = new Family(22.0, "xablau", AudioType.DUBLADO, 2);
    Ticket ticket2 = new HalfPrice(24.0, "Dev development", AudioType.LEGENDADO);
    Stream<Ticket> ticketList = Stream.of(ticket1, ticket2);
    List<Ticket> ticketResult = ticketList.filter(ticket -> ticket.getAudioType() == AudioType.DUBLADO).toList();

    System.out.println("Quantidade de filmes dublados: " + ticketResult.size());
    ticketResult.forEach(ticket -> {
          System.out.println("Nome do filme: " + ticket.getMovieName());
          System.out.println("Audio do filme: " + ticket.getAudioType().toString().toLowerCase());
        }
    );
  }
}
