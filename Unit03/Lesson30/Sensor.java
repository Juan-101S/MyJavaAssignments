public abstract class Sensor {
    private String name;
    private int modelNumber;

    private String getName() {
        return name;
    }

    private void setName(String newName) {
        this.name = newName;
    }

    private int getModelNumber() {
        return modelNumber;
    }

    private void setModelNumber(int newModelNumber) {
        this.modelNumber = newModelNumber;
    }

    public abstract void recordMeasurement();
}