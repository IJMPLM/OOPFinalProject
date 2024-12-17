CREATE TABLE plm.schoolyear (
syear             VARCHAR(10)      NOT NULL
, CONSTRAINT  syear_pk  PRIMARY KEY(syear)
);

CREATE TABLE  plm.semester (
semester          VARCHAR(1)       NOT NULL
, CONSTRAINT  semester_pk PRIMARY KEY(semester)
);

CREATE TABLE plm.college (
college_code      VARCHAR(10)     NOT NULL
, description     VARCHAR(200)    NOT NULL 
, date_opened     DATE            NOT NULL
, date_closed     DATE            NOT NULL
, status          VARCHAR(1)      DEFAULT 'A'
, CONSTRAINT  college_code_pk PRIMARY KEY(college_code)
);

CREATE TABLE plm.course (
course_code       VARCHAR(10)     NOT NULL
, description     VARCHAR(200)    NOT NULL
, college_code    VARCHAR(10)     NOT NULL
, date_opened     DATE            
, date_closed     DATE            
, status          VARCHAR(1)      DEFAULT 'A'
, CONSTRAINT  course_code_pk  PRIMARY KEY(course_code)
, CONSTRAINT  college_code_fk FOREIGN KEY(college_code) REFERENCES plm.college(college_code)
);

CREATE TABLE plm.student (
student_no        VARCHAR(10)     NOT NULL
, lastname        VARCHAR(32)     NOT NULL    
, firstname       VARCHAR(32)     NOT NULL 
, email           VARCHAR(32)     NOT NULL 
, gender          CHAR            NOT NULL
, course_code     VARCHAR(10)     NOT NULL 
, cp_num          VARCHAR(11)     NOT NULL
, address         VARCHAR(32)     NOT NULL
, bday            DATE            NOT NULL      
, status          VARCHAR(1)      DEFAULT 'A'
, date_started    DATE            
, date_graduated  DATE            
, CONSTRAINT  student_no_pk  PRIMARY KEY(student_no)
, CONSTRAINT  course_code_fk FOREIGN KEY(course_code) REFERENCES plm.course(course_code)
);

CREATE TABLE plm.employee (
employee_id       VARCHAR(10)     NOT NULL
, lastname        VARCHAR(32)     NOT NULL
, firstname       VARCHAR(32)     NOT NULL
, email           VARCHAR(32)     NOT NULL 
, gender          CHAR            NOT NULL
, cp_num          VARCHAR(11)     NOT NULL
, address         VARCHAR(32)     NOT NULL
, bday            DATE            NOT NULL
, status          VARCHAR(1)      DEFAULT 'A'
, date_started    DATE
, date_resigned   DATE
, CONSTRAINT  employee_id_pk  PRIMARY KEY(employee_id)
);

CREATE TABLE plm.subject ( 
subject_code      VARCHAR(10)     NOT NULL 
, description     VARCHAR(200)    NOT NULL 
, units           INTEGER         DEFAULT 3 
, curriculum      VARCHAR(10)     DEFAULT '2000' 
, college_code    VARCHAR(10)     NOT NULL 
, status          VARCHAR(1)      DEFAULT 'A' 
, date_opened     DATE 
, date_closed     DATE 
, CONSTRAINT subject_pk PRIMARY KEY(subject_code, college_code) 
, CONSTRAINT college_code_fk1 FOREIGN KEY(college_code) REFERENCES plm.college(college_code) 
, CONSTRAINT unique_subject_code UNIQUE(subject_code)
);