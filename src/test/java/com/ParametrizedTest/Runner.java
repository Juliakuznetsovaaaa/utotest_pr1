package com.ParametrizedTest;

import com.BaseTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner extends BaseTest {
    public static void main(String[] args) {
        Result res = JUnitCore.runClasses(TestAssertAuthors.class);
        for (Failure fail : res.getFailures()) {
            System.out.println(fail.toString());
        }
        System.out.println(res.wasSuccessful());
    }
}
