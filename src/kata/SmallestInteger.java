package kata;

public class SmallestInteger {
    public static int findSmallestInt(int[] args) {
        int x = args[0];
        for (int i = 0; i < args.length; i++) {
            if (x > args[i]){
                x = args[i];
            }
        }
        return x;

    }

}
