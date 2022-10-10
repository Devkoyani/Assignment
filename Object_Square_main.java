
public class Object_Square_main {

    public static void main(String[] args) {

        Square s1 = new Square();
        Square s2 = new Square(8.9);

        // Default Square
        System.out.println(s1.toString());
        s1.print();
        s1.howToColor();
        System.out.println();

        System.out.println(s2.toString());
        s2.print();
        s2.howToColor();

    }

}