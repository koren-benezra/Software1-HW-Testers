import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Koren Ben Ezra
 */
class ArrayUtilsTest {

    @Test
    void shiftArrayCyclic() {


        assertArrayEquals(

                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'),
                new int[]{2, 3, 4, 5, 1});

        assertArrayEquals(
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'),
                new int[]{5, 1, 2, 3, 4});

        assertArrayEquals(
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'),
                new int[]{1, 2, 3, 4, 5});

        assertArrayEquals(
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'),
                new int[]{1, 2, 3, 4, 5});

        assertArrayEquals(
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'),
                new int[]{4, 5, 1, 2, 3});

        assertArrayEquals(
                ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'),
                new int[]{3, 4, 5, 1, 2});

        assertArrayEquals(
                ArrayUtils.shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'),
                new int[]{8, 9, 5, 6, 0});

        assertArrayEquals(
                ArrayUtils.shiftArrayCyclic(new int[]{}, 3, 'R'),
                new int[]{});

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