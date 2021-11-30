package com.thai.customers.service;

import com.thai.customers.model.Customer;
import com.thai.customers.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> fillAll(Pageable pageable);
    //Pageable là 1 đối tượng có chứa 3 thuộc tính page, size và sort hỗ trợ cho việc phân trang.
    // Pageable được tự động ánh xạ từ request. Lưu ý vì lớp Pageable có ở 2 thư viện để import nên
    // chúng ta sẽ import lớp Pageabe từ thư viện org.springframework.data.domain.Pageable.
    Page<Customer>findAllByFirstNameContaining(String firstName, Pageable pageable);
}
