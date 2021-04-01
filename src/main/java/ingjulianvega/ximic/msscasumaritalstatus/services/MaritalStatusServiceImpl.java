package ingjulianvega.ximic.msscasumaritalstatus.services;

import ingjulianvega.ximic.msscasumaritalstatus.web.controller.MaritalStatus;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {
    @Override
    public MaritalStatusList get() {
        log.debug("get()...");
        return null;
    }

    @Override
    public MaritalStatusDto getById() {
        log.debug("getById()...");
        return null;
    }

    @Override
    public void create(MaritalStatus maritalStatus) {
        log.debug("create()...");
    }

    @Override
    public void updateById() {
        log.debug("updateById...");
    }

    @Override
    public void deleteById() {
        log.debug("deleteById...");
    }
}
