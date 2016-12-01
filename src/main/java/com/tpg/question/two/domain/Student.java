package com.tpg.question.two.domain;

public class Student {
	
	private Long Id;
	private String Name;
	private Double GPA;
	public Student()
	{
		
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", GPA=" + GPA + "]";
	}
	public Student (Long id,String Name, Double GPA)
	{
		setId(id);
		setName(Name);
		setGPA(GPA);
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getGPA() {
		return GPA;
	}
	public void setGPA(Double gPA) {
		GPA = gPA;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((GPA == null) ? 0 : GPA.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (GPA == null) {
			if (other.GPA != null)
				return false;
		} else if (!GPA.equals(other.GPA))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}
}
