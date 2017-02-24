import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Philip on 2/20/17.
 */
public class TestProblem4 {
    @Test
    public void testProblem4a () {
        Problem4Meeting[] meetingTimes = new Problem4Meeting[] {
                new Problem4Meeting(0, 1),
                new Problem4Meeting(3, 5),
                new Problem4Meeting(4, 8),
                new Problem4Meeting(10, 12),
                new Problem4Meeting(9, 10)
        };

        Problem4Meeting[] expectedMergedTimes = new Problem4Meeting[] {
                new Problem4Meeting(0, 1),
                new Problem4Meeting(3, 8),
                new Problem4Meeting(9, 12)
        };
        assertArrayEquals(Problem4.mergeMeetings(meetingTimes), expectedMergedTimes);
    }
}
