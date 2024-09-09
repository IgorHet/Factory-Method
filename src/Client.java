public class Client {
    public void run() {
        // Создание фабрик
        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();

        // Создание транспортных средств с помощью фабрик
        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        // Вызов метода move() для каждого транспортного средства
        car.move();     // Ожидаемый вывод: "Автомобиль едет по дороге."
        plane.move();   // Ожидаемый вывод: "Самолет летит в небе."
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}