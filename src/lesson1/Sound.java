package lesson1;

class Sound {
    public static void main(String args[]) {
        double timeToEcho = 7.2; // Время возврата эха в секундах
        double speedOfSound = 1100; // Скорость звука в футах в секунду

        // Расчет времени прохождения звука до объекта
        double timeToOneWay = timeToEcho / 2;

        // Расчет расстояния до объекта
        double distance = timeToOneWay * speedOfSound;

        System.out.println("Расстояние до объекта составляет " + distance + " футов.");
    }
}