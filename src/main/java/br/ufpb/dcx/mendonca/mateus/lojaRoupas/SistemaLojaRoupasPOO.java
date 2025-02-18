package br.ufpb.dcx.mendonca.mateus.lojaRoupas;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SistemaLojaRoupasPOO implements SistemaLojaRoupas {

    private Map<String, Roupa> roupasMap;

    public SistemaLojaRoupasPOO() {
        this.roupasMap = new HashMap<>();
    }

    public List<Roupa> pesquisaRoupasPorTamanho(Tamanho tamanho) {
        List<Roupa> tamanhoRoupas = new LinkedList<>();
        for (Roupa r : this.roupasMap.values()) {
            if (r.getTamanho().equals(tamanho)) {
                tamanhoRoupas.add(r);
            }
        }
        return tamanhoRoupas;
    }

    public List<Roupa> pesquisaRoupasComDescricaoComecandoCom(String prefixoDescricao) {
        List<Roupa> roupasComDesc = new LinkedList<>();
        for (Roupa r : this.roupasMap.values()) {
            if (r.getDescricao().equals(prefixoDescricao)) {
                roupasComDesc.add(r);
            }
        }
        return roupasComDesc;
    }

    public Tamanho consultaTamanhoDaRoupa(String codigoRoupa) throws RoupaInexistenteException{
        if (!this.roupasMap.containsKey(codigoRoupa)) {
            throw new RoupaInexistenteException("Roupa já cadastrada: "+codigoRoupa);
        } else {
            for (Roupa r : this.roupasMap.values()) {
                return r.getTamanho();
            }
        }
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
        if (!this.roupasMap.containsKey(codigoRoupa)) {
            throw new RoupaInexistenteException("Nenhuma roupa com código "+codigoRoupa+ " encontrada.");
        } else {
            for (Roupa r : this.roupasMap.values()) {
                r.setQuantidade(novaQuantidade);
            }
        }
    }

    public int pesquisaQuantidadeDeRoupaNoEstoque(String codigoRoupa) throws RoupaInexistenteException {
        if (!this.roupasMap.containsKey(codigoRoupa)) {
            throw new RoupaInexistenteException("Nenhuma roupa com código "+codigoRoupa+ " encontrada.");
        } else {
            return
        }
    }

    public Roupa pesquisaRoupa(String codigoRoupa) throws RoupaInexistenteException {
        if (!this.roupasMap.containsKey(codigoRoupa)) {
            throw new RoupaInexistenteException("Nenhuma roupa com código "+codigoRoupa+ " encontrada.");
        } else {
            return this.roupasMap.get(codigoRoupa);
        }
    }
}

