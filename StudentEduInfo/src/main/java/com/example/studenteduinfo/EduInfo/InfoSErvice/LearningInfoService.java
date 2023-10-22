package com.example.studenteduinfo.EduInfo.InfoSErvice;

import com.example.studenteduinfo.entity.LearningInfo;

import java.util.List;

public interface LearningInfoService {
    public List<LearningInfo>getLearningInfo();

    List<LearningInfo> getList2();

    public LearningInfo getLearningInfo(int getLearningInfo);
    public LearningInfo addLearningInfo(  LearningInfo AddedLearningInfo);
}
