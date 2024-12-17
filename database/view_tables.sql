CREATE VIEW plm.vwschedule AS
SELECT s.syear
        , s.semester
        , s.college_code
        , s.block_no
        , s.subject_code
        , sub.description
        , s.day
        , s.time
        , s.room
        , s.type
        , s.sequence_no
        , e.employee_id
        , e.lastname||', '||e.firstname   employee_name  
FROM plm.subject_schedule  s
INNER JOIN plm.subject sub
    ON s.subject_code = sub.subject_code
INNER JOIN plm.employee e
    ON s.employee_id = e.employee_id;
    
    SELECT * FROM plm.vwschedule;

CREATE VIEW PLM.vwgrades AS
SELECT s.syear
        , s.semester
        , g.student_no
        , s.subject_code
        , sub.description
        , s.block_no
        , g.grade
        , CASE WHEN g.grade > 3.00 THEN 'Failed'
               ELSE 'Passed'
          END AS Remark     
FROM plm.subject_schedule  s
INNER JOIN plm.subject sub
    ON s.subject_code = sub.subject_code
INNER JOIN plm.grades g
    ON s.subject_code = g.subject_code;
    
    
  
  
