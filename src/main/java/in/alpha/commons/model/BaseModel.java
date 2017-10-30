package in.alpha.commons.model;


import in.alpha.commons.util.JsonUtils;

import java.io.Serializable;


public class BaseModel implements Serializable {
    @Override
    public String toString() {
        return JsonUtils.toString(this);

    }

}
