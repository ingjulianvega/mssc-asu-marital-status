package ingjulianvega.ximic.msscasumaritalstatus.web.Mappers;

import ingjulianvega.ximic.msscasumaritalstatus.domain.MaritalStatusEntity;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface MaritalStatusMapper {
    MaritalStatusDto maritalStatusEntityToMaritalStatusDto(MaritalStatusEntity maritalStatusEntity);

    MaritalStatusEntity maritalStatusDtoToMaritalStatusEntity(MaritalStatusDto maritalStatusDto);

    ArrayList<MaritalStatusDto> maritalStatusEntityListToMaritalStatusDtoList(List<MaritalStatusEntity> maritalStatusEntityList);
}
