CREATE TABLE plm.subject_schedule ( 
syear             VARCHAR(10)     NOT NULL 
, semester        VARCHAR(1)      NOT NULL 
, college_code    VARCHAR(10)     NOT NULL  
, block_no        VARCHAR(15)     NOT NULL 
, subject_code    VARCHAR(10)     NOT NULL 
, day             VARCHAR(10)     NOT NULL 
, time            VARCHAR(20)     NOT NULL 
, room            VARCHAR(10)     NOT NULL 
, type            VARCHAR(10)     NOT NULL 
, sequence_no     INTEGER         DEFAULT 1 
, employee_id     VARCHAR(10)     DEFAULT 'TBA' 
, CONSTRAINT syear_fk FOREIGN KEY(syear) REFERENCES plm.schoolyear(syear) 
, CONSTRAINT semester_fk FOREIGN KEY(semester) REFERENCES plm.semester(semester) 
, CONSTRAINT college_code_fk2 FOREIGN KEY(college_code) REFERENCES plm.college(college_code) 
, CONSTRAINT subject_code_fk FOREIGN KEY(subject_code) REFERENCES plm.subject(subject_code) 
, CONSTRAINT employee_id_fk FOREIGN KEY(employee_id) REFERENCES plm.employee(employee_id) 
, CONSTRAINT subject_schedule_pk PRIMARY KEY(syear, semester, block_no, subject_code, sequence_no, college_code) 
);

CREATE TABLE plm.grades ( 
syear             VARCHAR(10)     NOT NULL 
, semester        VARCHAR(1)      NOT NULL 
, student_no      VARCHAR(10)     NOT NULL 
, subject_code    VARCHAR(10)     NOT NULL 
, block_no        VARCHAR(15)     NOT NULL 
, grade           DECIMAL(5,2) 
, CONSTRAINT syear_fk1 FOREIGN KEY(syear) REFERENCES plm.schoolyear(syear) 
, CONSTRAINT semester_fk1 FOREIGN KEY(semester) REFERENCES plm.semester(semester) 
, CONSTRAINT student_no_fk FOREIGN KEY(student_no) REFERENCES plm.student(student_no) 
, CONSTRAINT subject_code_fk1 FOREIGN KEY(subject_code) REFERENCES plm.subject(subject_code) 
, CONSTRAINT grades_pk PRIMARY KEY(syear, semester, student_no, subject_code, block_no) 
);
