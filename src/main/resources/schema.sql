
create table user
(
   id integer not null,
   firstName varchar(255) ,
   lastName varchar(255) ,
   nickName varchar(255) ,
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
   name varchar(255) ,
   picture varchar(255) ,
   bonusType varchar(255) ,
   bonusValue varchar(255) ,
   primary key(id)
);