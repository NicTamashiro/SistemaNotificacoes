import java.util.ArrayList;
import java.util.List;

public class ServicoDeNotificacao {
    private List<Notificavel> canais = new ArrayList<>();

    public void adicionarCanal(Notificavel canal){
        canais.add(canal);
    }

    public void notificarTodos(String mensagem){
        System.out.println("=== Deisparando notificacoes ===");
        for(Notificavel canal : canais){
            canal.enviarNotificacao(mensagem);
        }
    }

    public void notificarPorTipo(String tipo, String mensagem){
        for(Notificavel canal : canais){
            if(canal.getTipoCanal().equalsIgnoreCase(tipo)){
                canal.enviarNotificacao(mensagem);
            }
        }
    }

    public void listarCanais(){
        System.out.println("Canais cadastrados:");
        for(Notificavel canal : canais){
            System.out.println("- " + canal.getTipoCanal());
        }
    }
}
