/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.dao;

import br.com.imobiliaria.entidade.Click;

/**
 *
 * @author Gustavo
 */
public interface ClickDao extends BaseDao<Click, Long>{
    
    Click pesquisaClick(Long id) throws Exception;
}
