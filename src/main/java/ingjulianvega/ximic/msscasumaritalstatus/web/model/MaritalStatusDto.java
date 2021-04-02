package ingjulianvega.ximic.msscasumaritalstatus.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;

import static ingjulianvega.ximic.msscasumaritalstatus.configuration.ErrorCodeMessages.VALIDATION_NAME_NULL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MaritalStatusDto implements Serializable {
    static final long serialVersionUID = 3288070695886353002L;

    @Null
    private Integer id;
    @NotBlank(message = VALIDATION_NAME_NULL)
    private String name;

}

