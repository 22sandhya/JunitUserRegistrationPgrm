package com.bidgelabs.JunitTestProgram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class UserValidationTest 
{
   
    @Test
    public void firstNameValidator()
    {
        assertEquals(true,UserValidation.firstNameValidator());
    }
}
