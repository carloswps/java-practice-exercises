package OrientacaoObjetos.app;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectarInternet();
        // TODO Auto-generated method stub
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void recerMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem Facebook Messenger");
    }
}
