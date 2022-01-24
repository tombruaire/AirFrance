Drop database if exists airfrance_22;
Create database if not exists airfrance_22;
Use airfrance_22;

Drop table if exists pilote;
Create table if not exists pilote (
	idpilote int(3) not null auto_increment,
	nom varchar(50) not null,
	prenom varchar(50) not null,
	adresse varchar(255),
	nbheuresvol int(7),
	bip varchar(20),
	primary key (idpilote)
) ENGINE=InnoDB, CHARSET=utf8;

Insert into pilote values
(null, "BRUAIRE", "Tom", "5 rue de Levallois", 100, "4404050"),
(null, "BENHAMED", "Okacha", "IRIS", 50, "4040404");

Drop table if exists avion;
Create table if not exists avion (
	idavion int(3) not null auto_increment,
	designation varchar(50) not null,
	constructeur varchar(50) not null,
	nbplaces int(3),
	primary key (idavion)
) ENGINE=InnoDB, CHARSET=utf8;

Insert into avion values
(null, "AF3218", "AirFrance", 500),
(null, "AF3538", "AirFrance", 300);

Drop table if exists vol;
Create table if not exists vol (
	idvol int(3) not null auto_increment,
	designation varchar(50) not null,
	datevol date,
	heurevol time,
	idpilote1 int(3) not null,
	idpilote2 int(3) not null,
	idavion int(3) not null,
	primary key (idvol),
	foreign key (idpilote1) references pilote (idpilote)
	on update cascade
	on delete cascade,
	foreign key (idpilote2) references pilote (idpilote)
	on update cascade
	on delete cascade,
	foreign key (idavion) references avion (idavion)
	on update cascade
	on delete cascade
) ENGINE=InnoDB, CHARSET=utf8;

Insert into vol values
(null, "Paris-Lyon", "2022-01-01", "12:00:00", 1, 2, 1),
(null, "Paris-Brest", "2022-01-02", "13:30:00", 1, 2, 2);

Create or replace view pav as (
	select p.nom, p.prenom, a.designation as avion, v.designation as vol, v.datevol, v.heurevol
	from pilote p, avion a, vol v
	where p.idpilote = v.idpilote1
	and a.idavion = v.idvol
);
