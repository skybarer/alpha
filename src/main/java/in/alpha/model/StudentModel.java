package in.alpha.model;

import in.alpha.commons.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentModel extends BaseModel{
    private String id;
    private String name;
    private String department;
    private String college;
}
