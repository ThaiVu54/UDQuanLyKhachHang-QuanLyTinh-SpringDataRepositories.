package com.thai.customers.repo;

import com.thai.customers.model.Customer;
import com.thai.customers.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProvinceRepo extends PagingAndSortingRepository<Province,Long> {

}
