package br.com.compass.pb.crudadvanceddemo;

import br.com.compass.pb.crudadvanceddemo.dao.AppDAO;
import br.com.compass.pb.crudadvanceddemo.entity.Instructor;
import br.com.compass.pb.crudadvanceddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudAdvancedDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAdvancedDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){

		return runner ->
		{	//createInstructor(appDAO);
			//findInstructorByID(appDAO);
			removeInstructorById(appDAO);
		};

	}

	private void removeInstructorById(AppDAO appDAO) {
		Integer id = 1;
		System.out.println("Deleting instructor by id: " + id);
		appDAO.removeById(id);
	}

	private void findInstructorByID(AppDAO appDAO) {

		Integer id = 1;
		System.out.println("Finding instructor with id: " + id);
		System.out.println(appDAO.findById(id));

	}

	private void createInstructor(AppDAO appDAO) {

		Instructor theInstructor = new Instructor("Mateus", "Ribeiro", "mateus.ribeiro@compass.com.br");

		InstructorDetail theInstructorDetail = new InstructorDetail("MateusOKBlz", "games");


		theInstructor.setInstructorDetail(theInstructorDetail);

		System.out.println("Saving instructor...");
		appDAO.save(theInstructor);

	}

}
