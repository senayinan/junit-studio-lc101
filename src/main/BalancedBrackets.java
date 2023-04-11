package main;


import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBrackets {

    @Test
    public void emptyTest() {assertEquals(true,true);}

    @Test
    public void onlyBracketsReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void bracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void bracketsOfBracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }

    @Test
    public void tripleBracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void twoTripleBracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void BracketsWithSomethingElseReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[somethingElse]"));
    }
    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyCloseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void misMatchedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void unEqualBracketsWithSomethingElseReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[somethingElse[]"));
    }




    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
            if(brackets<0) return false;
        }
        return brackets == 0;
    }
}
