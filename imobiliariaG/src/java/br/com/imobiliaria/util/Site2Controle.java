/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.util;

import br.com.imobiliaria.dao.SiteDao;
import br.com.imobiliaria.dao.SiteDaoImp;
import br.com.imobiliaria.entidade.Imagens;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Gustavo
 */
@ManagedBean
@SessionScoped
public class Site2Controle {

    public static void main(String[] args) throws Exception {
        SiteDao sdao = new SiteDaoImp();
//        List<Imagens> imagens;
//        for (Imovel imo : sdao.listar()) {
//            imagens = new ArrayList();
//            System.out.println("id  " + imo.getId());
//            imagens = sdao.pesqeImg(imo.getId());
//            for (Imagens imag : imagens) {
//                System.out.println("id imovel " + imag.getIdImovel().getId());
//                System.out.println("nome dai magens " + imag.getNome());
//            }
//        }

        String bairro2 = "Barra da Lagoa";
        String tipo = "Casa";
        String nDormotorios = "";
       // List<Imagens> img = sdao.pesquisaImovelSite(bairro2, tipo, nDormotorios, "");

//        for (Imagens imagens : img) {
//            System.out.println("imagens " + imagens.getNome());
//            System.out.println("imagens " + imagens.getStatus());
//            System.out.println("imovel " + imagens.getIdImovel().getNdormitorios());
//            System.out.println("Endereco " + imagens.getIdImovel().getEndereco().getCep().getLogradouro());
//        }
    }
}
