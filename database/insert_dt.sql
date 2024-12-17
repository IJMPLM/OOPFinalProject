-- SCHOOLYEAR
INSERT INTO plm.schoolyear (syear)
VALUES ('2023-2024');

INSERT INTO plm.schoolyear (syear)
VALUES ('2024-2025');

-- SEMESTER
INSERT INTO plm.semester (semester)
VALUES ('1');

INSERT INTO plm.semester (semester)
VALUES ('2');

INSERT INTO plm.semester (semester)
VALUES ('3');

-- COLLEGE
INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CA', 'College of Accountancy', '01-01-1990', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CASBE', 'College of Architecture and Sustainable Built Environments', '01-10-2001', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CBA', 'College of Business Administration', '03-01-1995', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CED', 'College of Education', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CE', 'College of Engineering', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CHASS', 'College of Humanities, Arts, and Social Sciences', '01-01-1990', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CISTM', 'College of Information Systems and Technology Management', '12-08-2023', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CL', 'College of Law', '04-18-1989', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CM', 'College of Medicine', '06-01-1983', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CN', 'College of Nursing', '06-01-1967', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CPT', 'College of Physical Therapy', '01-01-1993', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CPA', 'College of Public Administration', '12-08-2023', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CS', 'College of Science', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.college (college_code, description, date_opened, date_closed, status)
VALUES ('CTHM', 'College of Tourism and Hospitality Management', '02-01-2024', '12-31-9999', 'A');

