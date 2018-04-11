package com.hpp.service;

/**
 * Created by HPP on 2018/4/11.
 */
import com.hpp.bean.Student;
import com.hpp.dao.StudentDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lxk on 2017/3/27
 */
@Service("studentService")
public class StudentService {

    @Resource(name = "studentDao")
    private StudentDao dao;

    public List<Student> getAllStudent() {
        return dao.findAll();
    }
}