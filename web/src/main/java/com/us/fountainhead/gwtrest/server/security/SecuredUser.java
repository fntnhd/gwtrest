package com.us.fountainhead.gwtrest.server.security;

import com.us.fountainhead.gwtrest.server.entity.User;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Andrews
 */
public class SecuredUser implements UserDetails {
    
    private User user;    
    private Collection<SecuredUserAuthority> authorities; 
    
    public SecuredUser(User u) {
        user = u;
        authorities = new ArrayList<SecuredUserAuthority>();
        authorities.add(new SecuredUserAuthority());
    }

    public User getUser() {
        return user;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
    
    private class SecuredUserAuthority implements GrantedAuthority {

        @Override
        public String getAuthority() {
            return "ROLE_USER";
        }
        
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
