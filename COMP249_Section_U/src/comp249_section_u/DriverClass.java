package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();

        myList.addAtTail("1");
        myList.addAtTail("2");
        myList.addAtTail("3");
        //String value = myList.removeFirst();
        //System.out.println(value);
        //myList.addBefore("2", "10");
        //myList.addAtTail("7");
        String data = myList.get(7);
        System.out.println(data);
        myList.display();
    }

}
