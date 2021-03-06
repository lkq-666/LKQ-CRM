package com.lkq.lkqcrm.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lkq.lkqcrm.entity.Customer;
import com.lkq.lkqcrm.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper extends BaseMapper<Customer> {
    IPage<Customer> selectList(Page<Customer> page);

    Customer selectByName(String empName);
}
