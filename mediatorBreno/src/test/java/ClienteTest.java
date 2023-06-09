import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarAtendente() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Atendente agradece pelo elogio: Excelente atendimento",
                cliente.elogiarAtendente("Excelente atendimento"));
    }

    @Test
    void deveReclamarAtendente() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Atendente vai encaminhar a reclamação para o setor responsável: Atraso na entrega do pedido",
                cliente.reclamarAtendente("Atraso na entrega do pedido"));
    }

    @Test
    void deveSugerirAtendente() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Atendente vai encaminhar a sugestão para análise: Adicionar novos produtos ao catálogo",
                cliente.sugerirAtendente("Adicionar novos produtos ao catálogo"));
    }

}