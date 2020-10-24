package quang.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.model.Picture;

@Repository
public interface PictureRepository extends JpaRepository<Picture,Integer> {
}
