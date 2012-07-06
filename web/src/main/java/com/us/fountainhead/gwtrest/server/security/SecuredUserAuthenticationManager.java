package com.us.fountainhead.gwtrest.server.security;

import com.us.fountainhead.gwtrest.server.entity.User;
import com.us.fountainhead.gwtrest.server.service.SecurityService;
import com.us.fountainhead.gwtrest.server.validate.ValidationException;
import javax.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Andrews
 */
public class SecuredUserAuthenticationManager implements UserDetailsService {

    @Resource
    private SecurityService securityService;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = null;
        
        try {
            user = securityService.findUserByUsername(username);
        } catch (ValidationException ex) {
            throw new UsernameNotFoundException(ex.getMessage());
        }
        
        return (user==null) ? null : new SecuredUser(user);
    }
    
}
