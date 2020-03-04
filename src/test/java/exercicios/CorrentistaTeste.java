package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
public class CorrentistaTeste {
    @Test
    public void criarObjetoCorrentista(){
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributo(){
        Correntista c1 = new Correntista();
        c1.codigo = 7500.0;
        c1.nome = "Vitinho Sampa";
        c1.email = "victor.hugo@ainfotec.com.br";
        c1.telefone = "12981878634";
        assertNotNull(c1.codigo);
        assertNotNull(c1.nome);
        assertNotNull(c1.email);
        assertNotNull(c1.telefone);
    }
}
