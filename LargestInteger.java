 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer i = 0;
        Integer largest = integers[0];
        while(i < integers.length){
            if(integers[i] > largest) largest = integers[i];
            i++;
        }
        // System.out.println(largest.toString());
        return largest;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Integer i = 0;
        Integer largest = integers[0];
        while(i < integers.length){
            largest = Math.max(largest, integers[i]);
            i++;
        }
        return largest;
    }
}
