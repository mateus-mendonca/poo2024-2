package br.ufpb.dcx.mendonca.mateus.lojaRoupas;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CancellationException;

public class GravadorDeRoupas {

    private String arquivoRoupas;

    public GravadorDeRoupas() {
        this.arquivoRoupas = "roupas.dat";
    }

    public void gravaRoupas(Collection<Roupa> roupas) throws IOException {
        ArrayList<Roupa> roupasArrayList = new ArrayList<>();
        roupasArrayList.addAll(roupas);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoRoupas))) {
            out.writeObject(roupasArrayList);
        }
    }

    public Collection<Roupa> recuperaRoupas() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.arquivoRoupas))) {
            Collection<Roupa> roupasAchadas = (ArrayList<Roupa>) in.readObject();
            return roupasAchadas;
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException();
        }
    }
}

//        #Forma antiga
//        ArrayList<Roupa> roupasArrayList = new ArrayList<>();
//        roupasArrayList.addAll(roupas);
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoRoupas));
//        out.writeObject(roupasArrayList);
//    }