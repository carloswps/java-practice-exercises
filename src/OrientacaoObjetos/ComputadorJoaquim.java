package OrientacaoObjetos;

import OrientacaoObjetos.app.FacebookMessenger;
import OrientacaoObjetos.app.MSNMesseger;
import OrientacaoObjetos.app.ServicoMensagemInstantanea;
import OrientacaoObjetos.app.Telegram;

public class ComputadorJoaquim {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMesseger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if ( appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.recerMensagem();
    }
}
