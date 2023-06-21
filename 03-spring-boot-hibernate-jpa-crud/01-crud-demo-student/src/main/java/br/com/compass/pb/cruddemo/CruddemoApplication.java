package br.com.compass.pb.cruddemo;

import br.com.compass.pb.cruddemo.dao.StudentDAO;
import br.com.compass.pb.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//removeStudent(studentDAO);
			deleteAll(studentDAO);
		};



	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("Deleting all Students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted rows: " + numRowsDeleted);

	}

	private void removeStudent(StudentDAO studentDAO) {
		Integer id =  2;
		System.out.println("Deleting Student id: " + id);
		studentDAO.delete(id);
	}

	private void updateStudent(StudentDAO studentDAO) {

		Integer id =  2;
		System.out.println("Student id: " + id);

		System.out.println("Retrieve by given id...");
		Student myStudent = studentDAO.findById(id);

		System.out.println("Updating Student...");
		myStudent.setFirstName("Scooby");
		studentDAO.update(myStudent);


		System.out.println("Found student: " + myStudent);


	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> thStudents = studentDAO.findByLastName("Eyros");

		for (Student tempStudent: thStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> thStudents = studentDAO.findAll();

		for (Student tempStudent: thStudents) {
			System.out.println(tempStudent);
		}

	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student object: ");
		Student tempStudent = new Student("Guga", "Eyros", "guga.eyros@compasso.com");


		System.out.println("Saving student");
		studentDAO.save(tempStudent);



	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating student object: ");
		Student tempStudent = new Student("Rebeca", "Baruch", "rebeca.baruch@compasso.com");

		System.out.println("Saving student");
		studentDAO.save(tempStudent);

		Integer id =tempStudent.getId();
		System.out.println("Student id: " + id);

		System.out.println("Retrieve by given id...");
		Student myStudent = studentDAO.findById(id);

		System.out.println("Found student: " + myStudent);
	}

}
