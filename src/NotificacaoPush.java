public class NotificacaoPush implements Notificavel{
    private  String dispositivoId;
    private String appNome;

    public NotificacaoPush(String appNome, String dispositivoId) {
        this.appNome = appNome;
        this.dispositivoId = dispositivoId;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("🔔 [PUSH]");
        System.out.println("App: " + appNome);
        System.out.println("Dispositivo: " + dispositivoId);
        System.out.println("Mensagem: " + mensagem);
        System.out.println();
    }

    @Override
    public String getTipoCanal() {
        return "Push";
    }
}
