package io.kubesphere.devops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Really appreaciate your stsssssssssars, that's twewewewewhe power of our life.", new HelloWorldController().sayHello());
    }
}
