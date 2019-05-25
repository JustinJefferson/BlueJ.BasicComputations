 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortCalculatorTest {
    
    private ShortCalculator shortCalculator;
    
    @Before
    public void setUp(){
        shortCalculator = new ShortCalculator();
    }
    
    @Test
    public void randomShort6And4Test() {
        //:Given
        String expected = "10 2 24 1 2";

        //:When
        String actual = shortCalculator.shortValues(6,4);

        //:Then
        Assert.assertEquals("The Strings should be equals", expected, actual);
        
    }
    
    @Test
    public void randomShort4And6Test() {
        //:Given
        String expected = "10 -2 24 0 4";

        //:When
        String actual = shortCalculator.shortValues(4,6);

        //:Then
        Assert.assertEquals("The Strings should be equals", expected, actual);
        
    }
    
}
