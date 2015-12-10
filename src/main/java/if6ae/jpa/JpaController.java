/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author a907413
 */
public class JpaController {
    protected static EntityManagerFactory emf = null;

    public JpaController() {
    }

    public EntityManagerFactory getEMFactory() {
        if (emf == null)
            emf = Persistence.createEntityManagerFactory("cema");
        return emf;
    }

    public EntityManager getEntityManager() {
        return getEMFactory().createEntityManager();
    }
    
}
