package com.example.studenteduinfo.EduInfo.InfoSErvice;

import com.example.studenteduinfo.entity.LearningInfo;
import com.example.studenteduinfo.entity.StudentInfo;

import java.util.List;

public interface StudentInfoService {
    public List<StudentInfo>getStudentInfo();
    public StudentInfo getStudentInfo(int getStudentInfo);
    public StudentInfo addStudentInfo(StudentInfo newStudentInfo);


}
