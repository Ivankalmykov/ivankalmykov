package javacourse.homework3;

import java.util.Arrays;

public class Workwithstring {
    public static void main(String[] args) {
        /*length();
        whoIsLonger();
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

    private static void length() {
        String str = "Мама мыла раму";
        System.out.println(str.length());
    }

    private static void whoIsLonger() {
        String str = "Мама мыла раму";
        String str2 = "Папа мыл полы";
        if (str.length() > str2.length()) {
            System.out.println("Строка Str длинее строки Str2");
        } else {
            System.out.println("Строка Str2 длинее строки Str");
        }
    }

    private static void internmethod(){
        String a = new String("Галоша");
        String b = a.intern();
        System.out.println(b);
    }

    private static void toCharArray(){
        String str4 = "Галоша";
        char[] ch = str4.toCharArray();
        for (char a : ch) {
            System.out.println(a);
        }

    }
    private static void byteArray(){
        String str5 = "Goal";
        byte[] byteArray = str5.getBytes();
        System.out.println(Arrays.toString(byteArray));
    }
    private static void upperCase(){
        String st = "epam";
        System.out.println(st.toUpperCase());
    }
    private static void firstA(){
        String st = "Panamera";
        int indexA = st.indexOf("a");
        if(indexA == - 1) {
            System.out.println("Символ \"a\" не найден.");
        } else {
            System.out.println("Символ \"a\" найден в индексе " + indexA);
        }
    }

    private static void lastA(){
        String st = "Panamera";
        System.out.println(st.lastIndexOf("a"));
    }

    private static void sun(){
        String str = "hot summer sun";
        System.out.println(str.contains("sun"));
    }

    private static void oracle(){
        String str = "It's the world you see on the plaque in the room of the Oracle";
        System.out.println(str.endsWith("Oracle"));
    }
    private static void startWithJava(){
        String str = "Java - лучший язык программирвоания ?";
        System.out.println(str.startsWith("Java"));
    }

    private static void swapAtoO(){
        String str = "lamborghini".replaceAll("a", "o");
        System.out.println(str);
    }
    private static void substring(){
        String str = "С точки зрения программирования, инкапсуляция– это «сокрытие реализации». Мне нравится такое определение. ";
        System.out.println(str.substring(44, 90));
    }
    private static void stringMassive(){
        String str = "Мама мыла раму";
        String[] st = str.split(" ");
        System.out.println(Arrays.toString(st));

    }

    private static void reverse(){
        String str = "abcdefg";
        String reversedString = new StringBuffer(str).reverse().toString();
        System.out.println(reversedString);
    }

}


