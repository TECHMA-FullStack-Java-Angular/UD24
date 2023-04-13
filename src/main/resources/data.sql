
DROP table IF EXISTS trabajador;

create table trabajador(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
    dni integer,
	salario float,
	trabajo enum('administrativo', 'comercial', 'juridico')
	
);

insert into trabajador (nombre, apellido, dni,trabajo)values('Jose','Marin',123456789, 'administrativo');
insert into trabajador (nombre, apellido,dni,trabajo)values('Juan','Lopez',122222222, 'comercial');
insert into trabajador (nombre, apellido,dni,trabajo)values('Pedro','Guillem',123333333, 'administrativo');
insert into trabajador (nombre, apellido,dni,trabajo)values('Jordi','Martin',123444444, 'juridico');
insert into trabajador (nombre, apellido,dni,trabajo)values('Jonatan','Vicente',123455555, 'comercial');

