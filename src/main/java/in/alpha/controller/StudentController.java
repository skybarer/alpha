package in.alpha.controller;

import in.alpha.commons.model.Response;
import in.alpha.model.StudentModel;
import in.alpha.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "profile", method = {RequestMethod.POST})
    public Response studentProfile(@RequestBody StudentModel studentModel) {
        System.out.println("============>" + studentModel);
        return studentService.studentProfile(studentModel);
    }
}
