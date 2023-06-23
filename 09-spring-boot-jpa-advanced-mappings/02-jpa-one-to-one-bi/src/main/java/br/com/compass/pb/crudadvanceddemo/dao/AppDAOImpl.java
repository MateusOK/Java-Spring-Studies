package br.com.compass.pb.crudadvanceddemo.dao;

import br.com.compass.pb.crudadvanceddemo.entity.Instructor;
import br.com.compass.pb.crudadvanceddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AppDAOImpl implements AppDAO{

    private EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findById(Integer id) {
        return entityManager.find(Instructor.class, id);

    }

    @Override
    @Transactional
    public void removeById(Integer id) {
        Instructor instructor = entityManager.find(Instructor.class, id);

        entityManager.remove(instructor);
    }

    @Override
    public InstructorDetail findInstructorDetailById(Integer id) {
        return entityManager.find(InstructorDetail.class, id);
    }

    @Override
    @Transactional
    public void removeInstructorDetailById(Integer id) {
        InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, id);

        instructorDetail.getInstructor().setInstructorDetail(null);

        entityManager.remove(instructorDetail);
    }
}
