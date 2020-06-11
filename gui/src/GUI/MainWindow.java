/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package GUI;

import Classes.Confirmation;
import Classes.Error;
import Classes.Information;
import DAO.*;
import EntityClasses.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.hibernate.exception.ConstraintViolationException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;

public class MainWindow extends TabContent {

    // Table View declarations
    static TableView tableView1 = new TableView();
    static TableView tableView2 = new TableView();
    static TableView tableView3 = new TableView();
    static TableView tableView4 = new TableView();
    static TableView tableView5 = new TableView();
    static TableView tableView6 = new TableView();
    static TableView tableView7 = new TableView();
    static TableView tableView8 = new TableView();
    static TableView tableView9 = new TableView();
    static TableView tableView10 = new TableView();
    static TableView tableView11 = new TableView();
    static TableView tableView12 = new TableView();
    static TableView tableView13 = new TableView();
    static TableView tableView14 = new TableView();
    static TableView tableView15 = new TableView();

    static TabContent tabContent = new TabContent();

    static Tab tab = new Tab("Income");
    static Tab tab1 = new Tab("Spending");
    static Tab tab2 = new Tab("Units");
    static Tab tab3 = new Tab("Positions");
    static Tab tab4 = new Tab("Employees");
    static Tab tab5 = new Tab("Employees Address");
    static Tab tab6 = new Tab("Employees Accounts");
    static Tab tab7 = new Tab("Customers");
    static Tab tab8 = new Tab("Customers Address");
    static Tab tab9 = new Tab("Customers Accounts");
    static Tab tab10 = new Tab("Product state");
    static Tab tab11 = new Tab("Product type");
    static Tab tab12 = new Tab("Account type");
    static Tab tab13 = new Tab("Orders");
    static Tab tab14 = new Tab("Products");


    // Returns currently selected row
    public int getSelectedIndex(TableView tableView) {
        return tableView.getSelectionModel().getSelectedIndex();
    }


