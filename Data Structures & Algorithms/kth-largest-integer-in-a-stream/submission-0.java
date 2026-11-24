class KthLargest {
    private int k;
    private PriorityQueue<Integer> queue = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num : nums) {
            if(queue.size() < k) {
                queue.add(num);
            } else {
                if(num > queue.peek()) {
                    queue.poll();
                    queue.add(num);
                }
            }
        }
    }
    
    public int add(int val) {
        if(queue.size() < k) {
            queue.add(val);
        } else {
            if(val > queue.peek()) {
                queue.poll();
                queue.add(val);
            }
        }
        return queue.peek();
    }
}
