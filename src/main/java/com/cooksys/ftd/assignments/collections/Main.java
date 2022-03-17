package com.cooksys.ftd.assignments.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cooksys.ftd.assignments.collections.model.Employee;
import com.cooksys.ftd.assignments.collections.model.Manager;
import com.cooksys.ftd.assignments.collections.model.OrgChart;
import com.cooksys.ftd.assignments.collections.model.Worker;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {
    	Manager andrew = new Manager("Andrew");
    	Manager liz = new Manager("Liz",andrew);
    	Worker ben = new Worker("Ben", liz);
    	Worker carrie = new Worker("Carrie");
    	OrgChart one = new OrgChart();
//    	
//    	one.addEmployee(ben);
//    	System.out.println(one.addEmployee(ben));
    	System.out.println(one.addEmployee(liz));
//    	System.out.println(one.getDirectSubordinates(liz));
//    	System.out.println(one.hasEmployee(andrew));
//    	System.out.println(one.addEmployee(andrew));
////    	System.out.println(one.addEmployee(andrew));
//    	System.out.println(ben.getManager());
////    	System.out.println(one.getAllManagers());
    	one.getAllEmployees();
//    	Set<Employee> subordinates = new HashSet<>();
//        subordinates.add(ben);
//        Map<Manager, Set<Employee>> hierarchy = one.getFullHierarchy();
//        System.out.println(hierarchy.keySet());
//        System.out.println(hierarchy.get(ben.getManager()));
//        System.out.println(subordinates.toString());
    	
   // 	System.out.println(one.getFullHierarchy().get);
    	
    

    	
    }

}
