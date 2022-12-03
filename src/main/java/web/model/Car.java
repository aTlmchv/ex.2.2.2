package web.model;

import java.util.Objects;

public class Car {
    private String nameCar;
    private int series;
    private String typeOfEngine;

    public Car() {
    }

    public Car(String nameCar, int series, String typeOfEngine) {
        this.nameCar = nameCar;
        this.series = series;
        this.typeOfEngine = typeOfEngine;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(nameCar, car.nameCar) && Objects.equals(typeOfEngine, car.typeOfEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCar, series, typeOfEngine);
    }

    @Override
    public String toString() {
        return  "nameCar = '" + nameCar + '\'' +
                ", series = " + series +
                ", typeOfEngine = '" + typeOfEngine + '\'' +
                '}';
    }
}
