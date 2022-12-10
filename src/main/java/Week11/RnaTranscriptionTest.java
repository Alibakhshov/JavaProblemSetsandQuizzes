package Week11;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RnaTranscriptionTest {
private RnaTranscription rnaTranscription;

    @Before
    public void setup() {
        rnaTranscription = new RnaTranscription();
    }

    @Test
    public void testEmptyRnaSequence() {
        assertEquals("", rnaTranscription.transcribe(""));
    }

    @Test
    public void testRnaComplementOfCytosineIsGuanine() {
        assertEquals("G", rnaTranscription.transcribe("C"));
    }

    @Test
    public void testRnaComplementOfGuanineIsCytosine() {
        assertEquals("C", rnaTranscription.transcribe("G"));
    }

    @Test
    public void testRnaComplementOfThymineIsAdenine() {
        assertEquals("A", rnaTranscription.transcribe("T"));
    }

    @Test
    public void testRnaComplementOfAdenineIsUracil() {
        assertEquals("U", rnaTranscription.transcribe("A"));
    }
}

