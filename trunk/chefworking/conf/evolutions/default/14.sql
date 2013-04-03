# add TITLE table

# --- !Ups

CREATE TABLE IF NOT EXISTS TITLE (
  ID BIGINT(20) NOT NULL auto_increment,
  NAME VARCHAR(50) NOT NULL,
  DESCRIPTION VARCHAR(255) NOT NULL,
  INDUSTRY_ID BIGINT(20) NOT NULL,
  TEAM_ID BIGINT(20) NOT NULL,
  LEVEL smallint NOT NULL DEFAULT 0,
  PRIMARY KEY (ID),
  UNIQUE KEY (INDUSTRY_ID, TEAM_ID, NAME),
  CONSTRAINT FOREIGN KEY (INDUSTRY_ID) REFERENCES INDUSTRY (ID) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT FOREIGN KEY (TEAM_ID) REFERENCES TEAM (ID) ON DELETE CASCADE ON UPDATE CASCADE
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# --- !Downs

DROP TABLE TITLE;