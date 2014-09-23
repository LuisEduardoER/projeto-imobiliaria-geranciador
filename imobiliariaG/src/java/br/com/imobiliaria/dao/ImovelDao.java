package br.com.imobiliaria.dao;

import br.com.imobiliaria.entidade.Bairro;
import br.com.imobiliaria.entidade.Imagens;
import br.com.imobiliaria.entidade.Imovel;
import java.util.List;

public interface ImovelDao extends BaseDao<Imovel, Long> {

    List<Bairro> pesquisaBairro(String municipio) throws Exception;

    List<Imovel> pesquisaImovel(Long bairro) throws Exception;

    List<Imagens> pesquisaImagens(Long id) throws Exception;

    Imovel pesquisaImovelFuncionario(Long id) throws Exception;

    List<Imovel> pesquisaCodigo() throws Exception;

    List<Imovel> pesquisaImovelPorCodigo(String codigo) throws Exception;
}