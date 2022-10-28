public class ServiceStationForBicycles implements ServiceStation {
    @Override
    public void checkCar(Car car) {

    }

    @Override
    public void checkTruck(Truck truck) {

    }

    @Override
    public void checkBicycle(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
}
