
DROP table IF EXISTS trabajador;

create table trabajador(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
    dni integer,
	trabajo enum('ADMINISTRATIVO', 'COMERCIAL', 'JURIDICO'),
    salario int
  
	
);

insert into trabajador (nombre, apellido, dni,trabajo, salario)values('Jose','Marin',123456789, 'ADMINISTRATIVO',1500);
insert into trabajador (nombre, apellido, dni,trabajo,salario)values('Juan','Lopez',122222222, 'COMERCIAL',2000);
insert into trabajador (nombre, apellido, dni,trabajo,salario)values('Pedro','Guillem',123333333, 'ADMINISTRATIVO',1500);
insert into trabajador (nombre, apellido, dni,trabajo,salario)values('Jordi','Martin',123444444,'JURIDICO',2500);
insert into trabajador (nombre, apellido, dni,trabajo,salario)values('Jonatan','Vicente',123455555,'COMERCIAL',2000);

