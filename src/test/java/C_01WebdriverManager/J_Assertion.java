package C_01WebdriverManager;

import org.junit.Assert;
import org.junit.Test;

public class J_Assertion {

    @Test
    public void testing01(){
        // scene 1 equals to right value 10/2 == 5


        // scene 2 divide the values they cant 10/3 == 3.33


        // scene 3 10 / 0 return -1



    }

    @Test
    public void testingsc01(){
        int expected =5;
        int actual = (int) divide(10,2);
        // expected == actual
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testingsc02(){
        double expect2ed  = 3.5;
        double result = 3.5;
        Assert.assertEquals(expect2ed,result,1e-5); // doubles requires delta for limitiing you can either edit it or convert to  different type watchout!!
    }
    @Test
    public void testing03(){
        double expected = -1;
        Assert.assertEquals(expected,divide(2,0));

    }
    public static double divide(int x , int y) {return x/y;}
}
