class LFUCache {
    int order;
    int capacity; // for accounting the size of the hashmap
    HashMap<Integer, Integer> hm; // for storing the key value pair upon put
    HashMap<Integer, Integer> fm; // for storing the frequency of each key
    HashMap<Integer, Integer> orderMap; // for storing order in which keys were interacted
    public LFUCache(int capacity) {
        order = 0;
        this.capacity = capacity;
        hm = new HashMap<>();
        fm = new HashMap<>();
        orderMap = new HashMap<>();
    }
    
    public int get(int key) {
        if(hm.containsKey(key))
        {   
            orderMap.put(key, ++order);
            fm.put(key, fm.get(key) + 1);
            return hm.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(capacity == 0)
            return;
        if(hm.size() < capacity)
        {   orderMap.put(key, ++order);
            fm.put(key,fm.getOrDefault(key, 0) + 1 );
            hm.put(key,value);
            return;
        }
        while(!fm.containsKey(key) && fm.size() >= capacity)
        {int remove_key = -1;
        int min = Integer.MAX_VALUE;
        for(int tmpkey: fm.keySet())
        {
            if(fm.get(tmpkey) < min)
            {
                min = fm.get(tmpkey);
                remove_key = tmpkey;
            }
            if(fm.get(tmpkey) == min)
            {
                if(orderMap.get(tmpkey) < orderMap.get(remove_key))
                { min = fm.get(tmpkey);
                remove_key = tmpkey;
            }
            }
        }
        hm.remove(remove_key);
        fm.remove(remove_key);
        }
        orderMap.put(key, ++order);
        fm.put(key,fm.getOrDefault(key, 0) + 1 );
        hm.put(key,value);
        return;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
