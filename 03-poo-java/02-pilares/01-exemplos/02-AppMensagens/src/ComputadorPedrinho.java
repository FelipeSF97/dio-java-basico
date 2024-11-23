import apps.FacebookMesseger;
import apps.MSNMesseger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args){
    ServicoMensagemInstantanea smi = null;

    String appEscolhido = "msn";

    if(appEscolhido.equals("msn"))
        smi = new MSNMesseger();
    else if(appEscolhido.equals("fbm")) 
        smi = new FacebookMesseger();
    else if(appEscolhido.equals("tlg")) 
        smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
