/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imobiliaria.util;

import br.com.imobiliaria.dao.ClienteDao;
import br.com.imobiliaria.dao.ClienteDaoImp;
import br.com.imobiliaria.entidade.Cliente;
import java.util.ArrayList;
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
public class ClienteControleTeste {

    private ClienteDao clienteDao;
    private Cliente clienteSelecionado;
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente getClienteSelecionado() {
        if(clienteSelecionado == null){
         clienteSelecionado = new Cliente();
        }
        return clienteSelecionado;
    }

    public void setClienteSelecionado(Cliente clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

    public ClienteDao getClienteDao() {
        return clienteDao;
    }

    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cliente> completaNome(String query) {
        clienteDao = new ClienteDaoImp();
        clientes = null;
        try {
           clientes = clienteDao.listar();
        } catch (Exception ex) {
            Logger.getLogger(ClienteControleTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Cliente> sugestoes = new ArrayList<Cliente>();
        for (Cliente cli : this.clientes) {
            if (cli.getNome().startsWith(query)) {
                sugestoes.add(cli);
            }
        }
        return sugestoes;
    }
}
