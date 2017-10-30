package in.alpha.service;

import in.alpha.commons.model.Response;
import in.alpha.dao.StudentDAO;
import in.alpha.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;


    public Response studentProfile(StudentModel studentModel) {
        Response response = new Response();
        response.setSuccessful(false);
        studentDAO.studentProfile(studentModel);
        response.setSuccessful(true);
        response.setResponseObject(studentModel);
        return response;
    }

}
