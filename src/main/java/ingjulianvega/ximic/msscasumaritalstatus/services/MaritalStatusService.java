package ingjulianvega.ximic.msscasumaritalstatus.services;

import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatus;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusList;

import java.util.UUID;

public interface MaritalStatusService {
    MaritalStatusList get();

    MaritalStatusDto getById(UUID id);

    void create(MaritalStatus maritalStatus);

    void updateById(UUID id, MaritalStatus maritalStatus);

    void deleteById(UUID id);
}
