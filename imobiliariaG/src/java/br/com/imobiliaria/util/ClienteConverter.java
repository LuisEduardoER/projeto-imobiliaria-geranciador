package br.com.imobiliaria.util;

import br.com.imobiliaria.dao.ClienteDao;
import br.com.imobiliaria.dao.ClienteDaoImp;
import br.com.imobiliaria.entidade.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "clienteConverter")
public class ClienteConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String string) {
        ClienteDao cliDao = new ClienteDaoImp();
       
        try {
       Cliente cliente = cliDao.pesquisaNome2(string);
            return cliente;
        } catch (Exception ex) {
            Logger.getLogger(ClienteConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object obj) {
        Cliente cliente = new Cliente();
        cliente = (Cliente) obj;
        return cliente.getNome();
    }
}
