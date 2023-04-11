public class Car {

    public void start(){
        System.out.println("Відпрацювала кнопка запуску автомобіля");
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("Запустився бортовий компютер");
    };
    private void startCommand(){
        System.out.println("Виконалась команда запуску двигуна");
    };
    private void startFuelSystem(){
        System.out.println("Запустилась паливна система");
    };


}
