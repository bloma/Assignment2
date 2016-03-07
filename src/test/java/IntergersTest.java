
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Cant-Detect on 2016/03/04.
 */
public class IntergersTest {

    Intergers add = new Intergers();

@Test(timeout =100)
public void testAdd() throws Exception {


    int var = add.addIntegers(5,5);

    Assert.assertEquals(10,var);

    }





}