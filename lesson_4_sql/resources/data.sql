CREATE DATABASE hr_sample;
CREATE USER hr_sample_user WITH ENCRYPTED PASSWORD '12345678';
GRANT ALL PRIVILEGES ON DATABASE hr_sample TO hr_sample_user;


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

/* Primary key из двух полей */
ALTER TABLE job_history add constraint job_history_pk primary key (employee_id, start_date);

ALTER TABLE departments add constraint fk_departments_locations
    FOREIGN KEY (location_id) REFERENCES locations (location_id);


ALTER TABLE employees add constraint fk_employees_departments
foreign key (department_id) references departments (department_id);

ALTER TABLE employees add constraint fk_employees_jobs
foreign key  (job_id) references jobs (job_id);

ALTER TABLE employees add constraint fk_employees
foreign key (manager_id) references employees (employee_id);

/* Добавления столбца для задания 7 */
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

INSERT INTO employees VALUES (20, 'Annn','White', 'canada59999@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',55000,1, 50, 30000);

INSERT INTO employees VALUES (21, 'Annn','White', 'canada59999676@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',9000,1, 50, 30000);

INSERT INTO employees VALUES (22, 'Annn','White', 'canada599996676@gmail.com', '89997736654',
                              '2018-12-10','IT_PROG',8000,1, 50, 30000);

INSERT INTO employees VALUES (23, 'Annn','White', 'cana76@gmail.ru', '89997736654',
                              '2018-12-10','IT_PROG',9008,1, 50, 30000);
INSERT INTO employees VALUES (24, 'Annn%','White', 'cana76@gmail.ru_', '89997736654',
                              '2018-12-10','IT_PROG',9008,1, 50, 30000);


INSERT INTO employees VALUES (25, '%Annn','White', 'cana76@gmail.ru__', '89997736654',
                              '2018-12-10','IT_PROG',9008,1, 50, 30000);

INSERT INTO employees VALUES (26, 'An%nn','White', 'cana76@gmail.ru___', '89997736654',
                              '2018-12-10','IT_PROG',9008,1, 50, 30000);

INSERT INTO employees VALUES (27, 'Annnnnnnnnnnnnn','White', 'cana76@gmail.ru____', '89997736654',
                              '2018-12-10','IT_PROG',9008,1, 50, 30000);

INSERT INTO employees VALUES (28, 'bob','White', 'bob@gmail.ru', '89997736654',
                              '2018-12-10','IT_PROG',9008,1, 50, 30000);

INSERT INTO employees VALUES (29, 'Bob','White', 'Bob@gmail.ru____', '89997736654',
                              '2018-12-10','IT_PROG',9008,1, 50, 30000);


insert into job_history values (1,'2020-02-02','2021-12-10',1,3);
insert into job_history values (2,'2021-02-02','2022-12-10',2,2);
insert into job_history values (2,'2022-02-02','2023-12-10',1,3);
insert into job_history values (3,'2018-02-02','2021-12-10',1,1);
insert into job_history values (3,'2018-12-12','2021-12-10',1,1);


/* 1.Получить список с информацией обо всех сотрудниках  */
SELECT * FROM employees;

/* 2.Получить список всех сотрудников с именем 'David' */
SELECT * FROM employees WHERE first_name='David';

/* 3. Получить список всех сотрудников с job_id равным 'IT_PROG' */
SELECT * FROM employees WHERE job_id='IT_PROG';

/* 4. Получить список всех сотрудников из 50го отдела (department_id) с зарплатой(salary), большей 4000 */
SELECT * FROM employees WHERE department_id=50 AND salary>4000;

/* 5. Получить список всех сотрудников из 20го и из 30го отдела (department_id) */
SELECT * FROM employees WHERE department_id=20 OR department_id=30;

/* 6. Получить список всех сотрудников у которых последняя буква в имени равна 'a'*/
SELECT * FROM employees WHERE first_name LIKE '%a';

/* 7. Получить список всех сотрудников из 50го и из 80го отдела (department_id) у которых есть бонус (значение в колонке commission_pct не пустое) */
SELECT * FROM employees WHERE (department_id=50 or department_id=80) AND commission_pct IS NOT NULL;


/* 8. Получить список всех сотрудников у которых в имени содержатся минимум 2 буквы 'n' */
SELECT *,  regexp_matches(first_name,'[n]{2,}') from employees;

/* 9. Получить список всех сотрудников у которых длина имени больше 4 букв */
SELECT *,  regexp_matches(first_name,'\w{5,}') from employees;

/* 10. Получить список всех сотрудников у которых зарплата находится в промежутке от 8000 до 9000 (включительно) */
SELECT * from employees where salary between 8000 and 9000;

/* 11. Получить список всех сотрудников у которых в имени содержится символ '%' */
SELECT * from employees where first_name LIKE '%\%%';

/*12. Получить список всех ID менеджеров*/
SELECT DISTINCT manager_id from departments;

/*13. Получить список работников с их позициями в формате: Donald(sh_clerk).*/
SELECT concat(employees.first_name,'(', jobs.job_title,')') from employees, jobs where employees.job_id = jobs.job_id;

/*14. Получить список всех сотрудников у которых длина имени больше 10 букв*/
SELECT *,  regexp_matches(first_name,'\w{10,}') from employees;

/*15. Получить список всех сотрудников у которых в имени есть буква 'b' (без учета регистра).*/
SELECT * from employees where  first_name ~* '[b]';

/*16. Получить репорт по department_id с минимальной и максимальной зарплатой,
с ранней и поздней датой прихода на работу и с количествов сотрудников.
Сорировать по количеству сотрудников (по убыванию)*/
select department_id, min(min_salary) as "минимальная зп",
       max(max_salary) as "максимальная зп",
       min(start_date) as "ранняя дата прихода на работу",
       max(start_date) as "поздняя дата прихода на работу",
       count(employee_id) as employees_amount
            from
            job_history inner join jobs
            on jobs.job_id = job_history.job_id
group by department_id
order by employees_amount desc;

/*17. Сколько сотрудников имена которых начинается с одной и той же буквы? Сортировать по количеству. Показывать только те где количество больше 1*/

SELECT count(substr(first_name,1,1)) as employee_amount,substr(first_name,1,1) as letter from employees
group by substr(first_name,1,1)
HAVING count(substr(first_name,1,1))>1
order by employee_amount;


/*18. Сколько сотрудников которые работают в одном и том же отделе и получают одинаковую зарплату?*/
select department_id, salary, count(*) as "кол-во сотрудников" from employees
group by department_id, salary
having count(*)>1;

/*19. Получить репорт сколько сотрудников приняли на работу в каждый день недели. Сортировать по количеству*/
select EXTRACT(DOW FROM start_date) as day_Of_Week,count(employee_id) as employee_Amount from job_history
group by day_Of_Week
order by count(employee_id);













