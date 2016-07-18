import com.vivien.Compute;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeTest {

    @Test
    public void should_return_2_when_input_1_and_1() throws Exception {
        Compute compute = new Compute();
        assertEquals(2,compute.plus(1,1),0.01);
    }

}