
DROP table IF EXISTS trabajador;

create table trabajador(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
    dni integer,
	trabajo enum('administrativo', 'comercial', 'juridico'),
    salario integer
	
);

insert into trabajador (nombre, apellido, dni,trabajo, salario)values('Jose','Marin',123456789, 'administrativo',1500);
insert into trabajador (nombre, apellido, dni,trabajo, salario)values('Juan','Lopez',122222222, 'comercial',2000);
insert into trabajador (nombre, apellido, dni,trabajo, salario)values('Pedro','Guillem',123333333, 'administrativo',1500);
insert into trabajador (nombre, apellido, dni,trabajo, salario)values('Jordi','Martin',123444444,'juridico',2500);
insert into trabajador (nombre, apellido, dni,trabajo, salario)values('Jonatan','Vicente',123455555,'comercial',2000);

