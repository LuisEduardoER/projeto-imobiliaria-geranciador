/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.dao;

import br.com.imobiliaria.entidade.Imagens;
import br.com.imobiliaria.entidade.Imovel;
import br.com.imobiliaria.util.VLHInfo;
import java.util.List;

/**
 *
 * @author Cursos Livres
 */
public interface SiteDao extends BaseDao<Imovel, Long> {

    Imagens pesqeImg(Long id) throws Exception;

    List<Imagens> pesquisaImovelSite(Long Bairro, Long tipoImovel, int nDormitorios, double valor) throws Exception;

    Imagens alteraImagenStatus(Long id, Long idImovel) throws Exception;

    Imovel pesquisaImovelSelecionado(Long id) throws Exception;

    Imovel pesquidaCodigoImovel(String codigo) throws Exception;

    List<Imagens> pesquisaImovelGaleriaValida() throws Exception;

    Imagens salvaStatusGaleria(Long idImovel, Long idImagen) throws Exception;

    List<Imagens> pesquisaGaleria() throws Exception;
}
