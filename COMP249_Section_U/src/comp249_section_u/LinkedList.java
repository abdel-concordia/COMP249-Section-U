package comp249_section_u;

public class LinkedList {

    private Node head; // MUST HAVE
    private int numberOfElements; // Optional: good for performance, mainly with getSize

    public LinkedList() {
        this.head = null;
        numberOfElements = 0;
    }

    // Add
    // addAtHead (head will change)
    public void addAtHead(String value) {
        head = new Node(value, head);
        numberOfElements++;
        //Node newNode = new Node(value, head);
        //head = newNode;
    }

    // addAtTail
    public void addAtTail(String value) {
        if (head == null) {
            addAtHead(value);
        } else {
            // Reach the tail
            Node position = head;
            while (position.getLink() != null) {
                position = position.getLink();
            }
            Node newNode = new Node(value, null);
            position.setLink(newNode);
        }
    }

    // addAfter
    // addBefore
    // Remove
    // removeFirst (remove the first element in the list) (head will change)
    public String removeFirst() {
        if (head == null) {
            return null; // Better, throw an Exception
        } else {
            String value = head.getData();
            head = head.getLink();

            return value;
        }
    }

    // removeLast (remove the last element in the list)
    // removeAfter
    // removeBefore
    // Find
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
