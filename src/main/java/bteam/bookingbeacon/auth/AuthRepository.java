package bteam.bookingbeacon.auth;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AuthRepository {
    private final EntityManager em;

    @Autowired
    public AuthRepository(EntityManager em){
        this.em = em;
    }

    public void save(UserEntity user) {
        em.persist(user);
    }

    public Optional<UserEntity> findUserById(Long id) {
        UserEntity user = em.find(UserEntity.class, id);
        return Optional.ofNullable(user);
    }
}
