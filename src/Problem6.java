/**
 * Created by plarie on 2/22/17.
 */
public class Problem6 {
    public static Problem6Rectangle rectangularLove (Problem6Rectangle rect1, Problem6Rectangle rect2) {
        Integer left = Math.max(rect1.leftX, rect2.leftX);
        Integer right = Math.min(rect1.leftX + rect1.width, rect2.leftX + rect2.width);
        Integer bottom = Math.max(rect1.bottomY, rect2.bottomY);
        Integer top = Math.min(rect1.bottomY + rect1.height, rect2.bottomY + rect2.height);

        if (left >= right || bottom >= top) {
            return null;
        }
        return new Problem6Rectangle(left, bottom, right - left, top - bottom);
    }
}
