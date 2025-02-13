package br.ufpb.dcx.mendonca.mateus.lojaRoupas;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SistemaLojaRoupasPOO implements SistemaLojaRoupas {

    private Map<String, Roupa> roupasMap;

    public SistemaLojaRoupasPOO() {
        this.roupasMap = new HashMap<>();
    }

    public List<Roupa> pesquisaRoupasPorTamanho(Tamanho tamanho) {
        return null;
    }

    public List<Roupa> pesquisaRoupasComDescricaoComecandoCom(String prefixoDescricao) {
        return null;
    }

    public Tamanho consultaTamanhoDaRoupa(String codigoRoupa) throws RoupaInexistenteException{
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

    public int pesquisaQuantidadeDeRoupaNoEstoque(String codigoRoupa) throws RoupaInexistenteException {
        for (Roupa r : roupasMap.size()) {
            if (this.roupasMap.containsKey(codigoRoupa)) {
                int quant = r.getQuantidade();
            } else {
                throw new RoupaInexistenteException("Nenhuma roupa com código "+codigoRoupa+ " encontrada.");
            }
        }
        return quant;
    }

    public Roupa pesquisaRoupa(String codigoRoupa) throws RoupaInexistenteException {
        return null;
    }
}

