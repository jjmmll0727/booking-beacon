package bteam.bookingbeacon.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class AuthService {
    final AuthRepository authRepository;

    @Autowired
    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public String login() {
        return "hello";
    }

    public void join(UserEntity user) {
        this.authRepository.save(user);
    }

    public Optional<UserEntity> findUserById(Long userId){
        return authRepository.findUserById(userId);
    }
}
