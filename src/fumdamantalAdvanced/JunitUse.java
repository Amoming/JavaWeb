package fumdamantalAdvanced;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitUse {

    @Before
    public  void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close..");
    }

    @Test
    public void testAdd(){
        System.out.println("test");
        Calc c = new Calc();
        int result=c.add(1,2);

        //断言
        Assert.assertEquals(2,result);
    }
}
