package com.MiguelAngelSotelo.backendArgentinaPrograma.security.service;

import com.MiguelAngelSotelo.backendArgentinaPrograma.security.entity.MainUser;
import com.MiguelAngelSotelo.backendArgentinaPrograma.security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        User user = userService.getByNombreUsuario(nombreUsuario).get();
        return MainUser.build(user);
    }
}
