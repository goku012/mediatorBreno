public class Pessoa {

    public String elogiarAtendente(String mensagem) {
        return CentralAtendimento.getInstancia().receberElogioAtendente(mensagem);
    }

    public String reclamarAtendente(String mensagem) {
        return CentralAtendimento.getInstancia().receberReclamacaoAtendente(mensagem);
    }

    public String sugerirAtendente(String mensagem) {
        return CentralAtendimento.getInstancia().receberSugestaoAtendente(mensagem);
    }


}