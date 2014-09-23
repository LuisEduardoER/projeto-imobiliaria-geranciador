/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.util;

import br.com.imobiliaria.dao.BaseDaoImp;
import br.com.imobiliaria.dao.FabricaConexao;
import br.com.imobiliaria.entidade.Imovel;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author User
 */
public class Site2DaoImp extends BaseDaoImp<Imovel, Long> implements Site2Dao{

    @Override
    public Imovel pesquisar(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Imovel> listar() throws Exception {
        
       session = FabricaConexao.abreSessao();
       Query query = session.createQuery("SELECT FROM Imovel i");
       return null;
    }
    
}
