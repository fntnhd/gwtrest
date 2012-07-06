package com.us.fountainhead.gwtrest.server.service.impl;

import com.us.fountainhead.gwtrest.server.entity.User;
import com.us.fountainhead.gwtrest.server.service.SecurityService;
import com.us.fountainhead.gwtrest.server.validate.ValidationException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

    
    @PersistenceContext(unitName = "gwtrestPU")
    private EntityManager em;
    
    /**
     * findUserByUsername
     * @param username
     * @return User
     * @see String
     */
    @Override
    public User findUserByUsername(String username) throws ValidationException {
        Query q = em.createQuery("select u from User u where username = :username");
        q.setParameter("username", username);
        List<User> users = q.getResultList();
        User user = null;
        if (users.size() == 1) {
            user = users.get(0);
        }
        else {
            //TO-DO Throw exception
        }
        
        return user;
    }

}