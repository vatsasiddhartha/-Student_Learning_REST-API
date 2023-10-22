package com.example.studenteduinfo.entity;


public class LearningInfo {

    private int SubjectId;
    private String Name;
    private String Topics;
    private String Rating;

    public LearningInfo(int subjectId, String name, String topics, String rating) {
        SubjectId = subjectId;
        Name = name;
        Topics = topics;
        Rating = rating;
    }

    public LearningInfo() {

    }

    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int subjectId) {
        SubjectId = subjectId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTopics() {
        return Topics;
    }

    public void setTopics(String topics) {
        Topics = topics;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }
}

