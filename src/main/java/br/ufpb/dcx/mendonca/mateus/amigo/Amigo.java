package br.ufpb.dcx.mendonca.mateus.amigo;

public class Amigo {

    private String nomeAmigo;
    private String emailAmigo;
    private String emailAmigoSorteado;

    public Amigo(String nomeAmigo, String emailAmigo, String emailAmigoSorteado) {
        this.nomeAmigo = nomeAmigo;
        this.emailAmigo = emailAmigo;
        this.emailAmigoSorteado = emailAmigoSorteado;
    }

    public String getNome() {
        return nomeAmigo;
    }

    public void setNome(String nome) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getEmail() {
        return emailAmigo;
    }

    public void setEmail(String email) {
        this.emailAmigo = emailAmigo;
    }

    public String getEmailAmigoSorteado() {
        return emailAmigoSorteado;
    }

    public void setEmailAmigoSorteado(String emailAmigoSorteado) {
        this.emailAmigoSorteado = emailAmigoSorteado;
    }

}
