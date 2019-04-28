
create table user
(
   id integer not null,
   firstName varchar(255) not null,
   lastName varchar(255) not null,
   nickName varchar(255) not null,
   sex varchar(255) ,
   race varchar(255) ,
   level varchar(255) ,
   experience varchar(255) ,
   money varchar(255) ,
   primary key(id)
);

create table item
(
   id integer not null,
   name varchar(255) not null,
   picture varchar(255) not null,
   bonusType varchar(255) not null,
   bonusValue varchar(255) ,
   primary key(id)
);