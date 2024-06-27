import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LanternFish {
    public static void main(String[] args) {

        int[] array = {4,1,1,4,1,2,1,4,1,3,4,4,1,5,5,1,3,1,1,1,4,4,3,1,5,3,1,2,5,1,1,5,1,1,4,1,1,1,1,2,1,5,3,4,4,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,5,1,1,1,4,1,2,3,5,1,2,2,4,1,4,4,4,1,2,5,1,2,1,1,1,1,1,1,4,1,1,4,3,4,2,1,3,1,1,1,3,5,5,4,3,4,1,5,1,1,1,2,2,1,3,1,2,4,1,1,3,3,1,3,3,1,1,3,1,5,1,1,3,1,1,1,5,4,1,1,1,1,4,1,1,3,5,4,3,1,1,5,4,1,1,2,5,4,2,1,4,1,1,1,1,3,1,1,1,1,4,1,1,1,1,2,4,1,1,1,1,3,1,1,5,1,1,1,1,1,1,4,2,1,3,1,1,1,2,4,2,3,1,4,1,2,1,4,2,1,4,4,1,5,1,1,4,4,1,2,2,1,1,1,1,1,1,1,1,1,1,1,4,5,4,1,3,1,3,1,1,1,5,3,5,5,2,2,1,4,1,4,2,1,4,1,2,1,1,2,1,1,5,4,2,1,1,1,2,4,1,1,1,1,2,1,1,5,1,1,2,2,5,1,1,1,1,1,2,4,2,3,1,2,1,5,4,5,1,4};
        List<Integer> lanternList = new ArrayList<Integer>();
        for (int s : array) {
            lanternList.add(s);
        }
        int days = 80;
        int added = 0;
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < lanternList.size(); j++) {
                int count = lanternList.get(j);

                if (added > 0 && j == lanternList.size() - added) {
                    added--;
                    continue;
                } else {
                    lanternList.set(j, count - 1);
                }

                if (count <= 0) {
                    lanternList.set(j, 6);
                    lanternList.add(8);
                    added++;

                }

            }

        }

        System.out.println("Total number of fish : "+lanternList.size());
    }
}
