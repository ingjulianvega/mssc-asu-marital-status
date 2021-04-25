package ingjulianvega.ximic.msscasumaritalstatus.domain.repositories;

import ingjulianvega.ximic.msscasumaritalstatus.domain.MaritalStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface MaritalStatusRepository extends JpaRepository<MaritalStatusEntity, UUID>, JpaSpecificationExecutor<MaritalStatusEntity> {
    List<MaritalStatusEntity> findAllByOrderByName();
}
