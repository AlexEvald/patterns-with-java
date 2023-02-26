package chain;

import chain.enums.WashState;

import java.util.Objects;

public class Car {
    private final String type;
    private final String color;
    private final int horsePower;

    private WashState state;

    public Car(String type, String color, int horsePower) {
        this.type = type;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public WashState getState() {
        return state;
    }

    public Car updateState(WashState state) {
        this.state = state;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(type, car.type) && Objects.equals(color, car.color) && state == car.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, horsePower, state);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", state=" + state +
                '}';
    }
}
