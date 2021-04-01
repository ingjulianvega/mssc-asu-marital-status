package ingjulianvega.ximic.msscasumaritalstatus.web.controller;

import ingjulianvega.ximic.msscasumaritalstatus.services.MaritalStatusService;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MaritalStatusController implements MaritalStatus {
    private final MaritalStatusService maritalStatusService;

    @Override
    public ResponseEntity<MaritalStatusList> get() {
        return new ResponseEntity<>(maritalStatusService.get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MaritalStatusDto> getById(Integer id) {
        return new ResponseEntity<>(maritalStatusService.getById(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@Valid MaritalStatus maritalStatus) {
        maritalStatusService.create(maritalStatus);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(Integer id, @Valid MaritalStatus maritalStatus) {
        maritalStatusService.updateById();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(Integer id) {
        maritalStatusService.deleteById();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
