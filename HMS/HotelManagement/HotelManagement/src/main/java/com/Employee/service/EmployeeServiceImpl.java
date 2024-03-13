package com.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.Employee;
import com.Employee.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
	private EmployeeRepo employeerepo;
//	@Override
//	public Employee createEmployee(Employee employee) {
//		if(employee!=null) {
//		return employeerepo.save(employee);
////			return save;
//		}
//		return null;
//	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if(employee!=null) {
			return employeerepo.save(employee);
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeerepo.findAll();
	}

	@Override
	public Employee getById(Integer serviceno) {
		Optional<Employee> findById = employeerepo.findById(serviceno);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

//	@Override
//	public String deleteById(Integer serviceno) {
//		return employeerepo.deleteById(serviceno);
//	}
//	public Employee deleteById(Integer serviceno) {
//		Boolean existsById = employeerepo.existsById(serviceno);
//		if(existsById) {
//			return "deletion successful";
//		}
//		return "deletion id is not present";
//	}
	@Override
    public String deleteById(Integer serviceno) {
        if (employeerepo.existsById(serviceno)) {
            employeerepo.deleteById(serviceno);
            return "Employee with serviceno " + serviceno + " deleted successfully.";
        } else {
            return "Employee with serviceno " + serviceno + " not found.";
        }
    }
	@Override
	public String upsert(Employee employee) {
		employeerepo.save(employee);
		return "saved";
	}

}
