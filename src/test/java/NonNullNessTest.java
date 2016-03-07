import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cant-Detect on 2016/03/05.
 */
public class NonNullNessTest{

    NonNullNess x;
    @Before
    public void setUp() throws Exception {

        x = new NonNullNess();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testName() throws Exception {

        Assert.assertNotNull(x.numbers());

    }


}