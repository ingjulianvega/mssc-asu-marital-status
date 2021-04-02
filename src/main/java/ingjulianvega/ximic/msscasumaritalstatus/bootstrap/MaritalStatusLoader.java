package ingjulianvega.ximic.msscasumaritalstatus.bootstrap;

import ingjulianvega.ximic.msscasumaritalstatus.domain.MaritalStatusEntity;
import ingjulianvega.ximic.msscasumaritalstatus.domain.repositories.MaritalStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class MaritalStatusLoader implements CommandLineRunner {

    private final MaritalStatusRepository maritalStatusRepository;

    @Override
    public void run(String... args) throws Exception {
        if (maritalStatusRepository.count() == 0) {
            loadMaritalStatusObjects();
        }
    }

    private void loadMaritalStatusObjects() {
        maritalStatusRepository.saveAll(Arrays.asList(
                MaritalStatusEntity.builder().name("Soltero/a").build(),
                MaritalStatusEntity.builder().name("Casado/a").build(),
                MaritalStatusEntity.builder().name("Divorciado/a").build(),
                MaritalStatusEntity.builder().name("Separación en proceso").build(),
                MaritalStatusEntity.builder().name("Viudo/a").build(),
                MaritalStatusEntity.builder().name("Concubinato").build()
        ));
    }
}
