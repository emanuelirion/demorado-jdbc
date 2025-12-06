package model.dao;

import model.dao.impl.SellerDaoJDBC.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao creatSellerDao() {
        return new SellerDaoJDBC();
    }
}
