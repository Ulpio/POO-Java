public class MSNMessenger {
    public void enviarMensagem(){
        verificarConexao();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        verificarConexao();
        System.out.println("recebendo mensagem");
        salvarHistoricoMensagem();
    }
    private void verificarConexao(){
        System.out.println("Validando a conexão com a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando Histórico das mensagens");
    }
}
