package com.codegym.service.impl;

import com.codegym.Entity.Role;
import com.codegym.Entity.User;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

public class UserServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user=userRepository.findByEmail(s);
        if (user==null) {
            throw new UsernameNotFoundException("user not found");
        }
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        Set<Role>roles=user.getRoles();
        for (Role role:roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority((role.getName())));
        }
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),user.getPassword(),grantedAuthorities
        );
    }
}
