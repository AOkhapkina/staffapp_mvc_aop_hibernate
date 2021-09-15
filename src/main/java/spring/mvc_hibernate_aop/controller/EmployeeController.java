package spring.mvc_hibernate_aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc_hibernate_aop.dao.EmployeeDAO;
import spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeDAO employeeDAO;


    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees); //18.34
        return "all-employees";

    }

}
