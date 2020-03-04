package exercicios;

public class Circulo {
    public Double raio;

    public Double calculaArea() {

        return 3.0*(raio*raio);
    }

    public Double calculaPerimetro() {
        return (raio * 3.0) * 2;
    }
}
