--------------------------------------------------------
--  File created - czwartek-czerwca-11-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ACCOUNT_TYPE
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."ACCOUNT_TYPE" 
   (	"ID" NUMBER(*,0), 
	"TYPE" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CUSTOMER
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."CUSTOMER" 
   (	"ID" NUMBER(*,0), 
	"FIRST_NAME" VARCHAR2(255 BYTE), 
	"LAST_NAME" VARCHAR2(255 BYTE), 
	"PHONE_NUMBER" NUMBER(*,0), 
	"EMAIL" VARCHAR2(255 BYTE), 
	"ADDRESS_ID" NUMBER(*,0), 
	"ACCOUNT_ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CUSTOMER_ACCOUNT
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."CUSTOMER_ACCOUNT" 
   (	"ID" NUMBER(*,0), 
	"LOGIN" VARCHAR2(255 BYTE), 
	"PASSWORD" VARCHAR2(255 BYTE), 
	"ACC_CREATE_DATE" DATE, 
	"TYPE_ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CUSTOMER_ADDRESS
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."CUSTOMER_ADDRESS" 
   (	"ID" NUMBER(*,0), 
	"COUNTRY" VARCHAR2(255 BYTE), 
	"CITY" VARCHAR2(255 BYTE), 
	"STREET" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EMPLOYEE_ACCOUNT
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."EMPLOYEE_ACCOUNT" 
   (	"ID" NUMBER(*,0), 
	"TYPE_ID" NUMBER(*,0), 
	"LOGIN" VARCHAR2(255 BYTE), 
	"PASSWORD" VARCHAR2(255 BYTE), 
	"ACCOUNT_CREATE_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EMPLOYEE_ADDRESS
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."EMPLOYEE_ADDRESS" 
   (	"ID" NUMBER(*,0), 
	"COUNTRY" VARCHAR2(255 BYTE), 
	"CITY" VARCHAR2(255 BYTE), 
	"STREET" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EMPLOYEES
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."EMPLOYEES" 
   (	"ID" NUMBER, 
	"FIRST_NAME" VARCHAR2(255 BYTE), 
	"LAST_NAME" VARCHAR2(255 BYTE), 
	"DATE_OF_BIRTH" DATE, 
	"EMAIL" VARCHAR2(255 BYTE), 
	"ADDRESS_ID" NUMBER(*,0), 
	"PHONE_NUMBER" NUMBER(*,0), 
	"UNIT_ID" NUMBER(*,0), 
	"POSITION_ID" NUMBER(*,0), 
	"SALARY" FLOAT(2), 
	"ACCOUNT_ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table INCOME
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."INCOME" 
   (	"ID" NUMBER(*,0), 
	"UNIT_ID" NUMBER(*,0), 
	"QUARTER" NUMBER(*,0), 
	"YEAR" NUMBER(*,0), 
	"NET_INCOME" FLOAT(2), 
	"GROSS_INCOME" FLOAT(2), 
	"TAX_INCOME" FLOAT(2)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ORDERS
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."ORDERS" 
   (	"ID" NUMBER(*,0), 
	"PRODUCT_ID" NUMBER(*,0), 
	"CUSTOMER_ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table POSITION
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."POSITION" 
   (	"ID" NUMBER(*,0), 
	"POSITION_NAME" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUCTS
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."PRODUCTS" 
   (	"ID" NUMBER(*,0), 
	"PRODUCT_TYPE_ID" NUMBER(*,0), 
	"PRODUCT_NAME" VARCHAR2(255 BYTE), 
	"PRICE_NET" FLOAT(126), 
	"PRICE_GROSS" FLOAT(126), 
	"PRICE_TAX" FLOAT(126), 
	"UNIT_ID" NUMBER(*,0), 
	"PRODUCT_STATE_ID" NUMBER(*,0), 
	"QUANTITY" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUCT_STATE
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."PRODUCT_STATE" 
   (	"ID" NUMBER(*,0), 
	"STATE_NAME" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUCT_TYPE
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."PRODUCT_TYPE" 
   (	"ID" NUMBER(*,0), 
	"PRODUCT_TYPE_NAME" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SPENDING
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."SPENDING" 
   (	"ID" NUMBER(*,0), 
	"UNIT_ID" NUMBER(*,0), 
	"QUARTER" NUMBER(*,0), 
	"YEAR" NUMBER(*,0), 
	"SPENDING_SUM" FLOAT(2)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table UNIT
--------------------------------------------------------

  CREATE TABLE "WOJTEK"."UNIT" 
   (	"ID" NUMBER(*,0), 
	"UNIT_NAME" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into WOJTEK.ACCOUNT_TYPE
SET DEFINE OFF;
Insert into WOJTEK.ACCOUNT_TYPE (ID,TYPE) values ('1','customer_account');
Insert into WOJTEK.ACCOUNT_TYPE (ID,TYPE) values ('2','admin');
Insert into WOJTEK.ACCOUNT_TYPE (ID,TYPE) values ('3','C-level employee');
Insert into WOJTEK.ACCOUNT_TYPE (ID,TYPE) values ('4','management');
REM INSERTING into WOJTEK.CUSTOMER
SET DEFINE OFF;
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('1','Jane','Doemis','180040500','janedoemis10990@gmail.com','1','1');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('2','John','Dani','199799899','johndani20445@gmail.com','2','2');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('3','Elijah','Hand','286380202','elijahhand3579@gmail.com','3','3');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('4','Tanner','Abney','773169024','tannerabney9721@gmail.com','4','4');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('5','Jewel','Evans','299465893','jewelevans14226@gmail.com','5','5');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('6','Alfonso','Bowens','276923907','alfonsobowens22667@gmail.com','6','6');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('7','Jason','Stanley','768754788','jasonstanley19430@gmail.com','7','7');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('8','Rico','Handley','750720409','ricohandley21578@gmail.com','8','8');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('9','Yasmine','Everett','300563433','yasmineeverett22696@gmail.com','9','9');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('10','Darcey','Lowry','505631837','darceylowry3730@gmail.com','10','10');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('11','Rodney','Wicks','830993162','rodneywicks16680@gmail.com','11','11');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('12','Latoya','Abraham','258064374','latoyaabraham11500@gmail.com','12','12');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('13','Jesus','Pelletier','444452675','jesuspelletier19814@gmail.com','13','13');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('14','Olimpia','Bower','411415204','olimpiabower3122@gmail.com','14','14');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('15','Aurelia','Hutcheson','467164931','aureliahutcheson505@gmail.com','15','15');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('16','Freeman','Stanton','697769043','freemanstanton11389@gmail.com','16','16');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('17','Brent','Handy','180121626','brenthandy7817@gmail.com','17','17');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('18','Anglea','Everhart','349236521','angleaeverhart21754@gmail.com','18','18');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('19','Desirae','Abrams','215811924','desiraeabrams16987@gmail.com','19','19');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('20','Cleo','Bowers','882377885','cleobowers6827@gmail.com','20','20');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('21','Clint','Abreu','839942785','clintabreu19804@gmail.com','21','21');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('22','Patience','Wiese','789685880','patiencewiese12552@gmail.com','22','22');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('23','Agustin','Loy','210542916','agustinloy16555@gmail.com','23','23');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('24','Josh','Hutchings','636350936','joshhutchings17642@gmail.com','24','24');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('25','Ada','Staples','924922703','adastaples1820@gmail.com','25','25');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('26','Margherita','Wiggins','769755787','margheritawiggins11076@gmail.com','26','26');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('27','Carlita','Mckeever','622821260','carlitamckeever15708@gmail.com','27','27');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('28','Adolph','Peltier','151277094','adolphpeltier14793@gmail.com','28','28');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('29','Britt','Mckenna','385354782','brittmckenna8269@gmail.com','39','29');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('30','Blair','Stapleton','588281592','blairstapleton12528@gmail.com','30','30');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('31','Fritz','Wilbanks','271641241','fritzwilbanks113@gmail.com','31','31');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('32','Maddie','Pemberton','485636934','maddiepemberton7277@gmail.com','32','32');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('33','Adrianne','Loyd','382964968','adrianneloyd17074@gmail.com','33','33');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('34','Mittie','Hutchins','295282421','mittiehutchins7892@gmail.com','34','34');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('35','Ellis','Starkey','830346362','ellisstarkey6529@gmail.com','35','35');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('36','Roland','Wilbur','815619741','rolandwilbur17838@gmail.com','36','36');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('37','Samuel','Starks','433474659','samuelstarks19582@gmail.com','37','37');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('38','Arthur','Hanes','940865384','arthurhanes18287@gmail.com','38','38');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('39','Rebecka','Mckenney','182675651','rebeckamckenney8924@gmail.com','39','39');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('40','Selena','Pena','846660569','selenapena18763@gmail.com','40','40');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('41','Albertina','Wilburn','567332872','albertinawilburn11281@gmail.com','41','41');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('42','Kelley','Evers','273143805','kelleyevers10792@gmail.com','42','42');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('43','Felicia','Haney','475445611','feliciahaney9571@gmail.com','43','43');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('44','Wally','Ewing','315231021','wallyewing671@gmail.com','44','44');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('45','Oren','Starling','512243101','orenstarling12908@gmail.com','45','45');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('46','Dong','Hankins','733483874','donghankins18003@gmail.com','46','46');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('47','Cristobal','Ezell','743083595','cristobalezell5475@gmail.com','47','47');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('48','Harley','Bowie','772433570','harleybowie12480@gmail.com','48','48');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('49','Cornell','Hanks','748469819','cornellhanks8580@gmail.com','49','49');
Insert into WOJTEK.CUSTOMER (ID,FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,ADDRESS_ID,ACCOUNT_ID) values ('50','Glenn','Wilcox','429985650','glennwilcox12528@gmail.com','50','50');
REM INSERTING into WOJTEK.CUSTOMER_ACCOUNT
SET DEFINE OFF;
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('3','elijahh375','elijahhand',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('4','tannera53','tannerabney',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('5','jewele716','jewelevans',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('6','alfonsob886','alfonsobowens',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('7','jasons882','jasonstanley',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('8','ricoh437','ricohandley',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('9','yasminee720','yasmineeverett',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('10','darceyl138','darceylowry',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('11','rodneyw31','rodneywicks',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('12','latoyaa195','latoyaabraham',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('13','jesusp591','jesuspelletier',to_date('10/03/04','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('14','olimpiab435','olimpiabower',to_date('10/12/10','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('15','aureliah80','aureliahutcheson',to_date('10/12/14','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('16','freemans51','freemanstanton',to_date('11/06/21','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('17','brenth378','brenthandy',to_date('11/07/04','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('18','angleae464','angleaeverhart',to_date('12/01/21','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('19','desiraea127','desiraeabrams',to_date('12/02/03','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('20','cleob306','cleobowers',to_date('12/02/20','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('21','clinta291','clintabreu',to_date('12/03/15','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('22','patiencew636','patiencewiese',to_date('13/09/16','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('23','agustinl234','agustinloy',to_date('14/07/07','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('24','joshh436','joshhutchings',to_date('14/08/21','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('25','adas24','adastaples',to_date('14/12/07','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('26','margheritaw933','margheritawiggins',to_date('14/12/21','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('27','carlitam965','carlitamckeever',to_date('15/09/04','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('28','adolphp118','adolphpeltier',to_date('16/03/19','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('29','brittm11','brittmckenna',to_date('16/07/24','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('30','blairs743','blairstapleton',to_date('16/09/29','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('31','fritzw633','fritzwilbanks',to_date('16/12/09','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('32','maddiep582','maddiepemberton',to_date('17/10/21','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('33','adriannel210','adrianneloyd',to_date('17/10/23','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('34','mittieh47','mittiehutchins',to_date('17/10/25','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('35','elliss936','ellisstarkey',to_date('18/01/13','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('36','rolandw357','rolandwilbur',to_date('18/02/12','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('37','samuels443','samuelstarks',to_date('18/03/03','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('38','arthurh968','arthurhanes',to_date('18/03/14','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('39','rebeckam562','rebeckamckenney',to_date('18/04/10','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('40','selenap18','selenapena',to_date('18/08/14','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('41','albertinaw478','albertinawilburn',to_date('18/08/16','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('42','kelleye672','kelleyevers',to_date('18/08/20','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('43','feliciah926','feliciahaney',to_date('18/08/29','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('44','wallye699','wallyewing',to_date('18/09/05','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('45','orens82','orenstarling',to_date('18/10/29','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('46','dongh465','donghankins',to_date('18/11/06','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('47','cristobale36','cristobalezell',to_date('20/02/20','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('48','harleyb521','harleybowie',to_date('20/03/02','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('49','cornellh81','cornellhanks',to_date('20/03/03','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('50','glennw924','glennwilcox',to_date('20/04/03','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('1','janed393','janedoemis',to_date('10/01/01','RR/MM/DD'),'1');
Insert into WOJTEK.CUSTOMER_ACCOUNT (ID,LOGIN,PASSWORD,ACC_CREATE_DATE,TYPE_ID) values ('2','johnd455','johndani',to_date('10/01/01','RR/MM/DD'),'1');
REM INSERTING into WOJTEK.CUSTOMER_ADDRESS
SET DEFINE OFF;
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('3','South Africa','Mooirivier','15304 La Follette Center');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('4','France','Dijon','8111 Canary Parkway');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('5','China','Zudun','7 International Hill');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('6','China','Beihe','402 Dovetail Avenue');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('7','Thailand','Wang Nam Yen','49 Manufacturers Hill');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('8','Yemen','Ra�ad','9157 Welch Crossing');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('9','Argentina','Famaill�','58 Caliangt Crossing');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('10','Latvia','Riebini','503 Pine View Parkway');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('11','Bolivia','Mairana','798 Katie Crossing');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('12','France','Marly','1756 Heath Street');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('13','Latvia','In�ukalns','96 Pearson Point');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('14','Ukraine','Zdolbuniv','6 Schlimgen Center');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('15','Colombia','Chiquinquir�','1 Moland Lane');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('16','Philippines','Candijay','6236 Bunker Hill Center');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('17','Norway','Porsgrunn','635 Rockefeller Junction');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('18','Brazil','Pedreira','24234 Heath Crossing');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('19','Peru','Cahuacho','82663 Sycamore Hill');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('20','Portugal','Cardal','965 Manley Circle');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('21','China','Beitou','620 Division Parkway');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('22','Albania','Ballsh','7 Main Terrace');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('23','China','Jiuhua','50 Comanche Drive');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('24','Myanmar','Kanbe','203 Pankratz Street');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('25','Czech Republic','Dobr�','7 Nelson Parkway');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('26','Palestinian Territory','Wadi Raval','6 American Junction');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('27','Poland','Szynwa�d','26 Ilene Drive');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('28','Malaysia','Seremban','55 Reinke Trail');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('29','Brazil','Santa Isabel','5692 Randy Point');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('30','Russia','Kuybyshev','8083 Red Cloud Place');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('31','Honduras','Concepci�n de la Barranca','422 Rieder Park');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('32','Indonesia','Banggel','8100 Birchwood Court');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('33','China','Xinying','0 Wayridge Crossing');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('34','Portugal','Vila Flor','03749 Esker Street');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('35','China','Yudai','1 Ludington Court');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('36','Egypt','Al Qanayat','6 Anthes Parkway');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('37','Guatemala','Pueblo Nuevo Vinas','73 Sutherland Street');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('38','Japan','Shimodate','5 Ridgeway Way');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('39','Mali','Araouane','6 Havey Drive');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('40','United States','Huntsville','0193 Brickson Park Road');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('41','Brazil','Curitiba','72106 Graceland Place');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('42','China','Luobei','929 Loftsgordon Lane');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('43','China','Hanjiaji','5 Stephen Plaza');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('44','France','Wasquehal','3015 Dahle Lane');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('45','Philippines','Burgos','000 Muir Road');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('46','Malaysia','Pulau Pinang','1611 Coleman Park');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('47','United Arab Emirates','Khawr Fakkan','7617 Reindahl Junction');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('48','China','Dongpu','16541 Morningstar Street');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('49','Italy','Padova','779 Eagan Pass');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('50','Russia','Noginsk','6 Kropf Avenue');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('1','United States of America','New York','200 N Spring St Los Angeles');
Insert into WOJTEK.CUSTOMER_ADDRESS (ID,COUNTRY,CITY,STREET) values ('2','England','London','1/2E Westminster London');
REM INSERTING into WOJTEK.EMPLOYEE_ACCOUNT
SET DEFINE OFF;
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('1','3','Tomas.Sousa','tomassousa1986',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('2','2','Marc.Welker','marcwelker1951',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('3','2','Julissa.Douglass','julissadouglass1961',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('4','4','Carrol.Pittman','carrolpittman1950',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('5','3','Sheldon.Godwin','sheldongodwin1974',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('6','4','Ken.Loveless','kenloveless1988',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('7','3','Daina.South','dainasouth1999',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('8','4','Hyman.Bobbitt','hymanbobbitt1987',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('9','4','Nubia.Dove','nubiadove1985',to_date('20/01/01','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('10','3','Crissy.Mena','crissymena1973',to_date('20/01/02','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('11','4','Stephany.Pitts','stephanypitts1980',to_date('20/01/04','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('12','3','Katelynn.Cohn','katelynncohn1951',to_date('20/01/07','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('13','4','Laticia.Weller','laticiaweller1987',to_date('20/01/11','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('14','4','Adam.Bobo','adambobo1981',to_date('20/01/13','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('15','4','Augustine.Southard','augustinesouthard1955',to_date('20/01/18','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('16','4','Estell.Wellman','estellwellman1950',to_date('20/01/19','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('17','4','Natisha.Coker','natishacoker1967',to_date('20/01/19','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('18','3','Antony.Southerland','antonysoutherland1989',to_date('20/01/20','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('19','4','Shanel.Wells','shanelwells1983',to_date('20/01/23','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('20','4','Bettie.Southern','bettiesouthern1993',to_date('20/01/25','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('21','4','Pat.Menard','patmenard1951',to_date('20/01/27','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('22','3','Akilah.Bock','akilahbock1993',to_date('20/02/02','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('23','4','Alexander.Colbert','alexandercolbert1950',to_date('20/02/05','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('24','4','Desmond.Hurst','desmondhurst1991',to_date('20/02/07','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('25','4','Jayme.Place','jaymeplace1973',to_date('20/02/10','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('26','4','Dudley.Lovell','dudleylovell1989',to_date('20/02/10','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('27','4','Moshe.Goebel','moshegoebel1950',to_date('20/02/12','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('28','4','Sherly.Boehm','sherlyboehm1950',to_date('20/02/15','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('29','3','Delmer.Welsh','delmerwelsh1967',to_date('20/02/16','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('30','4','Tyron.Hurt','tyronhurt1987',to_date('20/02/17','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('31','4','Jewel.Mendenhall','jewelmendenhall1950',to_date('20/02/17','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('32','4','Tarah.Souza','tarahsouza1988',to_date('20/02/20','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('33','4','Abel.Wendt','abelwendt1952',to_date('20/02/21','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('34','4','Neville.Colburn','nevillecolburn1956',to_date('20/02/22','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('35','3','Ivory.Bogan','ivorybogan1959',to_date('20/03/07','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('36','4','Luci.Dover','lucidover1983',to_date('20/03/07','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('37','4','Abigail.Colby','abigailcolby1966',to_date('20/03/07','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('38','3','Jone.Plante','joneplante1969',to_date('20/03/09','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('39','4','Cleo.Goetz','cleogoetz1995',to_date('20/03/11','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('40','4','Chance.Boggs','chanceboggs1956',to_date('20/03/21','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('41','4','Abby.Cole','abbycole1980',to_date('20/03/22','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('42','4','Benton.Bohannon','bentonbohannon1950',to_date('20/03/29','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('43','4','Ahmad.Mendez','ahmadmendez1959',to_date('20/04/07','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('44','4','Shakia.Sowell','shakiasowell1951',to_date('20/04/09','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('45','3','Quincy.Lovett','quincylovett1950',to_date('20/04/12','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('46','4','Jamison.Dow','jamisondow1950',to_date('20/04/15','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('47','4','Hyman.Hurtado','hymanhurtado1968',to_date('20/04/18','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('48','4','Marcus.Loving','marcusloving1971',to_date('20/04/19','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('49','4','Araceli.Platt','araceliplatt1998',to_date('20/04/24','RR/MM/DD'));
Insert into WOJTEK.EMPLOYEE_ACCOUNT (ID,TYPE_ID,LOGIN,PASSWORD,ACCOUNT_CREATE_DATE) values ('50','4','Tommy.Goff','tommygoff1973',to_date('20/04/29','RR/MM/DD'));
REM INSERTING into WOJTEK.EMPLOYEE_ADDRESS
SET DEFINE OFF;
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('2','Ukraine','Kapitanivka','40069 Merrick Avenue');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('3','Philippines','Rominimbang','0911 Canary Trail');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('4','Tanzania','Geita','737 Washington Road');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('5','France','Montreuil','8 Schlimgen Place');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('6','Indonesia','Baleagung','159 Larry Junction');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('7','Poland','Mirsk','186 Hansons Avenue');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('8','Brazil','Rio Grande','2154 Cherokee Pass');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('9','Albania','Quk�s-Sk�nderbe','400 Declaration Road');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('10','South Korea','Uiju','0010 Corry Lane');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('11','Dominican Republic','Pizarrete','424 Garrison Way');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('12','Russia','Uzlovaya','21576 Autumn Leaf Circle');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('13','Russia','Mikhaylovsk','7 Sutteridge Park');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('14','Indonesia','Druju','3 Magdeline Parkway');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('15','China','Nanping','0388 Moulton Hill');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('16','Portugal','Carreira','05765 Columbus Alley');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('17','Indonesia','Rangah','6 Jana Alley');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('18','China','Hoit Taria','58 Anhalt Avenue');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('19','Portugal','Lamarosa','16 Orin Circle');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('20','China','Hengjiang','46807 Drewry Junction');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('21','Cuba','Pinar del R�o','69044 Spohn Terrace');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('22','Thailand','Songkhla','87132 Carpenter Lane');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('23','Brazil','Ilhabela','30 Talmadge Center');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('24','Russia','Zarechnyy','92 Chive Drive');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('25','Sweden','Bj�sta','16 Oakridge Drive');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('26','China','Beizhang','7975 Helena Parkway');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('27','Sweden','V�xj�','3138 Stuart Plaza');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('28','Colombia','S�chica','47511 Bobwhite Drive');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('29','Indonesia','Kawaliwu','79 Jay Park');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('30','China','Linquan','80 Muir Place');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('31','Panama','Nueva Gorgona','496 Laurel Circle');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('32','Tunisia','Jendouba','1 Melody Street');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('33','Ireland','Virginia','7 Anzinger Court');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('34','China','Nanhe','11781 Fallview Park');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('35','Greece','K�tsi','460 Dennis Place');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('36','Indonesia','Sindangkopo','03329 7th Lane');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('37','Kuwait','Ar Riqqah','79309 Spaight Plaza');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('38','Russia','Korolev','51 Towne Junction');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('39','Peru','Caspisapa','70506 New Castle Parkway');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('40','Indonesia','Bangrat','9 Cordelia Point');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('41','Germany','Hamburg','369 7th Circle');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('42','Denmark','Kobenhavn','820 Northfield Court');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('43','Dominican Republic','Dajab�n','60 Sutherland Terrace');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('44','Argentina','San Luis del Palmar','03 Monica Street');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('45','Philippines','Tungol','99 Valley Edge Court');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('46','Philippines','Katipunan','76 Eggendart Center');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('47','China','Zhutang','64709 Acker Street');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('48','Brazil','Ivoti','25746 Merry Point');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('49','Ukraine','Valky','644 Crownhardt Parkway');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('50','Kenya','Eldoret','45 Anniversary Lane');
Insert into WOJTEK.EMPLOYEE_ADDRESS (ID,COUNTRY,CITY,STREET) values ('1','Russia','Moskow','20 Mezhdunarodnaya Ulitsa Krasnogorsk');
REM INSERTING into WOJTEK.EMPLOYEES
SET DEFINE OFF;
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('1','Tomas','Sousa',to_date('86/05/02','RR/MM/DD'),'tomas_sousa@company.com','1','204699222','3','10','50000','1');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('2','Marc','Welker',to_date('51/01/25','RR/MM/DD'),'marc_welker@company.com','2','539511191','6','23','40000','2');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('3','Julissa','Douglass',to_date('61/04/15','RR/MM/DD'),'julissa_douglass@company.com','3','734529009','4','6','70000','3');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('4','Carrol','Pittman',to_date('50/03/09','RR/MM/DD'),'carrol_pittman@company.com','4','983485404','8','24','40000','4');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('5','Sheldon','Godwin',to_date('74/03/08','RR/MM/DD'),'sheldon_godwin@company.com','5','959458562','12','13','50000','5');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('6','Ken','Loveless',to_date('88/02/12','RR/MM/DD'),'ken_loveless@company.com','6','765621836','11','19','70000','6');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('7','Daina','South',to_date('99/06/20','RR/MM/DD'),'daina_south@company.com','7','938957090','5','17','40000','7');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('8','Hyman','Bobbitt',to_date('87/07/10','RR/MM/DD'),'hyman_bobbitt@company.com','8','431500892','1','7','60000','8');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('9','Nubia','Dove',to_date('85/11/14','RR/MM/DD'),'nubia_dove@company.com','9','849097511','10','5','30000','9');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('10','Crissy','Mena',to_date('73/09/20','RR/MM/DD'),'crissy_mena@company.com','10','629842301','7','11','80000','10');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('11','Stephany','Pitts',to_date('80/09/12','RR/MM/DD'),'stephany_pitts@company.com','11','536666434','2','20','80000','11');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('12','Katelynn','Cohn',to_date('51/09/05','RR/MM/DD'),'katelynn_cohn@company.com','12','655814904','9','8','40000','12');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('13','Laticia','Weller',to_date('87/06/07','RR/MM/DD'),'laticia_weller@company.com','13','546886928','4','9','60000','13');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('14','Adam','Bobo',to_date('81/09/03','RR/MM/DD'),'adam_bobo@company.com','14','374378041','8','28','60000','14');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('15','Augustine','Southard',to_date('55/12/12','RR/MM/DD'),'augustine_southard@company.com','15','172335199','2','25','60000','15');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('16','Estell','Wellman',to_date('50/01/01','RR/MM/DD'),'estell_wellman@company.com','16','256842936','8','21','60000','16');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('17','Natisha','Coker',to_date('67/04/09','RR/MM/DD'),'natisha_coker@company.com','17','527616806','9','12','70000','17');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('18','Antony','Southerland',to_date('89/08/22','RR/MM/DD'),'antony_southerland@company.com','18','594684996','5','1','70000','18');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('19','Shanel','Wells',to_date('83/04/11','RR/MM/DD'),'shanel_wells@company.com','19','333521020','4','26','40000','19');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('20','Bettie','Southern',to_date('93/12/01','RR/MM/DD'),'bettie_southern@company.com','20','527862043','10','18','60000','20');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('21','Pat','Menard',to_date('51/03/08','RR/MM/DD'),'pat_menard@company.com','21','666379634','11','30','70000','21');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('22','Akilah','Bock',to_date('93/10/11','RR/MM/DD'),'akilah_bock@company.com','22','126042577','4','27','50000','22');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('23','Alexander','Colbert',to_date('50/01/09','RR/MM/DD'),'alexander_colbert@company.com','23','384079332','1','15','40000','23');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('24','Desmond','Hurst',to_date('91/10/05','RR/MM/DD'),'desmond_hurst@company.com','24','387498455','5','4','30000','24');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('25','Jayme','Place',to_date('73/05/09','RR/MM/DD'),'jayme_place@company.com','25','194888950','10','14','50000','25');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('26','Dudley','Lovell',to_date('89/03/25','RR/MM/DD'),'dudley_lovell@company.com','26','878456873','9','29','50000','26');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('27','Moshe','Goebel',to_date('50/03/06','RR/MM/DD'),'moshe_goebel@company.com','27','628155402','8','22','40000','27');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('28','Sherly','Boehm',to_date('50/01/03','RR/MM/DD'),'sherly_boehm@company.com','28','930515400','12','2','60000','28');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('29','Delmer','Welsh',to_date('67/04/11','RR/MM/DD'),'delmer_welsh@company.com','29','593668990','1','3','40000','29');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('30','Tyron','Hurt',to_date('87/03/21','RR/MM/DD'),'tyron_hurt@company.com','30','786658250','11','2','30000','30');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('31','Jewel','Mendenhall',to_date('50/04/08','RR/MM/DD'),'jewel_mendenhall@company.com','31','854879483','8','13','60000','31');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('32','Tarah','Souza',to_date('88/05/22','RR/MM/DD'),'tarah_souza@company.com','32','948651663','2','19','60000','32');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('33','Abel','Wendt',to_date('52/06/11','RR/MM/DD'),'abel_wendt@company.com','33','496456684','7','2','60000','33');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('34','Neville','Colburn',to_date('56/05/18','RR/MM/DD'),'neville_colburn@company.com','34','716713340','4','29','30000','34');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('35','Ivory','Bogan',to_date('59/01/03','RR/MM/DD'),'ivory_bogan@company.com','35','172955152','9','28','70000','35');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('36','Luci','Dover',to_date('83/09/24','RR/MM/DD'),'luci_dover@company.com','36','847232515','12','25','60000','36');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('37','Abigail','Colby',to_date('66/08/13','RR/MM/DD'),'abigail_colby@company.com','37','770125192','1','21','50000','37');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('38','Jone','Plante',to_date('69/03/25','RR/MM/DD'),'jone_plante@company.com','38','554195612','8','11','40000','38');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('39','Cleo','Goetz',to_date('95/05/17','RR/MM/DD'),'cleo_goetz@company.com','39','395336617','2','15','60000','39');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('40','Chance','Boggs',to_date('56/01/13','RR/MM/DD'),'chance_boggs@company.com','40','541381812','4','18','50000','40');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('41','Abby','Cole',to_date('80/12/26','RR/MM/DD'),'abby_cole@company.com','41','761124818','7','3','40000','41');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('42','Benton','Bohannon',to_date('50/01/07','RR/MM/DD'),'benton_bohannon@company.com','42','750908584','2','12','40000','42');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('43','Ahmad','Mendez',to_date('59/01/05','RR/MM/DD'),'ahmad_mendez@company.com','43','704205333','8','5','50000','43');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('44','Shakia','Sowell',to_date('51/07/29','RR/MM/DD'),'shakia_sowell@company.com','44','378369934','3','17','70000','44');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('45','Quincy','Lovett',to_date('50/01/05','RR/MM/DD'),'quincy_lovett@company.com','45','494548514','4','28','40000','45');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('46','Jamison','Dow',to_date('50/02/10','RR/MM/DD'),'jamison_dow@company.com','46','320199485','5','22','40000','46');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('47','Hyman','Hurtado',to_date('68/11/25','RR/MM/DD'),'hyman_hurtado@company.com','47','693901328','12','5','80000','47');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('48','Marcus','Loving',to_date('71/07/16','RR/MM/DD'),'marcus_loving@company.com','48','917052378','5','30','70000','48');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('49','Araceli','Platt',to_date('98/06/27','RR/MM/DD'),'araceli_platt@company.com','49','351209792','1','27','60000','49');
Insert into WOJTEK.EMPLOYEES (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,EMAIL,ADDRESS_ID,PHONE_NUMBER,UNIT_ID,POSITION_ID,SALARY,ACCOUNT_ID) values ('50','Tommy','Goff',to_date('73/09/06','RR/MM/DD'),'tommy_goff@company.com','50','385688633','6','12','80000','50');
REM INSERTING into WOJTEK.INCOME
SET DEFINE OFF;
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('1','1','2','2019','6000','3000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('2','2','2','2019','7000','4000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('3','3','2','2019','4000','3000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('4','4','2','2019','5000','3000','1000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('5','5','2','2019','4000','3000','1000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('6','6','2','2019','7000','5000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('7','7','2','2019','4000','2000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('8','8','2','2019','3000','2000','800');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('9','9','2','2019','6000','4000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('10','10','2','2019','4000','3000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('11','11','2','2019','6000','5000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('12','12','2','2019','7000','5000','4000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('13','1','3','2019','7000','4000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('14','2','3','2019','7000','4000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('15','3','3','2019','8000','6000','5000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('16','4','3','2019','6000','4000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('17','5','3','2019','6000','4000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('18','6','3','2019','5000','4000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('19','7','3','2019','9000','7000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('20','8','3','2019','7000','4000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('21','9','3','2019','10000','7000','5000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('22','10','3','2019','5000','3000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('23','11','3','2019','8000','5000','4000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('24','12','3','2019','2000','1000','500');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('25','1','4','2019','1000','700','500');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('26','2','4','2019','4000','3000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('27','3','4','2019','9000','5000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('28','4','4','2019','2000','1000','1000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('29','5','4','2019','9000','6000','4000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('30','6','4','2019','2000','2000','1000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('31','7','4','2019','3000','2000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('32','8','4','2019','7000','5000','4000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('33','9','4','2019','1000','500','400');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('34','10','4','2019','10000','7000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('35','11','4','2019','4000','3000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('36','12','4','2019','1000','800','500');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('37','1','1','2020','8000','6000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('38','2','1','2020','10000','8000','4000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('39','3','1','2020','10000','8000','4000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('40','4','1','2020','1000','800','400');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('41','5','1','2020','1000','800','400');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('42','6','1','2020','3000','2000','1000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('43','7','1','2020','6000','5000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('44','8','1','2020','9000','6000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('45','9','1','2020','4000','2000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('46','10','1','2020','6000','3000','2000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('47','11','1','2020','8000','4000','3000');
Insert into WOJTEK.INCOME (ID,UNIT_ID,QUARTER,YEAR,NET_INCOME,GROSS_INCOME,TAX_INCOME) values ('48','12','1','2020','8000','6000','4000');
REM INSERTING into WOJTEK.ORDERS
SET DEFINE OFF;
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('2','5','32');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('3','10','30');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('4','47','5');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('5','55','26');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('6','50','24');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('7','11','50');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('8','24','38');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('9','34','10');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('10','32','45');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('11','4','15');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('12','3','9');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('13','3','17');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('14','46','19');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('15','4','40');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('16','50','1');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('17','49','27');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('18','48','30');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('19','22','35');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('20','35','21');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('21','8','11');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('22','5','31');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('23','47','13');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('24','5','24');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('25','52','14');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('26','45','45');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('27','38','25');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('28','14','48');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('29','21','28');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('30','23','28');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('31','28','2');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('32','45','36');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('33','24','45');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('34','44','26');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('35','48','40');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('36','41','48');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('37','48','29');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('38','52','17');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('39','53','7');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('40','27','50');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('41','44','34');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('42','53','9');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('43','47','33');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('44','1','21');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('45','38','5');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('46','20','42');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('47','5','49');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('48','1','11');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('49','43','26');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('50','18','21');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('51','28','3');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('52','34','44');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('53','25','39');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('54','43','26');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('55','51','20');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('56','3','2');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('57','50','4');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('58','25','21');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('59','17','41');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('60','23','41');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('61','8','40');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('62','5','30');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('63','56','30');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('64','17','24');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('65','24','4');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('66','43','2');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('67','5','26');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('68','31','35');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('69','35','12');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('70','24','2');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('71','42','2');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('72','37','46');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('73','43','28');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('74','42','5');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('75','9','10');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('76','43','4');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('77','30','49');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('78','5','6');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('79','5','46');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('80','53','10');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('81','47','43');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('82','7','25');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('83','17','18');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('84','50','4');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('85','35','34');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('86','34','21');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('87','15','43');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('88','3','24');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('89','34','3');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('90','46','29');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('91','46','37');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('92','21','15');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('93','28','11');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('94','41','41');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('95','20','47');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('96','51','16');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('97','33','42');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('98','13','45');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('99','6','26');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('100','52','40');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('101','8','26');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('102','27','47');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('103','39','50');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('104','26','3');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('105','39','46');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('106','7','9');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('107','9','15');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('108','21','2');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('109','40','5');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('110','31','37');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('111','46','41');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('112','31','43');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('113','54','44');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('114','13','39');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('115','38','23');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('116','48','9');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('117','3','42');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('118','36','25');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('119','47','29');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('120','40','44');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('121','25','4');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('122','31','7');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('123','52','10');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('124','4','6');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('125','2','33');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('126','23','15');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('127','23','49');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('128','11','49');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('129','45','33');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('130','49','43');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('131','31','50');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('132','37','45');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('133','52','15');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('134','35','14');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('135','44','6');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('136','56','41');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('137','2','17');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('138','32','37');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('139','35','4');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('140','52','43');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('141','6','41');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('142','20','33');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('143','21','28');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('144','24','49');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('145','47','29');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('146','23','38');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('147','8','21');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('148','9','2');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('149','51','42');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('150','34','36');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('151','35','15');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('152','15','31');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('153','23','47');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('154','31','35');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('155','43','6');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('156','35','21');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('157','31','22');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('158','4','12');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('159','35','24');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('160','14','37');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('161','11','8');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('162','56','45');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('163','45','43');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('164','29','14');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('165','39','1');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('166','38','28');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('167','30','35');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('168','33','37');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('169','6','6');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('170','4','45');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('171','29','16');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('172','11','8');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('173','4','36');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('174','7','25');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('175','51','47');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('176','17','50');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('177','37','28');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('178','21','24');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('179','27','4');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('180','23','17');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('181','50','11');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('182','26','16');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('183','32','46');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('184','56','37');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('185','29','11');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('186','43','25');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('187','18','4');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('188','9','46');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('189','45','15');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('190','4','1');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('191','24','43');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('192','52','47');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('193','47','12');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('194','31','44');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('195','26','19');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('196','40','46');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('197','26','18');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('198','23','19');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('199','48','45');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('200','29','44');
Insert into WOJTEK.ORDERS (ID,PRODUCT_ID,CUSTOMER_ID) values ('1','35','37');
REM INSERTING into WOJTEK.POSITION
SET DEFINE OFF;
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('1','Chief Executive Officer');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('2','Communication Analyst');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('3','Product Manager');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('4','Secretary');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('5','Site Manager');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('6','Chief Technology Officer');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('7','Director of Finance');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('8','Assistant Vice President');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('9','Senior Consultant');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('10','Commercial Manager');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('11','Business Analyst');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('12','Channel Sales Manager');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('13','Human Resources Representative');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('14','Sales Consultant');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('15','Specialist');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('16','Commercial Director');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('17','Lead Engineer');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('18','Shop Assistant');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('19','Purchasing Agent');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('20','QA Manager');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('21','Vice President');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('22','Consultant');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('23','Chief Financial Officer');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('24','Budget Analyst');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('25','Revenue Manager');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('26','Technical Writer');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('27','Technical Editor');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('28','Technology Manager');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('29','Developer/Programmer');
Insert into WOJTEK.POSITION (ID,POSITION_NAME) values ('30','Contract Manager');
REM INSERTING into WOJTEK.PRODUCTS
SET DEFINE OFF;
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('2','1','Mi 9 Explorer','292','584','292','8','5','6000');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('3','1','Mi 9 SE','521','1042','521','8','5','3600');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('4','1','Mi 9T','454','908','454','8','5','3100');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('5','1','Mi 9T Pro','417','834','417','7','4','8100');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('6','1','Mi CC9','829','1658','829','7','4','1500');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('7','1','Mi A3','725','1450','725','9','3','3700');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('8','1','Mi 9 Pro','347','694','347','9','3','500');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('9','1','Mi CC9 Pro','540','1080','540','9','3','7900');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('10','1','Mi 10','352','704','352','2','2','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('11','1','Mi 10 Pro','598','1196','598','5','1','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('12','1','Mi 10 Lite','336','672','336','2','2','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('13','1','Mi 10 Lite Zoom Edition','251','502','251','5','1','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('14','1','Redmi Note 4X','680','1360','680','1','6','400');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('15','1','Redmi Note 5A','909','1818','909','1','6','6800');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('16','1','Redmi Note 5A Prime','559','1118','559','1','6','1600');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('17','1','Redmi Note 5','340','680','340','1','6','7000');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('18','1','Redmi Note 6 pro','492','984','492','1','6','100');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('19','1','Redmi Note 7','307','614','307','8','5','3000');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('20','1','Redmi Note 7S','669','1338','669','8','5','5400');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('21','1','Redmi Note 7 Pro','818','1636','818','7','4','6000');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('22','1','Redmi Note 8 Pro','566','1132','566','7','4','1300');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('23','1','Redmi Note 8','712','1424','712','9','3','5200');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('24','1','Redmi Note 8T','212','424','212','2','2','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('25','1','Redmi Note 9 Pro','390','780','390','5','1','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('26','1','Redmi Note 9S','420','840','420','5','1','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('27','1','Redmi Note 9 Pro Max','349','698','349','5','1','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('28','1','Huawei P9�','180','360','180','1','6','4900');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('29','1','Huawei P9 Lite ','710','1420','710','1','6','2800');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('30','1','Huawei P9 Lite Mini ','819','1638','819','1','6','4700');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('31','1','Huawei P9 Plus ','572','1144','572','1','6','700');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('32','1','Huawei P10','716','1432','716','1','6','900');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('33','1','Huawei P10 Plus ','718','1436','718','1','6','200');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('34','1','Huawei P10 Lite ','829','1658','829','1','6','5900');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('35','1','Huawei P Smart','771','1542','771','8','5','600');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('36','1','Huawei P Smart Pro ','392','784','392','8','5','8400');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('37','1','Huawei P20','406','812','406','8','5','8100');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('38','1','Huawei P20 Pro','527','1054','527','8','5','5300');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('39','1','Huawei P20 Lite','426','852','426','7','4','2500');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('40','1','Huawei P Smart +','303','606','303','7','4','8500');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('41','1','Huawei P Smart','246','492','246','7','4','7700');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('42','1','Huawei P Smart Z','455','910','455','9','3','7400');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('43','1','Huawei P30','431','862','431','9','3','6100');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('44','1','Huawei P30 Pro','637','1274','637','9','3','5100');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('45','1','Huawei P30 Lite','832','1664','832','2','2','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('46','1','Huawei P40','258','516','258','2','2','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('47','1','Huawei P40 Lite','338','676','338','2','2','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('48','1','Huawei P40 Lite E ','754','1508','754','5','1','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('49','1','Huawei P40 Pro','921','1842','921','5','1','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('50','1','Huawei P40 Pro+ ','791','1582','791','5','1','0');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('51','2','Mi Pad 4','252','504','252','8','5','6600');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('52','2','MediaPad T3','522','1044','522','7','4','5200');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('53','2','MediaPad T5','205','410','205','7','4','1300');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('54','3','Matebook D15 Ryzen','562','1124','562','8','5','5700');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('55','3','Matebook D15 Intel','207','414','207','8','5','8100');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('56','4','MiCloud','351','702','351','8','5','1');
Insert into WOJTEK.PRODUCTS (ID,PRODUCT_TYPE_ID,PRODUCT_NAME,PRICE_NET,PRICE_GROSS,PRICE_TAX,UNIT_ID,PRODUCT_STATE_ID,QUANTITY) values ('1','1','Mi 9','404','808','404','1','6','3100');
REM INSERTING into WOJTEK.PRODUCT_STATE
SET DEFINE OFF;
Insert into WOJTEK.PRODUCT_STATE (ID,STATE_NAME) values ('1','Design');
Insert into WOJTEK.PRODUCT_STATE (ID,STATE_NAME) values ('2','Pre-production');
Insert into WOJTEK.PRODUCT_STATE (ID,STATE_NAME) values ('3','In-production');
Insert into WOJTEK.PRODUCT_STATE (ID,STATE_NAME) values ('4','Post-production');
Insert into WOJTEK.PRODUCT_STATE (ID,STATE_NAME) values ('5','Sales');
Insert into WOJTEK.PRODUCT_STATE (ID,STATE_NAME) values ('6','Discontinued');
REM INSERTING into WOJTEK.PRODUCT_TYPE
SET DEFINE OFF;
Insert into WOJTEK.PRODUCT_TYPE (ID,PRODUCT_TYPE_NAME) values ('1','Smartphone');
Insert into WOJTEK.PRODUCT_TYPE (ID,PRODUCT_TYPE_NAME) values ('2','Tablet');
Insert into WOJTEK.PRODUCT_TYPE (ID,PRODUCT_TYPE_NAME) values ('3','Laptop');
Insert into WOJTEK.PRODUCT_TYPE (ID,PRODUCT_TYPE_NAME) values ('4','Software');
REM INSERTING into WOJTEK.SPENDING
SET DEFINE OFF;
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('1','1','2','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('2','2','2','2019','500');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('3','3','2','2019','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('4','4','2','2019','700');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('5','5','2','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('6','6','2','2019','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('7','7','2','2019','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('8','8','2','2019','800');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('9','9','2','2019','800');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('10','10','2','2019','900');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('11','11','2','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('12','12','2','2019','500');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('13','1','3','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('14','2','3','2019','300');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('15','3','3','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('16','4','3','2019','800');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('17','5','3','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('18','6','3','2019','400');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('19','7','3','2019','900');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('20','8','3','2019','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('21','9','3','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('22','10','3','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('23','11','3','2019','600');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('24','12','3','2019','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('25','1','4','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('26','2','4','2019','100');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('27','3','4','2019','200');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('28','4','4','2019','300');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('29','5','4','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('30','6','4','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('31','7','4','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('32','8','4','2019','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('33','9','4','2019','200');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('34','10','4','2019','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('35','11','4','2019','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('36','12','4','2019','100');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('37','1','1','2020','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('38','2','1','2020','900');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('39','3','1','2020','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('40','4','1','2020','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('41','5','1','2020','100');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('42','6','1','2020','300');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('43','7','1','2020','400');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('44','8','1','2020','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('45','9','1','2020','1000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('46','10','1','2020','700');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('47','11','1','2020','2000');
Insert into WOJTEK.SPENDING (ID,UNIT_ID,QUARTER,YEAR,SPENDING_SUM) values ('48','12','1','2020','2000');
REM INSERTING into WOJTEK.UNIT
SET DEFINE OFF;
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('1','Operations');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('2','Executive');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('3','Marketing');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('4','Finance');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('5','Research and Development');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('6','Information Technology');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('7','Customer Support');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('8','Sales');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('9','Manufacturing');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('10','Human Resources');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('11','Consulting');
Insert into WOJTEK.UNIT (ID,UNIT_NAME) values ('12','Facilities');
--------------------------------------------------------
--  DDL for Index ACCOUNT_TYPE_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."ACCOUNT_TYPE_ID" ON "WOJTEK"."ACCOUNT_TYPE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CUSTOMER_ACCOUNT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."CUSTOMER_ACCOUNT_PK" ON "WOJTEK"."CUSTOMER_ACCOUNT" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CUSTOMER_ADDRESS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."CUSTOMER_ADDRESS_PK" ON "WOJTEK"."CUSTOMER_ADDRESS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CUSTOMER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."CUSTOMER_PK" ON "WOJTEK"."CUSTOMER" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index EMPLOYEES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."EMPLOYEES_PK" ON "WOJTEK"."EMPLOYEES" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index EMPLOYEE_ACCOUNT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."EMPLOYEE_ACCOUNT_PK" ON "WOJTEK"."EMPLOYEE_ACCOUNT" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index EMPLOYEE_ADDRESS_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."EMPLOYEE_ADDRESS_ID" ON "WOJTEK"."EMPLOYEE_ADDRESS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."ID" ON "WOJTEK"."UNIT" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index INCOME_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."INCOME_PK" ON "WOJTEK"."INCOME" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ORDERS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."ORDERS_PK" ON "WOJTEK"."ORDERS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index POSITION_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."POSITION_ID" ON "WOJTEK"."POSITION" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PRODUCTS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."PRODUCTS_PK" ON "WOJTEK"."PRODUCTS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PRODUCT_STATE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."PRODUCT_STATE_PK" ON "WOJTEK"."PRODUCT_STATE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PRODUCT_TYPE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."PRODUCT_TYPE_PK" ON "WOJTEK"."PRODUCT_TYPE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SPEDING_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "WOJTEK"."SPEDING_PK" ON "WOJTEK"."SPENDING" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Procedure ADD_ACCOUNT_TYPE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_ACCOUNT_TYPE" (typex VARCHAR2)
  AS
  BEGIN
    INSERT INTO ACCOUNT_TYPE (
      ID, TYPE
    )
    VALUES ((SELECT MAX(ID) + 1 FROM ACCOUNT_TYPE), typex);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_CUSTOMER
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_CUSTOMER" (first   VARCHAR2,
                              last    VARCHAR2,
                              phone   NUMBER,
                              mail    VARCHAR2,
                              addr_id NUMBER,
                              acc_id  NUMBER)
  AS
  BEGIN
    INSERT INTO CUSTOMER (
      ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL, ADDRESS_ID, ACCOUNT_ID
    )
    VALUES ((SELECT MAX(ID) + 1 FROM CUSTOMER), first, last, phone, mail, addr_id, acc_id);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_CUSTOMER_ACCOUNT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_CUSTOMER_ACCOUNT" (log         VARCHAR2,
                                      pass        VARCHAR2,
                                      create_date DATE,
                                      type_i      NUMBER)
  AS
  BEGIN
    INSERT INTO CUSTOMER_ACCOUNT (
      ID, LOGIN, PASSWORD, ACC_CREATE_DATE, TYPE_ID
    )
    VALUES ((SELECT MAX(ID) + 1 FROM CUSTOMER_ACCOUNT), log, pass, create_date, type_i);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_CUSTOMER_ADDRESS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_CUSTOMER_ADDRESS" (countr VARCHAR2,
                                      cit    VARCHAR2,
                                      stree  VARCHAR2)
  AS
  BEGIN
    INSERT INTO CUSTOMER_ADDRESS (
      ID, COUNTRY, CITY, STREET
    )
    VALUES ((SELECT MAX(ID) + 1 FROM CUSTOMER_ADDRESS), countr, cit, stree);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_EMPLOYEE_ACCOUNT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_EMPLOYEE_ACCOUNT" (type_i      NUMBER,
                                      logi        VARCHAR2,
                                      pass        VARCHAR2,
                                      create_date DATE)
  AS
  BEGIN
    INSERT INTO EMPLOYEE_ACCOUNT (
      ID, TYPE_ID, LOGIN, PASSWORD, ACCOUNT_CREATE_DATE
    )
    VALUES ((SELECT MAX(ID) + 1 FROM EMPLOYEE_ACCOUNT), type_i, logi, pass, create_date);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_EMPLOYEE_ADDRESS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_EMPLOYEE_ADDRESS" (countr VARCHAR2,
                                      cit    VARCHAR2,
                                      stree  VARCHAR2)
  AS
  BEGIN
    INSERT INTO EMPLOYEE_ADDRESS (
      ID, COUNTRY, CITY, STREET
    )
    VALUES ((SELECT MAX(ID) + 1 FROM EMPLOYEE_ADDRESS), countr, cit, stree);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_EMPLOYEES
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_EMPLOYEES" (first      VARCHAR2,
                               last       VARCHAR2,
                               birth_date DATE,
                               mail       VARCHAR2,
                               addr_id    NUMBER,
                               phone      NUMBER,
                               uni_id     NUMBER,
                               posi_id    NUMBER,
                               salar      FLOAT,
                               acc_id     NUMBER)
  AS
  BEGIN
    INSERT INTO EMPLOYEES (
      ID, FIRST_NAME, LAST_NAME, DATE_OF_BIRTH, EMAIL, ADDRESS_ID, PHONE_NUMBER, UNIT_ID, POSITION_ID, SALARY, ACCOUNT_ID
    )
    VALUES ((SELECT MAX(ID + 1) FROM EMPLOYEES), first, last, birth_date, mail, addr_id, phone, uni_id, posi_id, salar, acc_id);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_INCOME
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_INCOME" (uni_id  NUMBER,
                            quarte  NUMBER,
                            yea     NUMBER,
                            net_i   FLOAT,
                            gross_i FLOAT,
                            tax_i   FLOAT)
  AS
  BEGIN
    INSERT INTO INCOME (
      ID, Unit_id, QUARTER, YEAR, NET_INCOME, GROSS_INCOME, TAX_INCOME
    )
    VALUES ((SELECT MAX(ID) + 1 FROM INCOME), uni_id, quarte, yea, net_i, gross_i, tax_i);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_ORDERS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_ORDERS" (p_id NUMBER,
                            c_id NUMBER)
  AS
  BEGIN
    INSERT INTO ORDERS (
      ID, PRODUCT_ID, CUSTOMER_ID
    )
    VALUES ((SELECT MAX(ID) + 1 FROM ORDERS), p_id, c_id);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_POSITION
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_POSITION" (p_name VARCHAR2)
  AS
  BEGIN
    INSERT INTO POSITION (
      ID, POSITION_NAME
    )
    VALUES ((SELECT MAX(ID) + 1 FROM POSITION), p_name);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_PRODUCTS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_PRODUCTS" (p_type_id  NUMBER,
                              p_name     VARCHAR2,
                              p_net      FLOAT,
                              p_gross    FLOAT,
                              p_tax      FLOAT,
                              uni_id     NUMBER,
                              p_state_id NUMBER,
                              quanti     NUMBER)
  AS
  BEGIN
    INSERT INTO PRODUCTS (
      ID, PRODUCT_TYPE_ID, PRODUCT_NAME, PRICE_NET, PRICE_GROSS, PRICE_TAX, UNIT_ID, PRODUCT_STATE_ID, QUANTITY
    )
    VALUES ((SELECT MAX(ID) + 1 FROM PRODUCTS), p_type_id, p_name, p_net, p_gross, p_tax, uni_id, p_state_id, quanti);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_PRODUCT_STATE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_PRODUCT_STATE" (s_name VARCHAR2)
  AS
  BEGIN
    INSERT INTO PRODUCT_STATE (
      ID, STATE_NAME
    )
    VALUES ((SELECT MAX(ID) + 1 FROM PRODUCT_STATE), s_name);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_PRODUCT_TYPE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_PRODUCT_TYPE" (p_type VARCHAR2)
  AS
  BEGIN
    INSERT INTO PRODUCT_TYPE (
      ID, PRODUCT_TYPE_NAME
    )
    VALUES ((SELECT MAX(ID) + 1 FROM PRODUCT_TYPE), p_type);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_SPENDING
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_SPENDING" (uni_id   NUMBER,
                              quarte   NUMBER,
                              yea      NUMBER,
                              spending FLOAT)
  AS
  BEGIN
    INSERT INTO SPENDING (
      ID, unit_id, quarter, year, spending_sum
    )
    VALUES ((SELECT MAX(ID) + 1 FROM SPENDING), uni_id, quarte, yea, spending);
  END;

/
--------------------------------------------------------
--  DDL for Procedure ADD_UNIT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."ADD_UNIT" (name VARCHAR2)
  AS
  BEGIN
    INSERT INTO UNIT (
      ID, UNIT_NAME
    )
    VALUES ((SELECT MAX(ID) + 1 FROM UNIT), name);
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_ACCOUNT_TYPE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_ACCOUNT_TYPE" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM ACCOUNT_TYPE
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_CUSTOMER
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_CUSTOMER" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM CUSTOMER
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_CUSTOMER_ACCOUNT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_CUSTOMER_ACCOUNT" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM CUSTOMER_ACCOUNT
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_CUSTOMER_ADDRESS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_CUSTOMER_ADDRESS" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM CUSTOMER_ADDRESS
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_EMPLOYEE_ACCOUNT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_EMPLOYEE_ACCOUNT" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM EMPLOYEE_ACCOUNT
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_EMPLOYEE_ADDRESS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_EMPLOYEE_ADDRESS" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM EMPLOYEE_ADDRESS
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_EMPLOYEES
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_EMPLOYEES" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM EMPLOYEES
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_INCOME
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_INCOME" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM INCOME
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_ORDERS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_ORDERS" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM ORDERS
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_POSITION
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_POSITION" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM POSITION
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_PPRODUCTS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_PPRODUCTS" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM PRODUCTS
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_PPRODUCT_STATE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_PPRODUCT_STATE" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM PRODUCT_STATE
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_PPRODUCT_TYPE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_PPRODUCT_TYPE" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM PRODUCT_TYPE
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_SPENDING
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_SPENDING" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM SPENDING
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_UNIT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."DELETE_UNIT" (id_x NUMBER)
  AS
  BEGIN
    DELETE FROM UNIT
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_ACCOUNT_TYPE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_ACCOUNT_TYPE" (id_x  NUMBER,
                                     typex VARCHAR2)
  AS
  BEGIN
    UPDATE ACCOUNT_TYPE
      SET TYPE = typex
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_CUSTOMER
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_CUSTOMER" (cus_id  NUMBER,
                                 first   VARCHAR2,
                                 last    VARCHAR2,
                                 phone   NUMBER,
                                 mail    VARCHAR2,
                                 addr_id NUMBER,
                                 acc_id  NUMBER)
  AS
  BEGIN
    UPDATE customer
      SET FIRST_NAME = first, LAST_NAME = last, PHONE_NUMBER = phone, EMAIL = mail, ADDRESS_ID = addr_id, ACCOUNT_ID = acc_id
      WHERE ID = cus_id;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_CUSTOMER_ACCOUNT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_CUSTOMER_ACCOUNT" (id_x        NUMBER,
                                         log         VARCHAR2,
                                         pass        VARCHAR2,
                                         create_date DATE,
                                         type_i      NUMBER)
  AS
  BEGIN
    UPDATE CUSTOMER_ACCOUNT
      SET LOGIN = log, PASSWORD = pass, ACC_CREATE_DATE = create_date, TYPE_ID = type_i
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_CUSTOMER_ADDRESS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_CUSTOMER_ADDRESS" (id_x   NUMBER,
                                         countr VARCHAR2,
                                         cit    VARCHAR2,
                                         stree  VARCHAR2)
  AS
  BEGIN
    UPDATE CUSTOMER_ADDRESS
      SET COUNTRY = countr, CITY = cit, STREET = stree
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_EMPLOYEE_ACCOUNT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_EMPLOYEE_ACCOUNT" (id_x        NUMBER,
                                         type_i      NUMBER,
                                         logi        VARCHAR2,
                                         pass        VARCHAR2,
                                         create_date DATE)
  AS
  BEGIN
    UPDATE EMPLOYEE_ACCOUNT
      SET LOGIN = logi, PASSWORD = pass, ACCOUNT_CREATE_DATE = create_date, TYPE_ID = type_i
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_EMPLOYEE_ADDRESS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_EMPLOYEE_ADDRESS" (id_x   NUMBER,
                                         countr VARCHAR2,
                                         cit    VARCHAR2,
                                         stree  VARCHAR2)
  AS
  BEGIN
    UPDATE EMPLOYEE_ADDRESS
      SET COUNTRY = countr, CITY = cit, STREET = stree
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_EMPLOYEES
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_EMPLOYEES" (id_x       NUMBER,
                                  first      VARCHAR2,
                                  last       VARCHAR2,
                                  birth_date DATE,
                                  mail       VARCHAR2,
                                  addr_id    NUMBER,
                                  phone      NUMBER,
                                  uni_id     NUMBER,
                                  posi_id    NUMBER,
                                  salar      NUMBER,
                                  acc_id     NUMBER)
  AS
  BEGIN
    UPDATE EMPLOYEES
      SET FIRST_NAME = first, LAST_NAME = last, DATE_OF_BIRTH = birth_date, EMAIL = mail, ADDRESS_ID = addr_id, PHONE_NUMBER = phone, UNIT_ID = uni_id, POSITION_ID = posi_id, SALARY = salar, ACCOUNT_ID = acc_id
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_INCOME
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_INCOME" (id_x    NUMBER,
                               uni_id  NUMBER,
                               quarte  NUMBER,
                               yea     NUMBER,
                               net_i   FLOAT,
                               gross_i FLOAT,
                               tax_i   FLOAT)
  AS
  BEGIN
    UPDATE INCOME
      SET UNIT_ID = uni_id, QUARTER = quarte, YEAR = yea, NET_INCOME = net_i, GROSS_INCOME = gross_i, TAX_INCOME = tax_i
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_ORDERS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_ORDERS" (id_x NUMBER,
                               p_id NUMBER,
                               c_id NUMBER)
  AS
  BEGIN
    UPDATE ORDERS
      SET PRODUCT_ID = p_id, CUSTOMER_ID = c_id
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_POSITION
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_POSITION" (id_x   NUMBER,
                                 p_name VARCHAR2)
  AS
  BEGIN
    UPDATE POSITION
      SET POSITION_NAME = p_name
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_PRODUCTS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_PRODUCTS" (id_x       NUMBER,
                                 p_type_id  NUMBER,
                                 p_name     VARCHAR2,
                                 p_net      FLOAT,
                                 p_gross    FLOAT,
                                 p_tax      FLOAT,
                                 uni_id     NUMBER,
                                 p_state_id NUMBER,
                                 quanti     NUMBER)
  AS
  BEGIN
    UPDATE PRODUCTS
      SET PRODUCT_TYPE_ID = p_type_id, PRODUCT_NAME = p_name, PRICE_NET = p_net, PRICE_GROSS = p_gross, PRICE_TAX = p_tax, UNIT_ID = uni_id, PRODUCT_STATE_ID = p_state_id, QUANTITY = quanti
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_PRODUCT_STATE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_PRODUCT_STATE" (id_x   NUMBER,
                                      s_name VARCHAR2)
  AS
  BEGIN
    UPDATE PRODUCT_STATE
      SET STATE_NAME = s_name
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_PRODUCT_TYPE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_PRODUCT_TYPE" (id_x   NUMBER,
                                     p_type VARCHAR2)
  AS
  BEGIN
    UPDATE PRODUCT_TYPE
      SET PRODUCT_TYPE_NAME = p_type
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_SPENDING
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_SPENDING" (id_x     NUMBER,
                                 uni_id   NUMBER,
                                 quarte   NUMBER,
                                 yea      NUMBER,
                                 spending FLOAT)
  AS
  BEGIN
    UPDATE SPENDING
      SET UNIT_ID = uni_id, QUARTER = quarte, YEAR = yea, SPENDING_SUM = spending
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_UNIT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "WOJTEK"."UPDATE_UNIT" (id_x NUMBER,
                             name VARCHAR2)
  AS
  BEGIN
    UPDATE UNIT
      SET UNIT_NAME = name
      WHERE ID = id_x;
  END;

/
--------------------------------------------------------
--  Constraints for Table CUSTOMER
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."CUSTOMER" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."CUSTOMER" ADD CONSTRAINT "CUSTOMER_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table CUSTOMER_ADDRESS
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."CUSTOMER_ADDRESS" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."CUSTOMER_ADDRESS" ADD CONSTRAINT "CUSTOMER_ADDRESS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PRODUCTS
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."PRODUCTS" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."PRODUCTS" ADD CONSTRAINT "PRODUCTS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table EMPLOYEE_ADDRESS
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."EMPLOYEE_ADDRESS" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."EMPLOYEE_ADDRESS" ADD CONSTRAINT "EMPLOYEE_ADDRESS_ID" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table INCOME
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."INCOME" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."INCOME" ADD CONSTRAINT "INCOME_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SPENDING
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."SPENDING" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."SPENDING" ADD CONSTRAINT "SPEDING_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PRODUCT_STATE
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."PRODUCT_STATE" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."PRODUCT_STATE" ADD CONSTRAINT "PRODUCT_STATE_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table EMPLOYEE_ACCOUNT
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."EMPLOYEE_ACCOUNT" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."EMPLOYEE_ACCOUNT" ADD CONSTRAINT "EMPLOYEE_ACCOUNT_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table EMPLOYEES
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."EMPLOYEES" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."EMPLOYEES" ADD CONSTRAINT "EMPLOYEES_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table CUSTOMER_ACCOUNT
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."CUSTOMER_ACCOUNT" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."CUSTOMER_ACCOUNT" ADD CONSTRAINT "CUSTOMER_ACCOUNT_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table POSITION
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."POSITION" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."POSITION" MODIFY ("POSITION_NAME" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."POSITION" ADD CONSTRAINT "POSITION_ID" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ACCOUNT_TYPE
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."ACCOUNT_TYPE" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."ACCOUNT_TYPE" ADD CONSTRAINT "ACCOUNT_TYPE_ID" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ORDERS
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."ORDERS" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."ORDERS" ADD CONSTRAINT "ORDERS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table UNIT
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."UNIT" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."UNIT" MODIFY ("UNIT_NAME" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."UNIT" ADD CONSTRAINT "UNIT_ID" PRIMARY KEY ("ID")
  USING INDEX (CREATE UNIQUE INDEX "WOJTEK"."ID" ON "WOJTEK"."UNIT" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" )  ENABLE;
--------------------------------------------------------
--  Constraints for Table PRODUCT_TYPE
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."PRODUCT_TYPE" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "WOJTEK"."PRODUCT_TYPE" ADD CONSTRAINT "PRODUCT_TYPE_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CUSTOMER
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."CUSTOMER" ADD CONSTRAINT "FK_CUSTOMER_ACCOUNT_ID" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "WOJTEK"."CUSTOMER_ACCOUNT" ("ID") ENABLE;
  ALTER TABLE "WOJTEK"."CUSTOMER" ADD CONSTRAINT "FK_CUSTOMER_ADDRESS_ID" FOREIGN KEY ("ADDRESS_ID")
	  REFERENCES "WOJTEK"."CUSTOMER_ADDRESS" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CUSTOMER_ACCOUNT
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."CUSTOMER_ACCOUNT" ADD CONSTRAINT "FK_CUSTOMER_ACCOUNT_TYPE_ID" FOREIGN KEY ("TYPE_ID")
	  REFERENCES "WOJTEK"."ACCOUNT_TYPE" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table EMPLOYEE_ACCOUNT
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."EMPLOYEE_ACCOUNT" ADD CONSTRAINT "FK_EMPLOYEE_ACCOUNT_TYPE_ID" FOREIGN KEY ("TYPE_ID")
	  REFERENCES "WOJTEK"."ACCOUNT_TYPE" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table EMPLOYEES
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."EMPLOYEES" ADD CONSTRAINT "FK_EMPLOYEES_ACCOUNT_ID" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "WOJTEK"."EMPLOYEE_ACCOUNT" ("ID") ENABLE;
  ALTER TABLE "WOJTEK"."EMPLOYEES" ADD CONSTRAINT "FK_EMPLOYEES_ADDRESS_ID" FOREIGN KEY ("ADDRESS_ID")
	  REFERENCES "WOJTEK"."EMPLOYEE_ADDRESS" ("ID") ENABLE;
  ALTER TABLE "WOJTEK"."EMPLOYEES" ADD CONSTRAINT "FK_EMPLOYEES_POSITION_ID" FOREIGN KEY ("POSITION_ID")
	  REFERENCES "WOJTEK"."POSITION" ("ID") ENABLE;
  ALTER TABLE "WOJTEK"."EMPLOYEES" ADD CONSTRAINT "FK_EMPLOYEES_UNIT_ID" FOREIGN KEY ("UNIT_ID")
	  REFERENCES "WOJTEK"."UNIT" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table INCOME
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."INCOME" ADD CONSTRAINT "FK_INCOME_UNIT_ID" FOREIGN KEY ("UNIT_ID")
	  REFERENCES "WOJTEK"."UNIT" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ORDERS
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."ORDERS" ADD CONSTRAINT "FK_ORDERS_CUSTOMER_ID" FOREIGN KEY ("CUSTOMER_ID")
	  REFERENCES "WOJTEK"."CUSTOMER" ("ID") ENABLE;
  ALTER TABLE "WOJTEK"."ORDERS" ADD CONSTRAINT "FK_ORDERS_PRODUCT_ID" FOREIGN KEY ("PRODUCT_ID")
	  REFERENCES "WOJTEK"."PRODUCTS" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PRODUCTS
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."PRODUCTS" ADD CONSTRAINT "FK_PRODUCTS_PRODUCT_STATE_ID" FOREIGN KEY ("PRODUCT_STATE_ID")
	  REFERENCES "WOJTEK"."PRODUCT_STATE" ("ID") ENABLE;
  ALTER TABLE "WOJTEK"."PRODUCTS" ADD CONSTRAINT "FK_PRODUCTS_PRODUCT_TYPE_ID" FOREIGN KEY ("PRODUCT_TYPE_ID")
	  REFERENCES "WOJTEK"."PRODUCT_TYPE" ("ID") ENABLE;
  ALTER TABLE "WOJTEK"."PRODUCTS" ADD CONSTRAINT "FK_PRODUCTS_UNIT_ID" FOREIGN KEY ("UNIT_ID")
	  REFERENCES "WOJTEK"."UNIT" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SPENDING
--------------------------------------------------------

  ALTER TABLE "WOJTEK"."SPENDING" ADD CONSTRAINT "FK_SPEDING_UNIT_ID" FOREIGN KEY ("UNIT_ID")
	  REFERENCES "WOJTEK"."UNIT" ("ID") ENABLE;
