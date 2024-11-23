package apps;
public class MSNMesseger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem no MSN");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem no MSN");
    }
}
