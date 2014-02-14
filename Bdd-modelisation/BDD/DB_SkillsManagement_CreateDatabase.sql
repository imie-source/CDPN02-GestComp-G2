------------------------------------------------------------
--        Script Postgre 
------------------------------------------------------------


CREATE TABLE promotion(
	id_promotion      SERIAL NOT NULL ,
	libelle_promotion VARCHAR (100)  ,
	annee_debut       INT   ,
	annee_fin         INT   ,
	CONSTRAINT prk_constraint_promotion PRIMARY KEY (id_promotion)
)WITHOUT OIDS;

CREATE TABLE utilisateur(
	id_utilisateur         VARCHAR (25) NOT NULL ,
	nom_utilisateur         VARCHAR (50)  ,
	prenom_utilisateur      VARCHAR (50)  ,
	login_utilisateur       VARCHAR (50)  ,
	mdp_utilisateur         VARCHAR (50)  ,
	email_utilisateur       VARCHAR (50)  ,
	tel_utilisateur         VARCHAR (20)  ,
	description_utilisateur VARCHAR (200)  ,
	disponible_utilisateur  BOOL   ,
	id_promotion            INT   ,
	CONSTRAINT prk_constraint_utilisateur PRIMARY KEY (id_utilisateur)
)WITHOUT OIDS;

CREATE TABLE projet(
	id_projet      SERIAL NOT NULL ,
	libelle_projet VARCHAR (200)  ,
	id_chef_projet INT   ,
	CONSTRAINT prk_constraint_projet PRIMARY KEY (id_projet)
)WITHOUT OIDS;

CREATE TABLE utilisateur_projet(
	id_utilisateur INT  NOT NULL ,
	id_projet      INT  NOT NULL ,
	CONSTRAINT prk_constraint_utilisateur_projet PRIMARY KEY (id_utilisateur,id_projet)
)WITHOUT OIDS;

CREATE TABLE competence(
	id_competence      SERIAL NOT NULL ,
	libelle_competence VARCHAR (200)  ,
	id_competence_pere INT   ,
	CONSTRAINT prk_constraint_competence PRIMARY KEY (id_competence)
)WITHOUT OIDS;

CREATE TABLE profil(
	id_profil  SERIAL NOT NULL ,
	nom_profil VARCHAR (50)  ,
	CONSTRAINT prk_constraint_profil PRIMARY KEY (id_profil)
)WITHOUT OIDS;

CREATE TABLE notification(
	id_notification      SERIAL NOT NULL ,
	date_notification    DATE   ,
	libelle_notification VARCHAR (500)  ,
	CONSTRAINT prk_constraint_notification PRIMARY KEY (id_notification)
)WITHOUT OIDS;

CREATE TABLE utilisateur_competence(
	id_utilisateur    INT  NOT NULL ,
	id_competence     INT  NOT NULL ,
	niveau_competence VARCHAR (50)  ,
	CONSTRAINT prk_constraint_utilisateur_competence PRIMARY KEY (id_utilisateur,id_competence)
)WITHOUT OIDS;

CREATE TABLE tache(
	id_tache           SERIAL NOT NULL ,
	libelle_tache      VARCHAR (250)  ,
	duree_estime_tache INT   ,
	statut_tache       VARCHAR (50)  ,
	id_projet          INT   ,
	id_competence      INT   ,
	CONSTRAINT prk_constraint_tache PRIMARY KEY (id_tache)
)WITHOUT OIDS;

CREATE TABLE utilisateur_profil(
	id_utilisateur INT  NOT NULL ,
	id_profil      INT  NOT NULL ,
	CONSTRAINT prk_constraint_utilisateur_profil PRIMARY KEY (id_utilisateur,id_profil)
)WITHOUT OIDS;

CREATE TABLE utilisateur_notification(
	id_notification INT  NOT NULL ,
	id_utilisateur  INT  NOT NULL ,
	CONSTRAINT prk_constraint_utilisateur_notification PRIMARY KEY (id_notification,id_utilisateur)
)WITHOUT OIDS;



