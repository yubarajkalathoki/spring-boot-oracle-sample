package com.yubaraj.oracle.repository;
import com.yubaraj.oracle.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by Yubaraj on 2/1/2017.
 */
@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
}
