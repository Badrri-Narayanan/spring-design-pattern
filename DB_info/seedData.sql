CREATE TABLE students (
name varchar(200) UNIQUE NOT NULL,
id INTEGER PRIMARY KEY AUTO_INCREMENT,
email varchar(200) UNIQUE NOT NULL,
current_grade varchar(200) NOT NULL,
date_of_birth DATE NOT NULL
);

CREATE TABLE teachers (
name varchar(200) UNIQUE NOT NULL,
id INTEGER PRIMARY KEY AUTO_INCREMENT,
email varchar(200) UNIQUE NOT NULL,
edu_qualification varchar(200) NOT NULL,
years_of_exp INTEGER NOT NULL DEFAULT 0
);

INSERT INTO student (name, email, current_grade, date_of_birth) VALUES 
('Viola Byrd', 'dibno@kurinse.bt', 'Class 8', '1998-02-22'), 
('Cora Valdez', 'jedkij@cujukoka.ua', 'Class 2', '1990-12-16'), 
('Darrell Singleton', 'ger@lupeni.tg', 'Class 6', '1964-12-11'), 
('Delia Patterson', 'uzeol@saoj.cy', 'Class 2', '1960-11-25'), 
('Mamie Caldwell', 'dubume@nezo.kg', 'Class 8', '2001-11-06'), 
('Eleanor Flowers', 'pevije@rirolru.om', 'Class 5', '1989-10-06'), 
('Adrian Carr', 'igpub@ta.sc', 'Class 9', '1981-01-05'), 
('Frederick Lambert', 'bikaviju@ji.bg', 'Class 11', '1963-08-14'), 
('Fannie Parks', 'bo@tam.pl', 'Class 2', '1966-08-05'), 
('Lloyd Stanley', 'eli@ebohicu.so', 'Class 6', '1963-06-27'), 
('Earl Diaz', 'kijsu@giclibhov.ky', 'Class 12', '1980-08-02'), 
('Matilda Lopez', 'niwgew@ji.ge', 'Class 4', '2004-08-16'), 
('Mario Greene', 'wofraf@fiwviri.li', 'Class 3', '1982-07-30'), 
('Dustin Butler', 'bala@up.cg', 'Class 9', '1977-09-15'), 
('Landon Adkins', 'egkeli@ejvek.co', 'Class 10', '1980-10-27');

INSERT INTO teachers (name, email, edu_qualification, years_of_exp) VALUES
('Susie Underwood', 'wuduje@ikunar.na', 'Physics', '6'), 
('Marvin Palmer', 'ut@hamiwut.ye', 'Chemistry', '5'), 
('Alta Underwood', 'uzkoub@mumol.jm', 'Maths', '16'), 
('Gavin Mendoza', 'reb@niude.ai', 'Biology', '3'), 
('Francis Huff', 'gebuben@kore.com', 'Political science', '13'), 
('Winifred Morales', 'fubezub@ifu.to', 'Geography', '18'), 
('Alberta Black', 'lok@fuuzhe.sc', 'History', '15'), 
('Isaiah Tate', 'keraz@vohemkip.pk', 'Computer science', '12'), 
('Jeremy Cannon', 'uvkemta@tomicamom.th', 'Aerodynamics', '1'), 
('Jesse Bass', 'esuleiko@muzimi.gp', 'Fluid Mechanics', '4'), 
('Lawrence Neal', 'citkak@sihuni.ck', 'Physical Eduction', '3'), 
('Etta Hicks', 'rilewvo@muvipaze.kg', 'Music', '13'), 
('Francis Joseph', 'parefij@parefwi.ao', 'Arts', '5'), 
('Addie Roberson', 'honsu@iju.pw', 'Dance', '2'), 
('Nancy Lawson', 'jegni@tijvijtod.cf', 'English', '0');