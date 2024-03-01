import Bank.Account;

class Shape {
    String color;

    public void area() {
        System.out.println("Print area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        float area = (float) 0.5 * l * h;
        System.out.println(area);
    }
}

class EquilatralTriangle extends Triangle {
    public void area(int l, int h) {
        float area = (float) 0.5 * l * h;
        System.out.println(area);
    }
}

class Circle extends Shape {
    public void area(int r) {
        float area = (float) 3.14 * r * r;
        System.out.println(area);
    }
}

public class oops {
    public static void main(String[] args) {
        Triangle P1 = new Triangle();
        P1.color = "red";
    }
}
