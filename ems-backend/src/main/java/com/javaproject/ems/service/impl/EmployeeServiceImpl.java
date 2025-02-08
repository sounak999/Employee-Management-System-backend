package com.javaproject.ems.service.impl;

import com.javaproject.ems.dto.EmployeeDto;
import com.javaproject.ems.entity.Employee;
import com.javaproject.ems.mapper.EmployeeMapper;
import com.javaproject.ems.repository.EmployeeRepository;
import com.javaproject.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
