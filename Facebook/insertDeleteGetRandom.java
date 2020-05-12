class RandomizedSet {
    List<Integer> num;
    HashMap<Integer, Integer> loc;
    Random rand;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        rand = new Random();
        num = new ArrayList<>();
        loc = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(loc.containsKey(val))
            return false;
        num.add(val);
        loc.put(val, num.size() - 1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!loc.containsKey(val))
            return false;
        int ind =loc.get(val);
        num.set(ind, num.get(num.size() - 1));
        loc.put(num.get(ind),ind);
        loc.remove(val);
        num.remove(num.size() - 1);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return num.get(rand.nextInt(num.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
