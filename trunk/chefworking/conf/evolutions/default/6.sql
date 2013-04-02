# populate GEOPOSTAL table

# --- !Ups

LOAD DATA INFILE 'zip_code_database.csv' INTO TABLE GEOPOSTAL
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES
(@col1,@col2,@col3,@col4,@col5,@col6,@col7,@col8,@col9,@col10,@col11,@col12,@col13,@col14,@col15,@col16)
SET POSTALCODE=@col1,CITY=@col3,COUNTY=@col7,STATECODE=@col6,COUNTRYCODE=@col13,REGIONCODE=@col12,AREACODES=@col9,TIMEZONE=@col8,LATITUDE=@col10,LONGITUDE=@col11;

# --- !Downs

TRUNCATE TABLE GEOPOSTAL;