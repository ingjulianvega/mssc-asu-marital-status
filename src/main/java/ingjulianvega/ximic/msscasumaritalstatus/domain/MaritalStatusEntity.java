package ingjulianvega.ximic.msscasumaritalstatus.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class MaritalStatusEntity extends BaseEntity{

    private String name;
}
