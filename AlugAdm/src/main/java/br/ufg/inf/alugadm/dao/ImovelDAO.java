package br.ufg.inf.alugadm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ufg.inf.alugadm.model.Imovel;

public class ImovelDAO {

	private static EntityManagerFactory factory;

	public ImovelDAO() {
		setFactory(Persistence.createEntityManagerFactory("imovel"));
	}

	public void register(Imovel imovel) {

		EntityManager manager = getFactory().createEntityManager();

		manager.getTransaction().begin();
		
		manager.persist(imovel);
		manager.getTransaction().commit();
		manager.close();
	}

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	public static void setFactory(EntityManagerFactory factory) {
		ImovelDAO.factory = factory;
	}
}
