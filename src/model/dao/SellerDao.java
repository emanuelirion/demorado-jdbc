package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    //responsavel por inserir no banco de dados
    void insert(Seller obj);
    //atualizar
    void update(Seller obj);
    //deletar
    void deleteById(Integer obj);

    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
