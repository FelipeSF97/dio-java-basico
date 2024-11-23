package apps;
public class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem no Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem no Telegram");
    }
}
