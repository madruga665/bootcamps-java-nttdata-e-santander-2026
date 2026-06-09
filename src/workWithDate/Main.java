package workWithDate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
  static void main() {
    var date = new Date();
    var calendar = Calendar.getInstance();

    System.out.println(calendar.getTime());
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    System.out.println(date);
    System.out.println(calendar);

    System.out.println("==== OffsetDateTime ====");
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    OffsetDateTime offsetDateTime = OffsetDateTime.now();
    OffsetDateTime dataEspecifica = OffsetDateTime.of(
        1986, 12, 8,
        0, 0, 0, 0,
        ZoneOffset.ofHours(-3)
    );
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println(localDate);
    System.out.println(localDate.getMonth());
    System.out.println(localDate.format(formatter));
    System.out.println(localTime);
    System.out.println(offsetDateTime);
    System.out.println(dataEspecifica);
    System.out.println(dataEspecifica.isAfter(offsetDateTime));
    System.out.println(dataEspecifica.isBefore(offsetDateTime));
  }
}
