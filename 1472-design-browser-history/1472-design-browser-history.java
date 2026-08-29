class BrowserHistory {

    class Node{
        String url;
        Node next;
        Node prev;

        Node(String url){
            this.url = url;
            prev = next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        tail = head;
    }
    
    public void visit(String url) {
        Node newPage = new Node(url);
        tail.next = newPage;
        newPage.prev = tail;
        tail = newPage;
    }
    
    public String back(int steps) {
        while(steps-- > 0 && tail!=head){
            tail = tail.prev;
            // steps--;
        }
        return tail.url;
    }
    
    public String forward(int steps) {
        while(steps-- > 0 && tail.next != null){
            tail = tail.next;
            // steps--;
        }
        return tail.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */