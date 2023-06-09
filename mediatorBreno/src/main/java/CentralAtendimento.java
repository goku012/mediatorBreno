public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String receberElogioAtendente(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "O Atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Atendente.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoAtendente(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "O Atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Atendente.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoAtendente(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "O Atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Atendente.getInstancia().receberSugestao(mensagem);
    }

}