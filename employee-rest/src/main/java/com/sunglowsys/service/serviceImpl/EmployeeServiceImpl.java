package com.sunglowsys.service.serviceImpl;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRespository;
import com.sunglowsys.service.EmployeeService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRespository employeeRespository;

    public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
        this.employeeRespository = employeeRespository;
    }


    @Override
    public Employee save(Employee employee) {
       return employeeRespository.save (employee);

    }

    @Override
    public Employee update(Employee employee) {
        return employeeRespository.save (employee);
    }

    @Override
    public List<Employee> findAll(Pageable pageable) {
       return employeeRespository.findAll ();
    }

    @Override
    public Employee findOne(Long id) {
        return employeeRespository.findById (id).get ();
    }


    @Override
    public void delete(Long id) {
        employeeRespository.deleteById (id);
    }
}
