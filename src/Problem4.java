import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Philip on 2/20/17.
 *
 * The key here is first sort and then use a greedy algorithm
 */
public class Problem4 {
    public static Problem4Meeting[] mergeMeetings (Problem4Meeting[] meetingTimes) {
        Arrays.sort(meetingTimes, new Comparator<Problem4Meeting>() {
            @Override
            public int compare(Problem4Meeting o1, Problem4Meeting o2) {
                return o1.startTime - o2.startTime;
            }
        });

        ArrayList<Problem4Meeting> mergedTimes = new ArrayList<>();

        mergedTimes.add(meetingTimes[0]);
        for (int i = 1; i < meetingTimes.length; i++) {
            Problem4Meeting lastMergedMeeting = mergedTimes.get(mergedTimes.size() - 1);
            Problem4Meeting curMeetingToAdd = meetingTimes[i];
            if (lastMergedMeeting.endTime < curMeetingToAdd.startTime) {
                mergedTimes.add(curMeetingToAdd);
            } else {
                lastMergedMeeting.endTime = Math.max(lastMergedMeeting.endTime, curMeetingToAdd.endTime);
            }
        }

        return mergedTimes.toArray(new Problem4Meeting[0]);
    }
}

