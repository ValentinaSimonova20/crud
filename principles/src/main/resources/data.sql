CREATE TABLE employees(
    employee_id int PRIMARY KEY,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25) UNIQUE ,
    phone_number varchar(20),
    hire_date date,
    job_id varchar(10),
    salary int,
    manager_id int,
    department_id int
);

CREATE TABLE jobs(
    job_id varchar(10) PRIMARY KEY,
    job_title varchar(35),
    min_salary int,
    max_salary int
);

CREATE TABLE departments(
    department_id int PRIMARY KEY,
    department_name varchar(30),
    manager_id int,
    location_id int
);

CREATE TABLE locations(
    location_id int PRIMARY KEY not null,
    street_address varchar(40) not null ,
    city varchar(30) not null
);

CREATE TABLE job_history(
    employee_id int not null ,
    start_date date not null ,
    end_date date not null ,
    job_id varchar(10) not null ,
    department_id int
);

ALTER TABLE job_history add constraint job_history_pk primary key (employee_id, start_date);

ALTER TABLE departments add constraint fk_departments_locations
    FOREIGN KEY (location_id) REFERENCES locations (location_id);


ALTER TABLE employees add constraint fk_employees_departments
foreign key (department_id) references departments (department_id);

ALTER TABLE employees add constraint fk_employees_jobs
foreign key  (job_id) references jobs (job_id);

ALTER TABLE employees add constraint fk_employees
foreign key (manager_id) references employees (employee_id);

ALTER TABLE employees add column commission_pct int;

ALTER TABLE job_history add constraint fk_job_history_jobs
foreign key (job_id) references jobs (job_id);

ALTER TABLE job_history add constraint fk_job_history_employees
foreign key (employee_id) references employees (employee_id);

ALTER TABLE job_history add constraint fk_job_history_departments
foreign key (department_id) references departments(department_id);




INSERT INTO locations VALUES (1, 'pushkina street 2', 'Moscow');
INSERT INTO locations VALUES (2, 'arbatskaya street 3', 'Saint P');
INSERT INTO locations VALUES (3, 'black street 4', 'London');


INSERT INTO jobs VALUES (1, 'manager', 20000, 100000);
INSERT INTO jobs VALUES (2, 'programmer', 30000, 300000);
INSERT INTO jobs VALUES (3, 'economist', 20000, 150000);
INSERT INTO jobs VALUES ('IT_PROG', 'test', 20000, 150000);

INSERT INTO departments VALUES (1, 'department 1', 1, 1);
INSERT INTO departments VALUES (2, 'department 2', 1, 3);
INSERT INTO departments VALUES (3, 'department 3', 2, 2);
INSERT INTO departments VALUES (50, 'department 50', 2, 2);
INSERT INTO departments VALUES (20, 'department 20', 2, 2);
INSERT INTO departments VALUES (30, 'department 30', 2, 2);
INSERT INTO departments VALUES (80, 'department 30', 2, 2);


INSERT INTO employees VALUES (1, 'John','Black', 'black@gmail.com', '89997776655',
                              '2020-12-10',1,30000,null, 1);

INSERT INTO employees VALUES (2, 'Terry','White', 'white@gmail.com', '88887776655',
                              '2019-12-10',2,130000,1, 1);

INSERT INTO employees VALUES (3, 'Alex','Star', 'star@gmail.com', '89997736654',
                              '2018-12-10',3,50000,1, 1);

INSERT INTO employees VALUES (4, 'David','Star', 'starD@gmail.com', '89997736654',
                              '2018-12-10',3,50000,1, 1);

INSERT INTO employees VALUES (5, 'David','White', 'whiteD@gmail.com', '89997736654',
                              '2018-12-10',3,40000,1, 1);

INSERT INTO employees VALUES (6, 'David','White', 'whiteD2@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',40000,1, 1);

INSERT INTO employees VALUES (7, 'Ann','White', 'whiteAnn2@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',50000,1, 50);

INSERT INTO employees VALUES (8, 'Alex','White', 'whiteA2@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 50);

INSERT INTO employees VALUES (9, 'Alex','White', 'whiteA23@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 20);

INSERT INTO employees VALUES (10, 'Alex','White', 'whiteA21@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 30);

INSERT INTO employees VALUES (11, 'Anna','White', 'anna2@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 30);

INSERT INTO employees VALUES (12, 'Canada','White', 'canada@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 30);

INSERT INTO employees VALUES (13, 'Canada1','White', 'canada3@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 30, 10000);

INSERT INTO employees VALUES (14, 'Canada2','White', 'canada4@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 30,20000);

INSERT INTO employees VALUES (15, 'Canada6','White', 'canada5@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 30, 30000);

INSERT INTO employees VALUES (16, 'Canada1','White', 'canada30@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 80, 10000);

INSERT INTO employees VALUES (17, 'Canada2','White', 'canada40@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 80,20000);

INSERT INTO employees VALUES (18, 'Canada6','White', 'canada50@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 80, 30000);

INSERT INTO employees VALUES (19, 'Canada6','White', 'canada599@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 50, 30000);



SELECT * FROM employees;


SELECT * FROM employees WHERE first_name='David';

SELECT * FROM employees WHERE job_id='IT_PROG';

SELECT * FROM employees WHERE department_id=50 AND salary>4000;

SELECT * FROM employees WHERE department_id=20 OR department_id=30;

SELECT * FROM employees WHERE first_name LIKE '%a';

SELECT * FROM employees WHERE (department_id=50 or department_id=80) AND commission_pct IS NOT NULL;







