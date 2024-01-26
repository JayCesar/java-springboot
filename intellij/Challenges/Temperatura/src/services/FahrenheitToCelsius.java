package services;

public class FahrenheitToCelsius implements TemperatureConverter {
    @Override
    public double FahrenheitToCelsius(double valueF) {
        final double x = 32;
        final double y = 5.0/9;
        return (valueF - x) * y;
    }
}
