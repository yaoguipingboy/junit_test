package org.b3log;

import org.junit.Assert;
import org.junit.Test;

import org.b3log.CoverageTest;

/**
 * Created by 000284 on 2017/2/6.
 */
public class JunitTestCoverageTest {
    @Test
    public void testadd(){
        int b = CoverageTest.testadd(5, 20);
        Assert.assertEquals(b,50);
        b = CoverageTest.testadd(10, 20);
        Assert.assertEquals(b,30);
        b = CoverageTest.testadd(30, 20);
        Assert.assertEquals(b,100);
    }


}
