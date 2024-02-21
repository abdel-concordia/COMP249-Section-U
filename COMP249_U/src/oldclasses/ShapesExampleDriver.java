package oldclasses;

public class ShapesExampleDriver {

    public static void main(String[] args) {

        //Triangle t1 = new Triangle("T1", 6, 9, 3);
        //Circle c1 = new Circle("C1", 3.5);
        final int NUMBER_OF_SHAPES = 3;
        Shape[] myShapes = new Shape[NUMBER_OF_SHAPES];

        myShapes[0] = new Triangle("T1", 6, 9, 3);
        myShapes[1] = new Circle("C1", 3.5);
        myShapes[2] = new Rectangle("R1", 2, 7);

//        for (int i = 0; i < NUMBER_OF_SHAPES; i++) {
//            System.out.println(myShapes[i].calculatePerimeter());
//        }
        Shape s1; // = new Shape("aaa");

        // Enhanced loop (foreach loop)
        for (Shape x : myShapes) {
            //x.setName("From enhanced loop");
            System.out.println(x);
        }
    }
}
