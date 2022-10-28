public class ServiceStationForTrucks implements ServiceStation {
    @Override
    public void checkCar(Car car) {

    }

    @Override
    public void checkTruck(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

    @Override
    public void checkBicycle(Bicycle bicycle) {

    }
}
