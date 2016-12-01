package com.tpg.question.two;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tpg.question.two.domain.Student;

public class StudentsSortUtil {

	/**
	 * The method is to rearrange them according to their GPA in descending
	 * order. If two students have the same GPA, then arrange them according to
	 * their first name in alphabetical order. If those two students also have
	 * the same first name, then sort them in ascending order according to their
	 * IDs. No two students have the same ID.
	 * 
	 * @param students
	 * @return ordered student list.
	 */
	public static List<Student>   sortByOrder(List<Student> students) {
		if (students != null) {
			Collections.sort(students, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getGPA() == o2.getGPA()) {
						if (o1.getName().compareToIgnoreCase(o2.getName()) == 0) {
							return o1.getId() - o2.getId() < 0 ? -1 : 1;
						}
						return o1.getName().compareToIgnoreCase(o2.getName());
					}

					return o1.getGPA() - o2.getGPA() < 0 ? 1 : -1;
				}
			});
		}
		return students;
	}

}
