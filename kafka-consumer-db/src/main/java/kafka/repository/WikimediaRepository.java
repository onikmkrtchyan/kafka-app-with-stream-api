package kafka.repository;

import kafka.entity.WikimediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<WikimediaEntity, Long> {

}
