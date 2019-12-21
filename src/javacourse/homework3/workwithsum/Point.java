package javacourse.homework3.workwithsum;

public class Point implements Formater {
    private final static String DELIMETR = ".";

    @Override
    public String format(double value){
        int intPart = (int) value;
        Double decimal = value - intPart;
        String x_str = Integer.toString(intPart);
        String dcm = String.format("%.3f", decimal);
        String xstr2 = dcm.substring(2);
        return x_str + DELIMETR + xstr2;
    }
}
