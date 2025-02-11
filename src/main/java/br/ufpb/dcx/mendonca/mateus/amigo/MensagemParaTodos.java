package br.ufpb.dcx.mendonca.mateus.amigo;

public class MensagemParaTodos extends Mensagem {

    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }
    @Override
    public String getTextoCompletoAExibir() {
        //TODO: COMPLETAR
        if (ehAnonima()) {
            return "Mensagem para todos. Texto: "+getTexto();
        }
            return "Mensagem de " + getEmailRemetente()+ " para todos. Texto: " +getTexto();
    }
}
