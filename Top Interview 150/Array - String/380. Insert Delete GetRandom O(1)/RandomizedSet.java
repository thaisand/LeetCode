import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomizedSet {
    private List<Integer> vals;
    private Random rand;

    public RandomizedSet() {
        vals = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (!vals.contains(val)) {
            vals.add(val);
            return true;
        }
        return false;

    }

    public boolean remove(int val) {
        if (vals.contains(val)) {
            vals.remove(Integer.valueOf(val));
            return true;
        }
        return false;

    }

    public int getRandom() {
        int randomIndex = rand.nextInt(vals.size()); // Generate a random index
        return vals.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */