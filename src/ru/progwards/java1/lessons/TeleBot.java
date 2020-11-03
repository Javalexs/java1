package ru.progwards.java1.lessons;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

public class TeleBot extends ProgwardsTelegramBot {
    private final String menu = "У нас есть кофе, чай, напитки и выпечка";

    private final String dobavka = "синнабон, круассан";

    @Override
    public String processMessage(String text) {
        checkTags(text);
        if (foundCount() == 1){
                if (checkLastFound("привет"))
                    return "Доброе утро!\n Что желаешь? " + menu;

                if (checkLastFound("/start"))
                    return "Доброе утро!\n Что желаешь? " + menu;


                if (checkLastFound("Американо"))
                    return "Желаете ли в кофе сливки, сироп, сахар?";

                if (checkLastFound("Эспрессо"))
                return "Желаете ли в эспрессо сливки или сахар?";

                if (checkLastFound("Капучино"))
                return "Желаете ли в капучино сахар, корицу?";

                if (checkLastFound("Черный"))
                return "Желаете ли в чай сахар, лимон?";

                if (checkLastFound("Зеленый"))
                return "Желаете ли в чай сахар, лимон?";

                if (checkLastFound("С чабрецом"))
                return "Желаете ли в чай сахар?";

                if (checkLastFound("хочу"))
                    return "Также у нас есть :\n" + extract() + "Выбирай, и я добавлю это в заказ.";

                if (checkLastFound("конец"))
                    return "Спасибо за заказ. Ждем вас снова";

                if (checkLastFound("дурак"))
                    return "Пожалуйста, не ругайтесь. Мы работаем только первый день и вы у нас первый клиент";

                if (checkLastFound("а что еще есть"))
                    return "Есть выпечка: круасанны и синабоны";

                return "Отлично, добавляю в заказ " + getLastFound() + ". Желаете что-то еще?";
        }
            if (foundCount() > 1)
                return "У нас есть :\n" + extract() + "Выбирай, и я добавлю это в заказ.";
            return "Я не понял, возможно у нас этого нет, попробуй сказать по другому.";

    }

    public static void main(String[] args){
            System.out.println("Привет Бот");

            ApiContextInitializer.init();

            TeleBot bot = new TeleBot();
            bot.username = "Barista99_bot";
            bot.token = "1246372799:AAEnJlQBD1WjDI-b0Z1xlY4mpGFXywr7l3Y";

            bot.addTags("привет", "привет, здрасьте, здравствуй, добр, день, вечер, утро, hi, hello, ghbdtn,/start");
            bot.addTags("да", "хочу, может быть");
            bot.addTags("конец", "конец, все, стоп, нет, достаточно, ничего не нужно");
            bot.addTags("дурак", "дурак, придурок, идиот, тупой, глупый");
            //bot.addTags("а что еще есть", "что, есть, можете, предложить");
            //bot.addTags("да", "хочу, можно");


            bot.addTags("Американо", "кофе");
            bot.addTags("Эспрессо", "кофе");
            bot.addTags("Капучино", "кофе");

            bot.addTags("Черный", "чай");
            bot.addTags("Зеленый", "чай");
            bot.addTags("С чабрецом", "чай");

            bot.addTags("круассан", "выпечка, поесть");
            bot.addTags("синнабон", "выпечка, поесть");

            bot.addTags("сливки", "в кофе, добавки, добавка");
            bot.addTags("сироп", "в кофе, добавки, добавка");
            bot.addTags("сахар", "в кофе, для чая, добавки, добавка");
            bot.addTags("лимон", "для чая, добавки, добавка");
            bot.addTags("корица", "корицу, добавки, добавка");

            bot.addTags("кола", "напитки, газировка, попить");
            bot.addTags("вода", "напитки, попить");

            bot.start();

    }
}
