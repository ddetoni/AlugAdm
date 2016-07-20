/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.alugadm.controller;

import br.ufg.inf.alugadm.dao.ImovelDAO;
import br.ufg.inf.alugadm.model.Imovel;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author paulo
 */
public class VisualizarImovelAction {
     

    public ActionForward execute(ActionMapping mapping, ActionForm form, 
             HttpServletRequest request, HttpServletResponse response) throws Exception{
        
            HttpSession session = request.getSession();

             ImovelDAO imovelDao = new ImovelDAO();

            ArrayList<Imovel> listaImovel = imovelDao.getListaImoveis();

            request.setAttribute("listaImovel", listaImovel);

            return mapping.findForward("listaImovel");
        }
}
