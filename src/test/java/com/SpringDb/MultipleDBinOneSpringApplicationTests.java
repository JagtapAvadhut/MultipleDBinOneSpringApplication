package com.SpringDb;

import com.SpringDb.mongodb.entites.Product;
import com.SpringDb.mongodb.repository.ProductRepo;
import com.SpringDb.mysql.entites.User;
import com.SpringDb.mysql.repository.UserRepo;
import com.SpringDb.postgresSQL.entities.Company;
import com.SpringDb.postgresSQL.repository.CompanyRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultipleDBinOneSpringApplicationTests {
//    @Autowired
//    ProductRepo productRepo;
//    @Autowired
//    CompanyRepo companyRepo;
//    @Autowired
//    UserRepo userRepo;
//
//    @Test
//    void saveData() {
//        System.out.println(" just Testing start....");
//
//
//        try {
//            Product product = Product.builder().productName("iphone15")
//                    .productPrice(1500000.15).build();
//            productRepo.save(product);
//            System.out.println(product);
//        } catch (Exception e) {
//            System.out.println("Error Product Save");
//            e.printStackTrace();
//        }
//        try {
//            User avadhut = User.builder().userName("Avadhut").userEmail("avadhut.pvt@gmail.com").build();
//            User user = userRepo.save(avadhut);
//            System.out.println(user);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            Company company = companyRepo.save(Company.builder().companyLocation("Baramati").companyName("AJ").build());
//            System.out.println(company);
//        } catch (Exception e) {
//            System.out.println(" Error Company Save");
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    void printData() {
//        userRepo.findAll().forEach(System.out::println);
//        productRepo.findAll().forEach(System.out::println);
//        companyRepo.findAll().forEach(System.out::println);
//    }
//
//    @Test
//    void deleteAllData() {
//        userRepo.findAll().forEach(a -> userRepo.deleteById(a.getUserId()));
//        productRepo.findAll().forEach(a -> productRepo.deleteById(a.getId()));
//        companyRepo.findAll().forEach(a -> companyRepo.deleteById(a.getCompanyId()));
//        System.out.println(" All Data Deleted Inside DB");
//    }

}
