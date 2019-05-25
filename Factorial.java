 


import java.math.BigInteger;
/**
 * Helpful advice for factorials:
 * https://www.baeldung.com/java-bigdecimal-biginteger
 * 
 * Java 8 docs for BigInteger
 * https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html
 * 
 * Note: BigInteger can only perform mathmatical operations by using its methods. 
 * You can't use basic operators like you would with primitives or Wrapper classes
 * Also BigIntegers are immutable so the methods return all new BigIntegers which need to be assigned to a variable.
 */

public class Factorial {
    
    public String testingFunctions(Integer value) {
        BigInteger bigNum = new BigInteger(value.toString());
        BigInteger anotherNum = new BigInteger("4");
        BigInteger newBigNum = bigNum.add(anotherNum);
        String result = newBigNum.toString();
        return result;
        
    }

    public BigInteger factorialOf(Integer value){
        value++;
        BigInteger factorial = new BigInteger(value.toString());
        BigInteger counter = new BigInteger("1");
        BigInteger increment = new BigInteger("1");
        BigInteger result = new BigInteger("1");
        
        while(counter.equals(factorial) == false) {
            
            result = result.multiply(counter); // Compute factorial
            
            counter = counter.add(increment);   // increment to next number
            
        }
        // System.out.println(result.toString());
        return result;
    }

}
