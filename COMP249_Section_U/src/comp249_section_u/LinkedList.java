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
            tail.link = newNode;
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

        while (!position.data.equals(referenceValue)) { // Watch out
            position = position.link;

            if (position == null) { // DId not find the reference value and reached end of list
                System.out.println("The refernce value " + referenceValue + " does not exist.");
                return;
            }
        }

        Node newNode = new Node(newValue, position.link);
        position.link = newNode;

        if (position == tail) {
            tail = newNode;
        }

        numberOfElements++;
    }

    // addBefore
    public void addBefore(String referenceValue, String newValue) { // Can affect the head

        if (head == null) {
            System.out.println("Your list is empty. Cannot add before.");
        } else if (head.data.equals(referenceValue)) {
            addAtHead(newValue);
        } else {
            Node position = head;
            while (position.link != null && !position.link.data.equals(referenceValue)) {
                position = position.link;
            }
            // Did not find the reference value
            if (position.link == null) {
                System.out.println("Your reference value to add before does not exist.");
            } else {// Did find the reference value
                Node newNode = new Node(newValue, position.link);
                position.link = newNode;
                numberOfElements++;
            }
        }
    }

    // Remove
    // removeFirst (remove the first element in the list) (head will change)
    public String removeFirst() { // Might affect the tail if the list has one element
        if (head == null) {
            return null; // Better, throw an Exception
        } else {
            String value = head.data;
            head = head.link;
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
            while (position.link != tail) {
                position = position.link;
            }
            String value = tail.data;
            position.link = null; // position.setLink(x) --> position.link = x
            tail = position;
            numberOfElements--;
            return value;
        }
    }

    // removeAfter
    public String removeAfter(String referenceValue) {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Node position = head;
            while (position.link != null && !position.data.equals(referenceValue)) {
                position = position.link;
            }

// Reference value not found
            if (position.link == null) {
                System.out.println("There is no value after " + referenceValue);
                return null; // throw an exception
            } else {// Reference value found

                // Is the element to remove is the tail?
                if (position == tail) {

                }
            }
        }
    }

    // removeBefore
    // contains (returns true or false)
    public boolean contains(String value) { // checkes if the list contains a specific value/data
        Node position = head;
        while (position != null) {
            if (position.data.equals(value)) {
                return true;
            }
            position = position.link;
        }
        return false;
    }

    // get element at specific index
    public String get(int index) {
        if (index >= numberOfElements) {
            System.out.println("The index is bigger than the number of elements.");
            return null; // or throw an exception
        } else {
            Node position = head;
            for (int i = 0; i < index; i++) {
                position = position.link;
            }
            return position.data; // watch out if not immutable
        }
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("The list has no elements.");
        } else {
            System.out.println("Your list has " + numberOfElements + " elements:");
            Node position = head;
            while (position != null) {
                System.out.println(position);
                position = position.link;
            }
        }
    }

    // Return the size (number of elements in the linked list)
    public int getSize() {
        return numberOfElements;
    }

    // Node is a private inner class of LinkedList
    //
    private class Node {

        private String data;
        private Node link;

        public Node(String data, Node link) {
            this.data = data;
            this.link = link;
        }

        @Override
        public String toString() {
            return "Data is: " + this.data;
        }

        @Override
        public boolean equals(Object otherObject) {
            Node otherData = (Node) otherObject;
            return this.data.equals(otherData.data);
        }
    }
}

class A {

    private class B {

        private int x;
    }
}
