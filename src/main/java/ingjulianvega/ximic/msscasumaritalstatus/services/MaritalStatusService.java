package ingjulianvega.ximic.msscasumaritalstatus.services;

import ingjulianvega.ximic.msscasumaritalstatus.web.controller.MaritalStatus;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusList;

public interface MaritalStatusService {
    MaritalStatusList get();

    MaritalStatusDto getById();

    void create(MaritalStatus maritalStatus);

    void updateById();

    void deleteById();
}
