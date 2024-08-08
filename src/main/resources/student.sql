INSERT INTO Classroom ( building_name, room_number)
VALUES
    ( 'Science Building', '101'),
    ('Arts Building', '202'),
    ( 'Engineering Building', '303');

-- Insert data into the Student table
INSERT INTO Student (student_number, first_name, middle_name, last_name, cgpa, date_of_enrollment, classroom_id)
VALUES
    ('S001', 'Nahom', 'A.', 'Birhane', 3.8, '2020-09-01', 1),
    ('S002', 'Mengis', 'F.', 'Tekle', 3.4, '2021-01-15', 1),
    ('S003', 'Aron', 'B.', 'Bereket', 3.5, '2019-09-01', 2),
    ('S004', 'Semhar', 'C.', 'Haile', 3.9, '2021-01-15', 2),
    ('S005', 'Michal', 'E.', 'Tesfu', 3.6, '2019-09-01', 3),
    ('S006', 'Jossie', 'G.', 'Davis', 3.5, '2020-09-01', 3),
    ('S007', 'Mussie', 'H.', 'Massa', 3.8, '2019-09-01', 1);




INSERT INTO classroom ( building_name, room_number)
VALUES
    ( 'Building A', '101'),
    ( 'Building B', '202');

INSERT INTO transcript ( degree_title)
VALUES
    ( 'Bachelor of Science in Computer Science'),
    ( 'Master of Science in Computer Science');

-- Insert data into Course table
INSERT INTO course ( course_code, course_name)
VALUES
    ( 'CS101', 'Introduction to Computer Science'),
    ( 'CS102', 'Data Structures'),
    ( 'CS103', 'Algorithms');

-- Insert data into Student table
INSERT INTO student ( student_number, first_name, middle_name, last_name, cgpa, date_of_enrollment, transcript_id, classroom_id)
VALUES
    ( 'S0011', 'Nahom', 'A.', 'Birhane', 3.8, '2020-09-01', 1, 1),
    ( 'S0012', 'Mengis', 'F.', 'Tekle', 3.4, '2021-01-15', 2, 2),
    ( 'S0013', 'Aron', 'B.', 'Bereket', 3.5, '2019-09-01', 1, 1),
    ( 'S0014', 'Hermon', 'C.', 'Haile', 3.9, '2021-01-15', 2, 2),
    ( 'S0015', 'Michal', 'E.', 'Tesfu', 3.6, '2019-09-01', 1, 1),
    ( 'S0016', 'Silvana', 'G.', 'Davis', 3.5, '2020-09-01', 2, 2),
    ( 'S0017', 'Asmerom', 'H.', 'Massa', 3.8, '2019-09-01', 1, 1);


INSERT INTO student_course (student_id, course_id)
VALUES
    (1, 1), -- Nahom enrolled in Introduction to Computer Science
    (1, 2), -- Nahom enrolled in Data Structures
    (2, 1), -- Mengis enrolled in Introduction to Computer Science
    (2, 3), -- Mengis enrolled in Algorithms
    (3, 2), -- Aron enrolled in Data Structures
    (3, 3), -- Aron enrolled in Algorithms
    (4, 1), -- Semhar enrolled in Introduction to Computer Science
    (4, 2), -- Semhar enrolled in Data Structures
    (5, 3), -- Michal enrolled in Algorithms
    (6, 1), -- Jossie enrolled in Introduction to Computer Science
    (6, 2), -- Jossie enrolled in Data Structures
    (7, 3); -- Mussie enrolled in Algorithms