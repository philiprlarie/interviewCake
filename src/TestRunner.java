import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Philip on 2/20/17.
 */
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(new Class[] {
                TestProblem1.class,
                TestProblem2.class,
                TestProblem3.class,
                TestProblem4.class,
                TestProblem5.class
        });

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}