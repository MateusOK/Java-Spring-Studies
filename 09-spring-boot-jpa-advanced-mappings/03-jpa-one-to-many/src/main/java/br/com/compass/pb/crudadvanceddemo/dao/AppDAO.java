package br.com.compass.pb.crudadvanceddemo.dao;

import br.com.compass.pb.crudadvanceddemo.entity.Instructor;
import br.com.compass.pb.crudadvanceddemo.entity.InstructorDetail;

public interface AppDAO {

     void save(Instructor instructor);

     Instructor findById(Integer id);

     void removeById(Integer id);

     InstructorDetail findInstructorDetailById(Integer id);

     void removeInstructorDetailById(Integer id);

}
