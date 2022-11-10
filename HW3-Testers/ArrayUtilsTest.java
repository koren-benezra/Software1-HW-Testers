import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Koren Ben Ezra
 */
class ArrayUtilsTest {

    @Test
    void shiftArrayCyclic() {

        assertArrayEquals(

                new int[]{2, 3, 4, 5, 1},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'));

        assertArrayEquals(
                new int[]{5, 1, 2, 3, 4},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'));

        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'));

        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'));

        assertArrayEquals(
                new int[]{4, 5, 1, 2, 3},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'));

        assertArrayEquals(
                new int[]{3, 4, 5, 1, 2},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'));

        assertArrayEquals(
                new int[]{8, 9, 5, 6, 0},
                ArrayUtils.shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'));

        assertArrayEquals(
                new int[]{},
                ArrayUtils.shiftArrayCyclic(new int[]{}, 3, 'R'));


        // ------------------------ New Tests ------------------------ //

        assertArrayEquals(
                new int[]{4, 5, 6, 1, 2, 3},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5, 6}, 3, 'R'));

        assertArrayEquals(
                new int[]{5, 6, 1, 2, 3, 4},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5, 6}, 2, 'R'));

        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5, 6}, 0, 'R'));

        assertArrayEquals(
                new int[]{},
                ArrayUtils.shiftArrayCyclic(new int[]{}, 10000, 'R'));
    }


    @org.junit.jupiter.api.Test
    void findShortestPath() {

        assertEquals(-1,
                ArrayUtils.findShortestPath(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 0, 1));

        assertEquals(0,
                ArrayUtils.findShortestPath(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 1, 1));

        assertEquals(2,
                ArrayUtils.findShortestPath(new int[][]{{0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {1, 0, 0, 0}}, 0, 2));

        assertEquals(2,
                ArrayUtils.findShortestPath(new int[][]{{0, 1, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 1, 0}}, 0, 2));

    }
}