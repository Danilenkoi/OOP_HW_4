package transport;

public class Car extends Transport<DriverB> {

    public Car (String brand, String model, double engineVolume, DriverB driver){
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void startMove(){
        System.out.println("Автомобиль - " + getBrand() + " начал движение");
    }
    @Override
    public void finishMove(){
        System.out.println("Автомобиль - " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп");
    }

    @Override
    public void theBestLepTime(){
        int minBound = 90;
        int maxBound = 200;
        int theBestLep = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("лучший круг! " + theBestLep);
    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 210;
        int theBestSpeed = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("максимальная скорость " + theBestSpeed);
    }
}
