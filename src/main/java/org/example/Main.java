package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now().plusWeeks(2);
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2021, 1, 1);
        System.out.println(localDate1.isAfter(localDate2));
        System.out.println(localDate1.isBefore(localDate2));


        LocalDate localDate3 = LocalDate.of(2021, 1, 1);
        LocalDate localDate4 = LocalDate.of(2021, 1, 10);
        System.out.println(localDate3.until(localDate4).getDays());


        Animal animal = new Animal("Burek", LocalDate.of(2010, 1, 1));
        Animal animal2 = new Animal("Astrid", LocalDate.of(2015, 12, 1));
        System.out.println(animal.getName());
        System.out.println(animal.getDateOfBirth());
        LocalDate dateOfBirth = animal.getDateOfBirth();
        LocalDate dateOfBirth2 = animal2.getDateOfBirth();
        LocalDate now = LocalDate.now();
        // next Birthday in days
        long daysUntilNextBirthday = (dateOfBirth.withYear(now.getYear()).isBefore(now) ?
                now.until(dateOfBirth.withYear(now.getYear() + 1), ChronoUnit.DAYS) :
                now.until(dateOfBirth.withYear(now.getYear()), ChronoUnit.DAYS));

        long daysUntilNextBirthday2 = (dateOfBirth2.withYear(now.getYear()).isBefore(now) ?
                now.until(dateOfBirth2.withYear(now.getYear() + 1), ChronoUnit.DAYS) :
                now.until(dateOfBirth2.withYear(now.getYear()), ChronoUnit.DAYS));

        System.out.println(daysUntilNextBirthday);
        System.out.println(daysUntilNextBirthday2);


        /**
         * Erklärung zu daysUntilNextBirthday
         *
         * 1. LocalDateTime localDateTime = LocalDateTime.now();
         * Der Code ermittelt das aktuelle Datum (now). Dies ist das heutige Datum.
         * Geburtsdatum des Tieres holen:
         *
         * 2. LocalDate dateOfBirth = animal.getDateOfBirth();
         * Das Geburtsdatum des Tieres (dateOfBirth) wird aus dem animal-Objekt geholt.
         * Geburtsjahr auf das aktuelle Jahr setzen:
         *
         * 3.
         * Das Geburtsdatum des Tieres wird so modifiziert, dass das Jahr auf das aktuelle Jahr gesetzt wird
         * (dateOfBirth.withYear(now.getYear())). Das bedeutet, wir betrachten den Geburtstag
         * des Tieres in diesem Jahr.
         *
         * Überprüfen, ob der Geburtstag dieses Jahr schon war:
         * Hier wird geprüft, ob der Geburtstag des Tieres in diesem Jahr bereits vorbei ist.
         * Das macht der Code mit isBefore(now). Wenn ja, bedeutet das, dass der nächste Geburtstag im nächsten Jahr ist.
         * Berechnung der Tage bis zum nächsten Geburtstag:
         *
         * Wenn der Geburtstag dieses Jahr schon vorbei ist:
         * Der Code setzt das Geburtsdatum auf das nächste Jahr (dateOfBirth.withYear(now.getYear() + 1))
         * und berechnet dann, wie viele Tage es von heute bis zu diesem Datum im nächsten Jahr sind.
         * Wenn der Geburtstag dieses Jahr noch nicht vorbei ist:
         * Der Code berechnet, wie viele Tage es von heute bis zum Geburtstag in diesem Jahr sind.
         * Ergebnis in daysUntilNextBirthday speichern:
         *
         * Die berechnete Anzahl der Tage wird in der Variable daysUntilNextBirthday gespeichert.
         */

    }
}