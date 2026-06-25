public class NotificacaoEmail implements Notificavel{
    private String enderecoEmail;
    private String nomeRemetente;

    public NotificacaoEmail(String enderecoEmail, String nomeRemetente) {
        this.enderecoEmail = enderecoEmail;
        this.nomeRemetente = nomeRemetente;
    }

    @Override
    public void enviarNotificacao(String mensagem){
        System.out.println("\uD83D\uDCE7 [EMAIL}");
        System.out.println("De: " + nomeRemetente);
        System.out.println("Para: " + enderecoEmail);
        System.out.println("Mensagem: " + mensagem);
        System.out.println();
    }

    @Override
    public String getTipoCanal(){
        return "E-mail";
    }

}
