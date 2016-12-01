package com.tpg.question.two;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.tpg.question.two.domain.Student;

public class StudentsSortUtilUnitTest {
	
	@Test
	public void test_sort()
	{
		List<Student> students = new ArrayList<>();
		students.add(new Student(33l,"Tina",3.68d));
		students.add(new Student(85l,"Louis",3.85d));
		students.add(new Student(56l,"Samil",3.75));
		students.add(new Student(19l,"Samar",3.75d));
		students.add(new Student(33l,"Lorry",3.76d));
		
		
		List<Student> expected = new ArrayList<>();
		
		expected.add(new Student(85l,"Louis",3.85d));
		expected.add(new Student(33l,"Lorry",3.76d));
		expected.add(new Student(19l,"Samar",3.75d));
		expected.add(new Student(56l,"Samil",3.75));
		expected.add(new Student(33l,"Tina",3.68d));
		List<Student> actuals = StudentsSortUtil.sortByOrder(students);
		Assert.assertArrayEquals(expected.toArray(), actuals.toArray());
	}
	@Test
	public void test_sort_null()
	{
		Assert.assertNull(StudentsSortUtil.sortByOrder(null));
	}
}
