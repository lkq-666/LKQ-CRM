package com.lkq.lkqcrm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lkq.lkqcrm.entity.Customer;
import com.lkq.lkqcrm.entity.Employee;

public interface CustomerService extends IService<Customer> {

    IPage<Customer> selectList(Page<Customer> page);

    Customer selectByName(String empName);

    Integer add(Customer customer, Integer empId);

    Integer update(Customer customer, Integer empId);
}
