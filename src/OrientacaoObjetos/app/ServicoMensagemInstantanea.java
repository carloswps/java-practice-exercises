package OrientacaoObjetos.app;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void recerMensagem();

    protected void validarConectarInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}
