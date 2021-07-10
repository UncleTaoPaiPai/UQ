public class class_09 {

    // 单链表
    public static class Node<V>{
        public V value;
        public Node<V> next;

        public Node(V value) {
            this.value = value;
            this.next = null;
        }
    }

    // 队列结构
    public static class MyQueue<V>{
        private Node<V> head;
        private Node<V> tail;
        private int size;

        public MyQueue() {
            head = null;
            tail = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }


    }

    public static void main(String[] args) {
    
    }
}
