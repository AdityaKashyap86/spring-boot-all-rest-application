package com.sunglowsys.resource;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee  employee) {
        Employee result = employeeService.save (employee);
        return ResponseEntity
                .status (HttpStatus.OK)
                .body (result);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee result = employeeService.save (employee);
        return ResponseEntity
                .status (HttpStatus.OK)
                .body (result);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> findAll() {
        List <Employee> employees = employeeService.findAll (PageRequest.of (0,2));
        return ResponseEntity
                .status (HttpStatus.OK)
                .body (employees);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Optional<Employee>> getOneEmployee(@PathVariable Long id) {
        Optional<Employee> result = employeeService.findOne (id);
        return ResponseEntity.status (HttpStatus.OK).body (result);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmployee( @PathVariable  Long id) {
        employeeService.delete (id);
        return ResponseEntity
                .status (HttpStatus.OK)
                .build ();
    }
}
