package com.learn.test;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DailyTest {

    @Test
    public void test_reflect() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Integer> integerClass = int.class;
        Constructor<Integer> constructor = integerClass.getConstructor();
        Integer integer = constructor.newInstance(2);
        System.out.println(integer);
    }
}
