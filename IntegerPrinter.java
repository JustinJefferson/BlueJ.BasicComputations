 


public class IntegerPrinter {
    
    Integer base = new Integer(0);

    public String printIntegerAsBinary(int value){
        return base.toBinaryString(value);
    }

    public String printIntegerAsOctal(int value){
        return base.toOctalString(value);
    }

    public String printIntegerAsHexadecimal(int value){
        return base.toHexString(value);
    }

    public static void main(String[] args){

    }
}
