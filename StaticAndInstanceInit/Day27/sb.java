public class sb {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        /**
         *  // reference variable which is inside a fn. so local that means stack frame reference is there but object heap is in heap
         *  and as each thread has its own stack frame not shared so and heap reference available but since the reference is in stack
         *  no thread can access it
         */
        for (int i = 0; i < 100; i++) {
            System.out.println(sb.append(i).append(","));
        }
        String result = sb.toString();
    }       // non synchronised nd not thread safe but since a single thread is used so no point of overhead in this case.
       // no locking no extra time or time wastage
    /**
     * What is actually local
     *
     * The reference sb lives on the method’s stack frame. Each thread has its own stack, so no other
     * thread can see this reference.
     * The object it points to lives on the heap, and the heap is shared by all threads.
     *
     * So the heap object could be reached by another thread, but only if someone has a reference to it.
     * Since the only reference is sitting in your private stack frame, no other thread has any way to find it.
     */
}
