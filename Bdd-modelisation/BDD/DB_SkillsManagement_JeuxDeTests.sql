-------------------------------------------------------------
--        Script Postgre - Créations des jeux de tests
-------------------------------------------------------------

INSERT INTO promotion(id_promotion, libelle_promotion, annee_debut, annee_fin) VALUES
(1, 'promotion1', '2000', '2001'),
(2, 'promotion2', '2000', '2001');

INSERT INTO utilisateur(id_utilisateur, nom_utilisateur, prenom_utilisateur, login_utilisateur, mdp_utilisateur, email_utilisateur, tel_utilisateur, description_utilisateur, disponible_utilisateur, id_promotion) VALUES 
(1, 'nom1', 'prenom1', 'login1', 'mdp1', 'email1@email.com', 0123456789, 'description1', true, 1),
(2, 'nom2', 'prenom2', 'login2', 'mdp2', 'email2@email.com', 0123456789, 'description2', true, 1),
(3, 'nom3', 'prenom3', 'login3', 'mdp3', 'email3@email.com', 0123456789, 'description3', true, 1),
(4, 'nom4', 'prenom4', 'login4', 'mdp4', 'email4@email.com', 0123456789, 'description4', true, 1),
(5, 'nom5', 'prenom5', 'login5', 'mdp5', 'email5@email.com', 0123456789, 'description5', true, 1),
(6, 'nom6', 'prenom6', 'login6', 'mdp6', 'email6@email.com', 0123456789, 'description6', true, 2),
(7, 'nom7', 'prenom7', 'login7', 'mdp7', 'email7@email.com', 0123456789, 'description7', true, 2),
(8, 'nom8', 'prenom8', 'login8', 'mdp8', 'email8@email.com', 0123456789, 'description8', true, 2),
(9, 'nom9', 'prenom9', 'login9', 'mdp9', 'email9@email.com', 0123456789, 'description9', true, 2),
(10, 'nom10', 'prenom10', 'login10', 'mdp10', 'email10@email.com', 0123456789, 'description10', true, 2);

INSERT INTO competence(id_competence, libelle_competence, id_competence_pere) VALUES
(1, 'competence1', null),
(2, 'competence2', null),
(3, 'competence3', null),
(4, 'competence4', 1),
(5, 'competence5', 2),
(6, 'competence6', 3),
(7, 'competence7', 1),
(8, 'competence8', 2),
(9, 'competence9', 3),
(10, 'competence10', 4),
(11, 'competence11', 5),
(12, 'competence12', 6),
(13, 'competence13', 10),
(14, 'competence14', 10),
(15, 'competence15', 10),
(16, 'competence16', 11),
(17, 'competence17', 11),
(18, 'competence18', 12);

INSERT INTO projet(id_projet, libelle_projet, id_chef_projet) VALUES
(1, 'projet1', 1),
(2, 'projet2', 1),
(3, 'projet3', 2),
(4, 'projet4', 3),
(5, 'projet5', 2),
(6, 'projet6', 4);

INSERT INTO profil(id_profil, nom_profil) VALUES
(1, 'admin'),
(2, 'modo'),
(3, 'participant'),
(4, 'invite');

INSERT INTO notification(id_notification, date_notification, libelle_notification) VALUES
(1, '2014-02-14 00:00:00', 'notification1'),
(2, '2014-02-14 00:00:00', 'notification2'),
(3, '2014-02-14 00:00:00', 'notification3'),
(4, '2014-02-14 00:00:00', 'notification4');

INSERT INTO utilisateur_competence(id_utilisateur, id_competence, niveau_competence) VALUES
(1, 1, 'debutant'),
(1, 2, 'initié'),
(1, 3, 'expert'),
(2, 4, 'debutant'),
(2, 5, 'initié'),
(3, 6, 'expert'),
(3, 7, 'debutant'),
(3, 8, 'initié'),
(4, 9, 'expert'),
(5, 10, 'debutant'),
(6, 11, 'initié'),
(7, 12, 'expert'),
(8, 13, 'debutant'),
(9, 14, 'initié'),
(10, 15, 'expert');

INSERT INTO utilisateur_projet(id_utilisateur, id_projet) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 1),
(8, 2),
(9, 3);

INSERT INTO tache(id_tache, libelle_tache, duree_estime_tache, statut_tache, id_projet, id_competence) VALUES
(1, 'tache1', 100, 'statut1', 1, 10),
(2, 'tache2', 100, 'statut1', 1, 5),
(3, 'tache3', 100, 'statut1', 2, 6),
(4, 'tache4', 100, 'statut1', 3, 9),
(5, 'tache5', 100, 'statut1', 4, 5),
(6, 'tache6', 100, 'statut1', 5, 1),
(7, 'tache7', 100, 'statut1', 6, 5),
(8, 'tache8', 100, 'statut1', 6, 3),
(9, 'tache9', 100, 'statut1', 6, 4),
(10, 'tache1', 100, 'statut1', 6, 2);

INSERT INTO utilisateur_profil(id_utilisateur, id_profil) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 3),
(5, 3),
(6, 3),
(7, 3),
(8, 4),
(9, 4),
(10, 4);

INSERT INTO utilisateur_notification(id_notification, id_utilisateur) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4);





