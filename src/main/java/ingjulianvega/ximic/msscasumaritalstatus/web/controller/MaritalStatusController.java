package ingjulianvega.ximic.msscasumaritalstatus.web.controller;

import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MaritalStatusController implements MaritalStatus {

    @Override
    public ResponseEntity<MaritalStatusList> get() {
        return new ResponseEntity<>(MaritalStatusList.builder().build(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MaritalStatusDto> getById(Integer id) {
        return new ResponseEntity<>(MaritalStatusDto.builder().build(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@Valid MaritalStatus maritalStatus) {
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> updateById(Integer id, @Valid MaritalStatus maritalStatus) {
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(Integer id) {
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
