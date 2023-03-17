package uk.co.mds.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectInfo {

    private String userId;

    private String baseProjectId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBaseProjectId() {
        return baseProjectId;
    }

    public void setBaseProjectId(String baseProjectId) {
        this.baseProjectId = baseProjectId;
    }
}
