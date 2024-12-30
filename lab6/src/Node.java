/**
 * Represents a node in a doubly linked list.
 *
 * @param <T> The type of the data stored in the node.
 */
public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    /**
     * Constructor to create a new node.
     *
     * @param data The data to store in the node.
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
