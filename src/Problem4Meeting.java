/**
 * Created by Philip on 2/21/17.
 */
public class Problem4Meeting {

    int startTime;
    int endTime;

    public Problem4Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }

    public String toString() {
        return String.format("(%d, %d)", startTime, endTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem4Meeting that = (Problem4Meeting) o;

        if (startTime != that.startTime) return false;
        return endTime == that.endTime;
    }

    @Override
    public int hashCode() {
        int result = startTime;
        result = 31 * result + endTime;
        return result;
    }
}