# populate GEOCITY table

# --- !Ups

INSERT INTO GEOCITY (CITY, COUNTY, STATECODE, COUNTRYCODE) SELECT DISTINCT CITY, COUNTY, STATECODE, COUNTRYCODE FROM GEOPOSTAL ORDER BY STATECODE, COUNTY;

# --- !Downs

TRUNCATE TABLE GEOCITY;