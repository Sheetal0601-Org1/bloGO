package me.ktkim.blog.repository;

import me.ktkim.blog.model.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author backend Sheetal Lalwani - sopringboot crio
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}