public class Main{
    public static void main(String[] args) {
        ServicoDeNotificacao servico = new ServicoDeNotificacao();

        servico.adicionarCanal(new NotificacaoEmail("nicolas@gmail.com", "Sistema"));
        servico.adicionarCanal(new NotificacaoSMS("(11) 99999-1234"));
        servico.adicionarCanal(new NotificacaoPush("MeuAPP", "device-abc-123"));

        servico.listarCanais();
        System.out.println();

        servico.notificarTodos("Seu pedido foi confirmado!");

        System.out.println("=== So SMS ===");
        servico.notificarPorTipo("SMS", "Codigo de verificacao: 4821");
    }
}