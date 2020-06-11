--------------------------------------------------------
--  File created - czwartek-czerwca-11-2020   
--------------------------------------------------------
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
