package ru.progwards.java1.lessons;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

public class TeleBot extends ProgwardsTelegramBot {
    private final String menu = "У нас есть кофе";

    @Override
    public String processMessage(String text) {
        checkTags(text);
        if (foundCount() == 1) {
            if (checkLastFound("привет"))
                return "Приветствую тебя, о мой повелитель!\n Что желаешь? ";

            if (checkLastFound("конец"))
                return "Спасибо за заказ.";

            if (checkLastFound("дурак"))
                return "Не надоругаться. Я не волшебник, я только учусь";

            return "Отлично, добавляю в заказ " + getLastFound() + " Желаешь что-то еще?";
        }
        if (foundCount() > 1)
            return "Под твой запрос подходит: \n" + extract() + "Выбери что-то одно, и я добавлю это в заказ.";
        return "Я не понял, возможно у нас этого нет, попробуй сказать по другому. ";
    }

    public static void main(String[] args) {
        System.out.println("Привет Бот");

        ApiContextInitializer.init();

        TeleBot bot = new TeleBot();
        bot.username = "Barista2020_bot";
        bot.token = "1077549095:AAH0N8ob8MkvQlAbBnucXbfjONjqYE_YLS0";

        bot.addTags("привет", "привет, здрасьте, здравствуй, добр, день, вечер, утро, hi, hello");
        bot.addTags("конец", "конец, все, стоп, нет");
        bot.addTags("дурак", "дурак, придурок, идиот, тупой");

        bot.addTags("Американо", "американо, кофе, молоко, ");
        bot.addTags("Эспресо", "маргарит, пицц, моцарелла, сыр, кетчуп, помидор");
        bot.addTags("Капучино", "пеперони, пицц, салями, колбас, сыр, кетчуп, помидор");


        bot.start();
    }
}
