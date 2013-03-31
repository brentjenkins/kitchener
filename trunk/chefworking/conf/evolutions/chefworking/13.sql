# populate TEAM table

# --- !Ups

INSERT INTO TEAM (NAME, DESCRIPTION, INDUSTRY_ID) VALUES ('Kitchen', 'Kitchen Workers', 1);
INSERT INTO TEAM (NAME, DESCRIPTION, INDUSTRY_ID) VALUES ('Front of the house', 'Front of the house', 1);

# --- !Downs

TRUNCATE TABLE TEAM;