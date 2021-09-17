package com.oracle.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Test1 {
	public static Optional<String> getGrade(int marks) {
		Optional<String> grade = Optional.empty();
		if (marks > 50) {
			grade = Optional.of("PASS");
		} else {
			//grade.of("FAIL");
			//grade=Optional.of("FAIL");
		}
		return grade;
	}

	public static void main(String[] args) {
		Optional<String> grade1 = getGrade(50); //grade1  FAIL
		Optional<String> grade2 = getGrade(55); // grade2 PASS
		System.out.println(grade1.orElse("UNKNOWN")); //FAIL
		if (grade2.isPresent()) {
			grade2.ifPresent(x -> System.out.println(x));// PASS
		} else {
			System.out.println("**");
			System.out.println(grade2.orElse("Empty"));// PASS
		}
		System.out.println("--------------");
		Optional<Employee> employee=getEmployee();
		System.out.println(employee.isPresent());
		System.out.println(employee.get());
		System.out.println(employee.get().id);
		System.out.println(employee.get().name);
		System.out.println("--------------------");
		Optional<List<String>> listOptional=getlist();
		if(listOptional.isPresent()){
			List<String > list=listOptional.get();
			list.stream().filter(e->!e.isEmpty()).forEach(e->System.out.println(e));
		}
		System.out.println("--------------");
		printEmployee(employee);
	}

	private static void printEmployee(Optional<Employee> employee) {
		if (employee.isPresent()) {
			Employee emp = employee.get();
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
		AtomicInteger id = new AtomicInteger();
		AtomicReference<String> name = new AtomicReference<String>();
		employee.ifPresent(e -> {
			id.set(e.id);
			name.set(e.name);
		});
		System.out.println(id.get());
		System.out.println(name.get());
	}

	static Optional<Employee> getEmployee(){
		Employee employee=new Employee();
		Optional<Employee> employeeOptional;

		employee.id=100;
		employee.name="dk";
		employeeOptional=Optional.ofNullable(employee);

		return employeeOptional;
	}

	static Optional<List<String>> getlist(){
		List<String> list= Arrays.asList("a","b","c","d","","","","e","f","g","h");
		//return Optional.empty();

		Optional<List<String>> optional=Optional.ofNullable(null);
		//return Optional.of(list); //Use this if youre sure that list is not null, if its null, then this thows NPE
		//return Optional.of(null);
		return Optional.ofNullable(list); // If your not sure that list is null or not, usr ofNullable.
	}
}
