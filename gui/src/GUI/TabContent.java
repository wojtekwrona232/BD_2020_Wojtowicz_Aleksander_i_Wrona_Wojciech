/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package GUI;

import Classes.TableLists;
import EntityClasses.*;
import DAO.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class TabContent extends TableLists implements TableViewInterfaceConnect {
    HibernateUtil hibernateUtil = new HibernateUtil();
    TableLists tableLists = new TableLists();

    ObservableList<Account_Type> account_typeList = FXCollections.observableArrayList();
    ObservableList<Customer> customerList = FXCollections.observableArrayList();
    ObservableList<Customer_Account> customer_accountList = FXCollections.observableArrayList();
    ObservableList<Customer_Address> customer_addressList = FXCollections.observableArrayList();
    ObservableList<Employee_Account> employee_accountList = FXCollections.observableArrayList();
    ObservableList<Employee_Address> employee_addressList = FXCollections.observableArrayList();
    ObservableList<Employees> employeesList = FXCollections.observableArrayList();
    ObservableList<Income> incomeList = FXCollections.observableArrayList();
    ObservableList<Orders> ordersList = FXCollections.observableArrayList();
    ObservableList<Position> positionList = FXCollections.observableArrayList();
    ObservableList<Product_State> product_stateList = FXCollections.observableArrayList();
    ObservableList<Product_Type> product_typeList = FXCollections.observableArrayList();
    ObservableList<Products> productsList = FXCollections.observableArrayList();
    ObservableList<Spending> spendingList = FXCollections.observableArrayList();
    ObservableList<Units> unitsList = FXCollections.observableArrayList();

    public ObservableList<Account_Type> getAccount_typeList() {
        return account_typeList;
    }
    public void setAccount_typeList(ObservableList<Account_Type> account_typeList) {
        this.account_typeList = account_typeList;
    }
    public ObservableList<Customer> getCustomerList() {
        return customerList;
    }
    public void setCustomerList(ObservableList<Customer> customerList) {
        this.customerList = customerList;
    }
    public ObservableList<Customer_Account> getCustomer_accountList() {
        return customer_accountList;
    }
    public void setCustomer_accountList(ObservableList<Customer_Account> customer_accountList) {
        this.customer_accountList = customer_accountList;
    }
    public ObservableList<Customer_Address> getCustomer_addressList() {
        return customer_addressList;
    }
    public void setCustomer_addressList(ObservableList<Customer_Address> customer_addressList) {
        this.customer_addressList = customer_addressList;
    }
    public ObservableList<Employee_Account> getEmployee_accountList() {
        return employee_accountList;
    }
    public void setEmployee_accountList(ObservableList<Employee_Account> employee_accountList) {
        this.employee_accountList = employee_accountList;
    }
    public ObservableList<Employee_Address> getEmployee_addressList() {
        return employee_addressList;
    }
    public void setEmployee_addressList(ObservableList<Employee_Address> employee_addressList) {
        this.employee_addressList = employee_addressList;
    }
    public ObservableList<Employees> getEmployeesList() {
        return employeesList;
    }
    public void setEmployeesList(ObservableList<Employees> employeesList) {
        this.employeesList = employeesList;
    }
    public ObservableList<Income> getIncomeList() {
        return incomeList;
    }
    public void setIncomeList(ObservableList<Income> incomeList) {
        this.incomeList = incomeList;
    }
    public ObservableList<Orders> getOrdersList() {
        return ordersList;
    }
    public void setOrdersList(ObservableList<Orders> ordersList) {
        this.ordersList = ordersList;
    }
    public ObservableList<Position> getPositionList() {
        return positionList;
    }
    public void setPositionList(ObservableList<Position> positionList) {
        this.positionList = positionList;
    }
    public ObservableList<Product_State> getProduct_stateList() {
        return product_stateList;
    }
    public void setProduct_stateList(ObservableList<Product_State> product_stateList) {
        this.product_stateList = product_stateList;
    }
    public ObservableList<Product_Type> getProduct_typeList() {
        return product_typeList;
    }
    public void setProduct_typeList(ObservableList<Product_Type> product_typeList) {
        this.product_typeList = product_typeList;
    }
    public ObservableList<Products> getProductsList() {
        return productsList;
    }
    public void setProductsList(ObservableList<Products> productsList) {
        this.productsList = productsList;
    }
    public ObservableList<Spending> getSpendingList() {
        return spendingList;
    }
    public void setSpendingList(ObservableList<Spending> spendingList) {
        this.spendingList = spendingList;
    }
    public ObservableList<Units> getUnitsList() {
        return unitsList;
    }
    public void setUnitsList(ObservableList<Units> unitsList) {
        this.unitsList = unitsList;
    }


    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Account_Type> AddAccount_TypeDataToList() {
        tableLists.setAccount_typeArrayList((ArrayList<Account_Type>) hibernateUtil.openCurrentSession().createCriteria(Account_Type.class).list());
        account_typeList.addAll(tableLists.getAccount_typeArrayList());
        return account_typeList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Customer> AddCustomerDataToList() {
        tableLists.setCustomerArrayList((ArrayList<Customer>) hibernateUtil.openCurrentSession().createCriteria(Customer.class).list());

        ArrayList<Customer> arrayList = new ArrayList<>();
        arrayList.addAll(tableLists.getCustomerArrayList());
        Query query = hibernateUtil.openCurrentSession().createQuery("select concat(u.street,', ',u.city,', ',u.country) as address from Customer_Address u");
        List<String> list = query.getResultList();

        for (int i = 0; i < tableLists.getCustomerArrayList().size(); i++) {
            arrayList.get(i).setAddress(list.get(arrayList.get(i).getAddress_id()-1));
        }

        customerList.addAll(arrayList);
        return customerList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Customer_Account> AddCustomer_AccountDataToList() {
        tableLists.setCustomer_accountArrayList((ArrayList<Customer_Account>) hibernateUtil.openCurrentSession().createCriteria(Customer_Account.class).list());

        ArrayList<Customer_Account> arrayList = new ArrayList<>();
        arrayList.addAll(tableLists.getCustomer_accountArrayList());
        Query query = hibernateUtil.openCurrentSession().createQuery("select u.type from Account_Type u");
        List<String> list = query.getResultList();

        for (int i = 0; i < tableLists.getCustomer_accountArrayList().size(); i++) {
            arrayList.get(i).setType_name(list.get(arrayList.get(i).getType_id()-1));
        }

        customer_accountList.addAll(arrayList);
        return customer_accountList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Customer_Address> AddCustomer_AddressDataToList() {
        tableLists.setCustomer_addressArrayList((ArrayList<Customer_Address>) hibernateUtil.openCurrentSession().createCriteria(Customer_Address.class).list());
        customer_addressList.addAll(tableLists.getCustomer_addressArrayList());
        return customer_addressList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Employee_Account> AddEmployee_AccountDataToList() {
        tableLists.setEmployee_accountArrayList((ArrayList<Employee_Account>) hibernateUtil.openCurrentSession().createCriteria(Employee_Account.class).list());

        ArrayList<Employee_Account> arrayList = new ArrayList<>();
        arrayList.addAll(tableLists.getEmployee_accountArrayList());
        Query query = hibernateUtil.openCurrentSession().createQuery("select u.type from Account_Type u");
        List<String> list = query.getResultList();

        for (int i = 0; i < tableLists.getEmployee_accountArrayList().size(); i++) {
            arrayList.get(i).setType_name(list.get(arrayList.get(i).getType_id()-1));
        }

        employee_accountList.addAll(arrayList);
        return employee_accountList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Employee_Address> AddEmployee_AddressDataToList() {
        tableLists.setEmployee_addressArrayList((ArrayList<Employee_Address>) hibernateUtil.openCurrentSession().createCriteria(Employee_Address.class).list());
        employee_addressList.addAll(tableLists.getEmployee_addressArrayList());
        return employee_addressList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Employees> AddEmployeesDataToList() {
        tableLists.setEmployeesArrayList((ArrayList<Employees>) hibernateUtil.openCurrentSession().createCriteria(Employees.class).list());

        ArrayList<Employees> arrayList = new ArrayList<>();
        arrayList.addAll(tableLists.getEmployeesArrayList());
        Query query = hibernateUtil.openCurrentSession().createQuery("select u.unit_name from Units u");
        List<String> list = query.getResultList();
        Query query1 = hibernateUtil.openCurrentSession().createQuery("select concat(u.street,', ',u.city,', ',u.country) as address from Employee_Address u");
        List<String> list1 = query1.getResultList();
        Query query2 = hibernateUtil.openCurrentSession().createQuery("select u.position_name from Position u");
        List<String> list2 = query2.getResultList();

        for (int i = 0; i < tableLists.getEmployeesArrayList().size(); i++) {
            arrayList.get(i).setUnit_name(list.get(arrayList.get(i).getUnit_id()-1));
            arrayList.get(i).setPosition_name(list2.get(arrayList.get(i).getPosition_id()-1));
            arrayList.get(i).setAddress_name(list1.get(arrayList.get(i).getAddress_id()-1));
            String[] help = arrayList.get(i).getDate_of_birth().split("\\s+");
            arrayList.get(i).setDate_of_birth(help[0]);
        }

        employeesList.addAll(arrayList);
        return employeesList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Income> AddIncomeDataToList() {
        tableLists.setIncomeArrayList((ArrayList<Income>) hibernateUtil.openCurrentSession().createCriteria(Income.class).list());
        ArrayList<Income> arrayList = new ArrayList<>();
        arrayList.addAll(tableLists.getIncomeArrayList());
        Query query = hibernateUtil.openCurrentSession().createQuery("select u.unit_name from Units u");
        List<String> list = query.getResultList();

        for (int i = 0; i < tableLists.getIncomeArrayList().size(); i++) {
            arrayList.get(i).setUnit_name(list.get(arrayList.get(i).getUnit_id()-1));
        }

        incomeList.addAll(arrayList);
        return incomeList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Orders> AddOrdersDataToList() {
        tableLists.setOrdersArrayList((ArrayList<Orders>) hibernateUtil.openCurrentSession().createCriteria(Orders.class).list());
        ArrayList<Orders> arrayList = new ArrayList<>();
        arrayList.addAll(tableLists.getOrdersArrayList());
        Query query = hibernateUtil.openCurrentSession().createQuery("select concat(c.first_name, ', ', c.last_name ) as customer_name from Customer c");
        List<String> list = query.getResultList();
        Query query1 = hibernateUtil.openCurrentSession().createQuery("select c.product_name as customer_name from Products c");
        List<String> list1 = query1.getResultList();

        for (int i = 0; i < tableLists.getOrdersArrayList().size(); i++) {
            arrayList.get(i).setProduct_name(list1.get(arrayList.get(i).getProduct_id()-1));
            arrayList.get(i).setCustomer_name(list.get(arrayList.get(i).getCustomer_id()-1));
        }

        ordersList.addAll(arrayList);
        return ordersList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Position> AddPositionDataToList() {
        tableLists.setPositionArrayList((ArrayList<Position>) hibernateUtil.openCurrentSession().createCriteria(Position.class).list());
        positionList.addAll(tableLists.getPositionArrayList());
        return positionList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Product_State> AddProduct_StateDataToList() {
        tableLists.setProduct_stateArrayList((ArrayList<Product_State>) hibernateUtil.openCurrentSession().createCriteria(Product_State.class).list());
        product_stateList.addAll(tableLists.getProduct_stateArrayList());
        return product_stateList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Product_Type> AddProduct_TypeDataToList() {
        tableLists.setProduct_typeArrayList((ArrayList<Product_Type>) hibernateUtil.openCurrentSession().createCriteria(Product_Type.class).list());
        product_typeList.addAll(tableLists.getProduct_typeArrayList());
        return product_typeList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Products> AddProductsDataToList() {
        tableLists.setProductsArrayList((ArrayList<Products>) hibernateUtil.openCurrentSession().createCriteria(Products.class).list());

        ArrayList<Products> arrayList = new ArrayList<>();
        arrayList.addAll(tableLists.getProductsArrayList());
        Query query = hibernateUtil.openCurrentSession().createQuery("select u.state_name from Product_State u");
        List<String> list = query.getResultList();
        Query query1 = hibernateUtil.openCurrentSession().createQuery("select u.product_name from Product_Type u");
        List<String> list1 = query1.getResultList();
        Query query2 = hibernateUtil.openCurrentSession().createQuery("select u.unit_name from Units u");
        List<String> list2 = query2.getResultList();

        for (int i = 0; i < tableLists.getProductsArrayList().size(); i++) {
            arrayList.get(i).setProduct_state_name(list.get(arrayList.get(i).getProduct_state_id()-1));
            arrayList.get(i).setProduct_type_name(list1.get(arrayList.get(i).getProduct_type_id()-1));
            arrayList.get(i).setUnit_name(list2.get(arrayList.get(i).getUnit_id()));
        }

        productsList.addAll(arrayList);
        return productsList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Spending> AddSpendingDataToList() {
        tableLists.setSpendingArrayList((ArrayList<Spending>) hibernateUtil.openCurrentSession().createCriteria(Spending.class).list());

        ArrayList<Spending> arrayList = new ArrayList<>();
        arrayList.addAll(tableLists.getSpendingArrayList());
        Query query = hibernateUtil.openCurrentSession().createQuery("select u.unit_name from Units u");
        List<String> list = query.getResultList();

        for (int i = 0; i < tableLists.getSpendingArrayList().size(); i++) {
            arrayList.get(i).setUnit_name(list.get(arrayList.get(i).getUnit_id()-1));
        }

        spendingList.addAll(arrayList);
        return spendingList;
    }

    // Observable list type method for specific table return observable list that is type of specific table/class
    public ObservableList<Units> AddUnitsDataToList() {
        tableLists.setUnitsArrayList((ArrayList<Units>) hibernateUtil.openCurrentSession().createCriteria(Units.class).list());
        unitsList.addAll(tableLists.getUnitsArrayList());
        return unitsList;
    }



    // Method creating table view for specific table implemented from interface
    @Override
    public void Account_typeTableView(TableView tableView) {
        TableColumn<Integer, Account_Type> column0 = new TableColumn<>("Id");
        TableColumn<String, Account_Type> column1 = new TableColumn<>("Type");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("type"));

        tableView.getColumns().clear();
        tableView.setItems(AddAccount_TypeDataToList());

        tableView.getColumns().addAll(column1);


        column1.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void CustomerTableView(TableView tableView) {
        TableColumn<Integer, Customer> column0 = new TableColumn<>("Id");
        TableColumn<String, Customer> column1 = new TableColumn<>("First name");
        TableColumn<String, Customer> column2 = new TableColumn<>("Last name");
        TableColumn<Long, Customer> column3 = new TableColumn<>("Phone number");
        TableColumn<String, Customer> column4 = new TableColumn<>("Email");
        TableColumn<String, Customer> column5 = new TableColumn<>("Address");
        TableColumn<Integer, Customer> column6 = new TableColumn<>("Account ID");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        column3.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        column4.setCellValueFactory(new PropertyValueFactory<>("email"));
        column5.setCellValueFactory(new PropertyValueFactory<>("address"));
        column6.setCellValueFactory(new PropertyValueFactory<>("account_id"));

        tableView.getColumns().clear();
        tableView.setItems(AddCustomerDataToList());

        tableView.getColumns().addAll(column1, column2, column3, column4, column5, column6);


        column1.setPrefWidth(250);
        column2.setPrefWidth(250);
        column3.setPrefWidth(250);
        column4.setPrefWidth(250);
        column5.setPrefWidth(250);
        column6.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void Customer_AccountTableView(TableView tableView) {
        TableColumn<Integer, Customer_Account> column0 = new TableColumn<>("Id");
        TableColumn<Integer, Customer_Account> column1 = new TableColumn<>("Type id");
        TableColumn<String, Customer_Account> column2 = new TableColumn<>("Login");
        TableColumn<String, Customer_Account> column3 = new TableColumn<>("Password");
        TableColumn<String, Customer_Account> column4 = new TableColumn<>("Account creation date");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("type_name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("login"));
        column3.setCellValueFactory(new PropertyValueFactory<>("password"));
        column4.setCellValueFactory(new PropertyValueFactory<>("acc_create_date"));

        tableView.getColumns().clear();
        tableView.setItems(AddCustomer_AccountDataToList());

        tableView.getColumns().addAll(column1, column2, column3, column4);


        column1.setPrefWidth(250);
        column2.setPrefWidth(250);
        column3.setPrefWidth(250);
        column4.setPrefWidth(250);


    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void Customer_AddressTableView(TableView tableView) {
        TableColumn<Integer, Customer_Address> column0 = new TableColumn<>("Id");
        TableColumn<String, Customer_Address> column1 = new TableColumn<>("Country");
        TableColumn<String, Customer_Address> column2 = new TableColumn<>("City");
        TableColumn<String, Customer_Address> column3 = new TableColumn<>("Street");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("country"));
        column2.setCellValueFactory(new PropertyValueFactory<>("city"));
        column3.setCellValueFactory(new PropertyValueFactory<>("street"));

        tableView.getColumns().clear();
        tableView.setItems(AddCustomer_AddressDataToList());

        tableView.getColumns().addAll( column1, column2, column3);


        column1.setPrefWidth(250);
        column2.setPrefWidth(250);
        column3.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void Employee_AccountTableView(TableView tableView) {
        TableColumn<Integer, Employee_Account> column0 = new TableColumn<>("Id");
        TableColumn<Integer, Employee_Account> column1 = new TableColumn<>("Type name");
        TableColumn<String, Employee_Account> column2 = new TableColumn<>("Login");
        TableColumn<String, Employee_Account> column3 = new TableColumn<>("Password");
        TableColumn<String, Employee_Account> column4 = new TableColumn<>("Account creation date");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("type_name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("login"));
        column3.setCellValueFactory(new PropertyValueFactory<>("password"));
        column4.setCellValueFactory(new PropertyValueFactory<>("account_create_date"));

        tableView.getColumns().clear();
        tableView.setItems(AddEmployee_AccountDataToList());

        tableView.getColumns().addAll(column1, column2, column3, column4);



        column1.setPrefWidth(250);
        column2.setPrefWidth(250);
        column3.setPrefWidth(250);
        column4.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void Employee_AddressTableView(TableView tableView) {
        TableColumn<Integer, Employee_Address> column0 = new TableColumn<>("Id");
        TableColumn<String, Employee_Address> column1 = new TableColumn<>("Country");
        TableColumn<String, Employee_Address> column2 = new TableColumn<>("City");
        TableColumn<String, Employee_Address> column3 = new TableColumn<>("Street");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("country"));
        column2.setCellValueFactory(new PropertyValueFactory<>("city"));
        column3.setCellValueFactory(new PropertyValueFactory<>("street"));

        tableView.getColumns().clear();
        tableView.setItems(AddEmployee_AddressDataToList());

        tableView.getColumns().addAll(column1, column2, column3);


        column1.setPrefWidth(250);
        column2.setPrefWidth(250);
        column3.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void EmployeesTableView( TableView tableView) {
        TableColumn<Integer, Employees> column0 = new TableColumn<>("Id");
        TableColumn<String, Employees> column1 = new TableColumn<>("First name");
        TableColumn<String, Employees> column2 = new TableColumn<>("Last name");
        TableColumn<String, Employees> column3 = new TableColumn<>("Date of birth");
        TableColumn<Integer, Employees> column4 = new TableColumn<>("Account id");
        TableColumn<String, Employees> column5 = new TableColumn<>("Address");
        TableColumn<String, Employees> column6 = new TableColumn<>("Email");
        TableColumn<String, Employees> column7 = new TableColumn<>("Phone number");
        TableColumn<String, Employees> column8 = new TableColumn<>("Unit");
        TableColumn<String, Employees> column9 = new TableColumn<>("Position");
        TableColumn<Float, Employees> column10 = new TableColumn<>("Salary");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        column3.setCellValueFactory(new PropertyValueFactory<>("date_of_birth"));
        column4.setCellValueFactory(new PropertyValueFactory<>("account_id"));
        column5.setCellValueFactory(new PropertyValueFactory<>("address_name"));
        column6.setCellValueFactory(new PropertyValueFactory<>("email"));
        column7.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        column8.setCellValueFactory(new PropertyValueFactory<>("unit_name"));
        column9.setCellValueFactory(new PropertyValueFactory<>("position_name"));
        column10.setCellValueFactory(new PropertyValueFactory<>("salary"));


        tableView.getColumns().clear();
        tableView.setItems(AddEmployeesDataToList());

        tableView.getColumns().addAll(column1, column2, column3, column4, column5,column6,column7,column8,column9,column10);


        column1.setPrefWidth(150);
        column2.setPrefWidth(150);
        column3.setPrefWidth(150);
        column4.setPrefWidth(50);
        column5.setPrefWidth(100);
        column6.setPrefWidth(200);
        column7.setPrefWidth(150);
        column8.setPrefWidth(75);
        column9.setPrefWidth(100);
        column10.setPrefWidth(75);


    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void IncomeTableView( TableView tableView) {
        TableColumn<Integer, Income> column0 = new TableColumn<>("Id");
        TableColumn<String, Income> column1 = new TableColumn<>("Unit");
        TableColumn<Integer, Income> column2 = new TableColumn<>("Quarter");
        TableColumn<Integer, Income> column3 = new TableColumn<>("Year");
        TableColumn<Integer, Income> column4 = new TableColumn<>("Net income");
        TableColumn<Integer, Income> column5 = new TableColumn<>("Gross income");
        TableColumn<Integer, Income> column6 = new TableColumn<>("Tax income");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("unit_name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("quarter_id"));
        column3.setCellValueFactory(new PropertyValueFactory<>("year"));
        column4.setCellValueFactory(new PropertyValueFactory<>("net_income"));
        column5.setCellValueFactory(new PropertyValueFactory<>("gross_income"));
        column6.setCellValueFactory(new PropertyValueFactory<>("tax_income"));

        tableView.getColumns().clear();
        tableView.setItems(AddIncomeDataToList());

        tableView.getColumns().addAll(column1, column2, column3, column4, column5,column6);


        column1.setPrefWidth(150);
        column2.setPrefWidth(150);
        column3.setPrefWidth(150);
        column4.setPrefWidth(150);
        column5.setPrefWidth(150);
        column6.setPrefWidth(150);


    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void OrdersTableView(TableView tableView) {
        TableColumn<Integer, Orders> column0 = new TableColumn<>("Id");
        TableColumn<Integer, Orders> column1 = new TableColumn<>("Product");
        TableColumn<Integer, Orders> column2 = new TableColumn<>("Customer");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("product_name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("customer_name"));

        tableView.getColumns().clear();
        tableView.setItems(AddOrdersDataToList());

        tableView.getColumns().addAll(column1, column2);


        column1.setPrefWidth(250);
        column2.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void PositionsTableView( TableView tableView) {
        TableColumn<Integer, Position> column0 = new TableColumn<>("Id");
        TableColumn<String, Position> column1 = new TableColumn<>("Position name");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("position_name"));

        tableView.getColumns().clear();
        tableView.setItems(AddPositionDataToList());

        tableView.getColumns().addAll(column1);

        column1.setPrefWidth(250);


    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void Product_StateTableView(TableView tableView) {
        TableColumn<Integer, Product_State> column0 = new TableColumn<>("Id");
        TableColumn<String, Product_State> column1 = new TableColumn<>("State name");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("state_name"));

        tableView.getColumns().clear();
        tableView.setItems(AddProduct_StateDataToList());

        tableView.getColumns().addAll(column1);


        column1.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void Product_TypeTableView(TableView tableView) {
        TableColumn<Integer, Product_Type> column0 = new TableColumn<>("Id");
        TableColumn<String, Product_Type> column1 = new TableColumn<>("Product type name");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("product_name"));

        tableView.getColumns().clear();
        tableView.setItems(AddProduct_TypeDataToList());

        tableView.getColumns().addAll(column1);


        column1.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void ProductsTableView(TableView tableView) {
        TableColumn<Integer, Products> column0 = new TableColumn<>("Id");
        TableColumn<String, Products> column1 = new TableColumn<>("Product type name");
        TableColumn<String, Products> column2 = new TableColumn<>("Product name");
        TableColumn<Float, Products> column3 = new TableColumn<>("Price net");
        TableColumn<Float, Products> column4 = new TableColumn<>("Price gross");
        TableColumn<Float, Products> column5 = new TableColumn<>("Price tax");
        TableColumn<String, Products> column6 = new TableColumn<>("Unit name");
        TableColumn<String, Products> column7 = new TableColumn<>("Product state");
        TableColumn<Integer, Products> column8 = new TableColumn<>("Quantity");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("product_type_name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("product_name"));
        column3.setCellValueFactory(new PropertyValueFactory<>("price_net"));
        column4.setCellValueFactory(new PropertyValueFactory<>("price_gross"));
        column5.setCellValueFactory(new PropertyValueFactory<>("price_tax"));
        column6.setCellValueFactory(new PropertyValueFactory<>("unit_name"));
        column7.setCellValueFactory(new PropertyValueFactory<>("product_state_name"));
        column8.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        tableView.getColumns().clear();
        tableView.setItems(AddProductsDataToList());

        tableView.getColumns().addAll(column1, column2, column3, column4, column5, column6, column7, column8);


        column1.setPrefWidth(250);
        column2.setPrefWidth(250);
        column3.setPrefWidth(250);
        column4.setPrefWidth(250);
        column5.setPrefWidth(250);
        column6.setPrefWidth(250);
        column7.setPrefWidth(250);
        column8.setPrefWidth(250);

    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void SpendingTableView( TableView tableView) {
        TableColumn<Integer, Spending> column0 = new TableColumn<>("Id");
        TableColumn<String, Spending> column1 = new TableColumn<>("Unit");
        TableColumn<Integer, Spending> column2 = new TableColumn<>("Quarter");
        TableColumn<Integer, Spending> column3 = new TableColumn<>("Year");
        TableColumn<Integer, Spending> column4 = new TableColumn<>("Spending sum");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("unit_name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("quarter_id"));
        column3.setCellValueFactory(new PropertyValueFactory<>("year"));
        column4.setCellValueFactory(new PropertyValueFactory<>("spending_sum"));


        tableView.getColumns().clear();
        tableView.setItems(AddSpendingDataToList());

        tableView.getColumns().addAll(column1, column2, column3, column4);


        column1.setPrefWidth(150);
        column2.setPrefWidth(150);
        column3.setPrefWidth(150);
        column4.setPrefWidth(150);


    }

    // Method creating table view for specific table implemented from interface
    @Override
    public void UnitsTableView( TableView tableView) {
        TableColumn<Integer, Units> column0 = new TableColumn<>("Id");
        TableColumn<String, Units> column1 = new TableColumn<>("Unit name");

        column0.setCellValueFactory(new PropertyValueFactory<>("id"));
        column1.setCellValueFactory(new PropertyValueFactory<>("unit_name"));

        tableView.getColumns().clear();
        tableView.setItems(AddUnitsDataToList());

        tableView.getColumns().addAll(column1);


        column1.setPrefWidth(250);


    }


}
