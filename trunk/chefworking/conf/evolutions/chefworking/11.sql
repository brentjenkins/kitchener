# populate INDUSTRY table

# --- !Ups

INSERT INTO INDUSTRY (NAME, DESCRIPTION) VALUES ('Culinary', 'The Culinary Industry...Chefs, Sous Chefs, Line Cooks');
INSERT INTO INDUSTRY (NAME, DESCRIPTION) VALUES ('Food Service', 'The Food Service Industry...Restaurant Manager, Cook, Bartender');

# --- !Downs

TRUNCATE TABLE INDUSTRY;