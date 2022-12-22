package com.ParametrizedTest;

import java.util.Arrays;
import java.util.Collection;

import com.BaseTest;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestAssertAuthors extends BaseTest {
    String authorName;
    String authorSurname;

    public TestAssertAuthors(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{"Thomas", "Mraz"}, {"Taylor", "Swift"}, {"Selena", "Gomez"}});
    }

    @Tag("Authors test assertion")
    @Test
    public void testAssertion() {
        TestMusic.testAssertAuthors(authorName, authorSurname);
    }
}