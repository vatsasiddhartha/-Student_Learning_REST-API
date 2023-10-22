package com.example.studenteduinfo;

import com.example.studenteduinfo.EduInfo.InfoSErvice.LearningInfoService;
import com.example.studenteduinfo.EduInfo.InfoSErvice.StudentInfoService;
import com.example.studenteduinfo.entity.LearningInfo;
import com.example.studenteduinfo.entity.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class OurController {
    @Autowired


    private StudentInfoService StudentInfoService1;
    @Autowired
    private LearningInfoService LearningInfoService1;

    //    @GetMapping("/")
//    public String print(){
//        return "hello";
//    }
    @GetMapping("/StudentInfo")
    public List<StudentInfo> getStudentInfo(){

        return this.StudentInfoService1.getStudentInfo();
    }

    @GetMapping("/StudentInfo/{getStudentInfo}")
    public StudentInfo getStudentInfo(@PathVariable String  getStudentInfo){
        return this.StudentInfoService1.getStudentInfo((int) Long.parseLong(getStudentInfo));
    }

    @GetMapping("/LearningInfo")
    public List<LearningInfo> getLearningInfo(){
        return this.LearningInfoService1.getLearningInfo();
    }
    @GetMapping("/LearningInfo/{getLearningInfo}")
    public LearningInfo getLearningInfo(@PathVariable String getLearningInfo ){
        return this.LearningInfoService1.getLearningInfo((int) Long.parseLong(getLearningInfo));
    }
    @PostMapping("/StudentInfo")
    public StudentInfo addStudentInfo(@RequestBody StudentInfo newStudentInfo){
        return this.StudentInfoService1.addStudentInfo(newStudentInfo);
    }
    @PostMapping("/LearningInfo")
    public LearningInfo addLearningInfo(@RequestBody LearningInfo AddedLearningInfo ){
        return this.LearningInfoService1.addLearningInfo(AddedLearningInfo);
    }
}
