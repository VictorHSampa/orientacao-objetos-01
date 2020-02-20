package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {
    @Test
    public void criarObjetoRetangulo(){
        Retangulo r1 = new Retangulo();
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributoLado(){
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 5.0;
        assertNotNull(r1.base);
        assertNotNull(r1.altura);
    }

    @Test
    public void metodoCalcularArea() {
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 5.0;
        Double valorEsperado = 50.0;
        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 5.0;
        Double valorEsperado = 30.0;
        Double valorObtido = r1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
