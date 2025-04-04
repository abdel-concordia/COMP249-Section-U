package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        DLinkedList dList = new DLinkedList();

        dList.addAtHead("1");
        dList.addAfter("1", "5");

        dList.displayForward();
        dList.displayBackward();
    }
}
