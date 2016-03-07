import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cant-Detect on 2016/03/06.
 */
public class ExceptionsTest{

    Exceptions except;

    @Before
    public void setUp() throws Exception {
        except = new Exceptions();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(expected = ArithmeticException.class)
    public void testName(){

        int answer = except.number1(1);
        Assert.assertEquals(-1,answer);
    }
}