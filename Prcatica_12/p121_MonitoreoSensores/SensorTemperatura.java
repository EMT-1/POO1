package Prcatica_12.p121_MonitoreoSensores;

public class SensorTemperatura implements Medible, Alertable {

    private double valor;
    private double minimo;
    private double maximo;

    public SensorTemperatura(double valor, double minimo, double maximo) {
        this.valor = valor;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    @Override
    public double leerValor() {
        return valor;
    }

    @Override
    public String getUnidad() {
        return "°C";
    }

    @Override
    public boolean estaEnAlerta() {
        return valor < minimo || valor > maximo;
    }
}