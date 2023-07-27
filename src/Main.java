import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TESTE 1: SELLER findById");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("_--------------------------------_");

        System.out.println("TSTE 2: SELLER findByDepartment");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));

        for(Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("_--------------------------------_");

        System.out.println("TSTE 2: SELLER findAll");
        List<Seller> lista = sellerDao.findAll();

        for(Seller obj : lista){
            System.out.println(obj);
        }

    }
}