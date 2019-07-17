
create database cargabd;
use cargabd;


CREATE TABLE `Carga`
(
	`idcarga` int NOT NULL,
	`iddocente` int NOT NULL,
	`horas` smallint NOT NULL,
	`ciclo` int NOT NULL,
	CONSTRAINT `PK_Carga` PRIMARY KEY (`idcarga` ASC)
)

;


CREATE TABLE `Curso`
(
	`idcurso` int(11) NOT NULL,
	`nombre` varchar(50) NOT NULL,
	`horassemana` tinyint NOT NULL,
	`tipo` varchar(10) NOT NULL,
	CONSTRAINT `PK_Curso` PRIMARY KEY (`idcurso` ASC)
)

;

CREATE TABLE `Docente`
(
	`iddocente` int NOT NULL,
	`nombres` varchar(40) NOT NULL,
	`apelidos` varchar(40) NOT NULL,
	`idcurso` int(11) NOT NULL,
	CONSTRAINT `PK_Docente` PRIMARY KEY (`iddocente` ASC)
)

;

CREATE TABLE `Semestreacademico`
(
	`ciclo` int NOT NULL,

	CONSTRAINT `PK_Semestre` PRIMARY KEY (`ciclo` ASC)
)
;


/* llaves foráneas */

ALTER TABLE `Carga` 
 ADD CONSTRAINT `FK_Carga_Docente`
	FOREIGN KEY (`iddocente`) REFERENCES `Docente` (`iddocente`) ON DELETE Restrict ON UPDATE Restrict
;

ALTER TABLE `Carga` 
 ADD CONSTRAINT `FK_Carga_ciclo`
	FOREIGN KEY (`ciclo`) REFERENCES `Semestreacademico` (`ciclo`) ON DELETE Restrict ON UPDATE Restrict
;

ALTER TABLE `Docente` 
 ADD CONSTRAINT `FK_Carga_Semestre`
	FOREIGN KEY (`idcurso`) REFERENCES `Curso` (`idcurso`) ON DELETE Restrict ON UPDATE Restrict
;
