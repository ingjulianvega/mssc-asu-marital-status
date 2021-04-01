package ingjulianvega.ximic.msscasumaritalstatus.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiError   {

  private String code;
  private String description;

}

