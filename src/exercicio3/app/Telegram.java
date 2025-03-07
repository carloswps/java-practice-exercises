package exercicio3.app;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectarInternet();
        // TODO Auto-generated method stub
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void recerMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
