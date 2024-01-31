package conceitos_basicos.temperatura;

public class TemperaturaConverter implements Converter{

    private double value;
    private String type;

    public TemperaturaConverter(double value, String type){
        this.value = value;
        this.type = type;
    }
    public TemperaturaConverter(){
    }

    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    @Override
    public double temperaturaConverter(double value, String type) {
        if (type.equals("c")) return (value - 32) / 1.8;
        else return (value * 1.8) + 32;
    }
}
