package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    //responsavel por inserir no banco de dados
    void insert(Department obj);
    //atualizar
    void update(Department obj);
    //deletar
    void delete(Department obj);
    Department findById(Integer id);
    List<Department> findAll();
}
