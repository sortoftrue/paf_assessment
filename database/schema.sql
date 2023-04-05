use day24;

create table user(
	user_id varchar(8) not null,
    username varchar(50) not null,
    name varchar(50),
    constraint user_pk primary key (user_id)
    );

create table task(
	task_id int not null auto_increment,
    description varchar(255) not null,
    priority tinyint not null,
    due_date timestamp not null,
    user_id varchar(8) not null,
    constraint task_pk primary key (task_id),
	constraint user_fk foreign key (user_id) references user(user_id)
    )

