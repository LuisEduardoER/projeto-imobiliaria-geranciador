/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.util;

import br.com.imobiliaria.dao.BaseDao;
import br.com.imobiliaria.entidade.Imagens;
import br.com.imobiliaria.entidade.Imovel;

/**
 *
 * @author Gustavo
 */
public interface SiteDaoTeste extends BaseDao<Imovel, Long>{
  // void pesquisaImovel() throws Exception;
    void listarDados(VLHInfo vLHInfo) throws Exception;
    Imagens pesqImg(Long id) throws Exception;
}
