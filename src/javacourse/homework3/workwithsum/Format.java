package javacourse.homework3.workwithsum;

public class Format {
    private String delimeter;

    public Format(String delimmetr){
        this.delimeter = delimmetr;

    }
    public String format(double value){
        int intPart = (int) value;
        double decimal = value - intPart;
        String intValue = Integer.toString(intPart);
        String decimValue = String.format("%.3f", decimal);
        String dcmValue = decimValue.substring(2);
        return intValue + delimeter + dcmValue;
    }

}
