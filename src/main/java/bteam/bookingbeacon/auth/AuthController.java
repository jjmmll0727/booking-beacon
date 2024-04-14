package bteam.bookingbeacon.auth;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth")
public class AuthController {

    private final AuthService authService;
    @GetMapping("login")
    public String login() {
        return this.authService.login();
    }

    @PostMapping("join")
    public void join(@RequestBody UserEntity user) {
        this.authService.join(user);
    }

    @GetMapping("{userId}")
    public Optional<UserEntity> findUserById(@PathVariable Long userId) {
        return this.authService.findUserById(userId);
    }
}
