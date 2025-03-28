package comp249_section_u;

public class LinkedList {

    private Node head; // MUST HAVE
    private Node tail; // Optional: good for performance if addAtTail is used frequently
    private int numberOfElements; // Optional: good for performance, mainly with getSize

    public LinkedList() {
        this.head = null;
        this.tail = null;
        numberOfElements = 0;
    }

    // Add
    // addAtHead (head will change)
    public void addAtHead(String value) {
        head = new Node(value, head);
        numberOfElements++;

        // If this is the first element, adjust tail
        if (numberOfElements == 1) {
            tail = head;
        }
    }

    // addAtTail
    public void addAtTail(String value) {
        // If this is the first element
        if (head == null) {
            addAtHead(value);
        } else {

            Node newNode = new Node(value, null);
            tail.setLink(newNode);
            tail = newNode;

            numberOfElements++;
        }
    }

    // addAfter
    public void addAfter(String referenceValue, String newValue) { // Might affect tail

        if (head == null) {
            System.out.println("The list is empty. Add after only works when there is at least one value.");
            return;
        }

        Node position = head;

        while (!position.getData().equals(referenceValue)) { // Watch out
            position = position.getLink();

            if (position == null) { // DId not find the reference value and reached end of list
                System.out.println("The refernce value " + referenceValue + " does not exist.");
                return;
            }
        }

        Node newNode = new Node(newValue, position.getLink());
        position.setLink(newNode);

        if (position == tail) {
            tail = newNode;
        }

        numberOfElements++;
    }

    // addBefore
    public void addBefore(String referenceValue, String newValue) { // Can affect the head

    }

    // Remove
    // removeFirst (remove the first element in the list) (head will change)
    public String removeFirst() { // Might affect the tail if the list has one element
        if (head == null) {
            return null; // Better, throw an Exception
        } else {
            String value = head.getData();
            head = head.getLink();
            numberOfElements--;

            if (numberOfElements == 0) { // Check this later
                tail = null;
            }
            return value;
        }
    }

    // removeLast (remove the last element in the list)
    public String removeLast() {
        if (head == null) {
            System.out.println("Cannot remove from an empty list.");
            return null;
        }
        if (numberOfElements == 1) {
            return removeFirst();
        } else {
            Node position = head;
            while (position.getLink() != tail) {
                position = position.getLink();
            }
            String value = tail.getData();
            position.setLink(null);
            tail = position;
            numberOfElements--;
            return value;
        }
    }

    // removeAfter
    // removeBefore
    // contains (returns true or false)
    // Display
    public void display() {
        if (head == null) {
            System.out.println("The list has no elements.");
        } else {
            System.out.println("Your list has " + numberOfElements + " elements:");
            Node position = head;
            while (position != null) {
                System.out.println(position);
                position = position.getLink();
            }
        }
    }

    // Return the size (number of elements in the linked list)
    public int getSize() { // Please review
        return numberOfElements;
    }
}