-- COURSE
INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSA', 'Bachelor of Science in Accountancy', 'CA', '01-01-1990', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS Arch', 'Bachelor of Science in Architecture', 'CASBE', '01-10-2001', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSBA-MM', 'Bachelor of Science in Business Administration major in Marketing Management', 'CBA', '03-01-1995', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSBA-BE', 'Bachelor of Science in Business Administration major in Business Economics', 'CBA', '03-01-1995', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSBA-FM', 'Bachelor of Science in Business Administration major in Financial Management', 'CBA', '03-01-1995', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSBA - HRM', 'Bachelor of Science in Business Administration major in Human Resource Management', 'CBA', '03-01-1995', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSBA - OM', 'Bachelor of Science in Business Administration major in Operations Management', 'CBA', '03-01-1995', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS Entrep', 'Bachelor of Science in Entrepreneurship', 'CBA', '03-01-1995', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS-REM', 'Bachelor of Science in Real Estate Management', 'CBA', '03-01-1995', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BEEd', 'Bachelor of Elementary Education', 'CED', '06-04-2015', '08-30-2023', 'I');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BECED', 'Bachelor of Early Childhood Education', 'CED', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSNED', 'Bachelor of Special Needs Education', 'CED', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSEd-Eng', 'Bachelor of Secondary Education major in English', 'CED', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSEd-Fil', 'Bachelor of Secondary Education major in Filipino', 'CED', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSEd-Math', 'Bachelor of Secondary Education major in Mathematics', 'CED', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSEd-Sci', 'Bachelor of Secondary Education major in Sciences', 'CED', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSEd-SS', 'Bachelor of Secondary Education major in Social Studies', 'CED', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BPEd', 'Bachelor of Physical Education', 'CED', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSChE', 'Bachelor of Science in Chemical Engineering', 'CE', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSCE-CM', 'Bachelor of Science in Civil Engineering with Specialization in Construction Management', 'CE', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSCE-SE', 'Bachelor of Science in Civil Engineering with Specialization in Structural Engineering', 'CE', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSCpE', 'Bachelor of Science in Computer Engineering', 'CE', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSEE', 'Bachelor of Science in Electrical Engineering', 'CE', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSECE', 'Bachelor of Science in Electronics Engineering', 'CE', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSMFGE', 'Bachelor of Science in Manufacturing Engineering', 'CE', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSME', 'Bachelor of Science in Mechanical Engineering', 'CE', '01-25-2000', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BAC', 'Bachelor of Arts in Communications', 'CHASS', '01-01-1990', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BAC-PR', 'Bachelor of Arts in Communications with Specialization in Public Relations', 'CHASS', '01-01-1990', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSSW', 'Bachelor of Science in Social Work', 'CHASS', '01-01-1990', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BMMP', 'Bachelor of Music in Music Performance', 'CHASS', '01-01-1990', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSCS', 'Bachelor of Science in Computer Science', 'CISTM', '12-08-2023', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSIT', 'Bachelor of Science in Information Technology', 'CISTM', '12-08-2023', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('JD', 'Juris Doctor', 'CL', '04-18-1989', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('MD', 'Doctor of Medicine', 'CM', '06-01-1983', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSN', 'Bachelor of Science in Nursing', 'CN', '06-01-1967', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSPT', 'Bachelor of Science in Physical Therapy', 'CPT', '01-01-1993', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BPA', 'Bachelor of Public Administration', 'CPA', '12-08-2023', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS BIO', 'Bachelor of Science in Biology', 'CS', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS BIO-MB', 'Bachelor of Science in Biology major in Medical Biology', 'CS', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS BIO-CMB', 'Bachelor of Science in Biology major in Cell and Molecular Biology', 'CS', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS BIO-Eco', 'Bachelor of Science in Biology major in Ecology', 'CS', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS Chem', 'Bachelor of Science in Chemistry', 'CS', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS Math', 'Bachelor of Science in Mathematics', 'CS', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BS Psych', 'Bachelor of Science in Psychology', 'CS', '06-04-2015', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSTM', 'Bachelor of Science in Tourism Management', 'CTHM', '02-01-2024', '12-31-9999', 'A');

INSERT INTO plm.course (course_code, description, college_code, date_opened, date_closed, status)
VALUES ('BSHM', 'Bachelor of Science in Hospitality Management', 'CTHM', '02-01-2024', '12-31-9999', 'A');

-- STUDENT
INSERT INTO plm.student (student_no, lastname, firstname, email, gender, course_code, cp_num, address, bday, status, date_started, date_graduated)
VALUES (202300001, 'Aliswag', 'Karylle', 'kaliswag@yahoo.com', 'F', 'BSCS', '09000000001', 'Manila', '04-16-2005', 'A', '08-30-2023', '08-30-2027');

INSERT INTO plm.student (student_no, lastname, firstname, email, gender, course_code, cp_num, address, bday, status, date_started, date_graduated)
VALUES (202300002, 'Del Rosario', 'Juana', 'jdelrosario@yahoo.com', 'F', 'BSCS', '09000000002', 'Rizal', '01-20-2005', 'A', '08-30-2023', '08-30-2027');

INSERT INTO plm.student (student_no, lastname, firstname, email, gender, course_code, cp_num, address, bday, status, date_started, date_graduated)
VALUES (202300003, 'Dela Peña', 'Daniella', 'ddelapeña@yahoo.com', 'F', 'BSCS', '09000000003', 'Manila', '05-14-2005', 'A', '08-30-2023', '08-30-2027');

INSERT INTO plm.student (student_no, lastname, firstname, email, gender, course_code, cp_num, address, bday, status, date_started, date_graduated)
VALUES (202300004, 'Garsota', 'Janine', 'jgarsota@yahoo.com', 'F', 'BSCS', '09000000004', 'Manila', '07-02-2005', 'A', '08-30-2023', '08-30-2027');

-- EMPLOYEE
INSERT INTO plm.employee (employee_id, lastname, firstname, email, gender, cp_num, address, bday, status, date_started, date_resigned)
VALUES ('E001', 'Soberano', 'Liza', 'lsoberano@yahoo.com', 'F', '09900000001', 'Manila', '01-01-1980', 'A', '12-08-2023', '12-31-9999');

INSERT INTO plm.employee (employee_id, lastname, firstname, email, gender, cp_num, address, bday, status, date_started, date_resigned)
VALUES ('E002', 'Bernardo', 'Kathryn', 'kbernardo@yahoo.com', 'F', '09900000002', 'Manila', '01-02-1980', 'A', '12-09-2023', '12-31-9999');

INSERT INTO plm.employee (employee_id, lastname, firstname, email, gender, cp_num, address, bday, status, date_started, date_resigned)
VALUES ('E003', 'Lustre', 'Nadine', 'nlustre@yahoo.com', 'F', '09900000003', 'Manila', '01-03-1980', 'A', '12-10-2023', '12-31-9999');

INSERT INTO plm.employee (employee_id, lastname, firstname, email, gender, cp_num, address, bday, status, date_started, date_resigned)
VALUES ('E004', 'Smith', 'Sofia', 'ssmith@yahoo.com', 'F', '09900000004', 'Manila', '01-04-1980', 'A', '12-11-2023', '12-31-9999');

-- SUBJECT
INSERT INTO plm.subject (subject_code, description, units, curriculum, college_code, status, date_opened, date_closed)
VALUES ('PATHFIT311', 'Touch Rugby', 2, '2015', 'CED', 'A', '06-04-2015', '12-31-9999');

INSERT INTO plm.subject (subject_code, description, units, curriculum, college_code, status, date_opened, date_closed)
VALUES ('ETH 008', 'Ethics', 3, '2000', 'CHASS', 'A', '01-01-1990', '12-31-9999');

INSERT INTO plm.subject (subject_code, description, units, curriculum, college_code, status, date_opened, date_closed)
VALUES ('UTS 003', 'Understanding the Self', 3, '2000', 'CHASS', 'A', '01-01-1990', '12-31-9999');

INSERT INTO plm.subject (subject_code, description, units, curriculum, college_code, status, date_opened, date_closed)
VALUES ('CSC 0224', 'Operation Research', 3, '2015', 'CE', 'A', '01-25-2000', '12-31-9999');

INSERT INTO plm.subject (subject_code, description, units, curriculum, college_code, status, date_opened, date_closed)
VALUES ('CSC 0213', 'Logic Design and Digital Computer Circuits', 3, '2023', 'CISTM', 'A', '12-08-2023', '12-31-9999');

INSERT INTO plm.subject (subject_code, description, units, curriculum, college_code, status, date_opened, date_closed)
VALUES ('CSC 0212', 'Object Oriented Programming', 3, '2023', 'CISTM', 'A', '12-08-2023', '12-31-9999');

INSERT INTO plm.subject (subject_code, description, units, curriculum, college_code, status, date_opened, date_closed)
VALUES ('ICC 0105', 'Information Management', 3, '2023', 'CISTM', 'A', '12-08-2023', '12-31-9999');

INSERT INTO plm.subject (subject_code, description, units, curriculum, college_code, status, date_opened, date_closed)
VALUES ('ITE 001', 'Living in the I.T. Era', 3, '2023', 'CISTM', 'A', '12-08-2023', '12-31-9999');

