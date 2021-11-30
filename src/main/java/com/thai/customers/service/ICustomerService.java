package com.thai.customers.service;

import com.thai.customers.model.Customer;
import com.thai.customers.model.Province;

public interface ICustomerService extends IGeneralService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);

}
