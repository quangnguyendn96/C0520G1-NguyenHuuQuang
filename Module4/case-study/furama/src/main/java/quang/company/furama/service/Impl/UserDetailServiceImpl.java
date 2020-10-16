package quang.company.furama.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import quang.company.furama.model.Role;
import quang.company.furama.model.User;
import quang.company.furama.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("Account not found: " + username);
        }
        System.out.println(user);
//
        Collection<GrantedAuthority> listRole = new ArrayList<>();
        Set<Role> roles = user.getRoles();
        for (Role role: roles) {
            SimpleGrantedAuthority temp = new SimpleGrantedAuthority(role.getNameRole());
            listRole.add(temp);
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(), listRole);
//
    }
}
