package com.michaelcane;

import org.junit.Before;
import org.junit.Test;
import static org.junit.util.Assert.*;


public class PromptTest {

    Prompt prompt;
    @Before
    public void initializationSetup() {
        prompt = new Prompt("How many dogs?");
    }


    @Test
    public void promptUserTest() {
        String expectedValue = "How many dogs?";
        String actualValue =
    }
}
