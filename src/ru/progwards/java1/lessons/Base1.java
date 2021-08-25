package ru.progwards.java1.lessons;

public class Base1 {
    public static void main(String[] args) {

        printJava();
        printJava("Чтобы Java понимать", "Надо функции писать");
        printJava("Буду, буду программистом", "Код пишу я чисто, чисто");
        String str = plusJava("самый популярный");
        System.out.println("str = " + str);
        String str1 = plusJava("объектно-ориентированный");
        System.out.println("str = " + str1);
        System.out.println(plusJava("очень интересный"));

    }
    public static void printJava(){
        String str = "Хорошо идут дела";
        String str2 = "Изучаю Java я!";
        String str3 = " ";
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str + str3 + str2);
        System.out.println(str2 + str3 + str);

    }
    public static void printJava(String java1, String java2){
        System.out.println(java1);
        System.out.println(java2 + "!");
        System.out.println(java1 + "," + " " + java2 + "!");
        System.out.println(java2 + "," + " " + java1 + "!");
    }
    public static String plusJava(String message){
        return "Java - " + message + " язык программирования";
    }

}
