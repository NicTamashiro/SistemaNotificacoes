public class NotificacaoSMS implements Notificavel{
    private String numeroTelefone;

    public NotificacaoSMS(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        if (mensagem.length() > 160){
            System.out.println("⚠ SMS muito longo, será cortado.");
            mensagem = mensagem.substring(0, 160);
        }
        System.out.println("📱 [SMS]");
        System.out.println("Para: " + numeroTelefone);
        System.out.println("Mensagem: " + mensagem);
        System.out.println();
    }

    @Override
    public String getTipoCanal() {
        return "SMS";
    }
}
