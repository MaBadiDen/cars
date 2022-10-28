public class ServiceStationForCars implements ServiceStation {

    @Override
    public void checkCar(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    @Override
    public void checkTruck(Truck truck) {

    }

    @Override
    public void checkBicycle(Bicycle bicycle) {

    }
}