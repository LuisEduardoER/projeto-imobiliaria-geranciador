/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.util;

import br.com.imobiliaria.entidade.Imagens;
import br.com.imobiliaria.entidade.Imovel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Gustavo
 */
@ManagedBean
@SessionScoped
public class PaginaControle extends VLHInfo{
    private static final long serialVersionUID = 1L;
    private SiteDaoTeste siteDao;
    
    public PaginaControle(){
        try {
            siteDao =  new SiteDaoImpTeste();
        } catch (Exception ex) {
            Logger.getLogger(PaginaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
     pageFirst();
    }
    
// public String carregaNoidades() {
//        siteDao = new SiteDaoImp();
//        imagens = null;
//        List<Imovel> imov = new ArrayList();
//        imagens = new ArrayList();
//        try {
//            imov = siteDao.listar();
//            for (Imovel imo : imov) {
//                imagens.add(PaginaControle.pesqeImg(imo.getId()));
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(SiteControle.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return "novidades";
//    }
    private List<Imagens> imagens;
    @Override
    public void loadDataList() {
        try {
//            List<Imovel> imov;
//            imov = siteDao.listar();
//            for (Imovel imovel : imov) {
//                imagens.add(siteDao.pesqImg(imovel.getId()));
//            }

            siteDao.listarDados(this);
        } catch (Exception ex) {
            Logger.getLogger(PaginaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public void listarDados(VLHInfo vLHInfo) throws Exception {
//         vLHInfo.setTotalNumberOfEntries(imagens.size());
//        Integer firsResult = vLHInfo.getPagingPage() * vLHInfo.getPagingNumberPer();
//        Integer maxResult = vLHInfo.getPagingNumberPer();
//
//        Integer fromIndex = firsResult;
//        Integer toIndex = firsResult + maxResult;
//
//        if (toIndex >  imagens.size()) {
//            toIndex =  imagens.size();
//        }
//        List<Imagens> result =  imagens.subList(fromIndex, toIndex);
//        vLHInfo.setDataList(result);
//    }
}
