package org.fundatec.ti19.vinilemess.cassandraconnectionpoc;

import org.fundatec.ti19.vinilemess.cassandraconnectionpoc.model.Student;
import org.fundatec.ti19.vinilemess.cassandraconnectionpoc.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.UUID;

@SpringBootApplication
public class CassandraConnectionPocApplication {

	private static Logger logger = LoggerFactory.getLogger(CassandraConnectionPocApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CassandraConnectionPocApplication.class, args);
		StudentService studentService = context.getBean(StudentService.class);
		studentService.deleteAll();
		Student vinicius = new Student(UUID.randomUUID(), "Vinicius Lemes Caetano", "TI19", "Fundatec");
		Student joao = new Student(UUID.randomUUID(), "Joao Gabriel Meleski Dier", "TI19", "Fundatec");
		Student savedVinicius = studentService.saveStudent(vinicius);
		Student savedJoao = studentService.saveStudent(joao);

		studentService.getAllStudents().forEach(
				student -> logger.info(student.toString()));

		studentService.getStudentById(savedVinicius.getId())
				.ifPresent(student -> logger.info(student.toString()));

		studentService.getStudentById(savedJoao.getId())
				.ifPresent(student -> logger.info(student.toString()));
	}
}
