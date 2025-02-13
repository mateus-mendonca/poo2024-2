package br.ufpb.dcx.mendonca.mateus.lojaRoupas;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SistemaLojaRoupasPOO implements SistemaLojaRoupas {

    private Map<String, Roupa> roupasMap;

    public SistemaLojaRoupasPOO() {
        this.roupasMap = HashMap<>();
    }

    public List<Roupa> pesquisaRoupasPorTamanho(Tamanho tamanho) {
        return null;
    }

    public List<Roupa> pesquisaRoupasComDescricaoComecandoCom(String prefixoDescricao) {
        return null;
    }

    public Tamanho consultaTamanhDaRoupa(String codigoRoupa) {
        return null;
    }

    public void cadastraRoupa(String codigoRoupa, String descricao, Tamanho tamanho, int quantidade) throws RoupaJaExistenteException{
        if (this.roupasMap.containsKey(codigoRoupa)) {
            throw new RoupaJaExistenteException("Roupa já cadastrada: "+codigoRoupa);
        } else {
            Roupa roupa = new Roupa(codigoRoupa, descricao, tamanho, quantidade);
            this.roupasMap.put(codigoRoupa, roupa);
        }
    }

    public void alteraQuantidadeDeRoupaNoEstoque(String codigoRoupa, int novaQuantidade) throws RoupaInexistenteException{

    }

    public void pesquisaQuantidadeDeRoupaNoEstoque(String codigoRoupa) throws RoupaInexistenteException {

    }

    public Roupa pesquisaRoupa(String codigoRoupa) throws RoupaInexistenteException {
        return null;
    }
}

