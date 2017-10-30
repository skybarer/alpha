package in.alpha.dao;

import java.util.HashMap;
import java.util.Map;

import in.alpha.commons.dao.BaseDAO;
import in.alpha.model.StudentModel;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO extends BaseDAO {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public void studentProfile(StudentModel studentModel){
        Map<String ,Object> params = new HashMap<String, Object>();
        params.put("p",studentModel);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("Student.Insert", params);
        sqlSession.close();
    }
}
