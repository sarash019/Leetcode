class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int it : nums){
            heap.add(it);
        }

        int element = 0;
        for(int i = 0; i < k; i++){
            element = heap.poll();
        }

        return element;
    }
}