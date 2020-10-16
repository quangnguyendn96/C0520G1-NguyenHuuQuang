package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import quang.company.furama.model.TypeRent;

@Repository
public interface TypeRentRepository extends JpaRepository<TypeRent,Long> {
}
