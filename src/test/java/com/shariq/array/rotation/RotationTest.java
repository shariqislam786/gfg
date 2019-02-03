package com.shariq.array.rotation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RotationTest
{
    @Test
    public void testRotationReverse()
    {
        Reversal r = new Reversal();
        int input[] = {1, 2, 3, 4, 5, 6, 7};
        r.rotateArrayReversal(input, 2);
        int expectedOutput[] = {3, 4, 5, 6, 7, 1, 2};
        Assert.assertArrayEquals(expectedOutput, input);
    }
}
