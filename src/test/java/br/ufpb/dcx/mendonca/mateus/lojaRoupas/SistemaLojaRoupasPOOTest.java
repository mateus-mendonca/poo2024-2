package br.ufpb.dcx.mendonca.mateus.lojaRoupas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaLojaRoupasPOOTest {

    @Test
    public void testaCadastroDeRoupa() {
        SistemaLojaRoupasPOO sistema = new SistemaLojaRoupasPOO();
        try {
            sistema.cadastraRoupa("001", "Camisa polo Azul Masculina", Tamanho.M, 10);
            Roupa r = sistema.pesquisaRoupa("001");
            assertEquals(10, r.getQuantidade());
            //TODO: COMPLETAR O TESTE
        } catch (RoupaJaExistenteException | RoupaInexistenteException e) {
            fail("Não deveria lançar exceção");
        }
    }
}
