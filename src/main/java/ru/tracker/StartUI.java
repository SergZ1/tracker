package ru.tracker;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item show = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = show.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);

    }
}
