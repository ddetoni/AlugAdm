/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.alugadm.controller;

import br.ufg.inf.alugadm.model.Imovel;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



/**
 *
 * @author JuliannyAS
 */
public class ImovelServlet extends Action {


   public ActionForward VisualizarImovel(ActionMapping mapping, ActionForm form, 
            HttpServletRequest request, HttpServletResponse response) throws Exception{
       
       HttpSession session = request.getSession();
       
       // ImovelDao imovelDao = new ImovelDao();
       
       //ArrayList<Imovel> listaImoveis = imovelDao.getListaImoveis();
       
       ArrayList<Imovel> listaImovel = new ArrayList<Imovel>();
       
       request.setAttribute("listaImovel", listaImovel);
       
       
       return mapping.findForward("listaImovel");
   }

}
