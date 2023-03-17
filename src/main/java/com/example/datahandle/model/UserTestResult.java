package com.example.datahandle.model;

import java.util.List;

public class ProjectDto {
    private List<TestResult> testResults;
    private ProjectInfo projectInfo;

    public List<TestResult> getTestResults() {
        return testResults;
    }

    public void setTestResults(List<TestResult> testResults) {
        this.testResults = testResults;
    }

    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(ProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
    }
}
