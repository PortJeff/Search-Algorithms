import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Binary {
    public static HashMap<String, Integer> Search(ArrayList<Integer> Array, int Target) {

        // Two vars
        int Iter = 0;
        int Index = 0;

        List<Integer> Arr = Array;

        // Loop
        while (true) {
            Index = Arr.size() / 2;
            Iter += 1;
            System.out.println(Arr.get(Index) + ", " + Target);
            if (Arr.get(Index) > Target) {
                Arr = Arr.subList(0, Index);
            } else if (Arr.get(Index) < Target) {
                Arr = Arr.subList(Index, Arr.size());
            } else if (Arr.get(Index) == Target) {
                break;
            }
        }

        // Stats
        HashMap<String, Integer> Stats = new HashMap<String, Integer>();
        Stats.put("Index", Arr.get(Index));
        Stats.put("Iterations", Iter);
        return Stats;
    }
}
