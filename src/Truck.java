public class Truck extends Venichle{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkVenichle() {
        System.out.println("Проверяем - " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}