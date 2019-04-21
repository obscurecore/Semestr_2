public class LList<T> {

    private final LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.add(data);
    }

    public T pop() {
        return linkedList.remove();
    }


}

class LinkedList<T> {

    private static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

    }

    private Node<T> first = null;

    public void add(T data) {
        Node<T> nFirst = new Node<T>(data);
        nFirst.next = first;
        first = nFirst;
    }

    public T remove() {
        Node<T> l = first;
        first = first.next;
        return l.data;

    }





}