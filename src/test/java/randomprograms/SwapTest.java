package randomprograms;

import org.junit.Assert;
import org.junit.Test;

public class SwapTest {
    @Test
    public void numSwap() {
        Swap number = new Swap();
        int[] result = number.swap(1,2);
        Assert.assertEquals(2, result[0]); //
        Assert.assertEquals(1,result[1]); //
    }
    @Test
    public void numSwap1() {
        Swap number = new Swap();
        int[] result = number.swap(11,22);
        Assert.assertEquals(22, result[0]); //
        Assert.assertEquals(11,result[1]); //
    }
@Test
public void numSwap2(){
    Swap number = new Swap();
    int[] result = number.swap(14,30);
        Assert.assertEquals(30, result[0]); //
        Assert.assertEquals(14,result[1]); //
}
}
