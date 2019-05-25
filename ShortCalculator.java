 


public class ShortCalculator {
    
    public String shortValues(Integer a, Integer b) {
        String result = "";
        Integer convert = 0;
        
        //Store the values in shorts
        Short shortA = a.shortValue();
        Short shortB = b.shortValue();
        
        convert = a + b;
        Short sum = convert.shortValue();
        
        convert = a - b;
        Short diff = convert.shortValue();
        
        convert = a * b;
        Short product = convert.shortValue();
        
        convert = a / b;
        Short quotient = convert.shortValue();
        
        convert = a % b;
        Short remainder = convert.shortValue();
        
        result = sum + " " + diff + " " + product + " " + quotient + " " + remainder;
        
        return result;
    }
}
