# Write your MySQL query statement below
select 
    st.student_id ,
    st.student_name,
    s.subject_name,
    count(e.subject_name  )as attended_exams
from Students st cross join Subjects s left join Examinations  e
    on st.student_id=e.student_id and s.subject_name=e.subject_name
GROUP BY 
    st.student_id,
    st.student_name,
    s.subject_name
ORDER BY 
    st.student_id,
    s.subject_name;