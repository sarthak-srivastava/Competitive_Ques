public class Solution {
           private int capacity;
        private Deque<Integer> list;
        private Map<Integer, Integer> map;
    public Solution(int capacity) {
         this.capacity = capacity;
            this.list = new LinkedList<>();
            this.map = new HashMap<>();
        
    }
    
    public int get(int key) {
            if (map.containsKey(key)) {
                list.remove(Integer.valueOf(key));
                list.addFirst(key);
            }
            Integer value = map.get(key);
            if (value == null)
                return -1;
            else return value;
    }
    
    public void set(int key, int value) {
             if (map.containsKey(key)) {
                list.remove(Integer.valueOf(key));
                list.addFirst(key);
            } else if (list.size() >= capacity){
                int evicted = list.removeLast();
                map.remove(evicted);
                list.addFirst(key);
            } else {
                list.addFirst(key);
            }
            map.put(key, value);
    }
}
