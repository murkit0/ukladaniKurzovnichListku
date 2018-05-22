CREATE TABLE if not exists exchRates
(  
    shortName varchar(3) /*not null*/,
	validFrom varchar(19) /*not null*/, 
    name varchar(255) /*not null*/,
    country varchar(255) /*not null*/,
    amount int,
    valBuy double,
    valSell double, 
    valMid double, 
    currBuy double, 
    currSell double, 
    currMid double, 
    move double, 
    cnbMid double,
    version int,
    primary key (shortName)
);