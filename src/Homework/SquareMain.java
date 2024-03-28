package Homework;

class Square {
    private int side; // Сторона квадрата

    // Конструктор для инициализации стороны квадрата
    public Square(int side) {
        this.side = side;
    }

    // Метод для вычисления площади квадрата
    public int calculateArea() {
        return side * side;
    }
}

// Главный класс
public class SquareMain {
    public static void main(String[] args) {
        // Создаем объект "Квадрат" со стороной 5
        Square square = new Square(5);

        // Вычисляем площадь квадрата
        int area = square.calculateArea();

        // Выводим площадь квадрата
        System.out.println("Площадь квадрата: " + area);
    }
}
