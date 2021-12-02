package com.thai.customers.service;

import com.thai.customers.model.Customer;
import com.thai.customers.model.Province;
import com.thai.customers.repo.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepo customerRepo;


    @Override
    public Iterable<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) throws Exception {
        Optional<Customer> optionalCustomer = customerRepo.findById(id);
        if (!optionalCustomer.isPresent()){
           throw new Exception("customer not found");
        }
        return optionalCustomer;
    }

    @Override
    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepo.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepo.findAllByProvince(province);
    }

    @Override
    public Page<Customer> fillAll(Pageable pageable){
        return customerRepo.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable) {
        return customerRepo.findAllByFirstNameContaining(firstName,pageable);
    }
}
