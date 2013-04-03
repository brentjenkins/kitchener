# add TEAM table

# --- !Ups

CREATE TABLE IF NOT EXISTS TEAM (
  ID BIGINT(20) NOT NULL auto_increment,
  NAME VARCHAR(50) NOT NULL,
  DESCRIPTION VARCHAR(255) NOT NULL,
  INDUSTRY_ID BIGINT(20) NOT NULL,
  PRIMARY KEY (ID),
  UNIQUE KEY (INDUSTRY_ID, NAME),
  CONSTRAINT FOREIGN KEY (INDUSTRY_ID) REFERENCES INDUSTRY (ID) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# --- !Downs

DROP TABLE TEAM;