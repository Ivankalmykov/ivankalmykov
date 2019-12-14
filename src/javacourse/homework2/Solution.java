package javacourse.homework2;

public class Solution {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        for (int i =0 ; i<40; i++){
            notepad.add("number "+i);
        }

        notepad.print();
        notepad.delete();
        notepad.print();
    }
}
