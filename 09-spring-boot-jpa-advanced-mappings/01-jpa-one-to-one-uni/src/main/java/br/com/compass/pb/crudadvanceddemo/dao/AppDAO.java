package br.com.compass.pb.crudadvanceddemo.dao;

import br.com.compass.pb.crudadvanceddemo.entity.Instructor;

public interface AppDAO {

    public void save(Instructor instructor);

    public Instructor findById(Integer id);

    public void removeById(Integer id);

}
