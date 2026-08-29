class LRUCache {

    class Node{
        Node prev;
        Node  next;
        int key;
        int val;
        
        Node(int k, int v){
            this.key = k;
            this.val = v;
            prev = next = null;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    HashMap<Integer, Node> map = new HashMap<>();
    int limit;

    public void insert(Node newNode){
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }

    public void delete(Node newNode){
        newNode.next.prev = newNode.prev;
        newNode.prev.next = newNode.next;
    }

    public LRUCache(int capacity) {
        limit = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node ansNode = map.get(key);
        int ans = ansNode.val;
        map.remove(key);
        delete(ansNode);
        insert(ansNode);
        map.put(key, ansNode);
        return ans;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node oldNode = map.get(key);
            map.remove(key);
            delete(oldNode);
        }

        if(map.size() == limit){
            Node lru = tail.prev;
            map.remove(lru.key);
            delete(lru);
        }

        Node newNode = new Node(key, value);
        
        insert(newNode);
        map.put(key, newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */