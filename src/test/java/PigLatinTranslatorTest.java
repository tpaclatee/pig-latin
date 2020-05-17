import org.junit.Before;
//import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTranslatorTest {

    private PigLatinTranslator pigLatinTranslator;

    @Before
    public void setup() {
        setPigLatinTranslator(new PigLatinTranslator());
    }

    @Test
    public void testWordBeginningWithA() {
        assertEquals("appleay", PigLatinTranslator.translate("apple"));
    }


    @Test
    public void testWordBeginningWithE() {
        assertEquals("earay", PigLatinTranslator.translate("ear"));
    }


    @Test
    public void testWordBeginningWithI() {
        assertEquals("iglooay", PigLatinTranslator.translate("igloo"));
    }


    @Test
    public void testWordBeginningWithO() {
        assertEquals("objectay", PigLatinTranslator.translate("object"));
    }


    @Test
    public void testWordBeginningWithU() {
        assertEquals("underay", PigLatinTranslator.translate("under"));
    }


    @Test
    public void testWordBeginningWithVowelAndFollowedByQu() {
        assertEquals("equalay", PigLatinTranslator.translate("equal"));
    }


    @Test
    public void testWordBeginningWithP() {
        assertEquals("igpay", PigLatinTranslator.translate("pig"));
    }


    @Test
    public void testWordBeginningWithK() {
        assertEquals("oalakay", PigLatinTranslator.translate("koala"));
    }


    @Test
    public void testWordBeginningWithX() {
        assertEquals("enonxay", PigLatinTranslator.translate("xenon"));
    }


    @Test
    public void testWordBeginningWithQWithoutAFollowingU() {
        assertEquals("atqay", PigLatinTranslator.translate("qat"));
    }


    @Test
    public void testChTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("airchay", PigLatinTranslator.translate("chair"));
    }


    @Test
    public void testQuTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("eenquay", PigLatinTranslator.translate("queen"));
    }


    @Test
    public void testQuAndAPrecedingConsonantTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("aresquay", PigLatinTranslator.translate("square"));
    }


    @Test
    public void testThTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("erapythay", PigLatinTranslator.translate("therapy"));
    }


    @Test
    public void testThrTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("ushthray", PigLatinTranslator.translate("thrush"));
    }


    @Test
    public void testSchTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("oolschay", PigLatinTranslator.translate("school"));
    }


    @Test
    public void testYtTreatedLikeAVowelAtTheBeginningOfAWord() {
        assertEquals("yttriaay", PigLatinTranslator.translate("yttria"));
    }


    @Test
    public void testXrTreatedLikeAVowelAtTheBeginningOfAWord() {
        assertEquals("xrayay", PigLatinTranslator.translate("xray"));
    }


    @Test
    public void testYTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("ellowyay", PigLatinTranslator.translate("yellow"));
    }


    @Test
    public void testYTreatedLikeAVowelAtTheEndOfAConsonantCluster() {
        assertEquals("ythmrhay", PigLatinTranslator.translate("rhythm"));
    }


    @Test
    public void testYAsSecondLetterInTwoLetterWord() {
        assertEquals("ymay", PigLatinTranslator.translate("my"));
    }


    @Test
    public void testAWholePhrase() {
        assertEquals("ickquay astfay unray", PigLatinTranslator.translate("quick fast run"));
    }

	public PigLatinTranslator getPigLatinTranslator() {
		return pigLatinTranslator;
	}

	public void setPigLatinTranslator(PigLatinTranslator pigLatinTranslator) {
		this.pigLatinTranslator = pigLatinTranslator;
	}
}
