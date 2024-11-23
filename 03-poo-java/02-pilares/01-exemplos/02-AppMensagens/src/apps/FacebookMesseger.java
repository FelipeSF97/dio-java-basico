package apps;
public class FacebookMesseger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem no Facebook");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem no Facebook");
    }
}
