DROP DATABASE IF EXISTS Proyecto_Empresa;
CREATE DATABASE Proyecto_Empresa;
USE Proyecto_Empresa;

CREATE TABLe Tipo_Contrato(
id_tipo int auto_increment primary key,
descripcion varchar(50) not null unique key);

CREATE TABLE Prestacion(
id_prestacion int auto_increment primary key,
descripcion varchar(50) not null unique key);

CREATE TABLE Pais(
id_pais int primary key auto_increment,
nombre varchar(30) not null unique key,
moneda varchar(30) not null unique key);

CREATE TABLE Nivel_Academico(
id_nivel int auto_increment primary key,
descripcion varchar(50) not null unique key);

CREATE TABLE Tecnologias(
id_tecnologia int auto_increment primary key,
descripcion varchar(50) not null unique key);

CREATE TABLE Certificacion(
id_certificacion int auto_increment primary key,
descripcion varchar(50) not null unique key);

CREATE TABLE Idioma_Extranjero(
id_idioma int auto_increment primary key,
nombre varchar(30) not null unique key);

CREATE TABLE Empresa(
id_empresa int primary key auto_increment,
id_pais int not null,
nombre varchar(30) not null,
direccion varchar(50) not null,
telefono varchar(20) not null,
FOREIGN KEY(id_pais) REFERENCES Pais(id_pais),
UNIQUE KEY(id_pais,nombre));

CREATE TABLE Sucursal(
id_sucursal int primary key auto_increment,
id_pais int not null,
direccion varchar(50) not null,
telefono varchar(20) not null,
FOREIGN KEY(id_pais) REFERENCES Pais(id_pais));

CREATE TABLE Persona(
id_persona int primary key auto_increment,
id_nivel int not null,
nombre varchar(30) not null,
paterno varchar(30) not null,
materno varchar(30) not null,
FOREIGN KEY (id_nivel) REFERENCES Nivel_Academico(id_nivel));

CREATE TABLE Puesto(
id_puesto int primary key auto_increment,
id_sucursal int not null,
nombre varchar(30) not null,
salario decimal(10,2) not null,
id_nivel int not null,
FOREIGN KEY(id_sucursal) REFERENCES Sucursal(id_sucursal),
UNIQUE KEY(id_sucursal,nombre),
FOREIGN KEY(id_nivel) REFERENCES Nivel_Academico(id_nivel));

CREATE TABLE Cuenta(
id_persona int not null,
id_certificacion int  not null,
FOREIGN KEY (id_persona) REFERENCES Persona(id_persona),
FOREIGN KEY (id_certificacion) REFERENCES Certificacion(id_certificacion));

CREATE TABLE Domina(
id_persona int not null,
id_idioma int  not null,
FOREIGN KEY (id_persona) REFERENCES Persona(id_persona),
FOREIGN KEY (id_idioma) REFERENCES Idioma_Extranjero(id_idioma));

CREATE TABLE Conoce(
id_persona int not null,
id_tecnologia int  not null,
FOREIGN KEY (id_persona) REFERENCES Persona(id_persona),
FOREIGN KEY (id_tecnologia) REFERENCES Tecnologias(id_tecnologia));

CREATE TABLE Posee(
id_persona int not null,
id_nivel int  not null,
FOREIGN KEY (id_persona) REFERENCES Persona(id_persona),
FOREIGN KEY (id_nivel) REFERENCES Nivel_Academico(id_nivel));

CREATE TABLE Requiere(
id_puesto int not null,
id_idioma int  not null,
FOREIGN KEY (id_puesto) REFERENCES Puesto(id_puesto),
FOREIGN KEY (id_idioma) REFERENCES Idioma_Extranjero(id_idioma));

CREATE TABLE Maneja(
id_puesto int not null,
id_tecnologia int  not null,
FOREIGN KEY (id_puesto) REFERENCES Puesto(id_puesto),
FOREIGN KEY (id_tecnologia) REFERENCES Tecnologias(id_tecnologia));

CREATE TABLE Necesita(
id_puesto int not null,
id_certificacion int  not null,
FOREIGN KEY (id_puesto) REFERENCES Puesto(id_puesto),
FOREIGN KEY (id_certificacion) REFERENCES Certificacion(id_certificacion));

CREATE TABLE Ocupa(
id_puesto int not null,
id_nivel int  not null,
FOREIGN KEY (id_puesto) REFERENCES Puesto(id_puesto),
FOREIGN KEY (id_nivel) REFERENCES Nivel_Academico(id_nivel));


CREATE TABLE Contrato(
id_contrato int auto_increment primary key,
id_persona int not null,
id_tipo int not null,
id_puesto int not null,
f_inicio varchar(20) not null,
f_termino varchar(20) not null,
fecha varchar(20) not null,
FOREIGN KEY (id_persona) REFERENCES Persona(id_persona),
FOREIGN KEY (id_tipo) REFERENCES Tipo_Contrato(id_tipo),
FOREIGN KEY (id_puesto) REFERENCES Puesto(id_puesto));

CREATE TABLE Outsourcing(
id_contrato int not null,
id_empresa int not null,
UNIQUE KEY (id_contrato),
FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa));

CREATE TABLE Interno(
id_interno int primary key auto_increment,
id_contrato int not null,
FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
UNIQUE KEY (id_contrato));

CREATE TABLE Dispone(
id_interno int not null,
id_prestacion int not null,
monto int not null,
FOREIGN KEY (id_interno) REFERENCES Interno(id_interno),
FOREIGN KEY (id_prestacion) REFERENCES Prestacion(id_prestacion));




SHOW FULL TABLES FROM Proyecto_Empresa