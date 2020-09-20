package gestionDate;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        // Sur java 7 problemes liés a la date :
        // 2 classes dates
        // Pas les meme infos sur les deux classes
        // manque de cohérence
        // non thread safe
        // mauvaise gestion des zones



        // Date du jour
       LocalDate date = LocalDate.now();
       System.out.println(date);


        LocalTime dtt = LocalTime.now();
        System.out.println(dtt);

        LocalDateTime dtt2 = LocalDateTime.now();
        System.out.println(dtt2);

        LocalTime ZDT = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(ZDT);


        ZonedDateTime ZDTT = ZonedDateTime.of(dtt2, ZoneId.of("Asia/Tokyo"));
        System.out.println(ZDTT);


        System.out.println("-----------------------------------------------------------------");

        Set<Chronology> chronos = Chronology.getAvailableChronologies();

        for( Chronology c : chronos ) {
            ChronoLocalDate dt = c.dateNow();
            System.out.println("id " + c.getId() + " date " + dt );
        }

        JapaneseDate jd = JapaneseDate.now();
        System.out.println(jd);

        System.out.println("-----------------------------------------------------------------");




       // LocalTime R = LocalTime.now();
        // System.out.println(R.format(DateTimeFormatter.ISO_DATE));


    }
}
