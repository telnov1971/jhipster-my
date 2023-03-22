package ru.home.jhip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.jhip.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
