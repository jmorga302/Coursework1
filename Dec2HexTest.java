import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class Dec2HexTest {

    public Dec2HexTest()
   {}
    Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

    @Test
    public void testDec2Hex() {
        assertEquals("converting an integer should work", "C", dec2Hex.convertToHex("12"));
    }

    @Test
    public void test0ToHex() {
        assertEquals("zero converted to hex should be zero", "0", dec2Hex.convertToHex("0"));
    }

    @Test
    public void testNegToHex() {
        assertEquals("negative values converted to hex should be correct", "-37", dec2Hex.convertToHex("-55"));
        assertEquals("negative values converted to hex should be correct", "-1D", dec2Hex.convertToHex("-29"));
    }

    @Test
    public void testEmptyToHex() {
        assertEquals("if there is no argument being passed then an error message should be passed", "invalid input", dec2Hex.convertToHex(""));
        assertEquals("if a null argument being passed then an error message should be passed", "invalid input", dec2Hex.convertToHex(" "));
    }

    @Test
    public void testInvalidToHex() {
        assertEquals("if an invalid argument such as a string is entered an invalid message should be displayed", "invalid input", dec2Hex.convertToHex("&*("));
        assertEquals("if an invalid argument such as a string is entered an invalid message should be displayed", "invalid input", dec2Hex.convertToHex("seven"));
    }

}
