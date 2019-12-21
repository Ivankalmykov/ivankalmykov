package javacourse.homework3;

import java.util.Arrays;

public class Workwithstring {
    public static void main(String[] args) {
        /*length();
        equalsIgnoreCase();
        internmethod();
        toCharArray();
        byteArray();
        upperCase();
        firstA();
        lastA();
        sun();
        oracle();
        startWithJava();
        swapAtoO();
        substring();
        stringMassive();
        reverse();*/

    }

    private static void length() {    //Получить длину строки
        String str = "Мама мыла раму";
        System.out.println(str.length());
    }

    private static void equalsIgnoreCase() {  // Сравнить 2 строки без учета регистра
        String str = "Мама мыла раму";
        String str2 = "мама мыла раму";
        boolean result = str.equalsIgnoreCase(str2);
        System.out.println(result);
    }

    private static void internmethod(){  // Создать новую строку с помощью конструктора и занести ее в пул литералов
        String a = new String("Галоша");
        String b = a.intern();
        System.out.println(b);
    }

    private static void toCharArray(){ // Получить из строки массив символов
        String str4 = "Галоша";
        char[] ch = str4.toCharArray();
        for (char a : ch) {
            System.out.println(a);
        }

    }
    private static void byteArray(){ // Получить из строки массив байтов
        String str5 = "Goal";
        byte[] byteArray = str5.getBytes();
        System.out.println(Arrays.toString(byteArray));
    }
    private static void upperCase(){ // Привести строку к верхнему регистру
        String st = "epam";
        System.out.println(st.toUpperCase());
    }
    private static void firstA(){ // Найти первую позицию символа "а" в строке
        String st = "Panamera";
        int indexA = st.indexOf("a");
        if(indexA == - 1) {
            System.out.println("Символ \"a\" не найден.");
        } else {
            System.out.println("Символ \"a\" найден в индексе " + indexA);
        }
    }

    private static void lastA(){ // Найти последнюю позицию символа "а" в строке
        String st = "Panamera";
        System.out.println(st.lastIndexOf("a"));
    }

    private static void sun(){ // Проверить содержит-ли строка слово "Sun"
        String str = "hot summer sun";
        System.out.println(str.contains("sun"));
    }

    private static void oracle(){ // Проверить оканчивается-ли строка на "Oracle"
        String str = "It's the world you see on the plaque in the room of the Oracle";
        System.out.println(str.endsWith("Oracle"));
    }
    private static void startWithJava(){ //Проверить начинается-ли строка на "Java"
        String str = "Java - лучший язык программирвоания ?";
        System.out.println(str.startsWith("Java"));
    }

    private static void swapAtoO(){ //Заменить все символы "а" в строке на символ "о"
        String str = "lamborghini".replaceAll("a", "o");
        System.out.println(str);
    }
    private static void substring(){ //Получить подстроку с 44 символа по 90 символ
        String str = "С точки зрения программирования, инкапсуляция– это «сокрытие реализации». Мне нравится такое определение. ";
        System.out.println(str.substring(44, 90));
    }
    private static void stringMassive(){ //Разбить строку по символу пробел (т.е. чтобы каждое слово было отдельным элементом массива)
        String str = "Мама мыла раму";
        String[] st = str.split(" ");
        System.out.println(Arrays.toString(st));

    }

    private static void reverse(){ //Поменять последовательность символов в строке на обратную.
        String str = "abcdefg";
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println(reversedString);
    }

}


