package ingjulianvega.ximic.msscasumaritalstatus.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MaritalStatus   {

  @NotBlank
  private String name = null;

}

