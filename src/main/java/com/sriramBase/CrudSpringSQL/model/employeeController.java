package com.sriramBase.CrudSpringSQL.model;

import java.util.List;
import org.springframework.web.bind.annotation.*;


@RestController
public class employeeController {
    @RequestMapping("/employees")
    public List<employee> getAllemployee()
    {
        return employeeService.getAllEmployees();
    }
    @RequestMapping(method = RequestMethod.POST,value="/employees")
    public void addEmployee(@RequestBody employee e1)
    {
        System.out.println(e1);

        employeeService.addEmployee(e1);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/employees/{id}")
    public void updateEmployee(@RequestBody employee e1,@PathVariable int id)
    {
        employeeService.updateEmployee(e1,id);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/employees/{id}")
    public void updateEmployee(@PathVariable int id)
    {
        employeeService.deleteEmployee(id);
    }


}
