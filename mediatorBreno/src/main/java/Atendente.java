public class Atendente implements Setor {

    private static Atendente instancia = new Atendente();

    private Atendente() {}

    public static Atendente getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Atendente vai encaminhar a reclamação para o setor responsável: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Atendente agradece pelo elogio: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Atendente vai encaminhar a sugestão para análise: " + mensagem;
    }
}