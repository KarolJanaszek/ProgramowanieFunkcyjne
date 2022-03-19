package com.company.pomocnicze;

import java.util.ArrayList;
import java.util.List;

public class StudentFactory {
	public StudentFactory() {
	}

	public static List<Student> generateStudents() {
		List<Student> students = new ArrayList();
		String[] names = new String[]{"Cezary", "Marian", "Marcel", "Alexander", "Marek", "Maciej", "Bartosz", "Edward", "Błażej", "Józef", "Gniewomir", "Amadeusz", "Alex", "Remigiusz", "Bruno", "Karol", "Piotr", "Maurycy", "Bolesław", "Leszek", "Jakub", "Ludwik", "Marcin", "Filip", "Henryk", "Bruno", "Marcel", "Jakub", "Eryk", "Janusz", "Florian", "Natan", "Kajetan", "Emanuel", "Mirosław", "Miłosz", "Bronisław", "Janusz", "Krystian", "Alfred", "Konrad", "Klaudiusz", "Dominik", "Bartłomiej", "Damian", "Milan", "Radosław", "Kewin", "Arkadiusz", "Kuba", "Anita", "Antonina", "Lila", "Bogusława", "Alice", "Amanda", "Wanda", "Lila", "Malwina", "Anita", "Daniela", "Dorota", "Jolanta", "Regina", "Bernadetta", "Paulina", "Florentyna", "Judyta", "Natalia", "Edyta", "Ewa", "Daria", "Blanka", "Helena", "Celina", "Jolanta", "Ewelina", "Julita", "Matylda", "Angelika", "Milena", "Joanna", "Oksana", "Jolanta", "Aneta", "Asia", "Patrycja", "Kaja", "Paula", "Ewa", "Kaja", "Emilia", "Julianna", "Alisa", "Anatolia", "Joanna", "Halina", "Judyta", "Edyta", "Faustyna"};
		String[] surnames = new String[]{"Nowak", "Kowalski", "Wiśniewski", "Dąbrowski", "Lewandowski", "Wójcik", "Kamiński", "Kowalczyk", "Zieliński", "Szymański", "Woźniak", "Kozłowski", "Jankowski", "Wojciechowski", "Kwiatkowski", "Kaczmarek", "Mazur", "Krawczyk", "Piotrowski", "Grabowski", "Nowakowski", "Pawłowski", "Michalski", "Nowicki", "Adamczyk", "Dudek", "Zając", "Wieczorek", "Jabłoński", "Król", "Majewski", "Olszewski", "Jaworski", "Wróbel", "Malinowski", "Pawlak", "Witkowski", "Walczak", "Stępień", "Górski", "Rutkowski", "Michalak", "Sikora", "Ostrowski", "Baran", "Duda", "Szewczyk", "Tomaszewski", "Pietrzak", "Marciniak", "Jakubowska", "Walczak", "Czerwińska", "Szulc", "Tomaszewska", "Witkowska", "Sadowska", "Przybylska", "Szczepańska", "Malinowska", "Rutkowska", "Wojciechowska", "Szymczak", "Wojciechowska", "Baranowska", "Kucharska", "Baranowska", "Baranowska", "Adamska", "Bąk", "Walczak", "Adamska", "Zielińska", "Lis", "Baran", "Zawadzka", "Piotrowska", "Gajewska", "Kwiatkowska", "Sikora", "Wiśniewska", "Krajewska", "Czarnecka", "Nowak", "Włodarczyk", "Stępień", "Wysocka", "Czerwińska", "Górska", "Laskowska", "Sadowska", "Michalak", "Szewczyk", "Szulc", "Mazur", "Górecka", "Jaworska", "Makowska", "Stępień", "Zakrzewska"};
		Integer[] marks = new Integer[]{1, 5, 4, 1, 4, 5, 1, 2, 3, 3, 4, 4, 2, 5, 2, 6, 4, 3, 2, 6, 3, 5, 3, 2, 2, 4, 4, 2, 6, 3, 1, 1, 2, 4, 2, 4, 6, 4, 1, 2, 1, 5, 2, 6, 2, 1, 6, 3, 4, 2, 1, 6, 3, 3, 3, 4, 6, 3, 4, 5, 6, 6, 4, 5, 2, 6, 2, 2, 1, 5, 1, 5, 4, 2, 5, 4, 3, 3, 6, 1, 4, 6, 4, 3, 6, 2, 4, 2, 3, 5, 3, 3, 1, 4, 4, 4, 2, 2, 4, 3, 3, 5, 2, 4, 6, 1, 1, 6, 3, 5, 2, 1, 5, 5, 6, 5, 6, 5, 6, 1, 6, 1, 6, 1, 5, 4, 2, 3, 1, 6, 4, 4, 3, 3, 4, 2, 2, 6, 6, 5, 6, 6, 5, 6, 4, 6, 1, 5, 4, 4, 3, 4, 2, 6, 1, 1, 4, 6, 4, 5, 4, 3, 5, 5, 2, 6, 3, 5, 2, 3, 2, 5, 4, 3, 2, 6, 4, 5, 3, 6, 4, 2, 6, 2, 6, 6, 3, 3, 2, 1, 5, 3, 3, 6, 6, 6, 2, 1, 6, 3, 5, 2, 1, 2, 5, 6, 5, 3, 2, 5, 3, 6, 6, 6, 1, 4, 1, 3, 4, 5, 1, 2, 4, 1, 3, 3, 1, 2, 1, 3, 6, 4, 1, 5, 1, 3, 6, 2, 4, 6, 1, 3, 3, 3, 4, 5, 3, 2, 4, 4, 6, 2, 3, 2, 5, 4, 5, 4, 2, 3, 5, 4, 2, 3, 3, 2, 6, 2, 5, 5, 2, 3, 2, 6, 1, 5, 1, 4, 1, 2, 6, 3, 4, 4, 2, 4, 4, 5, 6, 4, 6, 4, 6, 1, 2, 2, 2, 6, 6, 5};
		if (validateInputData(names, surnames, marks)) {
			return null;
		} else {
			for(int i = 0; i < names.length; ++i) {
				Level level = Level.values()[i % 7];
				Student student = new Student(names[i], surnames[i], level);

				for(int j = i; j < i + 3; ++j) {
					student.addMark(marks[j]);
				}

				students.add(student);
			}

			return students;
		}
	}

	private static boolean validateInputData(String[] names, String[] surnames, Integer[] marks) {
		return names.length == surnames.length && names.length == marks.length * 3;
	}
}
