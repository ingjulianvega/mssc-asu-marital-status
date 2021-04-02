package ingjulianvega.ximic.msscasumaritalstatus.web.controller;

import ingjulianvega.ximic.msscasumaritalstatus.services.MaritalStatusService;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatus;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class MaritalStatusController implements MaritalStatusI {
    private final MaritalStatusService maritalStatusService;

    @Override
    public ResponseEntity<MaritalStatusList> get() {
        return new ResponseEntity<>(maritalStatusService.get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MaritalStatusDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(maritalStatusService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid MaritalStatus maritalStatus) {
        maritalStatusService.create(maritalStatus);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid MaritalStatus maritalStatus) {
        maritalStatusService.updateById(id, maritalStatus);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        maritalStatusService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}