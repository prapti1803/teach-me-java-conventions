package Power;

import org.junit.Test;
public class powerTest {
    @Test
    public void one_power_one_is_one(){
        assert powerFinder.OF(1,1)==1;
    }
    @Test
    public void two_power_one_is_two(){
        assert powerFinder.OF(2,1)==2;
    }
    @Test
    public void two_power_two_is_four(){
        assert powerFinder.OF(2,2)==4;
    }
    @Test
    public void three_power_two_is_nine(){
        assert powerFinder.OF(3,2)==9;
    }

}
