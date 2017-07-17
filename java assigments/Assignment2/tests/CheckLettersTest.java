import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 16/7/17.
 */
public class CheckLettersTest {
    @Test
    public void Test1() throws Exception {
        CheckLetters check = new CheckLetters();
        assertEquals(true,check.checker("abcDefgHijKlMnopQrstuVwXyz"));
    }

    @Test
    public void Test2() throws Exception {
        CheckLetters check = new CheckLetters();
        assertEquals(false,check.checker("THIS IS A TEST CASE WITHOUT ALL ALPHABETS"));
    }

    @Test
    public void Test3() {
        CheckLetters check = new CheckLetters();
        assertEquals(true,check.checker("qwertyuiopasdfghjklzxcvbnm"));
    }

    @Test
    public void Test4() throws Exception {
        CheckLetters check = new CheckLetters();
        assertEquals(true,check.checker("1a2b3c5d66e76rf56ghijklmnopqrstuvwxyz1"));
    }
}