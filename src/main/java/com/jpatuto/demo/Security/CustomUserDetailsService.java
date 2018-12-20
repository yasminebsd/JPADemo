package com.jpatuto.demo.Security;

import com.jpatuto.demo.Entities.Client;
import com.jpatuto.demo.Entities.JwtUser;
import com.jpatuto.demo.Entities.JwtUserDetails;
import com.jpatuto.demo.Repositories.ClientRepository;
import com.jpatuto.demo.Repositories.JwtUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    JwtUserRepository jwtUserRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        JwtUser user = jwtUserRepository.findByUsername(username);
        return JwtUserDetails.create(user);
    }

    // This method is used by JWTAuthenticationFilter
    @Transactional
    public UserDetails loadUserById(int id) {
        JwtUser user = jwtUserRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("User not found with id : " + id)
        );

        return JwtUserDetails.create(user);
    }
}
