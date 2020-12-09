create sequence student_seq start 1;

create table student
(
    student_id   bigint default nextval('student_seq'::regclass) not null
        constraint student_pk
            primary key,
    first_name  varchar(255)                                   not null,
    last_name   varchar(255)                                   not null,
    middle_name varchar(255)                                   not null,
    specialty  varchar(255) not null ,
    course varchar(255) not null
);

