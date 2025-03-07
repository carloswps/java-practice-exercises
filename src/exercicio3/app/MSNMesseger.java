package exercicio3.app;

public class MSNMesseger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectarInternet();
        // TODO Auto-generated method stub
        System.out.println("Enviando mensagem pelo MSNMesseger");
    }

    @Override
    public void recerMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo MSNMesseger");
    }
   
}