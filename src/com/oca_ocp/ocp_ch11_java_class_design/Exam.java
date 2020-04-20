package com.oca_ocp.ocp_ch11_java_class_design;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    public static void main(String[] args) {
        ExamAnswers r = new ExamAnswers();
        TestAnswers t = new TestAnswers();


    }
}


class ExamAnswers {

    private  static ExamAnswers instance = new ExamAnswers();
    private List<String> answers = new ArrayList<>();
    public static List<String> getAnswers() {
        return instance.answers;
    }

class Singletone {

        private Singletone () {}

}

}

class TestAnswers {

    private static TestAnswers instance = new TestAnswers();
    private List<String> answers = new ArrayList<>();
    public static TestAnswers getTestAnswers () {
        return instance;
    }
    public List<String> getAnswers() {
        return answers;
    }


}




