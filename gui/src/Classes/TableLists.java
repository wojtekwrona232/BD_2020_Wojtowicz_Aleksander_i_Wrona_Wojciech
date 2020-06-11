/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package Classes;

import DAO.*;
import EntityClasses.*;
import com.jfoenix.controls.JFXTextField;
import org.hibernate.exception.ConstraintViolationException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.util.ArrayList;

public class TableLists {

    Account_typeDAO account_typeDAO = new Account_typeDAO();
    CustomerDAO customerDAO = new CustomerDAO();
    Customer_accountDAO customer_accountDAO = new Customer_accountDAO();
    Customer_addressDAO customer_addressDAO = new Customer_addressDAO();
    Employee_accountDAO employee_accountDAO = new Employee_accountDAO();
    Employees_addressDAO employees_addressDAO = new Employees_addressDAO();
    EmployeesDAO employeesDAO = new EmployeesDAO();
    IncomeDAO incomeDAO = new IncomeDAO();
    OrdersDAO ordersDAO = new OrdersDAO();
    PositionDAO positionDAO = new PositionDAO();
    Product_typeDAO product_typeDAO = new Product_typeDAO();
    Product_stateDAO product_stateDAO = new Product_stateDAO();
    ProductsDAO productsDAO = new ProductsDAO();
    SpendingDAO spendingDAO = new SpendingDAO();
    UnitsDAO unitsDAO = new UnitsDAO();

    private final Error error = new Error();

    // Array lists storing information about currently added record and all record while reading from data base
    ArrayList<Account_Type> account_typeArrayList = new ArrayList<>();
    ArrayList<Customer> customerArrayList = new ArrayList<>();
    ArrayList<Customer_Account> customer_accountArrayList = new ArrayList<>();
    ArrayList<Customer_Address> customer_addressArrayList = new ArrayList<>();
    ArrayList<Employee_Account> employee_accountArrayList = new ArrayList<>();
    ArrayList<Employee_Address> employee_addressArrayList = new ArrayList<>();
    ArrayList<Employees> employeesArrayList = new ArrayList<>();
    ArrayList<Income> incomeArrayList = new ArrayList<>();
    ArrayList<Orders> ordersArrayList = new ArrayList<>();
    ArrayList<Position> positionArrayList = new ArrayList<>();
    ArrayList<Product_State> product_stateArrayList = new ArrayList<>();
    ArrayList<Product_Type> product_typeArrayList = new ArrayList<>();
    ArrayList<Products> productsArrayList = new ArrayList<>();
    ArrayList<Spending> spendingArrayList = new ArrayList<>();
    ArrayList<Units> unitsArrayList = new ArrayList<>();

