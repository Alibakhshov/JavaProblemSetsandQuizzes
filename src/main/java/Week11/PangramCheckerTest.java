package Week11;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PangramCheckerTest {
    private PangramChecker pangramChecker;

    @Before
    public void setUp() {
        pangramChecker = new PangramChecker();
    }

    @Test
    public void testSentenceEmpty() {
        assertFalse(pangramChecker.isPangram(""));
    }

    @Test
    public void testRecognizesPerfectLowerCasePangram() {
        assertTrue(pangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testPangramWithOnlyLowerCase() {
        assertTrue(pangramChecker.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void testMissingCharacterX() {
        assertFalse(pangramChecker.isPangram("a quick movement of the enemy will jeopardize five gunboats"));
    }

    @Test
    public void testAnotherMissingCharacterX() {
        assertFalse(pangramChecker.isPangram("the quick brown fish jumps over the lazy dog"));
    }

    @Test
    public void testPangramWithUnderscores() {
        assertTrue(pangramChecker.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    @Test
    public void testPangramWithNumbers() {
        assertTrue(pangramChecker.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    @Test
    public void testMissingLettersReplacedByNumbers() {
        assertFalse(pangramChecker.isPangram("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog"));
    }

    @Test
    public void testPangramWithMixedCaseAndPunctuation() {
        assertTrue(pangramChecker.isPangram("\"Five quacking"));}
}

