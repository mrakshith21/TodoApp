drop table if exists todo;

create table todo (
    id int NOT NULL AUTO_INCREMENT ,
    name varchar(50),
    description varchar(200),
    deadline date,
    primary key (id)
);