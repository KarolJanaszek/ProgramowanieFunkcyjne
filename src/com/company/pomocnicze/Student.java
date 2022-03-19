package com.company.pomocnicze;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	private Long id;
	private String name;
	private String surname;
	private Level level;
	private List<Double> marks;
	private static long COUNTER = 0L;

	public Student(String name, String surname, Level level) {
		this.name = name;
		this.surname = surname;
		this.level = level;
		this.marks = new ArrayList();
		this.id = COUNTER;
		++COUNTER;
	}

	public void addMark(Integer mark) {
		if (this.isMarkVaild(mark)) {
			this.marks.add((double)mark);
		}

	}

	public Double getAverageGrade() {
		double result = 0.0D;

		Double mark;
		for(Iterator var3 = this.marks.iterator(); var3.hasNext(); result += mark) {
			mark = (Double)var3.next();
		}

		return result / (double)this.marks.size();
	}

	private boolean isMarkVaild(Integer mark) {
		return mark > 0 && mark <= 6;
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public List<Double> getMarks() {
		return this.marks;
	}

	public String toString() {
		return "Student{id=" + this.id + ", name='" + this.name + "', surname='" + this.surname + "', level=" + this.level + "}";
	}
}

