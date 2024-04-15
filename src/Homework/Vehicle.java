package Homework;

class Vehicle {
    private int passengers; // количество пассажиров
    private int fuelcap;    // объем топливного бака в галлонах
    private int mpg;        // потребление топлива в милях на галлон

    // Конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Возвратить дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Вычислить объем топлива, требующегося для прохождения заданного пути
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }
}

// Расширение класса Vehicle для грузовиков
class Truck extends Vehicle {
    private int cargocap; // грузоподъемность в фунтах

    // Конструктор класса Truck
    Truck(int p, int f, int m, int c) {
        super(p, f, m); // Инициализация членов класса Vehicle
        cargocap = c;
    }

    // Методы доступа к переменной cargocap
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}

// Класс, описывающий внедорожники
class OffRoad extends Vehicle {
    private int groundClearance; // дорожный просвет в дюймах

    // Конструктор класса OffRoad
    OffRoad(int p, int f, int m, int gc) {
        super(p, f, m);
        groundClearance = gc;
    }

    // Методы доступа к переменной groundClearance
    int getGroundClearance() { return groundClearance; }
    void setGroundClearance(int gc) { groundClearance = gc; }
}

// Демонстрационный класс для показа функциональности
class VehicleDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        OffRoad jeep = new OffRoad(4, 15, 12, 10);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти " + semi.getCargo() +
                " фунтов. Для преодоления " + dist +
                " миль грузовику требуется " + gallons + " галлонов топлива.\n");

        gallons = jeep.fuelneeded(dist);
        System.out.println("Джип с дорожным просветом " + jeep.getGroundClearance() +
                " дюймов. Для преодоления " + dist +
                " миль джипу требуется " + gallons + " галлонов топлива.");
    }
}
