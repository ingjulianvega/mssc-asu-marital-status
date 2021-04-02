package ingjulianvega.ximic.msscasumaritalstatus.services;

import ingjulianvega.ximic.msscasumaritalstatus.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasumaritalstatus.domain.MaritalStatusEntity;
import ingjulianvega.ximic.msscasumaritalstatus.domain.repositories.MaritalStatusRepository;
import ingjulianvega.ximic.msscasumaritalstatus.exception.MaritalStatusException;
import ingjulianvega.ximic.msscasumaritalstatus.web.Mappers.MaritalStatusMapper;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatus;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {

    private final MaritalStatusRepository maritalStatusRepository;
    private final MaritalStatusMapper maritalStatusMapper;

    @Override
    public MaritalStatusList get() {
        log.debug("get()...");
        return MaritalStatusList
                .builder()
                .maritalStatusList(maritalStatusMapper.maritalStatusEntityListToMaritalStatusDtoList(maritalStatusRepository.findAll()))
                .build();
    }

    @Override
    public MaritalStatusDto getById(UUID id) {
        log.debug("getById()...");
        return maritalStatusMapper.maritalStatusEntityToMaritalStatusDto(
                maritalStatusRepository.findById(id).orElseThrow(() -> new MaritalStatusException(ErrorCodeMessages.MARITAL_STATUS_NOT_FOUND, "")));
    }

    @Override
    public void create(MaritalStatus maritalStatus) {
        log.debug("create()...");
        maritalStatusMapper.maritalStatusEntityToMaritalStatusDto(
                maritalStatusRepository.save(
                        maritalStatusMapper.maritalStatusDtoToMaritalStatusEntity(
                                MaritalStatusDto
                                        .builder()
                                        .name(maritalStatus.getName()).
                                        build())));
    }

    @Override
    public void updateById(UUID id, MaritalStatus maritalStatus) {
        log.debug("updateById...");
        MaritalStatusEntity maritalStatusEntity = maritalStatusRepository.findById(id).orElseThrow(() -> new MaritalStatusException(ErrorCodeMessages.MARITAL_STATUS_NOT_FOUND, ""));
        maritalStatusEntity.setName(maritalStatus.getName());

        maritalStatusRepository.save(maritalStatusEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        maritalStatusRepository.deleteById(id);
    }
}
