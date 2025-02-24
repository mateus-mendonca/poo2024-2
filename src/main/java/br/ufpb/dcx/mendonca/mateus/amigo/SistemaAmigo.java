package br.ufpb.dcx.mendonca.mateus.amigo;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {

    private List<Amigo> amigos;
    private List<Mensagem> mensagens;

    public void cadastraAmigo(String nomeAmigo, String emailAmigo, String emailAmigoSorteado) {
        Amigo amigo = new Amigo(nomeAmigo, emailAmigo, emailAmigoSorteado);
        this.amigos.add(amigo);

    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {]
        if (emailDaPessoa ) {
            throw new AmigoInexistenteException();
        } else {

        }

    }
}
