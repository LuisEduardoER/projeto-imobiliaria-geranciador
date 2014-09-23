/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class TesteDao {
    //armazena uma colecao para teste

    private List<Entidade> entidades;

    //instancia a classe DAO e gera os dados para teste
    public TesteDao() {
        super();
        gerarDados();
    }

    //metodo para gerar os dados para teste
    private void gerarDados() {
        entidades = new ArrayList<Entidade>();

        for (int i = 1; i < 128; i++) {
            Integer id = i;
            String nome = "nome " + i;
            String email = "email" + i + "@email.com";

            Entidade e = new Entidade(id, nome, email);

            entidades.add(e);
        }
    }

    //metodo que efetuará a paginação junto ao banco de dados
    //deve-se setar a quantidade total em "totalNumberOfEntries"
    //em seguida utiliza-se o firstResult e maxResult, 
    //mas pode depender do banco de dados utilizado
    //e adicione a colecao de resultado em "dataList"
    public void listarDados(VLHInfo vlhInfo) {

        vlhInfo.setTotalNumberOfEntries(entidades.size());

        Integer firstResult = vlhInfo.getPagingPage() * vlhInfo.getPagingNumberPer();
        Integer maxResult = vlhInfo.getPagingNumberPer();

        Integer fromIndex = firstResult;
        Integer toIndex = firstResult + maxResult;

        if (toIndex > entidades.size()) {
            toIndex = entidades.size();
        }

        List<Entidade> result = entidades.subList(fromIndex, toIndex);
        vlhInfo.setDataList(result);
    }
}
