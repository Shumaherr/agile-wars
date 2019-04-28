package agile.wars.hackathon.repository;


import agile.wars.hackathon.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
