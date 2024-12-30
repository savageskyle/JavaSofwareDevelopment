import java.util.*;

/**
 * A custom implementation of the List interface using a doubly linked list as its internal structure.
 *
 * @param <T> The type of elements stored in the collection.
 */
public class TypedCollection<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Default constructor that creates an empty collection.
     */
    public TypedCollection() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Constructor that initializes the collection with a single element.
     *
     * @param element The element to add to the collection.
     */
    public TypedCollection(T element) {
        this();
        add(element);
    }

    /**
     * Constructor that initializes the collection with elements from another collection.
     *
     * @param collection The collection to add.
     */
    public TypedCollection(Collection<? extends T> collection) {
        this();
        for (T element : collection) {
            add(element);
        }
    }

    // Utility method to get a node at a specific index.
    private Node<T> getNodeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (T element : this) {
            if (Objects.equals(element, o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int index = 0;
        for (T element : this) {
            array[index++] = element;
        }
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < size) {
            a = (T1[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        }
        int index = 0;
        Object[] result = a;
        for (T element : this) {
            result[index++] = element;
        }
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean add(T t) {
        Node<T> newNode = new Node<>(t);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (Node<T> current = head; current != null; current = current.next) {
            if (Objects.equals(current.data, o)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T element : c) {
            add(element);
        }
        return !c.isEmpty();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("AddAll at index is not supported");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object element : c) {
            while (remove(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (Node<T> current = head; current != null; ) {
            Node<T> next = current.next;
            if (!c.contains(current.data)) {
                remove(current.data);
                modified = true;
            }
            current = next;
        }
        return modified;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        return getNodeAtIndex(index).data;
    }

    @Override
    public T set(int index, T element) {
        Node<T> node = getNodeAtIndex(index);
        T oldData = node.data;
        node.data = element;
        return oldData;
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException("Add at index is not supported");
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException("Remove at index is not supported");
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (Node<T> current = head; current != null; current = current.next) {
            if (Objects.equals(current.data, o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        for (Node<T> current = tail; current != null; current = current.prev) {
            if (Objects.equals(current.data, o)) {
                return index;
            }
            index--;
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("ListIterator is not supported");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("ListIterator at index is not supported");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("SubList is not supported");
    }
}
