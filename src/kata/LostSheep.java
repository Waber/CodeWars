package kata;

public class LostSheep {
    public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {

        int x = 0;
        for (int i:fridayNightCounting) {
            x += i;
        }
        for (int i : saturdayNightCounting) {
            x += i;
        }
        return sheepsTotal - x;
    }
}
