package ingjulianvega.ximic.msscasumaritalstatus.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MaritalStatusList   {

  public ArrayList<MaritalStatusDto>  maritalStatusList;

}

