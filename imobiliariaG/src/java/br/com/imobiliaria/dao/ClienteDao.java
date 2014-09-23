package br.com.imobiliaria.dao;

import br.com.imobiliaria.entidade.Cliente;
import br.com.imobiliaria.entidade.Imovel;
import java.util.List;

public interface ClienteDao extends BaseDao<Cliente, Long> {

    public List<Cliente> pesquisaClienteCpf(String cpf);

    public List<Cliente> pesquisaNome(String nome) throws Exception;
    public Cliente pesquisaNome2(String nome) throws Exception;

    public List<Imovel> pesquisaImovel(Long id) throws Exception;
}