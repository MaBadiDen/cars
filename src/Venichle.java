public class Venichle {

    private String modelName;
    private int wheelsCount;

    public Venichle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("������ ��������");
    }

    public void checkEngine() {
        System.out.println("��������� ���������");
    }

    public void checkTrailer() {
        System.out.println("��������� ������");
    }
}
