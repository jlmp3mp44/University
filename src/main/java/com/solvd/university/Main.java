package com.solvd.university;

import com.solvd.university.model.*;
import com.solvd.university.service.*;
import com.solvd.university.service.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Logger LOGGER = LogManager.getLogger(Main.class);

        List<Faculty> faculties;
        List<Cafedra> cafedries;
        List<Speciality> specialities;

        File file =  new File("src/main/resources/xml/exam.xml");


        HealthRecord healthRecord = new HealthRecord("VERY HEALTHY");
        Allergy allergy = new Allergy("Flowers", "Akwater", new Date(2023 - 12 - 11), null);
        Vaccine vaccine = new Vaccine("Stolbnyak", "Vaccine from stolbnyak", new Date(2011 - 05 - 06), null);

        University university = new University("Kyiv NATIONAL Collage", "Anton");
        Faculty faculty = new Faculty("KRT", "Good faculty", "Misha", null);
        Cafedra cafedra = new Cafedra("Mathematics", "Cafedra about mathematic", null);
        Speciality speciality = new Speciality("121", "Cool speciality", null);
        Speciality speciality2 = new Speciality("126", "Awesome speciality", null);
        Price price = new Price(35000, null);

        Student student = new Student("ALEX", "ZELENSKIY", "026313161",
                "potap@gmail.com", null);
        Professor professor = new Professor("Leonardo", "Di Caprio", null);

        Subject subject = new Subject("Art", "Very interisting art");

        Exam exam = new Exam("Programming", new Date(2023 - 23 - 05), "Exam for programming", null, 40);
        Payment payment = new Payment("Monobank", null, null, new Date(2023 - 12 - 01));

        faculties =  List.of(faculty);
        cafedries =  List.of(cafedra);
        specialities =  List.of(speciality, speciality2);
        university.setFaculties(faculties);
        faculty.setCafedries(cafedries);
        cafedra.setSpecialities(specialities);


        Service allergyService = new AllergyServiceImpl();

        Service cafedraService = new CafedraServiceImpl();

        Service healthRecordService = new HealthRecordServiceImpl();

        Service examService = new ExamServiceImpl();

        Service facultyService = new FacultyServiceImpl();

        Service paymentService = new PaymentServiceImpl();

        Service priceService = new PriceServiceImpl();

        Service professorService = new ProfessorServiceImpl();

        Service specialityService = new SpecialityServiceImpl();

        Service studentService = new StudentServiceImpl();

        Service subjectService = new SubjectServiceImpl();

        Service universityService = new UniversityServiceImpl();

        Service vaccineService = new VaccineServiceImpl();

        ManyToManyService studentsExamsService =  new StudentsExamsServiceImpl();

        ManyToManyService subjectsSpecialitiesService =  new SubjectSpecialityServiceImpl();

        ManyToManyService subjectsProfessorsService =  new SubjectsProfessorsServiceImpl();


        priceService.create(price);
        paymentService.create(payment);

        healthRecordService.create(healthRecord);

        allergy.setHealthRecordId(healthRecord.getId());
        allergyService.create(allergy);
        vaccine.setHealthRecordId(healthRecord.getId());
        vaccineService.create(vaccine);



        universityService.create(university);
        faculty.setUniversityId(university.getId());
        facultyService.create(faculty);

        cafedra.setFacultyId(faculty.getId());
        cafedraService.create(cafedra);
        speciality.setCafedraId(cafedra.getId());
        specialityService.create(speciality);
        speciality2.setCafedraId(cafedra.getId());
        specialityService.create(speciality2);
        price.setSpecialityId(speciality.getId());
        priceService.create(price);

        student.setHealthRecordId(healthRecord.getId());
        studentService.create(student);
        professor.setCafedraId(cafedra.getId());
        professorService.create(professor);

        exam.setSpecialityId(speciality2.getId());
        examService.create(exam);
        payment.setPriceId(price.getId());
        payment.setStudentId(student.getId());
        paymentService.create(payment);

        subjectService.create(subject);


        //many-to-many
        studentsExamsService.create(student, exam);
        subjectsProfessorsService.create(subject, professor);
        subjectsSpecialitiesService.create(speciality, subject);

        LOGGER.info("Allergy id " + allergy.getId());
        LOGGER.info("Vaccine id " + vaccine.getId());
        LOGGER.info("Health Record id " + healthRecord.getId());
        LOGGER.info("University id " + university.getId());
        LOGGER.info("Faculty id " + faculty.getId());
        LOGGER.info("Cafedra id " + cafedra.getId());
        LOGGER.info("Speciality id " + speciality.getId());
        LOGGER.info("Price id " + price.getId());
        LOGGER.info("Student id " + student.getId());
        LOGGER.info("Professor id " + professor.getId());
        LOGGER.info("Exam id " + exam.getId());
        LOGGER.info("Payment id " + payment.getId());

        allergy.setPills("Akwa");
        vaccine.setData(new Date(2017 - 05 - 04));

        healthRecordService.findById(12L);
        allergyService.update(allergy);
        vaccineService.update(vaccine);
        List<University> universities =  universityService.findAll();
        System.out.println(universities.get(0));
        System.out.println(university.getFaculties().get(0));
        //List<Faculty> faculties = facultyService.findAll();
        specialityService.update(speciality);
        subjectService.findById(1l);


        DocumentBuilderFactory  factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            document.getChildNodes();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }

    }
}