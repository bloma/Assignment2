
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cant-Detect on 2016/03/05.
 */
public class ObjectEqualityTest{

    private ObjectEquality Aph;

    @Before
    public void setUp() throws Exception {
        Aph = new ObjectEquality();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testObjects(){
        String var = Aph.name1();
        String hisName = Aph.name2();

        Assert.assertEquals(var,hisName);

    }


}