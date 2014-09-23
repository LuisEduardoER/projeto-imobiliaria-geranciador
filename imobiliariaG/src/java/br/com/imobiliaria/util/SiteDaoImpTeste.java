/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.util;

import br.com.imobiliaria.dao.BaseDaoImp;
import br.com.imobiliaria.dao.FabricaConexao;
import br.com.imobiliaria.entidade.Imagens;
import br.com.imobiliaria.entidade.Imovel;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Gustavo
 */
public class SiteDaoImpTeste extends BaseDaoImp<Imovel, Long> implements SiteDaoTeste {

    private List<Imovel> imoveis;
    private List<Imagens> imagens;

    public SiteDaoImpTeste() throws Exception {
        super();
        pesquisaImovel();
    }

    private void pesquisaImovel() {
        session = FabricaConexao.abreSessao();
        Query query = session.createQuery("SELECT i FROM Imovel i ORDER BY i.id DESC LIMIT 8");
        imoveis = query.list();
        session.close();
        imagens = new ArrayList();
        for (Imovel imovel : imoveis) {
            imagens.add(pesqImg(imovel.getId()));
        }

    }

    @Override
    public Imagens pesqImg(Long id) {
        session = FabricaConexao.abreSessao();
        Query query = session.createQuery("SELECT i FROM Imagens i WHERE i.idImovel.id = :valor and i.status = :valorStatus");
        //SELECT i FROM Imagens i JWHERE i.idImovel.id = :valor and i.status = :valorStatus
        String status = "capa";
        query.setLong("valor", id);
        query.setString("valorStatus", status);
        Imagens img = (Imagens) query.uniqueResult();
        session.close();
        return img;
    }

    @Override
    public void listarDados(VLHInfo vLHInfo) throws Exception {
        vLHInfo.setTotalNumberOfEntries(imagens.size());
        Integer firsResult = vLHInfo.getPagingPage() * vLHInfo.getPagingNumberPer();
        Integer maxResult = vLHInfo.getPagingNumberPer();

        Integer fromIndex = firsResult;
        Integer toIndex = firsResult + maxResult;

        if (toIndex > imagens.size()) {
            toIndex = imagens.size();
        }
        List<Imagens> result = imagens.subList(fromIndex, toIndex);
        vLHInfo.setDataList(result);
    }

    @Override
    public Imovel pesquisar(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    public void listarDados(VLHInfo vLHInfo) {
//        vLHInfo.setTotalNumberOfEntries(imoveis.size());
//        Integer firsResult = vLHInfo.getPagingPage() * vLHInfo.getPagingNumberPer();
//        Integer maxResult = vLHInfo.getPagingNumberPer();
//
//        Integer fromIndex = firsResult;
//        Integer toIndex = firsResult + maxResult;
//
//        if (toIndex > imoveis.size()) {
//            toIndex = imoveis.size();
//        }
//        List<Imovel> result = imoveis.subList(fromIndex, toIndex);
//        vLHInfo.setDataList(result);
//    }
}
