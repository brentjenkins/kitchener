# add GEOCITY table

# --- !Ups

CREATE TABLE IF NOT EXISTS GEOCITY (
  ID BIGINT(20) NOT NULL auto_increment,
  CITY VARCHAR(50) NOT NULL,
  COUNTY VARCHAR(255) DEFAULT NULL,
  STATECODE VARCHAR(8) NOT NULL,
  COUNTRYCODE VARCHAR(2) NOT NULL,
  PRIMARY KEY (ID),
  UNIQUE KEY COUNTRYSTATECOUNTYCITY (COUNTRYCODE, STATECODE, COUNTY, CITY)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# --- !Downs

DROP TABLE GEOCITY;