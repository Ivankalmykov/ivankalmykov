package javacourse.homework3.workwithsum;

public class Comma implements Formater {

    private final static String DELIMETR = ",";

    @Override
    public String format(double value){
        int intPart = (int) value;
        double decimal = value - intPart;
        String intValue = Integer.toString(intPart);
        String decimValue = String.format("%.3f", decimal);
        String xstr2 = decimValue.substring(2);
        return intValue + DELIMETR + xstr2;
    }

}
