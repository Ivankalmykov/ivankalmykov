package javacourse.homework2;

import java.util.Arrays;


public class Notepad {
    private static int count = 0;
    private static String[] array = new String[10];


    public static void add(String s) {
        if (count >= array.length){
            String[] newArray = Arrays.copyOf(array, array.length*2);
             array = newArray;
        }
        array[count] = s;
        count++;

    }
    public static void delete() {
        array[count-1]=null;
        count--;
    }

    public static void print(){
        for(int i = 0; i< array.length; i++) {
            if(array[i] == null)
                continue;
            System.out.println(array[i]);
        }
    }

}
