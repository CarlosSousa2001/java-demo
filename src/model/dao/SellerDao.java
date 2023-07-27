package model.dao;

import entities.Department;
import entities.Seller;

import java.sql.SQLException;
import java.util.List;

public interface SellerDao {
    void insert(Seller obj) throws SQLException;
    void update(Seller obj) throws SQLException;
    void deleteById(Integer id) throws SQLException;
    Seller findById(Integer id) throws SQLException;
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
