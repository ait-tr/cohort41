/*
@date 19.03.2024
@author Sergey Bugaienko
*/

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeApi {
    public static void main(String[] args) {
        /*
        LocalDate
        LocalTime
        LocalDateTime
        ZonedDateTime
        Duration
        Period
         */

        //LocalDate - представляет дату (год, месяц, число)

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("now: " + date);
        LocalDate tomorrow = date.plusDays(1); //прибавляет к текущей дате х дней
        System.out.println(tomorrow);

        System.out.println("plusWeeks(2): " + date.plusWeeks(2)); // прибавляет к текущей дате х недель
        System.out.println("plusMonths(12): " + date.plusMonths(12)); // прибавляет к текущей дате х месяцев

        System.out.println("yesterday: " + date.minusDays(1)); // отнимает от текущей даты Х дней (недель, месяцев, лет)

        // Получить объект соответсвующий дате
        LocalDate date1 = LocalDate.of(2002, 2, 11);
        date1 = LocalDate.of(2002, Month.FEBRUARY, 11);
        System.out.println("date1: " + date1);

        System.out.println("год: " + date1.getYear() + "; месяц: " + date1.getMonth() + "; число: " + date1.getDayOfMonth());
        System.out.println("день недели: " + date1.getDayOfWeek() + "; день года: " + date1.getDayOfYear() + "; номер месяца: " + date1.getMonthValue());
        System.out.println("date1.lengthOfMonth(): " + date1.lengthOfMonth());

        System.out.println("\n===========================================\n");

        //LocalTime - представляет время (часы, минуты, секунды, наносекунды)


        LocalTime time = LocalTime.now(); // текущее время
        System.out.println("now: " + time);

        time = LocalTime.of(21, 33, 59);
        time = LocalTime.of(21, 33, 59, 15458);
        System.out.println(time);

        System.out.println("plusHours(1): " + time.plusHours(1)); // прибавляет к  текущему время Х часов
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65)); // прибавляет к  текущему время Х минут
        System.out.println(time.minusSeconds(30)); // отнимает от текущего времени Х секунд (минут, часов, наносекунд)

        System.out.println("час: " + time.getHour() + "; минуты: " + time.getMinute() + "; секунды: " + time.getSecond() + "; нано: " + time.getNano());

        String timeString = "12:13:45";
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime.getHour() + " | " + parseTime.getMinute());
        // ожидает формат строки ISO-8601 ("2001-01-15T08:15:45+01:00")

        String isoString = "2001-01-15T08:15:45+01:00";
        isoString = "18:31:42";


        isoString = "2001-01-02T10:15:45";
        LocalDateTime dateTime = LocalDateTime.parse(isoString);
        System.out.println("parse LDT: " + dateTime );

        isoString = "18:31:42";
        LocalTime parse = LocalTime.parse(isoString);
        System.out.println(parse + " " + parse.getHour());

        System.out.println("\n==============LocalDateTime=================\n");

        //LocalDateTime - Представляет дату и время без учета часового пояса

        LocalDateTime localDateTime = LocalDateTime.now(); // текущая дата и время
        System.out.println("localDateTime: " + localDateTime);

        LocalDate localDate = LocalDate.of(2023, Month.MARCH, 8);
        LocalTime localTime = LocalTime.of(15, 31, 25);

        LocalDateTime dateTime5 = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime5);

        System.out.println("dateTime.getDayOfWeek(): " + dateTime.getDayOfWeek());
        System.out.println("getDayOfWeek().getValue(): " + dateTime.getDayOfWeek().getValue());

        dateTime = LocalDateTime.now();
        System.out.println(dateTime.plusDays(15));
        System.out.println(dateTime.minusMinutes(30));


        System.out.println("\n==============ZonedDateTime=================\n");
        // ZonedDateTime - представляет дату и время с часовым поясом

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("zonedDateTime.getZone(): " + zonedDateTime.getZone());

        zonedDateTime = ZonedDateTime.of(localDate, localTime, ZoneId.of("Asia/Aden"));
        System.out.println(zonedDateTime);

