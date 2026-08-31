class MyHashSet {
    int a[];

    public MyHashSet() {
        a = new int[10000001];
    }
    
    public void add(int key) {
        if(a[key]!=1){
            a[key]++;
        }
    }
    
    public void remove(int key) {
        if(a[key]!=0){
            a[key]--;
        }
        
    }
    
    public boolean contains(int key) {
       if(a[key]==1){
        return true;
       }
       return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */