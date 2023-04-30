import org.junit.jupiter.api.Test;
import org.masrikdahir.LongestCommonSubsequence;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class TestLongestCommonSubsequence {

    LongestCommonSubsequence longestCommonSubsequence= new LongestCommonSubsequence();

    @Test
    public void testLcs_emptyStrings() {
        int lcs = longestCommonSubsequence.lcs("", "");
        assertEquals(0, lcs);
    }

    @Test
    public void testLcs_oneEmptyString() {
        int lcs = longestCommonSubsequence.lcs("abc", "");
        assertEquals(0, lcs);
    }

    @Test
    public void testLcs_noCommonSubsequence() {
        int lcs = longestCommonSubsequence.lcs("abc", "def");
        assertEquals(0, lcs);
    }

    @Test
    public void testLcs_withCommonSubsequence() {
        int lcs = longestCommonSubsequence.lcs("abcdef", "abcxef");
        assertEquals(5, lcs);
    }

    @Test
    public void testLcs_identicalStrings() {
        int lcs = longestCommonSubsequence.lcs("abc", "abc");
        assertEquals(3, lcs);
    }
}
