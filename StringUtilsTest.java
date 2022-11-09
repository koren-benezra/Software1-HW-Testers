import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Koren Ben Ezra
 */
class StringUtilsTest {

    @Test
    void findSortedSequence() {

        assertEquals(
                "not to",
                StringUtils.findSortedSequence("to be or not to be")
        );

        assertEquals(
                "an empty zoo",
                StringUtils.findSortedSequence("my mind is an empty zoo")
        );

        assertEquals(
                "",
                StringUtils.findSortedSequence("")
        );

        assertEquals(
                "andy bought candy",
                StringUtils.findSortedSequence("andy bought candy")
        );

        assertEquals(
                "is not not not",
                StringUtils.findSortedSequence("life is not not not fair")
        );

        assertEquals(
                "act",
                StringUtils.findSortedSequence("art act")
        );

        // ------------------------ New Tests ------------------------ //

        assertEquals(
                "a b c d e f g",
                StringUtils.findSortedSequence("a b c d e f g")
        );

        assertEquals(
                "a",
                StringUtils.findSortedSequence("g f e d c b a")
        );

        assertEquals(
                "aaa aab aac aba abb abc aca acb acc bcc ccc",
                StringUtils.findSortedSequence("aaa aab aac aba abb abc aca acb acc bcc ccc")
        );

        assertEquals(
                "aaa aaa aaa aaa aaa bbb ccc ddd",
                StringUtils.findSortedSequence("aaa aaa aaa aaa aaa bbb ccc ddd aaa")
        );

        assertEquals(
                "aaa zzz",
                StringUtils.findSortedSequence("aaa zzz g f e d c b a")
        );

    }

    @Test
    void isEditDistanceOne() {
        assertFalse(StringUtils.isEditDistanceOne("dog", "god"));


        assertTrue(StringUtils.isEditDistanceOne("x", "x"));

        assertTrue(StringUtils.isEditDistanceOne("main", "man"));

        assertTrue(StringUtils.isEditDistanceOne("ab", "cab"));

        // ------------------------ New Tests ------------------------ //

        assertFalse(StringUtils.isEditDistanceOne("aaaaaaaaa", "baaaaaaab"));

        assertFalse(StringUtils.isEditDistanceOne("kkkkkkkkk", ""));

        assertFalse(StringUtils.isEditDistanceOne("aa", "kk"));


        assertTrue(StringUtils.isEditDistanceOne("", ""));

        assertTrue(StringUtils.isEditDistanceOne("aaaaaaaab", "aaaaaaaaa"));

        assertTrue(StringUtils.isEditDistanceOne("aaaaaaaaa", "baaaaaaaa"));

        assertTrue(StringUtils.isEditDistanceOne("a", ""));



    }
}