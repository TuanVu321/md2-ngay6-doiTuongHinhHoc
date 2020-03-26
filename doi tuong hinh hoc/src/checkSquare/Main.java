package checkSquare;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(2.3);
        System.out.println(square1);
        Square square2 = new Square("yeallow",true,5.8);
    }
}
