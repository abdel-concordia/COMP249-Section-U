package comp249_u;

public class OurLinkedList {

    private Node head;
    //private Node tail;
    private int size;

    public OurLinkedList() {
        head = null;
    }

    // Add at head
    public void addAtHead(int newValue) {
        head = new Node(newValue, head);
        size++;
    }

    // Add at end
    public void addAtEnd(int newValue) {
        if (head == null) {
            addAtHead(newValue);
        } else {
            Node position = head;
            while (position.next != null) {
                position = position.next;
            }
            position.next = new Node(newValue, null);
            size++;
        }
    }

    // Add after: If the threshold value does not exist, we don't add
    public void addAfter(int value, int newValue) {
        Node position = head;
        while (position != null && position.value != value) {
            position = position.next;
        }
        if (position != null) {
            position.next = new Node(newValue, position.next);
            size++;
        }
    }

    // Add before a value
    // Remove head
    public int removeHead() {
        if (head == null) {
            return -1;
        } else {
            Node temp = head;
            head = head.next;
            size--;
            return temp.value;
        }
    }

    // Remove end
    public int removeEnd() {
        if (head == null) {
            return -1;
        } else if (size == 1) {
            int value = head.value;
            head = null;
            size--;
            return value;
        } else {
            Node position = head;
            while (position.next.next != null) {
                position = position.next;
            }
            int value = position.next.value;
            position.next = null;
            size--;
            return value;
        }
    }

    // Remove a specific value
    // Remove after
    public int removeAfter(int value) {
        if (head == null) {
            return -1;
        } else if (size == 1) {
            return -1;
        } else {
            Node position = head;
            while (position != null && position.value != value) {
                position = position.next;
            }
            if (position == null || position.next == null) {
                return -1;
            } else {
                int tempValue = position.next.value;
                position.next = position.next.next;
                return tempValue;
            }
        }
    }

    // Get size (number of nodes in the linked list)
    public int getSize() {
        return size;
    }

    // Display content of the linked list
    public void display() {
        if (size == 0) {
            System.out.println("Your list is empty.");
        } else {
            System.out.println("Your list has " + size + " element(s): ");
            Node position = head;
            while (position != null) {
                System.out.println(position.value);
                position = position.next;
            }
        }
    }

    class Node {

        private int value;
        private Node next;

        public Node() {
            value = 0;
            next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
