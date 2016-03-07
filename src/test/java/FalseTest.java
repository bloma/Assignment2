import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cant-Detect on 2016/03/05.
 */
public class FalseTest{

    False lie;
    @Before
    public void setUp() throws Exception {
        lie = new False();
    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void testName() throws Exception {

        boolean variant = lie.Surname();

        Assert.assertFalse("Is this false",variant);

    }
}