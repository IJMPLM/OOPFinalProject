-- SUBJECT_SCHEDULE
INSERT INTO plm.subject_schedule (syear, semester, college_code, block_no, subject_code, day, time, room, type, sequence_no, employee_id)
VALUES ('2024-2025', '1', 'CISTM', 'CS23', 'CSC 0212', 'S', '1:30-3:30', 'CL 4', 'F2F', 1, 'E001');

INSERT INTO plm.subject_schedule (syear, semester, college_code, block_no, subject_code, day, time, room, type, sequence_no, employee_id)
VALUES ('2024-2025', '1', 'CISTM', 'CS23', 'CSC 0213', 'S', '7:00-10:00', 'GV 307', 'F2F', 1, 'E002');

INSERT INTO plm.subject_schedule (syear, semester, college_code, block_no, subject_code, day, time, room, type, sequence_no, employee_id)
VALUES ('2024-2025', '1', 'CE', 'CS23', 'CSC 0224', 'M', '11:00-1:00', 'GCA 306', 'F2F', 1, 'E003');

INSERT INTO plm.subject_schedule (syear, semester, college_code, block_no, subject_code, day, time, room, type, sequence_no, employee_id)
VALUES ('2024-2025', '1', 'CISTM', 'CS23', 'ICC 0105', 'M', '6:00-9:00', 'CL 4', 'F2F', 1, 'E004');

-- GRADES
INSERT INTO plm.grades (syear, semester, student_no, subject_code, block_no, grade)
VALUES ('2024-2025', '1', '202300001', 'CSC 0212', 'CS23', '1.00');

INSERT INTO plm.grades (syear, semester, student_no, subject_code, block_no, grade)
VALUES ('2024-2025', '1', '202300002', 'CSC 0213', 'CS23', '1.25');

INSERT INTO plm.grades (syear, semester, student_no, subject_code, block_no, grade)
VALUES ('2024-2025', '1', '202300003', 'CSC 0224', 'CS23', '1.50');

INSERT INTO plm.grades (syear, semester, student_no, subject_code, block_no, grade)
VALUES ('2024-2025', '1', '202300004', 'ICC 0105', 'CS23', '1.75');


