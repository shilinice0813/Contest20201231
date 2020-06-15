package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HelloWorldTest {
    @Test
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertEquals(actual,"Leave me alone.");
    }

    @Test
    public void should_be_mocked() {
        //given
//        Dependency dependency = mock(Dependency.class);
//        when(dependency.say()).thenReturn("Hello World");
//        HelloWorld helloWorld = new HelloWorld(dependency);
//
//        //when
//        String actual = helloWorld.beenCalled();
//
//        //then
//        assertEquals(actual, "Hello World");
    }
}
