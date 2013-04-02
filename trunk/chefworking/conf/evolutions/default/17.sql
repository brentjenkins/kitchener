# populate EMPLOYER table

# --- !Ups

INSERT INTO EMPLOYER (
  NAME,
  INDUSTRY_ID,
  WEBSITE,
  PHONE,
  ADDRESS,
  CITY,
  STATECODE,
  POSTALCODE,
  COUNTRYCODE,
  CATEGORY,
  SUBCATEGORY,
  YELP_ID,
  FACTUAL_ID) VALUES (
  "French Laundry",
  1,
  "www.frenchlaundry.com",
  "(707) 944-2380",
  "6640 Washington St, Yountville, CA 94599",
  "Yountville",
  "CA",
  "94599",
  "US",
  "Restaurants",
  "French",
  "the-french-laundry-yountville-2",
  "73497023-e0a1-4ca4-81f8-0d6e95ffcd9a")

# --- !Downs

TRUNCATE TABLE EMPLOYER;