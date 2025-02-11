package br.ufpb.dcx.mendonca.mateus.amigo;

public class MensagemParaAlguem extends Mensagem {

    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
    @Override
    public String getTextoCompletoAExibir() {
        if (ehAnonima()) {
            return "Mensagem para " + getEmailDestinatario() + ". Texto: " + getTexto();
        }
        return "Mensagem de: " + getEmailRemetente() +" para "+getEmailDestinatario()+ ". Texto: " + getTexto();
    }
}
