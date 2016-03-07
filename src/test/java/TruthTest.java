import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cant-Detect on 2016/03/05.
 */
public class TruthTest{

    Truth myTruth;
    @Before
    public void setUp() throws Exception {
        myTruth = new Truth();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testName() throws Exception {

        boolean age = myTruth.Myage();
        Assert.assertTrue("Is this true",age);
    }
}