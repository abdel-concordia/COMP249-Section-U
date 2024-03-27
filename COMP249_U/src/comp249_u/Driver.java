package comp249_u;

public class Driver {

    public static void main(String[] args) {

        OurLinkedList list1 = new OurLinkedList();

        list1.addAtHead(5);
        list1.addAtEnd(25);
        list1.addAfter(25, 80);
        //int value = list1.removeHead();
        //int value = list1.removeEnd();
        int value = list1.removeAfter(80);
        //System.out.println(value);
        //System.out.println(value);
        //list1.addAtEnd(30);
        //list1.addAtHead(10);
        list1.display();
    }

}
