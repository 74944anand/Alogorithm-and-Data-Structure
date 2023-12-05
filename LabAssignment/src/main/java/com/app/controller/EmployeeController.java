package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Company;
import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/addEmployee")
	public String homeController() {
		System.out.println("in method addEmployee " + getClass().getName());
		return "/employee/add_employee_form";
	}
	
	
	@PostMapping("/show")
	public String addEmployee(@RequestParam String fn, @RequestParam String ln, @RequestParam String city,
			@RequestParam String myCompany, Model map) {
		System.out.println("in Controller "+myCompany);
		Employee emp = new Employee(fn, ln, city, Company.valueOf(myCompany));
		String result = employeeService.addEmployee(emp);
		map.addAttribute("employee", result);
		return "/employee/show";
	}
	
	@RequestMapping("/display")
	public String diplayEmployee(Model map) {
		System.out.println("in displayEmployee controller");
		List<Employee> list = employeeService.displayEmployee();
//		list.forEach(p->System.out.println(p));
		map.addAttribute("listOfemp",list);
		return "/employee/display_list";
	}
	@PostMapping("/company")
	public String viewEmployee(@RequestParam String myCompany, Model map) {
		System.out.println("in view employee");
		List<Employee> list =employeeService.findByCompany(Company.valueOf(myCompany));
		map.addAttribute("filterEmployee",list);
		return "/employee/filter_employee";
	}
	@RequestMapping("/find")
	public String mycontrol() {
		return "/employee/search_employee";
	}
}
