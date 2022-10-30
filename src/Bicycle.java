public class Bicycle extends Venichle{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkVenichle() {
        System.out.println("Проверяем - " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
    }


}

