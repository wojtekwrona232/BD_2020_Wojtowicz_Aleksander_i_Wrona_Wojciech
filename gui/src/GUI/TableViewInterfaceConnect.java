/*
 * Copyright (c) 2019. Wojciech Wrona
 * All rights reserved
 */

package GUI;

import javafx.scene.control.TableView;
import org.jetbrains.annotations.NotNull;

public interface TableViewInterfaceConnect {
    // Interface that creates Table specific Table View in GUI
    void Account_typeTableView(TableView tableView);
    void CustomerTableView(TableView tableView);
    void Customer_AccountTableView(TableView tableView);
    void Customer_AddressTableView(TableView tableView);
    void Employee_AccountTableView(TableView tableView);
    void Employee_AddressTableView(TableView tableView);
    void EmployeesTableView( TableView tableView);
    void IncomeTableView( TableView tableView);
    void OrdersTableView(TableView tableView);
    void PositionsTableView( TableView tableView);
    void Product_StateTableView(TableView tableView);
    void Product_TypeTableView(TableView tableView);
    void ProductsTableView(TableView tableView);
    void SpendingTableView( TableView tableView);
    void UnitsTableView( TableView tableView);

}
