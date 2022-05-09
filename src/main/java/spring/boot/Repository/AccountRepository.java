package spring.boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
