import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cant-Detect on 2016/03/05.
 */
public class NullnessTest{

    Nullness Aph;

    @Before
    public void setUp() throws Exception {
        Aph = new Nullness();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {

        String Ano = Aph.Names();

        Assert.assertNull("Aphiwe",Ano);

    }
}