//        for (String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

        String isoStringZoned = "2001-01-15T08:15:45+03:00[Asia/Aden]";
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse(isoStringZoned);
        System.out.println("zonedDateTime1: " + zonedDateTime1 + " | " + zonedDateTime1.getDayOfYear());

        System.out.println("getOffset().getTotalSeconds(): " + zonedDateTime1.getOffset().getTotalSeconds());

        System.out.println("\n ==================== isAfter, isBefore, until ====================== ");

        //isAfter, isBefore, until, equals - есть у всех объектов представляющий дату и / или время

        //isAfter - проверяет, что текущий объект после (позже) указанного объекта
        LocalDate date2 = LocalDate.of(2020, 10, 15);
        LocalDate date3 = LocalDate.of(2020, 6, 25);

        System.out.println("date2.isAfter(date3): " + date2.isAfter(date3));

        // isBefore - проверяет, что текущий объект до (раньше) указанного объекта
        System.out.println(date2.isBefore(date3));

        // equals - проверяет даты/время на равенство
        System.out.println("date2.equals(date2): " + date2.equals(date2));

        // until - метод измеряет разницу между текущим и указанным объектом даты/времени -> long

        long daysBetween = date3.until(date2, ChronoUnit.DAYS);
        System.out.println("daysBetween: " + daysBetween);

        long yearsBetween = date3.until(date2, ChronoUnit.YEARS);
        System.out.println("yearsBetween: " + yearsBetween);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime1 = LocalDateTime.of(2022, 11, 15, 15, 30);

        long hours = now.until(dateTime1, ChronoUnit.HOURS);
        System.out.println("hours: "  + hours);

        long hoursBetween = ChronoUnit.HOURS.between(now, dateTime1);
        System.out.println("hoursBetween: " + hoursBetween);

        System.out.println("\n ================= Duration =====================");

        // Duration - представляет продолжительность в секундах или наносекундах


//        System.out.println(System.currentTimeMillis());
        Instant start = Instant.now();
        System.out.println(start.toEpochMilli());

        for (int i = 0; i < 100000; i++) {

        }
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toDays());

        System.out.println("\n ================= Period ======================");

        // представляет период в годах, месяцах и днях
       LocalDate now2 = LocalDate.now();
      LocalDate dateTime2 = LocalDate.of(2022, 11, 15);

      Period period = Period.between(now2, dateTime2);
        System.out.println(period);

        System.out.println(period.getYears() + " | " + period.getMonths() + " | " + period.getDays());
        System.out.println("period.toTotalMonths(): " + period.toTotalMonths());

        System.out.println("\n =================== DateTimeFormatter ===================");
        // DateTimeFormatter - форматирование даты и время

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        // 24-число-месяц
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|dd|MM HH:mm:ss");

        String formattedDate = localDateTime1.format(formatter);
        System.out.println(formattedDate);

        String dateForParseString = "2024|19|03 20:36:59";
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy|dd|MM HH:mm:ss");

        LocalDateTime parseDateTime = LocalDateTime.parse(dateForParseString, formatterDate);

        System.out.println(parseDateTime + " - " + parseDateTime.getYear());


        /*
        y - год
        M - месяц
        d - день
        H - час в формате от 0 до 23
        h - час в формате от 0 до 12, флаг a - для отображения индикатора AM/PM
        m - минуты
        s - секунды
         */

        /*
        Количество повторений символа определяет формат вывода (года/месяца)

        yy - двухзначный год - например 24 для 2024 года
        yyyy - 4-значный
        M - месяц: 3
        MM - месяц 03
        d - однозначный день 9
        dd - двухзначный день 09
         */


        /*
        "15-12-2022 20-46"
        Запарсить из строки объект LocalDateTime
        распечатать + отдельно распечатать месяц, день, час

        "13-01-2023 00-47"
        какому дню недели соответствует вторая дата
        Сколько дней между этими датами
         */

        System.out.println("\n====================== Task1 =======================");

        String dateStr1 = "15-12-2022 20-46";
        String dateStr2 = "13-01-2023 00-47";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime dateFromStr1 = LocalDateTime.parse(dateStr1, formatter1);
        LocalDateTime dateFromStr2 = LocalDateTime.parse(dateStr2, formatter1);

        System.out.println(dateFromStr1);
        System.out.println(dateFromStr1.getYear() + " | " + dateFromStr1.getMonth()+  " | " + dateFromStr1.getHour());

        System.out.println(dateFromStr2.getDayOfWeek());
        System.out.println(dateFromStr1.until(dateFromStr2, ChronoUnit.DAYS));
        System.out.println(ChronoUnit.DAYS.between(dateFromStr1, dateFromStr2));


    }
}
