package localdomain.localhost.dnata.rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import localdomain.localhost.dnata.rest.entity.ExchRate;

@RestResource(exported = false)
public interface ExchRateRepository extends JpaRepository<ExchRate, String> {

}