    // Method for delete button
    public void deleteButtonAction() {
        ButtonWindow buttonWindow = new ButtonWindow();

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
        SpendingDAO spendingDAO = new SpendingDAO();
        UnitsDAO unitsDAO = new UnitsDAO();
        ProductsDAO productsDAO = new ProductsDAO();

        switch (MainGUI.getCurrentTab()) {
                    //income
                    case 0: {
                        this.AddIncomeDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = incomeDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_income(?) }");
                            query.setParameter(1, incomeList.get(getSelectedIndex(tableView1)).getId());
                            query.executeUpdate();
                            incomeDAO.getCurrentTransaction().commit();
                            incomeDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView1, "IncomeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //spending
                    case 1: {
                        this.AddSpendingDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = spendingDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_spending(?) }");
                            query.setParameter(1, spendingList.get(tableView2.getSelectionModel().getSelectedIndex()).getId());
                            query.executeUpdate();
                            spendingDAO.getCurrentTransaction().commit();
                            spendingDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView2, "SpendingTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //unit
                    case 2: {
                        this.AddUnitsDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = unitsDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_unit(?) }");
                            query.setParameter(1, unitsList.get(getSelectedIndex(tableView3)).getId());
                            query.executeUpdate();
                            unitsDAO.getCurrentTransaction().commit();
                            unitsDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView3, "UnitsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //position
                    case 3: {
                        this.AddPositionDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = positionDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_position(?) }");
                            query.setParameter(1, positionList.get(getSelectedIndex(tableView4)).getId());
                            query.executeUpdate();
                            positionDAO.getCurrentTransaction().commit();
                            positionDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView4, "PositionsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //employees
                    case 4: {
                        this.AddEmployeesDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = employeesDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_employees(?) }");
                            query.setParameter(1, employeesList.get(getSelectedIndex(tableView5)).getId());
                            query.executeUpdate();
                            employeesDAO.getCurrentTransaction().commit();
                            employeesDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView5, "EmployeesTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //employees address
                    case 5: {
                        this.AddEmployee_AddressDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = employees_addressDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_employee_address(?) }");
                            query.setParameter(1, employee_addressList.get(getSelectedIndex(tableView6)).getId());
                            query.executeUpdate();
                            employees_addressDAO.getCurrentTransaction().commit();
                            employees_addressDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView6, "Employee_AddressTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //employees accounts
                    case 6: {
                        Error error = new Error();
                        this.AddEmployee_AccountDataToList();
                        var success = false;
                        try {
                            Query query = employee_accountDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_employee_account(?) }");
                            query.setParameter(1, employee_accountList.get(getSelectedIndex(tableView7)).getId());
                            query.executeUpdate();
                            employee_accountDAO.getCurrentTransaction().commit();
                            employee_accountDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView7, "Employee_AccountTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //customer
                    case 7: {
                        Error error = new Error();
                        this.AddCustomerDataToList();
                        var success = false;
                        try {
                            Query query = customerDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_customer(?) }");
                            query.setParameter(1, customerList.get(getSelectedIndex(tableView8)).getId());
                            query.executeUpdate();
                            customerDAO.getCurrentTransaction().commit();
                            customerDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView8, "CustomerTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //customer address
                    case 8: {
                        this.AddCustomer_AddressDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = customer_addressDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_customer_address(?) }");
                            query.setParameter(1, customer_addressList.get(getSelectedIndex(tableView9)).getId());
                            query.executeUpdate();
                            customer_addressDAO.getCurrentTransaction().commit();
                            customer_addressDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView9, "Customer_AddressTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //customer accounts
                    case 9: {
                        this.AddCustomer_AccountDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = customer_accountDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_customer_account(?) }");
                            query.setParameter(1, customer_accountList.get(getSelectedIndex(tableView10)).getId());
                            query.executeUpdate();
                            customer_accountDAO.getCurrentTransaction().commit();
                            customer_accountDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView10, "Customer_AccountTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //product state
                    case 10: {
                        this.AddProduct_StateDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = product_stateDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_pproduct_state(?) }");
                            query.setParameter(1, product_stateList.get(getSelectedIndex(tableView11)).getId());
                            query.executeUpdate();
                            product_stateDAO.getCurrentTransaction().commit();
                            product_stateDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView11, "Product_StateTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //product type
                    case 11: {
                        this.AddProduct_TypeDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = product_typeDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_pproduct_type(?) }");
                            query.setParameter(1, product_typeList.get(getSelectedIndex(tableView12)).getId());
                            query.executeUpdate();
                            product_typeDAO.getCurrentTransaction().commit();
                            product_typeDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView12, "Product_TypeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //account type
                    case 12: {
                        this.AddAccount_TypeDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = account_typeDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_account_type(?) }");
                            query.setParameter(1, account_typeList.get(getSelectedIndex(tableView13)).getId());
                            query.executeUpdate();
                            account_typeDAO.getCurrentTransaction().commit();
                            account_typeDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView13, "Account_typeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //orders
                    case 13: {
                        this.AddOrdersDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = ordersDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_orders(?) }");
                            query.setParameter(1, ordersList.get(getSelectedIndex(tableView14)).getId());
                            query.executeUpdate();
                            ordersDAO.getCurrentTransaction().commit();
                            ordersDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView14, "OrdersTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    //products
                    case 14: {
                        this.AddProductsDataToList();
                        Error error = new Error();
                        var success = false;
                        try {
                            Query query = productsDAO.openCurrentSessionwithTransaction().createSQLQuery("{ call delete_pproducts(?) }");
                            query.setParameter(1, productsList.get(getSelectedIndex(tableView15)).getId());
                            query.executeUpdate();
                            productsDAO.getCurrentTransaction().commit();
                            productsDAO.getCurrentSession().close();
                            success = true;
                        } catch (IndexOutOfBoundsException e) {
                            var error_message = "Select row to delete it";
                            error.error("Error", error_message);
                        } catch (PersistenceException e) {
                            Throwable t = e.getCause();
                            while ((t != null) && !(t instanceof ConstraintViolationException)) {
                                t = t.getCause();
                            }
                            if (t instanceof ConstraintViolationException) {
                                var error_message = "Selected row is being used by parent table";
                                error.error("Error", error_message);
                            } else {
                                var error_message = "Selected row cannot be deleted. There may be problem with data related to selected row.";
                                error.error("Error", error_message);
                            }
                        } catch (Exception e) {
                            var error_message = "Unexpected error has occurred\n" + e.getClass().getSimpleName();
                            error.error("Error", error_message);
                        }
                        if (success) {
                            Information information = new Information();
                            information.information("Information", "Selected data has been deleted successfully");
                        }
                        try {
                            buttonWindow.refreshTableView(tableView15, "ProductsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            error.error("Error", "Table could not be refreshed.\nTo do so you need to restart the application");
                        }
                    }
                    break;
                    default:
                        Error error = new Error();
                        error.error("Error", "Deleting data from this table in not possible");
                        break;
                }

    }

    /* TAB ORDER
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
     TAB ORDER*/

    // Method for search field
    public void searchField(JFXTextField textField) {
        TabContent tabContent = new TabContent();

        switch (MainGUI.getCurrentTab()) {
            case 0: {
                tabContent.AddIncomeDataToList();
                FilteredList<Income> filteredList = new FilteredList<>(tabContent.getIncomeList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Income>) income -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(income.getId()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(income.getQuarter_id()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(income.getUnit_id()).contains(newValue)) {
                            return true;
                        } else if (income.getUnit_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(income.getYear()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(income.getNet_income()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(income.getGross_income()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(income.getTax_income()).contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Income> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView1.comparatorProperty());
                tableView1.setItems(sortedList);
            }
            break;
            case 1: {
                tabContent.AddSpendingDataToList();
                FilteredList<Spending> filteredList = new FilteredList<>(tabContent.getSpendingList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Spending>) spending -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(spending.getId()).contains(newValue)) {
                            return true;
                        } else if (spending.getUnit_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(spending.getQuarter_id()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(spending.getYear()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(spending.getSpending_sum()).contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Spending> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView2.comparatorProperty());
                tableView2.setItems(sortedList);
            }
            break;
            case 2: {
                tabContent.AddUnitsDataToList();
                FilteredList<Units> filteredList = new FilteredList<>(tabContent.getUnitsList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Units>) units -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(units.getId()).contains(newValue)) {
                            return true;
                        } else if (units.getUnit_name().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Units> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView3.comparatorProperty());
                tableView3.setItems(sortedList);
            }
            break;
            case 3: {
                tabContent.AddPositionDataToList();
                FilteredList<Position> filteredList = new FilteredList<>(tabContent.getPositionList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Position>) position -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(position.getId()).contains(newValue)) {
                            return true;
                        } else if (position.getPosition_name().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Position> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView4.comparatorProperty());
                tableView4.setItems(sortedList);
            }
            break;
            case 4: {
                tabContent.AddEmployeesDataToList();
                FilteredList<Employees> filteredList = new FilteredList<>(tabContent.getEmployeesList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Employees>) employees -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(employees.getId()).contains(newValue)) {
                            return true;
                        } else if (employees.getFirst_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (employees.getLast_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (employees.getDate_of_birth().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(employees.getAccount_id()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(employees.getAddress_id()).contains(newValue)) {
                            return true;
                        } else if (employees.getAddress_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (employees.getEmail().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(employees.getPhone_number()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(employees.getUnit_id()).contains(newValue)) {
                            return true;
                        } else if (employees.getUnit_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(employees.getPosition_id()).contains(newValue)) {
                            return true;
                        } else if (employees.getPosition_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(employees.getSalary()).contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Employees> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView5.comparatorProperty());
                tableView5.setItems(sortedList);
            }
            break;
            case 5: {
                tabContent.AddEmployee_AddressDataToList();
                FilteredList<Employee_Address> filteredList = new FilteredList<>(tabContent.getEmployee_addressList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Employee_Address>) address -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(address.getId()).contains(newValue)) {
                            return true;
                        } else if (address.getCity().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (address.getCountry().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (address.getStreet().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Employee_Address> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView6.comparatorProperty());
                tableView6.setItems(sortedList);
            }
            break;
            case 6: {
                tabContent.AddEmployee_AccountDataToList();
                FilteredList<Employee_Account> filteredList = new FilteredList<>(tabContent.getEmployee_accountList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Employee_Account>) account -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(account.getType_id()).contains(newValue)) {
                            return true;
                        } else if (account.getLogin().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getPassword().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getAccount_create_date().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getType_name().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Employee_Account> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView7.comparatorProperty());
                tableView7.setItems(sortedList);
            }
            break;
            case 7: {
                tabContent.AddCustomerDataToList();
                FilteredList<Customer> filteredList = new FilteredList<>(tabContent.getCustomerList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Customer>) customer -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(customer.getId()).contains(newValue)) {
                            return true;
                        } else if (customer.getFirst_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (customer.getLast_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(customer.getPhone_number()).contains(newValue)) {
                            return true;
                        } else if (customer.getEmail().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (customer.getAddress().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(customer.getAccount_id()).contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Customer> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView8.comparatorProperty());
                tableView8.setItems(sortedList);
            }
            break;
            case 8: {
                tabContent.AddCustomer_AddressDataToList();
                FilteredList<Customer_Address> filteredList = new FilteredList<>(tabContent.getCustomer_addressList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Customer_Address>) address -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(address.getId()).contains(newValue)) {
                            return true;
                        } else if (address.getCity().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (address.getCountry().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (address.getStreet().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Customer_Address> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView9.comparatorProperty());
                tableView9.setItems(sortedList);
            }
            break;
            case 9: {
                tabContent.AddCustomer_AccountDataToList();
                FilteredList<Customer_Account> filteredList = new FilteredList<>(tabContent.getCustomer_accountList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Customer_Account>) account -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(account.getType_id()).contains(newValue)) {
                            return true;
                        } else if (account.getLogin().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getPassword().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getAcc_create_date().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getType_name().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Customer_Account> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView10.comparatorProperty());
                tableView10.setItems(sortedList);
            }
            break;
            case 10: {
                tabContent.AddProduct_StateDataToList();
                FilteredList<Product_State> filteredList = new FilteredList<>(tabContent.getProduct_stateList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Product_State>) account -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(account.getId()).contains(newValue)) {
                            return true;
                        } else if (account.getState_name().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Product_State> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView11.comparatorProperty());
                tableView11.setItems(sortedList);
            }
            break;
            case 11: {
                tabContent.AddProduct_TypeDataToList();
                FilteredList<Product_Type> filteredList = new FilteredList<>(tabContent.getProduct_typeList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Product_Type>) account -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(account.getId()).contains(newValue)) {
                            return true;
                        } else if (account.getProduct_name().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Product_Type> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView12.comparatorProperty());
                tableView12.setItems(sortedList);
            }
            break;
            case 12: {
                tabContent.AddAccount_TypeDataToList();
                FilteredList<Account_Type> filteredList = new FilteredList<>(tabContent.getAccount_typeList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Account_Type>) account -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(account.getId()).contains(newValue)) {
                            return true;
                        } else if (account.getType().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Account_Type> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView13.comparatorProperty());
                tableView13.setItems(sortedList);
            }
            break;
            case 13: {
                tabContent.AddOrdersDataToList();
                FilteredList<Orders> filteredList = new FilteredList<>(tabContent.getOrdersList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Orders>) account -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(account.getId()).contains(newValue)) {
                            return true;
                        } else if (account.getProduct_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getCustomer_name().toLowerCase().contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Orders> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView14.comparatorProperty());
                tableView14.setItems(sortedList);
            }
            break;
            case 14: {
                tabContent.AddProductsDataToList();
                FilteredList<Products> filteredList = new FilteredList<>(tabContent.getProductsList(), e -> true);
                textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Products>) account -> {
                        if (newValue == null || newValue.isEmpty()) {
                            return true;
                        }
                        if (String.valueOf(account.getId()).contains(newValue)) {
                            return true;
                        } else if (account.getProduct_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getProduct_type_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getProduct_state_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (account.getUnit_name().toLowerCase().contains(newValue)) {
                            return true;
                        } else if (String.valueOf(account.getPrice_gross()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(account.getPrice_net()).contains(newValue)) {
                            return true;
                        } else if (String.valueOf(account.getPrice_tax()).contains(newValue)) {
                            return true;
                        }
                        return false;
                    });
                });
                SortedList<Products> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(tableView15.comparatorProperty());
                tableView15.setItems(sortedList);
            }
            break;
            default:
                break;
        }
    }


    // Created menu bar
    private static void MENU_BAR(VBox vBox) {
        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("About");
        MenuItem menuItem4 = new MenuItem("Licence");
        MenuItem menuItem = new MenuItem("About");
        menu.getItems().addAll(menuItem, new SeparatorMenuItem(), menuItem4);


        Menu menu1 = new Menu("Copyright");
        MenuItem menuItem1 = new MenuItem("Copyright");
        menu1.getItems().add(menuItem1);


        Menu menu2 = new Menu("Theme");
        MenuItem menuItem2 = new MenuItem("Light");
        MenuItem menuItem3 = new MenuItem("Dark");
        menu2.getItems().addAll(menuItem2, menuItem3);

        menuBar.getMenus().addAll(menu, menu1, menu2);
        vBox.getChildren().add(menuBar);

        menuItem.setOnAction(actionEvent -> {
            Information information = new Information();
            var string = "This application allows controlling database.\nIn was built with Java using JavaFX and Java 11";
            information.information("About", string);
        });

        menuItem1.setOnAction(actionEvent -> {
            Information information = new Information();
            var string = "Copyright (c) 2020\nWrona Wojciech\nWojtowicz Aleksander\nAll rights reserved";
            information.information("Copyright", string);
        });

        menuItem2.setOnAction(actionEvent -> {
            String formatCSS = "file:src/Files/styleCSS_light.css";
            Application.setUserAgentStylesheet(formatCSS);
        });

        menuItem3.setOnAction(actionEvent -> {
            String formatCSS = "file:src/Files/styleCSS_dark.css";
            Application.setUserAgentStylesheet(formatCSS);
        });

        menuItem4.setOnAction(actionEvent -> {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.edit(new File("src/Files/LICENSE.txt"));
            } catch (IOException e) {
                Error error = new Error();
                error.error("Error","File cannot be open");
            }
        });
    }

    // Created anchor pane with button and search field
    private static void ANCHOR_PANE(VBox vBox) {
        ButtonWindow buttonWindow = new ButtonWindow();
        MainWindow mainWindow = new MainWindow();
        AnchorPane anchorPane = new AnchorPane();

        JFXButton jfxButton = new JFXButton("Add");
        JFXButton jfxButton1 = new JFXButton("Remove");
        JFXButton jfxButton2 = new JFXButton("Change data");

        Image image = new Image("file:src/Files/Icons/search-1.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(28);
        imageView.setFitHeight(28);

        JFXTextField jfxTextField = new JFXTextField();
        jfxTextField.promptTextProperty().set("Search");
        jfxTextField.setLabelFloat(true);
        jfxTextField.setPrefWidth(350);
        jfxTextField.setMinWidth(jfxTextField.getPrefWidth());
        jfxTextField.setMaxWidth(jfxTextField.getPrefWidth());

        HBox hBox = new HBox(1, jfxButton, jfxButton1, jfxButton2);
        HBox hBox1 = new HBox(5, imageView, jfxTextField);

        anchorPane.getChildren().addAll(hBox, hBox1);
        AnchorPane.setLeftAnchor(hBox, 10d);
        AnchorPane.setRightAnchor(hBox1, 10d);
        AnchorPane.setBottomAnchor(hBox1, 10d);

        vBox.getChildren().add(anchorPane);

        jfxButton.setOnAction(actionEvent -> {
            buttonWindow.Window();
        });


        Confirmation conf = new Confirmation();

        jfxButton1.setOnAction(actionEvent -> {
            conf.confirmation("Confirmation", "Are you sure you want to delete selected record?");
            conf.getJfxButton().setOnAction(actionEvent1 -> {
                mainWindow.deleteButtonAction();
                conf.getStage().close();
            });
            conf.getJfxButton1().setOnAction(actionEvent1 -> {
                conf.getStage().close();
            });
        });


        jfxButton2.setOnAction(actionEvent -> {
            buttonWindow.Window1();
        });


        jfxTextField.setOnKeyPressed(keyEvent -> {
            mainWindow.searchField(jfxTextField);
        });


    }

    // Created VBox to store menu bar and anchor pane
    // Also it can be easily scaled up since it's v boc
    public static void V_BOX(VBox vBox) {
        vBox.setSpacing(1);
        MENU_BAR(vBox);
        ANCHOR_PANE(vBox);

    }

    // Created tab pane
    public static void JFX_TAB_PANE(JFXTabPane jfxTabPane) {
        jfxTabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        jfxTabPane.getTabs().addAll(tab, tab1, tab2, tab3, tab4, tab5, tab6, tab7, tab8, tab9, tab10, tab11, tab12, tab13, tab14);

        tabContent.IncomeTableView(tableView1);
        tabContent.SpendingTableView(tableView2);
        tabContent.UnitsTableView(tableView3);
        tabContent.PositionsTableView(tableView4);
        tabContent.EmployeesTableView(tableView5);
        tabContent.Employee_AddressTableView(tableView6);
        tabContent.Employee_AccountTableView(tableView7);
        tabContent.CustomerTableView(tableView8);
        tabContent.Customer_AddressTableView(tableView9);
        tabContent.Customer_AccountTableView(tableView10);
        tabContent.Product_StateTableView(tableView11);
        tabContent.Product_TypeTableView(tableView12);
        tabContent.Account_typeTableView(tableView13);
        tabContent.OrdersTableView(tableView14);
        tabContent.ProductsTableView(tableView15);

        tab.setContent(tableView1);
        tab1.setContent(tableView2);
        tab2.setContent(tableView3);
        tab3.setContent(tableView4);
        tab4.setContent(tableView5);
        tab5.setContent(tableView6);
        tab6.setContent(tableView7);
        tab7.setContent(tableView8);
        tab8.setContent(tableView9);
        tab9.setContent(tableView10);
        tab10.setContent(tableView11);
        tab11.setContent(tableView12);
        tab12.setContent(tableView13);
        tab13.setContent(tableView14);
        tab14.setContent(tableView15);
    }

}
