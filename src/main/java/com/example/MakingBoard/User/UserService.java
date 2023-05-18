package com.example.MakingBoard.User;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);

        //시큐리티 클래스 사용해 암호화하여 비밀번호 저장
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;
    }
}
