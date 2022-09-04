import java.util.HashMap;
import java.util.ArrayList;

public class Linear {
    public static HashMap<String, Integer> Search(ArrayList<Integer> Array, int Target) {

        // Two vars
        int Index = 0;
        int Iter = 0;

        // Loop
        while (true) {
            Iter += 1;
            if (Array.get(Index) == Target) {
                break;
            }
            Index += 1;
        }

        // Stats
        HashMap<String, Integer> Stats = new HashMap<String, Integer>();
        Stats.put("Index", Index);
        Stats.put("Iterations", Iter);
        return Stats;
    }
}
