package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class FuncionarioTeste {
    @Test
    public void criarObjetoFuncionario(){
        Funcionario f1 = new Funcionario();
        assertNotNull(f1);
    }

    @Test
    public void presencaAtributo(){
        Funcionario f1 = new Funcionario();
        f1.nome = "Vitinho Sampa";
        f1.email = "victor.hugo@ainfotec.com.br";
        f1.idade = 22;
        f1.salario = 2000.0;
        assertNotNull(f1.idade);
        assertNotNull(f1.nome);
        assertNotNull(f1.email);
        assertNotNull(f1.salario);
    }
    @Test
    public void metodoObterDados(){
        Funcionario f1 = new Funcionario();
        f1.nome = "Vitinho Sampa";
        f1.email = "victor.hugo@ainfotec.com.br";
        f1.idade = 22;
        String dadoEsperado = "Vitinho Sampa, 22 anos (victor.hugo@ainfotec.com.br)";
        String dadoObtido = f1.obterDados();
        assertEquals(dadoEsperado, dadoObtido);
    }

    @Test
    public void metodoPromover(){
        Funcionario f1 = new Funcionario();
        f1.salario = 2000.0;
        f1.promover(10.0);
        Double valorEsperado = 2200.0;
        Double valorObtido = f1.salario;
        assertEquals(valorEsperado, valorObtido);
    }
}
