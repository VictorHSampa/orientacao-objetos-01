package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {
    @Test
    public void criarObjetoCirculo(){
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos(){
        Circulo c1 = new Circulo();
        c1.raio = 20.0;
        assertNotNull(c1.raio);
    }

    @Test
    public void metodoCalcularArea(){
        Circulo c1 = new Circulo();
        c1.raio = 20.0;
        Double valorEsperado = 1200.0;
        Double valorObtido = c1.calculaArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro(){
        Circulo c1 = new Circulo();
        c1.raio = 10.00;
        Double valorEsperado = 60.0;
        Double valorObtido = c1.calculaPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
