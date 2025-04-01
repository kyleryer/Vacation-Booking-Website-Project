package com.example.demo;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count() <= 1) {

            Customer customer1 = new Customer();
            customer1.setFirstName("Bob");
            customer1.setLastName("Builder");
            customer1.setAddress("123 Main Street");
            customer1.setPhone("1111111111");
            customer1.setPostal_code("11111");
            customer1.setDivision(divisionRepository.findAll().get(2));

            customerRepository.save(customer1);

            Customer customer2 = new Customer();
            customer2.setFirstName("Sandy");
            customer2.setLastName("Cheeks");
            customer2.setAddress("123 Texas Ave");
            customer2.setPhone("2222222222");
            customer2.setPostal_code("22222");
            customer2.setDivision(divisionRepository.findAll().get(40));

            customerRepository.save(customer2);

            Customer customer3 = new Customer();
            customer3.setFirstName("Squidward");
            customer3.setLastName("Tentacles");
            customer3.setAddress("123 Bikini Bottom Drive");
            customer3.setPhone("3333333333");
            customer3.setPostal_code("33333");
            customer3.setDivision(divisionRepository.findAll().get(33));

            customerRepository.save(customer3);

            Customer customer4 = new Customer();
            customer4.setFirstName("Kim");
            customer4.setLastName("Possible");
            customer4.setAddress("123 Spy Street");
            customer4.setPhone("4444444444");
            customer4.setPostal_code("44444");
            customer4.setDivision(divisionRepository.findAll().get(31));

            customerRepository.save(customer4);

            Customer customer5 = new Customer();
            customer5.setFirstName("Bruce");
            customer5.setLastName("Almighty");
            customer5.setAddress("123 Godly Avenue");
            customer5.setPhone("5555555555");
            customer5.setPostal_code("55555");
            customer5.setDivision(divisionRepository.findAll().get(62));

            customerRepository.save(customer5);
        }

    }
}
