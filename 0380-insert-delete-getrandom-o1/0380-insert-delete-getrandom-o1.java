class RandomizedSet {

    Map<Integer, Integer> map;
    public RandomizedSet() {
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val, 1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            map.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        List<Integer> valuesList = new ArrayList<Integer>(map.keySet());
        int randomIndex = new Random().nextInt(valuesList.size());
        return valuesList.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */