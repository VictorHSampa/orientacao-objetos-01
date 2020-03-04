package exercicios;

public class Circulo {
    public Double raio;
    public Double pi = 3.14;

    public Double calculaArea() {

        return pi*(raio*raio);
    }

    public Double calcularPerimetro() {

        return (pi*raio)*2;
    }
}
