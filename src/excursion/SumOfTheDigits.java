package excursion;

public class SumOfTheDigits {
 
    public static int digitSum(long value) {
        int sum = 0;
        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }
    
  
    public static int digitSum(String value) {
        long longValue = Long.parseLong(value);
        return digitSum(longValue);
    }
}
