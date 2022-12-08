package car.classes;

public class Car {
    private long id;
    private String numberCar;

    public Car(long id, String numberCar) {
        this.id = id;
        this.numberCar = numberCar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return  "\n=======================================================================" +
                "\n                             Car ----->>>>  " +
                "\n=======================================================================" +
                "\nID:          " + id +
                "\nNumber Car:  " + numberCar +
                '\n';
    }
}