    // setters and getters for the array lists
    public ArrayList<Account_Type> getAccount_typeArrayList() {
        return account_typeArrayList;
    }
    public void setAccount_typeArrayList(ArrayList<Account_Type> account_typeArrayList) {
        this.account_typeArrayList = account_typeArrayList;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public ArrayList<Customer_Account> getCustomer_accountArrayList() {
        return customer_accountArrayList;
    }
    public void setCustomer_accountArrayList(ArrayList<Customer_Account> customer_accountArrayList) {
        this.customer_accountArrayList = customer_accountArrayList;
    }

    public ArrayList<Customer_Address> getCustomer_addressArrayList() {
        return customer_addressArrayList;
    }
    public void setCustomer_addressArrayList(ArrayList<Customer_Address> customer_addressArrayList) {
        this.customer_addressArrayList = customer_addressArrayList;
    }

    public ArrayList<Employee_Account> getEmployee_accountArrayList() {
        return employee_accountArrayList;
    }
    public void setEmployee_accountArrayList(ArrayList<Employee_Account> employee_accountArrayList) {
        this.employee_accountArrayList = employee_accountArrayList;
    }

    public ArrayList<Employee_Address> getEmployee_addressArrayList() {
        return employee_addressArrayList;
    }
    public void setEmployee_addressArrayList(ArrayList<Employee_Address> employee_addressArrayList) {
        this.employee_addressArrayList = employee_addressArrayList;
    }

    public ArrayList<Employees> getEmployeesArrayList() {
        return employeesArrayList;
    }
    public void setEmployeesArrayList(ArrayList<Employees> employeesArrayList) {
        this.employeesArrayList = employeesArrayList;
    }

    public ArrayList<Income> getIncomeArrayList() {
        return incomeArrayList;
    }
    public void setIncomeArrayList(ArrayList<Income> incomeArrayList) {
        this.incomeArrayList = incomeArrayList;
    }

    public ArrayList<Orders> getOrdersArrayList() {
        return ordersArrayList;
    }
    public void setOrdersArrayList(ArrayList<Orders> ordersArrayList) {
        this.ordersArrayList = ordersArrayList;
    }

    public ArrayList<Position> getPositionArrayList() {
        return positionArrayList;
    }
    public void setPositionArrayList(ArrayList<Position> positionArrayList) {
        this.positionArrayList = positionArrayList;
    }

    public ArrayList<Product_State> getProduct_stateArrayList() {
        return product_stateArrayList;
    }
    public void setProduct_stateArrayList(ArrayList<Product_State> product_stateArrayList) {
        this.product_stateArrayList = product_stateArrayList;
    }

    public ArrayList<Product_Type> getProduct_typeArrayList() {
        return product_typeArrayList;
    }
    public void setProduct_typeArrayList(ArrayList<Product_Type> product_typeArrayList) {
        this.product_typeArrayList = product_typeArrayList;
    }

    public ArrayList<Products> getProductsArrayList() {
        return productsArrayList;
    }
    public void setProductsArrayList(ArrayList<Products> productsArrayList) {
        this.productsArrayList = productsArrayList;
    }

    public ArrayList<Spending> getSpendingArrayList() {
        return spendingArrayList;
    }
    public void setSpendingArrayList(ArrayList<Spending> spendingArrayList) {
        this.spendingArrayList = spendingArrayList;
    }

    public ArrayList<Units> getUnitsArrayList() {
        return unitsArrayList;
    }
    public void setUnitsArrayList(ArrayList<Units> unitsArrayList) {
        this.unitsArrayList = unitsArrayList;
    }


    /*
    income
    spending
    units
    positions
    employees
    employees address
    employees accounts
    customer
    customer address
    customer accounts
    product state
    product type
    account type
    orders
    products
     */


    public void AddAccount_type(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = account_typeDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_account_type(?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.executeUpdate();
            account_typeDAO.getCurrentTransaction().commit();
            account_typeDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddCustomer(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = customerDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_customer(?,?,?,?,?,?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.setParameter(2, arrayList.get(1).getText());
            query.setParameter(3, Long.valueOf(arrayList.get(2).getText()));
            query.setParameter(4, arrayList.get(3).getText());
            query.setParameter(5, Integer.parseInt(arrayList.get(4).getText()));
            query.setParameter(6, Integer.parseInt(arrayList.get(5).getText()));
            query.executeUpdate();
            customerDAO.getCurrentTransaction().commit();
            customerDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddCustomer_Account(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = customer_accountDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_customer_account(?,?,?,?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.setParameter(2, arrayList.get(1).getText());
            query.setParameter(3, arrayList.get(2).getText());
            query.setParameter(4, Integer.parseInt(arrayList.get(3).getText()));
            query.executeUpdate();
            customer_accountDAO.getCurrentTransaction().commit();
            customer_accountDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddCustomer_Address(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = customer_addressDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_customer_address(?,?,?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.setParameter(2, arrayList.get(1).getText());
            query.setParameter(3, arrayList.get(2).getText());
            query.executeUpdate();
            customer_addressDAO.getCurrentTransaction().commit();
            customer_addressDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddEmployee_Account(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = employee_accountDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_employee_account(?,?,?,?) }");
            query.setParameter(1, Integer.parseInt(arrayList.get(3).getText()));
            query.setParameter(2, arrayList.get(0).getText());
            query.setParameter(3, arrayList.get(1).getText());
            query.setParameter(4, arrayList.get(2).getText());
            query.executeUpdate();
            employee_accountDAO.getCurrentTransaction().commit();
            employee_accountDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddEmployee_Address(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = customer_addressDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_employee_address(?,?,?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.setParameter(2, arrayList.get(1).getText());
            query.setParameter(3, arrayList.get(2).getText());
            query.executeUpdate();
            customer_addressDAO.getCurrentTransaction().commit();
            customer_addressDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddEmployee(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = employeesDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_employees(?,?,?,?,?,?,?,?,?,?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.setParameter(2, arrayList.get(1).getText());
            query.setParameter(3, arrayList.get(2).getText());
            query.setParameter(4, arrayList.get(4).getText());
            query.setParameter(5, Integer.parseInt(arrayList.get(3).getText()));
            query.setParameter(6, Integer.parseInt(arrayList.get(5).getText()));
            query.setParameter(7, Integer.parseInt(arrayList.get(6).getText()));
            query.setParameter(8, Integer.parseInt(arrayList.get(7).getText()));
            query.setParameter(9, Float.valueOf(arrayList.get(8).getText()));
            query.setParameter(10, Integer.parseInt(arrayList.get(9).getText()));
            query.executeUpdate();
            employeesDAO.getCurrentTransaction().commit();
            employeesDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
            e.printStackTrace();
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddIncome(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = incomeDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_income(?,?,?,?,?,?) }");
            query.setParameter(1, Integer.parseInt(arrayList.get(0).getText()));
            query.setParameter(2, Integer.parseInt(arrayList.get(1).getText()));
            query.setParameter(3, Integer.parseInt(arrayList.get(2).getText()));
            query.setParameter(4, Float.parseFloat(arrayList.get(3).getText()));
            query.setParameter(5, Float.parseFloat(arrayList.get(4).getText()));
            query.setParameter(6, Float.parseFloat(arrayList.get(5).getText()));
            query.executeUpdate();
            incomeDAO.getCurrentTransaction().commit();
            incomeDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
            e.printStackTrace();
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddOrders(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = ordersDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_orders(?,?) }");
            query.setParameter(1, Integer.parseInt(arrayList.get(0).getText()));
            query.setParameter(2, Integer.parseInt(arrayList.get(1).getText()));
            query.executeUpdate();
            ordersDAO.getCurrentTransaction().commit();
            ordersDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
            e.printStackTrace();
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddPosition(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_position(?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.executeUpdate();
            positionDAO.getCurrentTransaction().commit();
            positionDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddProduct_State(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_product_state(?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.executeUpdate();
            positionDAO.getCurrentTransaction().commit();
            positionDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddProduct_Type(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_product_type(?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.executeUpdate();
            positionDAO.getCurrentTransaction().commit();
            positionDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddProduct(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = productsDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_products(?,?,?,?,?,?,?,?) }");
            query.setParameter(1, Integer.parseInt(arrayList.get(0).getText()));
            query.setParameter(2, arrayList.get(1).getText());
            query.setParameter(3, Float.valueOf(arrayList.get(2).getText()));
            query.setParameter(4, Float.valueOf(arrayList.get(3).getText()));
            query.setParameter(5, Float.valueOf(arrayList.get(4).getText()));
            query.setParameter(6, Integer.parseInt(arrayList.get(5).getText()));
            query.setParameter(7, Integer.parseInt(arrayList.get(6).getText()));
            query.setParameter(8, Integer.parseInt(arrayList.get(7).getText()));
            query.executeUpdate();
            productsDAO.getCurrentTransaction().commit();
            productsDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddSpending(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = spendingDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_spending(?,?,?,?) }");
            query.setParameter(1, Integer.parseInt(arrayList.get(0).getText()));
            query.setParameter(2, Integer.parseInt(arrayList.get(1).getText()));
            query.setParameter(3, Integer.parseInt(arrayList.get(2).getText()));
            query.setParameter(4, Float.valueOf(arrayList.get(3).getText()));
            query.executeUpdate();
            spendingDAO.getCurrentTransaction().commit();
            spendingDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void AddUnit(ArrayList<JFXTextField> arrayList) {
        var success = false;
        try {
            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call add_unit(?) }");
            query.setParameter(1, arrayList.get(0).getText());
            query.executeUpdate();
            positionDAO.getCurrentTransaction().commit();
            positionDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }



    public void UpdateAccount_type(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = account_typeDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_account_type(?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.executeUpdate();
            account_typeDAO.getCurrentTransaction().commit();
            account_typeDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateCustomer(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = customerDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_customer(?,?,?,?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.setParameter(3, arrayList.get(1).getText());
            query.setParameter(4, Long.valueOf(arrayList.get(2).getText()));
            query.setParameter(5, arrayList.get(3).getText());
            query.setParameter(6, Integer.parseInt(arrayList.get(4).getText()));
            query.setParameter(7, Integer.parseInt(arrayList.get(5).getText()));
            query.executeUpdate();
            customerDAO.getCurrentTransaction().commit();
            customerDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateCustomer_Account(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = customer_accountDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_customer_account(?,?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.setParameter(3, arrayList.get(1).getText());
            query.setParameter(4, arrayList.get(2).getText());
            query.setParameter(5, Integer.parseInt(arrayList.get(3).getText()));
            query.executeUpdate();
            customer_accountDAO.getCurrentTransaction().commit();
            customer_accountDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateCustomer_Address(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = customer_addressDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_customer_address(?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.setParameter(3, arrayList.get(1).getText());
            query.setParameter(4, arrayList.get(2).getText());
            query.executeUpdate();
            customer_addressDAO.getCurrentTransaction().commit();
            customer_addressDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateEmployee_Account(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = employee_accountDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_employee_account(?,?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, Integer.parseInt(arrayList.get(3).getText()));
            query.setParameter(3, arrayList.get(0).getText());
            query.setParameter(4, arrayList.get(1).getText());
            query.setParameter(5, arrayList.get(2).getText());
            query.executeUpdate();
            employee_accountDAO.getCurrentTransaction().commit();
            employee_accountDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateEmployee_Address(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = customer_addressDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_employee_address(?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.setParameter(3, arrayList.get(1).getText());
            query.setParameter(4, arrayList.get(2).getText());
            query.executeUpdate();
            customer_addressDAO.getCurrentTransaction().commit();
            customer_addressDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateEmployee(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = employeesDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_employees(?,?,?,?,?,?,?,?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.setParameter(3, arrayList.get(1).getText());
            query.setParameter(4, arrayList.get(2).getText());
            query.setParameter(5, arrayList.get(4).getText());
            query.setParameter(6, Integer.parseInt(arrayList.get(3).getText()));
            query.setParameter(7, Integer.parseInt(arrayList.get(5).getText()));
            query.setParameter(8, Integer.parseInt(arrayList.get(6).getText()));
            query.setParameter(9, Integer.parseInt(arrayList.get(7).getText()));
            query.setParameter(10, Float.valueOf(arrayList.get(8).getText()));
            query.setParameter(11, Integer.parseInt(arrayList.get(9).getText()));
            query.executeUpdate();
            employeesDAO.getCurrentTransaction().commit();
            employeesDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
            e.printStackTrace();
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateIncome(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = incomeDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_income(?,?,?,?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, Integer.parseInt(arrayList.get(0).getText()));
            query.setParameter(3, Integer.parseInt(arrayList.get(1).getText()));
            query.setParameter(4, Integer.parseInt(arrayList.get(2).getText()));
            query.setParameter(5, Float.parseFloat(arrayList.get(3).getText()));
            query.setParameter(6, Float.parseFloat(arrayList.get(4).getText()));
            query.setParameter(7, Float.parseFloat(arrayList.get(5).getText()));
            query.executeUpdate();
            incomeDAO.getCurrentTransaction().commit();
            incomeDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
            e.printStackTrace();
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateOrders(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = ordersDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_orders(?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, Integer.parseInt(arrayList.get(0).getText()));
            query.setParameter(3, Integer.parseInt(arrayList.get(1).getText()));
            query.executeUpdate();
            ordersDAO.getCurrentTransaction().commit();
            ordersDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdatePosition(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_position(?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.executeUpdate();
            positionDAO.getCurrentTransaction().commit();
            positionDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateProduct_State(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_product_state(?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.executeUpdate();
            positionDAO.getCurrentTransaction().commit();
            positionDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateProduct_Type(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_product_type(?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.executeUpdate();
            positionDAO.getCurrentTransaction().commit();
            positionDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateProduct(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = productsDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_products(?,?,?,?,?,?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, Integer.parseInt(arrayList.get(0).getText()));
            query.setParameter(3, arrayList.get(1).getText());
            query.setParameter(4, Float.valueOf(arrayList.get(2).getText()));
            query.setParameter(5, Float.valueOf(arrayList.get(3).getText()));
            query.setParameter(6, Float.valueOf(arrayList.get(4).getText()));
            query.setParameter(7, Integer.parseInt(arrayList.get(5).getText()));
            query.setParameter(8, Integer.parseInt(arrayList.get(6).getText()));
            query.setParameter(9, Integer.parseInt(arrayList.get(7).getText()));
            query.executeUpdate();
            productsDAO.getCurrentTransaction().commit();
            productsDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateSpending(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = spendingDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_spending(?,?,?,?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, Integer.parseInt(arrayList.get(0).getText()));
            query.setParameter(3, Integer.parseInt(arrayList.get(1).getText()));
            query.setParameter(4, Integer.parseInt(arrayList.get(2).getText()));
            query.setParameter(5, Float.valueOf(arrayList.get(3).getText()));
            query.executeUpdate();
            spendingDAO.getCurrentTransaction().commit();
            spendingDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
            e.printStackTrace();
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }

    public void UpdateUnit(ArrayList<JFXTextField> arrayList, int id) {
        var success = false;
        try {
            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call update_unit(?,?) }");
            query.setParameter(1, id);
            query.setParameter(2, arrayList.get(0).getText());
            query.executeUpdate();
            positionDAO.getCurrentTransaction().commit();
            positionDAO.getCurrentSession().close();
            success = true;
        } catch (PersistenceException e) {
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                t = t.getCause();
            }
            if (t instanceof ConstraintViolationException) {
                var error_message = "New data cannot be added because it violates constraint";
                error.error("Error", error_message);
            } else {
                var error_message = "New data cannot be added. There may be problem with data you want to add.";
                error.error("Error", error_message);
            }
        } catch (Exception e) {
            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
            error.error("Error", error_message);
        }
        if (success) {
            Information information = new Information();
            information.information("Information", "Selected data has been added successfully");
        }
    }




}
