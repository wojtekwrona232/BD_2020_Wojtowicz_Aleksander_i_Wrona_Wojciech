/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package GUI;

import Classes.CheckIfEmpty;
import Classes.Confirmation;
import Classes.Error;
import Classes.TableLists;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.persistence.Query;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ButtonWindow extends MainWindow {

    TableLists tableLists = new TableLists();
    TabContent tabContent = new TabContent();
    Stage stage;

    // string tables containing names of columns in tables
    static String[] AccountTypeFieldsNames = {"Id", "Account type name"};
    static String[] CustomerFieldsNames = {"Id", "First name", "Last name", "Phone number", "Email", "Address", "Account id"};
    static String[] CustomerAccountFieldsNames = {"Id", "Login", "Password", "Account create date", "Account type"};
    static String[] CustomerAddressFieldsNames = {"Id", "Country", "City", "Street"};
    static String[] EmployeeAccountFieldsNames = {"Id", "Login", "Password", "Account create date", "Account type"};
    static String[] EmployeeAddressFieldsNames = {"Id", "Country", "City", "Street"};
    static String[] EmployeesFieldsNames = {"Id", "First name", "Last name", "Date od birth", "Address", "E-mail", "Phone number", "Unit", "Position", "Salary", "Account id"};
    static String[] IncomeFieldsNames = {"Id", "Unit", "Quarter", "Year", "Net income", "Gross income", "Tax income"};
    static String[] OrdersFieldsNames = {"Id", "Product", "Customer"};
    static String[] PositionFieldsNames = {"Id", "Position name"};
    static String[] ProductStateFieldsNames = {"Id", "Product state name"};
    static String[] ProductTypeFieldsNames = {"Id", "Product type name"};
    static String[] ProductsFieldsNames = {"Id", "Product type", "Product name", "Price net", "Price gross", "Price tax", "Unit name", "Product state name", "Quantity"};
    static String[] SpendingFieldsNames = {"Id", "Unit", "Quarter", "Year", "Spending sum"};
    static String[] UnitsFieldsNames = {"Id", "Unit name"};


    // method containing an array list of labels for specific table\
    private ArrayList<Label> AccountTypeLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();

        arrayList.add(label);
        arrayList.add(label1);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(AccountTypeFieldsNames[i]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> AccountTypeTextField() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();

        arrayList.add(jfxTextField);


        arrayList.get(0).setPromptText(AccountTypeFieldsNames[1]);
        arrayList.get(0).setLabelFloat(true);

        return arrayList;
    }



    // method containing an array list of labels for specific table\
    private ArrayList<Label> CustomerLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();

        arrayList.add(label);
        arrayList.add(label1);
        arrayList.add(label2);
        arrayList.add(label3);
        arrayList.add(label4);
        arrayList.add(label5);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(CustomerFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> CustomerTextField() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();
        JFXTextField jfxTextField2 = new JFXTextField();
        JFXTextField jfxTextField3 = new JFXTextField();
        JFXTextField jfxTextField4 = new JFXTextField();
        JFXTextField jfxTextField5 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);
        arrayList.add(jfxTextField2);
        arrayList.add(jfxTextField3);
        arrayList.add(jfxTextField4);
        arrayList.add(jfxTextField5);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(CustomerFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    // method containing an array list of labels for specific table\
    private ArrayList<Label> CustomerAccountLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();

        arrayList.add(label);
        arrayList.add(label1);
        arrayList.add(label2);
        arrayList.add(label3);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(CustomerAccountFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> CustomerAccountTextField() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();
        JFXTextField jfxTextField2 = new JFXTextField();
        JFXTextField jfxTextField3 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);
        arrayList.add(jfxTextField2);
        arrayList.add(jfxTextField3);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(CustomerAccountFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    // method containing an array list of labels for specific table\
    private ArrayList<Label> CustomerAddressLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();

        arrayList.add(label);
        arrayList.add(label1);
        arrayList.add(label2);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(CustomerAddressFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> CustomerAddressTextField() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();
        JFXTextField jfxTextField2 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);
        arrayList.add(jfxTextField2);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(CustomerAddressFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    // method containing an array list of labels for specific table\
    private ArrayList<Label> EmployeeAccountLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();

        arrayList.add(label);
        arrayList.add(label1);
        arrayList.add(label2);
        arrayList.add(label3);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(EmployeeAccountFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> EmployeeAccountTextField() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();
        JFXTextField jfxTextField2 = new JFXTextField();
        JFXTextField jfxTextField3 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);
        arrayList.add(jfxTextField2);
        arrayList.add(jfxTextField3);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(EmployeeAccountFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    // method containing an array list of labels for specific table\
    private ArrayList<Label> EmployeeAddressTypeLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();

        arrayList.add(label);
        arrayList.add(label1);
        arrayList.add(label2);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(EmployeeAddressFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> EmployeeAddressTextField() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();
        JFXTextField jfxTextField2 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);
        arrayList.add(jfxTextField2);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(EmployeeAddressFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    // method containing an array list of labels for specific table
    private ArrayList<Label> EmployeesLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        Label label7 = new Label();
        Label label8 = new Label();
        Label label9 = new Label();

        arrayList.add(label);
        arrayList.add(label1);
        arrayList.add(label2);
        arrayList.add(label3);
        arrayList.add(label4);
        arrayList.add(label5);
        arrayList.add(label6);
        arrayList.add(label7);
        arrayList.add(label8);
        arrayList.add(label9);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(EmployeesFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> EmployeesTextFields() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();
        JFXTextField jfxTextField2 = new JFXTextField();
        JFXTextField jfxTextField3 = new JFXTextField();
        JFXTextField jfxTextField4 = new JFXTextField();
        JFXTextField jfxTextField5 = new JFXTextField();
        JFXTextField jfxTextField6 = new JFXTextField();
        JFXTextField jfxTextField7 = new JFXTextField();
        JFXTextField jfxTextField8 = new JFXTextField();
        JFXTextField jfxTextField9 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);
        arrayList.add(jfxTextField2);
        arrayList.add(jfxTextField3);
        arrayList.add(jfxTextField4);
        arrayList.add(jfxTextField5);
        arrayList.add(jfxTextField6);
        arrayList.add(jfxTextField7);
        arrayList.add(jfxTextField8);
        arrayList.add(jfxTextField9);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(EmployeesFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }

    // method containing an array list of labels for specific table\
    private ArrayList<Label> OrdersLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();

        arrayList.add(label);
        arrayList.add(label1);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(OrdersFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> OrdersTextField() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(OrdersFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    // method containing an array list of labels for specific table
    private ArrayList<Label> PositionLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();

        arrayList.add(label);
        arrayList.add(label1);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(PositionFieldsNames[i]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> PositionTextFields() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);


        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(PositionFieldsNames[i]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    // method containing an array list of labels for specific table
    private ArrayList<Label> ProductStateLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();

        arrayList.add(label);

        arrayList.get(0).setText(ProductStateFieldsNames[1]);

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> ProductStateTextFields() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();

        arrayList.add(jfxTextField);

        arrayList.get(0).setPromptText(ProductStateFieldsNames[1]);
        arrayList.get(0).setLabelFloat(true);

        return arrayList;
    }



    // method containing an array list of labels for specific table
    private ArrayList<Label> ProductTypeLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();

        arrayList.add(label);

        arrayList.get(0).setText(ProductTypeFieldsNames[1]);

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> ProductTypeTextFields() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();

        arrayList.add(jfxTextField);

        arrayList.get(0).setPromptText(ProductTypeFieldsNames[1]);
        arrayList.get(0).setLabelFloat(true);

        return arrayList;
    }



    // method containing an array list of labels for specific table
    private ArrayList<Label> ProductsLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        Label label7 = new Label();

        arrayList.add(label);
        arrayList.add(label1);
        arrayList.add(label2);
        arrayList.add(label3);
        arrayList.add(label4);
        arrayList.add(label5);
        arrayList.add(label6);
        arrayList.add(label7);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(ProductsFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> ProductsTextFields() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();
        JFXTextField jfxTextField2 = new JFXTextField();
        JFXTextField jfxTextField3 = new JFXTextField();
        JFXTextField jfxTextField4 = new JFXTextField();
        JFXTextField jfxTextField5 = new JFXTextField();
        JFXTextField jfxTextField6 = new JFXTextField();
        JFXTextField jfxTextField7 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);
        arrayList.add(jfxTextField2);
        arrayList.add(jfxTextField3);
        arrayList.add(jfxTextField4);
        arrayList.add(jfxTextField5);
        arrayList.add(jfxTextField6);
        arrayList.add(jfxTextField7);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(ProductsFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    // method containing an array list of labels for specific table
    private ArrayList<Label> SpendingLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();

        arrayList.add(label);
        arrayList.add(label1);
        arrayList.add(label2);
        arrayList.add(label3);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setText(SpendingFieldsNames[i+1]);
        }

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> SpendingTextFields() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();
        JFXTextField jfxTextField1 = new JFXTextField();
        JFXTextField jfxTextField2 = new JFXTextField();
        JFXTextField jfxTextField3 = new JFXTextField();

        arrayList.add(jfxTextField);
        arrayList.add(jfxTextField1);
        arrayList.add(jfxTextField2);
        arrayList.add(jfxTextField3);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setPromptText(SpendingFieldsNames[i+1]);
            arrayList.get(i).setLabelFloat(true);
        }

        return arrayList;
    }



    private ArrayList<Label> UnitsLabels() {
        ArrayList<Label> arrayList = new ArrayList<>();

        Label label = new Label();

        arrayList.add(label);

        arrayList.get(0).setText(UnitsFieldsNames[1]);

        return arrayList;
    }
    // method containing an array list of jfx text fields (custom imported fields) for specific table
    private ArrayList<JFXTextField> UnitsTextFields() {
        ArrayList<JFXTextField> arrayList = new ArrayList<>();

        JFXTextField jfxTextField = new JFXTextField();

        arrayList.add(jfxTextField);

        arrayList.get(0).setPromptText(UnitsFieldsNames[1]);
        arrayList.get(0).setLabelFloat(true);


        return arrayList;
    }



    /*
        // Dynamic refresh table view to update elements that are displayed
        // This method invokes methods that create the tables
        // Method takes table view and string as an arguments where string is name of the method
    */
    public void refreshTableView( TableView tableView, String string) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        tableView.getItems().clear();
        Method method = TabContent.class.getMethod(string, TableView.class);
        method.invoke(tabContent,tableView);
    }


    // Managing the height of scene
    private int SetSceneHeight() {
        int height=0;
        switch(MainGUI.getCurrentTab()) {
            case 0: {
                height = IncomeFieldsNames.length*50+100;
            } break;
            case 1: {
                height = SpendingFieldsNames.length*50+100;
            } break;
            case 2: {
                height = UnitsFieldsNames.length*50+100;
            } break;
            case 3: {
                height = PositionFieldsNames.length*50+100;
            } break;
            case 4: {
                height = EmployeesFieldsNames.length*50+115;
            } break;
            case 5: {
                height = EmployeeAddressFieldsNames.length*50+100;
            } break;
            case 6: {
                height = EmployeeAccountFieldsNames.length*50+100;
            } break;
            case 7: {
                height = CustomerFieldsNames.length*50+100;
            } break;
            case 8: {
                height = CustomerAddressFieldsNames.length*50+100;
            } break;
            case 9: {
                height = CustomerAccountFieldsNames.length*50+100;
            } break;
            case 10: {
                height = ProductStateFieldsNames.length*50+100;
            } break;
            case 11: {
                height = ProductTypeFieldsNames.length*50+100;
            } break;
            case 12: {
                height = AccountTypeFieldsNames.length*50+100;
            } break;
            case 13: {
                height = OrdersFieldsNames.length*50+100;
            } break;
            case 14: {
                height = ProductsFieldsNames.length*50+100;
            } break;
            default:
                break;
        }
        return height;
    }

    // Creating stage for button windows
    private void CreateStage(Node node, String string) {
        stage = new Stage();
        stage.setTitle(string);
        stage.getIcons().add(new Image("file:src/Files/Icons/database-1.png"));
        Scene scene = new Scene((Parent) node, 500, SetSceneHeight());
        scene.getStylesheets().add("file:src/Files/styleCSS_dark.css");
        stage.setScene(scene);
        stage.show();
    }


    // Window for the Add button
    private  void runWindow( ArrayList<Label> arrayList, ArrayList<JFXTextField> arrayList1, GridPane gridPane, ArrayList<String> list, ArrayList<String> list1,
                             ArrayList<String> list2, ArrayList<String> list3, ArrayList<String> list4, ArrayList<String> list5, ArrayList<String> list6,
                             ArrayList<String> list7, ArrayList<String> list8) {

        /*
            list - unit name
            list1 - position name
            list2 - employee address
            list3 - account type
            list4 - customer address
            list5 - customers
            list6 - product type
            list7 - products
            list8 - product state name
        */


        switch(MainGUI.getCurrentTab()) {
            // Spending
            case 1: {
                //{"Id", "Unit", "Quarter", "Year", "Spending sum"};
                arrayList.get(0).setText("Unit");
                arrayList.get(1).setText("Quarter");
                arrayList.get(2).setText("Year");
                arrayList.get(3).setText("Spending");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);

                arrayList1.get(0).setPromptText("Unit");
                arrayList1.get(1).setPromptText("Quarter");
                arrayList1.get(2).setPromptText("Year");
                arrayList1.get(3).setPromptText("Spending");

                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(3),HPos.CENTER);

                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);
                gridPane.add(arrayList1.get(3),1,3);

                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,0);

                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                arrayList1.get(0).setText(String.valueOf(selectionModel.getSelectedIndex()));
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(0).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                });

            }break;
            // Units
            case 2: {
                //{"Id", "Position name"};

                arrayList.get(0).setText("Unit");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Unit name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);


            }break;
            // Positions
            case 3: {
                //{"Id", "Unit name"};

                arrayList.get(0).setText("Position");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Position name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);

            }break;
            // Employees
            case 4: {
                // {"Id", "First name", "Last name", "Date od birth", "Address", "E-mail", "Phone number", "Unit", "Position", "Salary", "Account id"};
                arrayList.get(0).setText("First name");
                arrayList.get(1).setText("Last name");
                arrayList.get(2).setText("Date of birth");
                arrayList.get(3).setText("Address");
                arrayList.get(4).setText("E-mail");
                arrayList.get(5).setText("Phone number");
                arrayList.get(6).setText("Unit");
                arrayList.get(7).setText("Position");
                arrayList.get(8).setText("Salary");
                arrayList.get(9).setText("Account id");
                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(5),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(6),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(7),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(8),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(9),HPos.CENTER);
                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);
                gridPane.add(arrayList.get(4),0,4);
                gridPane.add(arrayList.get(5),0,5);
                gridPane.add(arrayList.get(6),0,6);
                gridPane.add(arrayList.get(7),0,7);
                gridPane.add(arrayList.get(8),0,8);
                gridPane.add(arrayList.get(9),0,9);


                arrayList1.get(0).setPromptText("First name");
                arrayList1.get(1).setPromptText("Last name");
                arrayList1.get(2).setPromptText("Date of birth");
                arrayList1.get(3).setPromptText("Address");
                arrayList1.get(4).setPromptText("E-mail");
                arrayList1.get(5).setPromptText("Phone number");
                arrayList1.get(6).setPromptText("Unit name");
                arrayList1.get(7).setPromptText("Position name");
                arrayList1.get(8).setPromptText("Salary");
                arrayList1.get(9).setPromptText("Account id");
                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(5),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(8),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(9),HPos.CENTER);
                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(4),1,4);
                gridPane.add(arrayList1.get(5),1,5);
                gridPane.add(arrayList1.get(8),1,8);
                gridPane.add(arrayList1.get(9),1,9);


                JFXDatePicker jfxDatePicker = new JFXDatePicker();
                GridPane.setHalignment(jfxDatePicker,HPos.CENTER);
                gridPane.add(jfxDatePicker,1,2);
                jfxDatePicker.valueProperty().addListener(observable -> {
                    arrayList1.get(2).setText(jfxDatePicker.getValue().toString());
                });


                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list2);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,3);
                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                arrayList1.get(3).setText(String.valueOf(selectionModel.getSelectedIndex()));
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(3).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox1 = new JFXComboBox();
                jfxComboBox1.getItems().addAll(list);
                GridPane.setHalignment(jfxComboBox1,HPos.CENTER);
                gridPane.add(jfxComboBox1,1,6);
                SingleSelectionModel selectionModel1 = jfxComboBox1.getSelectionModel();
                arrayList1.get(6).setText(String.valueOf(selectionModel1.getSelectedIndex()));
                selectionModel1.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(6).setText(String.valueOf(selectionModel1.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox2 = new JFXComboBox();
                jfxComboBox2.getItems().addAll(list1);
                GridPane.setHalignment(jfxComboBox2,HPos.CENTER);
                gridPane.add(jfxComboBox2,1,7);
                SingleSelectionModel selectionModel2 = jfxComboBox2.getSelectionModel();
                arrayList1.get(7).setText(String.valueOf(selectionModel2.getSelectedIndex()));
                selectionModel2.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(7).setText(String.valueOf(selectionModel2.getSelectedIndex()+1));
                });

            }break;
            // Employees Address
            case 5: {
                //"Id", "Country", "City", "Street"

                arrayList.get(0).setText("Country");
                arrayList.get(1).setText("City");
                arrayList.get(2).setText("Street address");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);

                arrayList1.get(0).setPromptText("Enter country");
                arrayList1.get(1).setPromptText("Enter city");
                arrayList1.get(2).setPromptText("Enter street address");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);


            }break;
            // Employees Accounts
            case 6: {
                // {"Id", "Login", "Password", "Account create date", "Account type"};

                arrayList.get(0).setText("Login");
                arrayList.get(1).setText("Password");
                arrayList.get(2).setText("Account create date");
                arrayList.get(3).setText("Account type");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);

                arrayList1.get(0).setPromptText("Enter login");
                arrayList1.get(1).setPromptText("Enter password");
                arrayList1.get(2).setText("Account create date");
                arrayList1.get(3).setText("Account type");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);


                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list3);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,3);


                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(3).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                });


                JFXDatePicker jfxDatePicker = new JFXDatePicker();
                GridPane.setHalignment(jfxDatePicker,HPos.CENTER);
                gridPane.add(jfxDatePicker,1,2);

                jfxDatePicker.valueProperty().addListener(observable -> {
                    arrayList1.get(2).setText(jfxDatePicker.getValue().toString());

                });


            }break;
            // Customer
            case 7: {
                // {"Id", "First name", "Last name", "Phone number", "Email", "Address", "Account id"};
                arrayList.get(0).setText("First name");
                arrayList.get(1).setText("Last name");
                arrayList.get(2).setText("Phone number");
                arrayList.get(3).setText("E-mail");
                arrayList.get(4).setText("Address");
                arrayList.get(5).setText("Account");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(5),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);
                gridPane.add(arrayList.get(4),0,4);
                gridPane.add(arrayList.get(5),0,5);

                arrayList1.get(0).setPromptText("First name");
                arrayList1.get(1).setPromptText("Last name");
                arrayList1.get(2).setPromptText("Phone number");
                arrayList1.get(3).setPromptText("E-mail");
                arrayList1.get(4).setPromptText("Address");
                arrayList1.get(5).setPromptText("Account");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(5),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);
                gridPane.add(arrayList1.get(3),1,3);
                gridPane.add(arrayList1.get(5),1,5);


                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list4);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,4);
                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(4).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                });

            }break;
            // Customer Address
            case 8: {
                //"Id", "Country", "City", "Street"

                arrayList.get(0).setText("Country");
                arrayList.get(1).setText("City");
                arrayList.get(2).setText("Street address");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);

                arrayList1.get(0).setPromptText("Enter country");
                arrayList1.get(1).setPromptText("Enter city");
                arrayList1.get(2).setPromptText("Enter street address");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);


            }break;
            // Customer Accounts
            case 9: {
                // {"Id", "Login", "Password", "Account create date", "Account type"};

                arrayList.get(0).setText("Login");
                arrayList.get(1).setText("Password");
                arrayList.get(2).setText("Account create date");
                arrayList.get(3).setText("Account type");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);

                arrayList1.get(0).setPromptText("Enter login");
                arrayList1.get(1).setPromptText("Enter password");
                arrayList1.get(2).setText("Account create date");
                arrayList1.get(3).setText("1");

                JFXTextField jfxTextField = new JFXTextField();
                jfxTextField.setText("Customer account");
                jfxTextField.setPromptText("Account type");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(jfxTextField,HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(jfxTextField,1,3);

                jfxTextField.setDisable(true);


                JFXDatePicker jfxDatePicker = new JFXDatePicker();
                GridPane.setHalignment(jfxDatePicker,HPos.CENTER);
                gridPane.add(jfxDatePicker,1,2);
                jfxDatePicker.valueProperty().addListener(observable -> {
                    arrayList1.get(2).setText(jfxDatePicker.getValue().toString());

                });


            }break;
            // Product state
            case 10: {
                // {"Id", "Product state name"};

                arrayList.get(0).setText("Product state");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Product state name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);


            }break;
            // Product type
            case 11: {
                // {"Id", "Product state name"};

                arrayList.get(0).setText("Product type");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Product type name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);


            }break;
            // Account type
            case 12: {
                // {"Id", "Product type name"};

                arrayList.get(0).setText("Account type");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Account type name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);


            }break;
            // Orders
            case 13: {
                // {"Id", "Product", "Customer"};

                arrayList.get(0).setText("Product");
                arrayList.get(1).setText("Customer");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);

                arrayList1.get(0).setPromptText("Product");
                arrayList1.get(1).setPromptText("Customer");

                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list7);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,0);
                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                arrayList1.get(0).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(0).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox1 = new JFXComboBox();
                jfxComboBox1.getItems().addAll(list5);
                GridPane.setHalignment(jfxComboBox1,HPos.CENTER);
                gridPane.add(jfxComboBox1,1,1);
                SingleSelectionModel selectionModel1 = jfxComboBox1.getSelectionModel();
                arrayList1.get(1).setText(String.valueOf(selectionModel1.getSelectedIndex()+1));
                selectionModel1.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(1).setText(String.valueOf(selectionModel1.getSelectedIndex()+1));
                });


            }break;
            // Products
            case 14: {
                // {"Product type", "Product name", "Price net", "Price gross", "Price tax", "Unit name", "Product state name", "Quantity"};

                arrayList.get(0).setText("Product type");
                arrayList.get(1).setText("Product name");
                arrayList.get(2).setText("Net price");
                arrayList.get(3).setText("Gross price");
                arrayList.get(4).setText("Tax price");
                arrayList.get(5).setText("Unit name");
                arrayList.get(6).setText("Product state name");
                arrayList.get(7).setText("Quantity");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(5),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(6),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(7),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);
                gridPane.add(arrayList.get(4),0,4);
                gridPane.add(arrayList.get(5),0,5);
                gridPane.add(arrayList.get(6),0,6);
                gridPane.add(arrayList.get(7),0,7);

                arrayList1.get(0).setPromptText("Product type");
                arrayList1.get(1).setPromptText("Product name");
                arrayList1.get(2).setPromptText("Net price");
                arrayList1.get(3).setPromptText("Gross price");
                arrayList1.get(4).setPromptText("Tax price");
                arrayList1.get(5).setPromptText("Unit name");
                arrayList1.get(6).setPromptText("Product state name");
                arrayList1.get(7).setPromptText("Quantity");

                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(7),HPos.CENTER);

                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);
                gridPane.add(arrayList1.get(3),1,3);
                gridPane.add(arrayList1.get(4),1,4);
                gridPane.add(arrayList1.get(7),1,7);


                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list6);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,0);
                SingleSelectionModel selectionModel2 = jfxComboBox.getSelectionModel();
                selectionModel2.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(0).setText(String.valueOf(selectionModel2.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox2 = new JFXComboBox();
                jfxComboBox2.getItems().addAll(list);
                GridPane.setHalignment(jfxComboBox2,HPos.CENTER);
                gridPane.add(jfxComboBox2,1,5);
                SingleSelectionModel selectionModel1 = jfxComboBox2.getSelectionModel();
                selectionModel1.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(5).setText(String.valueOf(selectionModel1.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox3 = new JFXComboBox();
                jfxComboBox3.getItems().addAll(list8);
                GridPane.setHalignment(jfxComboBox3,HPos.CENTER);
                gridPane.add(jfxComboBox3,1,6);
                SingleSelectionModel selectionModel3 = jfxComboBox3.getSelectionModel();
                selectionModel3.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(6).setText(String.valueOf(selectionModel3.getSelectedIndex()+1));
                });



            }break;
            default: {
                Error error = new Error();
                error.error("Invalid table", "Table you are trying to select does not exist.");
            }
        }

        JFXButton jfxButton = new JFXButton("Add");
        gridPane.add(jfxButton,2,arrayList.size()+1);

        Confirmation conf = new Confirmation();
        CheckIfEmpty checkIfEmpty = new CheckIfEmpty();

        jfxButton.setOnAction(actionEvent -> {
            conf.confirmation("Confirmation", "Are you sure you want to add new record?");
            conf.getJfxButton().setOnAction(actionEvent1 -> {
                switch(MainGUI.getCurrentTab()) {
                    // spending
                    case 1: {
                        var x = checkIfEmpty.IsSpendingEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddSpending(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView2,"SpendingTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // units
                    case 2: {
                        var x = checkIfEmpty.IsUnitEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddUnit(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView3,"UnitsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // position
                    case 3: {
                        var x = checkIfEmpty.IsPositionEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddPosition(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView4,"PositionsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // employees
                    case 4: {
                        var x = checkIfEmpty.IsEmployeesEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddEmployee(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView5,"EmployeesTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // employee address
                    case 5: {
                        var x = checkIfEmpty.IsEmployeeAddressEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddEmployee_Address(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView6,"Employee_AddressTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // employee account
                    case 6: {
                        var x = checkIfEmpty.IsEmployeeAccountEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddEmployee_Account(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView7,"Employee_AccountTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // customers
                    case 7: {
                        var x = checkIfEmpty.IsCustomersEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddCustomer(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView8,"CustomerTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // customers address
                    case 8: {
                        var x = checkIfEmpty.IsCustomerAddressEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddCustomer_Address(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView9,"Customer_AddressTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // customers account
                    case 9: {
                        var x = checkIfEmpty.IsCustomerAccountEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddCustomer_Account(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView10,"Customer_AccountTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // product state
                    case 10: {
                        var x = checkIfEmpty.IsProductStateEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddProduct_State(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView11,"Product_StateTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // product type
                    case 11: {
                        var x = checkIfEmpty.IsProductTypeEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddProduct_Type(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView12,"Product_TypeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // account type
                    case 12: {
                        var x = checkIfEmpty.IsAccountTypeEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddAccount_type(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView13,"Account_typeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // orders
                    case 13: {
                        var x = checkIfEmpty.IsOrdersEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddOrders(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView14,"OrdersTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // products
                    case 14: {
                        var x = checkIfEmpty.IsProductsEmpty(arrayList1);
                        if (!x) {
                            tableLists.AddProduct(arrayList1);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView15,"ProductsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    default:
                        break;
                }
            });
            conf.getJfxButton1().setOnAction(actionEvent1 -> {
                conf.getStage().close();
                stage.close();
            });
        });

    }

    // Windows for the Replace button
    private void runWindow1( ArrayList<Label> arrayList, ArrayList<JFXTextField> arrayList1, GridPane gridPane, ArrayList<String> list, ArrayList<String> list1,
                             ArrayList<String> list2, ArrayList<String> list3, ArrayList<String> list4, ArrayList<String> list5, ArrayList<String> list6,
                             ArrayList<String> list7, ArrayList<String> list8) {

        /*
            list - unit name
            list1 - position name
            list2 - employee address
            list3 - account type
            list4 - customer address
            list5 - customers
            list6 - product type
            list7 - products
            list8 - product state name
        */

        TableLists tableLists = new TableLists();

        switch(MainGUI.getCurrentTab()) {
            // Spending
            case 1: {
                //{"Id", "Unit", "Quarter", "Year", "Spending sum"};
                arrayList.get(0).setText("Unit");
                arrayList.get(1).setText("Quarter");
                arrayList.get(2).setText("Year");
                arrayList.get(3).setText("Spending");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);

                arrayList1.get(1).setPromptText("Quarter");
                arrayList1.get(2).setPromptText("Year");
                arrayList1.get(3).setPromptText("Spending");

                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(3),HPos.CENTER);

                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);
                gridPane.add(arrayList1.get(3),1,3);

                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,0);

                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                arrayList1.get(0).setText(String.valueOf(selectionModel.getSelectedIndex()));
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(0).setText(String.valueOf(selectionModel.getSelectedIndex()));
                });

            }break;
            // Units
            case 2: {
                //{"Id", "Position name"};

                arrayList.get(0).setText("Unit");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Enter unit name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);


            }break;
            // Positions
            case 3: {
                //{"Id", "Unit name"};

                arrayList.get(0).setText("Position");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Enter position name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);

            }break;
            // Employees
            case 4: {
                // {"Id", "First name", "Last name", "Date od birth", "Address", "E-mail", "Phone number", "Unit", "Position", "Salary", "Account id"};
                arrayList.get(0).setText("First name");
                arrayList.get(1).setText("Last name");
                arrayList.get(2).setText("Date of birth");
                arrayList.get(3).setText("Address");
                arrayList.get(4).setText("E-mail");
                arrayList.get(5).setText("Phone number");
                arrayList.get(6).setText("Unit name");
                arrayList.get(7).setText("Position name");
                arrayList.get(8).setText("Salary");
                arrayList.get(9).setText("Account id");
                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(5),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(6),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(7),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(8),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(9),HPos.CENTER);
                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);
                gridPane.add(arrayList.get(4),0,4);
                gridPane.add(arrayList.get(5),0,5);
                gridPane.add(arrayList.get(6),0,6);
                gridPane.add(arrayList.get(7),0,7);
                gridPane.add(arrayList.get(8),0,8);
                gridPane.add(arrayList.get(9),0,9);


                arrayList1.get(0).setPromptText("First name");
                arrayList1.get(1).setPromptText("Last name");
                arrayList1.get(2).setPromptText("Date of birth");
                arrayList1.get(3).setPromptText("Address");
                arrayList1.get(4).setPromptText("E-mail");
                arrayList1.get(5).setPromptText("Phone number");
                arrayList1.get(6).setPromptText("Unit name");
                arrayList1.get(7).setPromptText("Position name");
                arrayList1.get(8).setPromptText("Salary");
                arrayList1.get(9).setPromptText("Account id");
                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(5),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(8),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(9),HPos.CENTER);
                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(4),1,4);
                gridPane.add(arrayList1.get(5),1,5);
                gridPane.add(arrayList1.get(8),1,8);
                gridPane.add(arrayList1.get(9),1,9);


                JFXDatePicker jfxDatePicker = new JFXDatePicker();
                GridPane.setHalignment(jfxDatePicker,HPos.CENTER);
                gridPane.add(jfxDatePicker,1,2);
                jfxDatePicker.valueProperty().addListener(observable -> {
                    arrayList1.get(2).setText(jfxDatePicker.getValue().toString());

                });


                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list2);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,3);
                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(3).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox1 = new JFXComboBox();
                jfxComboBox1.getItems().addAll(list);
                GridPane.setHalignment(jfxComboBox1,HPos.CENTER);
                gridPane.add(jfxComboBox1,1,6);
                SingleSelectionModel selectionModel1 = jfxComboBox1.getSelectionModel();
                selectionModel1.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(6).setText(String.valueOf(selectionModel1.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox2 = new JFXComboBox();
                jfxComboBox2.getItems().addAll(list1);
                GridPane.setHalignment(jfxComboBox2,HPos.CENTER);
                gridPane.add(jfxComboBox2,1,7);
                SingleSelectionModel selectionModel2 = jfxComboBox2.getSelectionModel();
                selectionModel2.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(7).setText(String.valueOf(selectionModel2.getSelectedIndex()+1));
                });

            }break;
            // Employees Address
            case 5: {
                //"Id", "Country", "City", "Street"

                arrayList.get(0).setText("Country");
                arrayList.get(1).setText("City");
                arrayList.get(2).setText("Street address");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);

                arrayList1.get(0).setPromptText("Enter country");
                arrayList1.get(1).setPromptText("Enter city");
                arrayList1.get(2).setPromptText("Enter street address");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);


            }break;
            // Employees Accounts
            case 6: {
                // {"Id", "Login", "Password", "Account create date", "Account type"};

                arrayList.get(0).setText("Login");
                arrayList.get(1).setText("Password");
                arrayList.get(2).setText("Account create date");
                arrayList.get(3).setText("Account type");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);

                arrayList1.get(0).setPromptText("Enter login");
                arrayList1.get(1).setPromptText("Enter password");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);


                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list3);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,3);


                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(3).setText(String.valueOf(selectionModel.getSelectedIndex()));
                });


                JFXDatePicker jfxDatePicker = new JFXDatePicker();
                GridPane.setHalignment(jfxDatePicker,HPos.CENTER);
                gridPane.add(jfxDatePicker,1,2);

                jfxDatePicker.valueProperty().addListener(observable -> {
                    arrayList1.get(2).setText(jfxDatePicker.getValue().toString());

                });


            }break;
            // Customer
            case 7: {
                // {"Id", "First name", "Last name", "Phone number", "Email", "Address", "Account id"};
                arrayList.get(0).setText("First name");
                arrayList.get(1).setText("Last name");
                arrayList.get(2).setText("Phone number");
                arrayList.get(3).setText("E-mail");
                arrayList.get(4).setText("Address");
                arrayList.get(5).setText("Account");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(5),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);
                gridPane.add(arrayList.get(4),0,4);
                gridPane.add(arrayList.get(5),0,5);

                arrayList1.get(0).setPromptText("Enter first name");
                arrayList1.get(1).setPromptText("Enter last name");
                arrayList1.get(2).setPromptText("Phone number");
                arrayList1.get(3).setPromptText("Enter e-mail");
                arrayList1.get(5).setPromptText("Account");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(5),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);
                gridPane.add(arrayList1.get(3),1,3);
                gridPane.add(arrayList1.get(5),1,5);


                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list4);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,4);
                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(4).setText(String.valueOf(selectionModel.getSelectedIndex()));
                });

            }break;
            // Customer Address
            case 8: {
                //"Id", "Country", "City", "Street"

                arrayList.get(0).setText("Country");
                arrayList.get(1).setText("City");
                arrayList.get(2).setText("Street address");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);

                arrayList1.get(0).setPromptText("Enter country");
                arrayList1.get(1).setPromptText("Enter city");
                arrayList1.get(2).setPromptText("Enter street address");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);


            }break;
            // Customer Accounts
            case 9: {
                // {"Id", "Login", "Password", "Account create date", "Account type"};

                arrayList.get(0).setText("Login");
                arrayList.get(1).setText("Password");
                arrayList.get(2).setText("Account create date");
                arrayList.get(3).setText("Account type");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);

                arrayList1.get(0).setPromptText("Enter login");
                arrayList1.get(1).setPromptText("Enter password");
                arrayList1.get(3).setText("1");

                JFXTextField jfxTextField = new JFXTextField();
                jfxTextField.setText("Customer account");
                jfxTextField.setPromptText("Account type");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(jfxTextField,HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,0);
                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(jfxTextField,1,3);

                jfxTextField.setDisable(true);


                JFXDatePicker jfxDatePicker = new JFXDatePicker();
                GridPane.setHalignment(jfxDatePicker,HPos.CENTER);
                gridPane.add(jfxDatePicker,1,2);

                jfxDatePicker.valueProperty().addListener(observable -> {
                    arrayList1.get(2).setText(jfxDatePicker.getValue().toString());

                });


            }break;
            // Product state
            case 10: {
                // {"Id", "Product state name"};

                arrayList.get(0).setText("Product state");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Enter product state name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);


            }break;
            // Product type
            case 11: {
                // {"Id", "Product state name"};

                arrayList.get(0).setText("Product type");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Enter product type name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);


            }break;
            // Account type
            case 12: {
                // {"Id", "Product type name"};

                arrayList.get(0).setText("Account type");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,1);

                arrayList1.get(0).setPromptText("Enter account type name");

                GridPane.setHalignment(arrayList1.get(0),HPos.CENTER);

                gridPane.add(arrayList1.get(0),1,1);


            }break;
            // Orders
            case 13: {
                // {"Id", "Product", "Customer"};

                arrayList.get(0).setText("Product");
                arrayList.get(1).setText("Customer");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);

                arrayList1.get(0).setPromptText("Product");
                arrayList1.get(1).setPromptText("Customer");

                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list7);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,0);
                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                arrayList1.get(0).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                selectionModel.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(0).setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox1 = new JFXComboBox();
                jfxComboBox1.getItems().addAll(list5);
                GridPane.setHalignment(jfxComboBox1,HPos.CENTER);
                gridPane.add(jfxComboBox1,1,1);
                SingleSelectionModel selectionModel1 = jfxComboBox1.getSelectionModel();
                arrayList1.get(1).setText(String.valueOf(selectionModel1.getSelectedIndex()+1));
                selectionModel1.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(1).setText(String.valueOf(selectionModel1.getSelectedIndex()+1));
                });



            }break;
            // Products
            case 14: {
                // {"Product type", "Product name", "Price net", "Price gross", "Price tax", "Unit name", "Product state name", "Quantity"};

                arrayList.get(0).setText("Product type");
                arrayList.get(1).setText("Product name");
                arrayList.get(2).setText("Net price");
                arrayList.get(3).setText("Gross price");
                arrayList.get(4).setText("Tax price");
                arrayList.get(5).setText("Unit name");
                arrayList.get(6).setText("Product state name");
                arrayList.get(7).setText("Quantity");

                GridPane.setHalignment(arrayList.get(0),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(5),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(6),HPos.CENTER);
                GridPane.setHalignment(arrayList.get(7),HPos.CENTER);

                gridPane.add(arrayList.get(0),0,0);
                gridPane.add(arrayList.get(1),0,1);
                gridPane.add(arrayList.get(2),0,2);
                gridPane.add(arrayList.get(3),0,3);
                gridPane.add(arrayList.get(4),0,4);
                gridPane.add(arrayList.get(5),0,5);
                gridPane.add(arrayList.get(6),0,6);
                gridPane.add(arrayList.get(7),0,7);

                arrayList1.get(0).setPromptText("Product type");
                arrayList1.get(1).setPromptText("Product name");
                arrayList1.get(2).setPromptText("Net price");
                arrayList1.get(3).setPromptText("Gross price");
                arrayList1.get(4).setPromptText("Tax price");
                arrayList1.get(5).setPromptText("Unit name");
                arrayList1.get(6).setPromptText("Product state name");
                arrayList1.get(7).setPromptText("Quantity");

                GridPane.setHalignment(arrayList1.get(1),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(2),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(3),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(4),HPos.CENTER);
                GridPane.setHalignment(arrayList1.get(7),HPos.CENTER);

                gridPane.add(arrayList1.get(1),1,1);
                gridPane.add(arrayList1.get(2),1,2);
                gridPane.add(arrayList1.get(3),1,3);
                gridPane.add(arrayList1.get(4),1,4);
                gridPane.add(arrayList1.get(7),1,7);


                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list6);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,0);
                SingleSelectionModel selectionModel2 = jfxComboBox.getSelectionModel();
                arrayList1.get(0).setText(String.valueOf(selectionModel2.getSelectedIndex()));
                selectionModel2.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(0).setText(String.valueOf(selectionModel2.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox2 = new JFXComboBox();
                jfxComboBox2.getItems().addAll(list);
                GridPane.setHalignment(jfxComboBox2,HPos.CENTER);
                gridPane.add(jfxComboBox2,1,5);
                SingleSelectionModel selectionModel1 = jfxComboBox2.getSelectionModel();
                arrayList1.get(5).setText(String.valueOf(selectionModel1.getSelectedIndex()));
                selectionModel1.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(5).setText(String.valueOf(selectionModel1.getSelectedIndex()+1));
                });

                JFXComboBox jfxComboBox3 = new JFXComboBox();
                jfxComboBox3.getItems().addAll(list8);
                GridPane.setHalignment(jfxComboBox3,HPos.CENTER);
                gridPane.add(jfxComboBox3,1,6);
                SingleSelectionModel selectionModel3 = jfxComboBox3.getSelectionModel();
                arrayList1.get(6).setText(String.valueOf(selectionModel3.getSelectedIndex()));
                selectionModel3.selectedItemProperty().addListener(observable -> {
                    arrayList1.get(6).setText(String.valueOf(selectionModel3.getSelectedIndex()+1));
                });


            }break;
            default: {
                Error error = new Error();
                error.error("Invalid table", "Table you are trying to select does not exist.");
            }
        }

        JFXButton jfxButton = new JFXButton("Add");
        gridPane.add(jfxButton,2,arrayList.size()+1);

        Confirmation conf = new Confirmation();
        CheckIfEmpty checkIfEmpty = new CheckIfEmpty();

        jfxButton.setOnAction(actionEvent -> {
            conf.confirmation("Confirmation", "Are you sure you want to add new record?");
            conf.getJfxButton().setOnAction(actionEvent1 -> {
                switch(MainGUI.getCurrentTab()) {
                    // spending
                    case 1: {
                        this.AddSpendingDataToList();
                        var x = checkIfEmpty.IsSpendingEmpty(arrayList1);
                        var y = spendingList.get(tableView2.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateSpending(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView2,"SpendingTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // units
                    case 2: {
                        this.AddUnitsDataToList();
                        var x = checkIfEmpty.IsUnitEmpty(arrayList1);
                        var y = unitsList.get(tableView3.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateUnit(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView3,"UnitsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // position
                    case 3: {
                        this.AddPositionDataToList();
                        var x = checkIfEmpty.IsPositionEmpty(arrayList1);
                        var y = positionList.get(tableView4.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdatePosition(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView4,"PositionsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // employees
                    case 4: {
                        this.AddEmployeesDataToList();
                        var x = checkIfEmpty.IsEmployeesEmpty(arrayList1);
                        var y = employeesList.get(tableView5.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateEmployee(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView5,"EmployeesTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // employee address
                    case 5: {
                        this.AddEmployee_AddressDataToList();
                        var x = checkIfEmpty.IsEmployeeAddressEmpty(arrayList1);
                        var y = employee_addressList.get(tableView6.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateEmployee_Address(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView6,"Employee_AddressTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // employee account
                    case 6: {
                        this.AddEmployee_AccountDataToList();
                        var x = checkIfEmpty.IsEmployeeAccountEmpty(arrayList1);
                        var y = employee_accountList.get(tableView7.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateEmployee_Account(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView7,"Employee_AccountTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    //customer
                    case 7: {
                        this.AddCustomerDataToList();
                        var x = checkIfEmpty.IsCustomersEmpty(arrayList1);
                        var y = customerList.get(tableView8.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateCustomer(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView8,"CustomerTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // customer address
                    case 8: {
                        this.AddCustomer_AddressDataToList();
                        var x = checkIfEmpty.IsCustomerAddressEmpty(arrayList1);
                        var y = customer_addressList.get(tableView9.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateCustomer_Address(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView9,"Customer_AddressTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // customer account
                    case 9: {
                        this.AddCustomer_AccountDataToList();
                        var x = checkIfEmpty.IsCustomerAccountEmpty(arrayList1);
                        var y = customer_accountList.get(tableView10.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateCustomer_Account(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView10,"Customer_AccountTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // product state
                    case 10: {
                        this.AddProduct_StateDataToList();
                        var x = checkIfEmpty.IsProductStateEmpty(arrayList1);
                        var y = product_stateList.get(tableView11.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateProduct_State(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView11,"Product_StateTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // product type
                    case 11: {
                        this.AddProduct_TypeDataToList();
                        var x = checkIfEmpty.IsProductTypeEmpty(arrayList1);
                        var y = product_typeList.get(tableView12.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateProduct_Type(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView12,"Product_TypeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // account type
                    case 12: {
                        this.AddAccount_TypeDataToList();
                        var x = checkIfEmpty.IsAccountTypeEmpty(arrayList1);
                        var y = account_typeList.get(tableView13.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateAccount_type(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView13,"Account_typeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // orders
                    case 13: {
                        this.AddOrdersDataToList();
                        var x = checkIfEmpty.IsOrdersEmpty(arrayList1);
                        var y = ordersList.get(tableView14.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateOrders(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView14,"OrdersTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    // products
                    case 14: {
                        this.AddProductsDataToList();
                        var x = checkIfEmpty.IsProductsEmpty(arrayList1);
                        var y = productsList.get(tableView15.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateProduct(arrayList1, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView15,"ProductsTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            Error error = new Error();
                            error.error("Error", "Table could not be refreshed");
                        }
                    } break;
                    default:
                        break;
            }
            });
            conf.getJfxButton1().setOnAction(actionEvent1 -> {
                conf.getStage().close();
                stage.close();
            });
        });


    }


    // Creating window depending on which table is selected
    public void Window() {

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(20);
        gridPane.setPadding(new Insets(10));

        CreateStage(gridPane,"Add data");

        ColumnConstraints columnConstraints = new ColumnConstraints(100);
        ColumnConstraints columnConstraints1 = new ColumnConstraints(250);
        ColumnConstraints columnConstraints2 = new ColumnConstraints(75);
        gridPane.getColumnConstraints().addAll(columnConstraints, columnConstraints1,columnConstraints2);

        Query query = hibernateUtil.openCurrentSession().createQuery("select i.unit_name from Units i");
        ArrayList<String> list = (ArrayList<String>) query.getResultList();

        Query query1 = hibernateUtil.openCurrentSession().createQuery("select i.position_name from Position i");
        ArrayList<String> list1 = (ArrayList<String>) query1.getResultList();

        Query query2 = hibernateUtil.openCurrentSession().createQuery("select concat(u.street,', ',u.city,', ',u.country) as address from Employee_Address u order by u.id");
        ArrayList<String> list2 = (ArrayList<String>) query2.getResultList();

        Query query3 = hibernateUtil.openCurrentSession().createQuery("select i.type from Account_Type i");
        ArrayList<String> list3 = (ArrayList<String>) query3.getResultList();

        Query query4 = hibernateUtil.openCurrentSession().createQuery("select concat(u.street,', ',u.city,', ',u.country) as address  from Customer_Address u order by u.id");
        ArrayList<String> list4 = (ArrayList<String>) query4.getResultList();

        Query query5 = hibernateUtil.openCurrentSession().createQuery("select concat(i.first_name, ' ', i.last_name) as customer from Customer i order by i.id");
        ArrayList<String> list5 = (ArrayList<String>) query5.getResultList();

        Query query6 = hibernateUtil.openCurrentSession().createQuery("select i.product_name from Product_Type i");
        ArrayList<String> list6 = (ArrayList<String>) query6.getResultList();

        Query query7 = hibernateUtil.openCurrentSession().createQuery("select i.product_name from Products i");
        ArrayList<String> list7 = (ArrayList<String>) query7.getResultList();

        Query query8 = hibernateUtil.openCurrentSession().createQuery("select i.state_name from Product_State i");
        ArrayList<String> list8 = (ArrayList<String>) query8.getResultList();

        switch(MainGUI.getCurrentTab()) {
            case 0: {

                Label label = new Label("Unit");
                Label label1 = new Label("Quarter");
                Label label2 = new Label("Year");
                Label label3 = new Label("Net income");
                Label label4 = new Label("Gross income");
                Label label5 = new Label("Tax income");

                GridPane.setHalignment(label,HPos.CENTER);
                GridPane.setHalignment(label1,HPos.CENTER);
                GridPane.setHalignment(label2,HPos.CENTER);
                GridPane.setHalignment(label3,HPos.CENTER);
                GridPane.setHalignment(label4,HPos.CENTER);
                GridPane.setHalignment(label5,HPos.CENTER);

                gridPane.add(label,0,0);
                gridPane.add(label1,0,1);
                gridPane.add(label2,0,2);
                gridPane.add(label3,0,3);
                gridPane.add(label4,0,4);
                gridPane.add(label5,0,5);

                JFXTextField jfxTextField = new JFXTextField();
                JFXTextField jfxTextField1 = new JFXTextField();
                JFXTextField jfxTextField2 = new JFXTextField();
                JFXTextField jfxTextField3 = new JFXTextField();
                JFXTextField jfxTextField4 = new JFXTextField();
                JFXTextField jfxTextField5 = new JFXTextField();

                jfxTextField.setPromptText("Unit");
                jfxTextField1.setPromptText("Quarter");
                jfxTextField2.setPromptText("Year");
                jfxTextField3.setPromptText("Net income");
                jfxTextField4.setPromptText("Gross income");
                jfxTextField5.setPromptText("Tax income");

                jfxTextField1.setLabelFloat(true);
                jfxTextField2.setLabelFloat(true);
                jfxTextField3.setLabelFloat(true);
                jfxTextField4.setLabelFloat(true);
                jfxTextField5.setLabelFloat(true);

                GridPane.setHalignment(jfxTextField1,HPos.CENTER);
                GridPane.setHalignment(jfxTextField2,HPos.CENTER);
                GridPane.setHalignment(jfxTextField3,HPos.CENTER);
                GridPane.setHalignment(jfxTextField4,HPos.CENTER);
                GridPane.setHalignment(jfxTextField5,HPos.CENTER);

                gridPane.add(jfxTextField1,1,1);
                gridPane.add(jfxTextField2,1,2);
                gridPane.add(jfxTextField3,1,3);
                gridPane.add(jfxTextField4,1,4);
                gridPane.add(jfxTextField5,1,5);



                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,0);

                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                selectionModel.selectedItemProperty().addListener(observable -> {
                    jfxTextField.setText(String.valueOf(selectionModel.getSelectedIndex()+1));
                });

                JFXButton jfxButton = new JFXButton("Add");
                gridPane.add(jfxButton,2,7);

                Confirmation conf = new Confirmation();
                CheckIfEmpty checkIfEmpty = new CheckIfEmpty();
                ArrayList<JFXTextField> arrayList = new ArrayList<>();
                arrayList.add(jfxTextField);
                arrayList.add(jfxTextField1);
                arrayList.add(jfxTextField2);
                arrayList.add(jfxTextField3);
                arrayList.add(jfxTextField4);
                arrayList.add(jfxTextField5);

                jfxButton.setOnAction(actionEvent -> {
                    conf.confirmation("Confirmation", "Are you sure you want to add new record?");
                    conf.getJfxButton().setOnAction(actionEvent1 -> {
                        var x = checkIfEmpty.IsIncomeEmpty(arrayList);
                        if (!x) {
                            tableLists.AddIncome(arrayList);
                        }
                        try {
                            refreshTableView(tableView1,"IncomeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        conf.getStage().close();
                    });
                    conf.getJfxButton1().setOnAction(actionEvent1 -> {
                        conf.getStage().close();
                        stage.close();
                    });
                });

            } break;
            case 1: {
                runWindow(SpendingLabels(),SpendingTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 2: {
                runWindow(UnitsLabels(),UnitsTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 3: {
                runWindow(PositionLabels(),PositionTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 4: {
                runWindow(EmployeesLabels(),EmployeesTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 5: {
                runWindow(EmployeeAddressTypeLabels(),EmployeeAddressTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 6: {
                runWindow(EmployeeAccountLabels(),EmployeeAccountTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 7: {
                runWindow(CustomerLabels(),CustomerTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 8: {
                runWindow(CustomerAddressLabels(),CustomerAddressTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 9: {
                runWindow(CustomerAccountLabels(),CustomerAccountTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 10: {
                runWindow(ProductStateLabels(),ProductStateTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 11: {
                runWindow(ProductTypeLabels(),ProductTypeTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 12: {
                runWindow(AccountTypeLabels(),AccountTypeTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 13: {
                runWindow(OrdersLabels(),OrdersTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 14: {
                runWindow(ProductsLabels(),ProductsTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            default: {
                Error error = new Error();
                error.error("Error", "You cannot add new data to selected table!");
            }break;
        }

    }

    // Creating window depending on which table is selected
    public void Window1() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(20);
        gridPane.setPadding(new Insets(10));

        CreateStage(gridPane, "Replace data");

        ColumnConstraints columnConstraints = new ColumnConstraints(100);
        ColumnConstraints columnConstraints1 = new ColumnConstraints(250);
        ColumnConstraints columnConstraints2 = new ColumnConstraints(100);
        gridPane.getColumnConstraints().addAll(columnConstraints, columnConstraints1,columnConstraints2);

        Query query = hibernateUtil.openCurrentSession().createQuery("select i.unit_name from Units i");
        ArrayList<String> list = (ArrayList<String>) query.getResultList();

        Query query1 = hibernateUtil.openCurrentSession().createQuery("select i.position_name from Position i");
        ArrayList<String> list1 = (ArrayList<String>) query1.getResultList();

        Query query2 = hibernateUtil.openCurrentSession().createQuery("select concat(u.street,', ',u.city,', ',u.country) as address from Employee_Address u order by u.id");
        ArrayList<String> list2 = (ArrayList<String>) query2.getResultList();

        Query query3 = hibernateUtil.openCurrentSession().createQuery("select i.type from Account_Type i");
        ArrayList<String> list3 = (ArrayList<String>) query3.getResultList();

        Query query4 = hibernateUtil.openCurrentSession().createQuery("select concat(u.street,', ',u.city,', ',u.country) as address  from Customer_Address u order by u.id");
        ArrayList<String> list4 = (ArrayList<String>) query4.getResultList();

        Query query5 = hibernateUtil.openCurrentSession().createQuery("select concat(i.first_name, ' ', i.last_name) as customer from Customer i order by i.id");
        ArrayList<String> list5 = (ArrayList<String>) query5.getResultList();

        Query query6 = hibernateUtil.openCurrentSession().createQuery("select i.product_name from Product_Type i");
        ArrayList<String> list6 = (ArrayList<String>) query6.getResultList();

        Query query7 = hibernateUtil.openCurrentSession().createQuery("select i.product_name from Products i");
        ArrayList<String> list7 = (ArrayList<String>) query7.getResultList();

        Query query8 = hibernateUtil.openCurrentSession().createQuery("select i.state_name from Product_State i");
        ArrayList<String> list8 = (ArrayList<String>) query8.getResultList();

        switch(MainGUI.getCurrentTab()) {
            case 0: {

                Label label = new Label("Unit");
                Label label1 = new Label("Quarter");
                Label label2 = new Label("Year");
                Label label3 = new Label("Net income");
                Label label4 = new Label("Gross income");
                Label label5 = new Label("Tax income");

                GridPane.setHalignment(label,HPos.CENTER);
                GridPane.setHalignment(label1,HPos.CENTER);
                GridPane.setHalignment(label2,HPos.CENTER);
                GridPane.setHalignment(label3,HPos.CENTER);
                GridPane.setHalignment(label4,HPos.CENTER);
                GridPane.setHalignment(label5,HPos.CENTER);

                gridPane.add(label,0,0);
                gridPane.add(label1,0,1);
                gridPane.add(label2,0,2);
                gridPane.add(label3,0,3);
                gridPane.add(label4,0,4);
                gridPane.add(label5,0,5);

                JFXTextField jfxTextField = new JFXTextField();
                JFXTextField jfxTextField1 = new JFXTextField();
                JFXTextField jfxTextField2 = new JFXTextField();
                JFXTextField jfxTextField3 = new JFXTextField();
                JFXTextField jfxTextField4 = new JFXTextField();
                JFXTextField jfxTextField5 = new JFXTextField();

                jfxTextField1.setPromptText("Enter quarter");
                jfxTextField2.setPromptText("Enter year");
                jfxTextField3.setPromptText("Enter net income");
                jfxTextField4.setPromptText("Enter gross income");
                jfxTextField5.setPromptText("Enter tax income");

                jfxTextField1.setLabelFloat(true);
                jfxTextField2.setLabelFloat(true);
                jfxTextField3.setLabelFloat(true);
                jfxTextField4.setLabelFloat(true);
                jfxTextField5.setLabelFloat(true);

                GridPane.setHalignment(jfxTextField1,HPos.CENTER);
                GridPane.setHalignment(jfxTextField2,HPos.CENTER);
                GridPane.setHalignment(jfxTextField3,HPos.CENTER);
                GridPane.setHalignment(jfxTextField4,HPos.CENTER);
                GridPane.setHalignment(jfxTextField5,HPos.CENTER);

                gridPane.add(jfxTextField1,1,1);
                gridPane.add(jfxTextField2,1,2);
                gridPane.add(jfxTextField3,1,3);
                gridPane.add(jfxTextField4,1,4);
                gridPane.add(jfxTextField5,1,5);



                JFXComboBox jfxComboBox = new JFXComboBox();
                jfxComboBox.getItems().addAll(list);
                GridPane.setHalignment(jfxComboBox,HPos.CENTER);
                gridPane.add(jfxComboBox,1,0);

                SingleSelectionModel selectionModel = jfxComboBox.getSelectionModel();
                selectionModel.selectedItemProperty().addListener(observable -> {
                    jfxTextField.setText(String.valueOf(selectionModel.getSelectedIndex()));
                });

                JFXButton jfxButton = new JFXButton("Add");
                gridPane.add(jfxButton,2,7);

                Confirmation conf = new Confirmation();
                CheckIfEmpty checkIfEmpty = new CheckIfEmpty();
                ArrayList<JFXTextField> arrayList = new ArrayList<>();
                arrayList.add(jfxTextField);
                arrayList.add(jfxTextField1);
                arrayList.add(jfxTextField2);
                arrayList.add(jfxTextField3);
                arrayList.add(jfxTextField4);
                arrayList.add(jfxTextField5);


                jfxButton.setOnAction(actionEvent -> {
                    conf.confirmation("Confirmation", "Are you sure you want to update selected record?");
                    conf.getJfxButton().setOnAction(actionEvent1 -> {
                        this.AddIncomeDataToList();
                        var x = checkIfEmpty.IsIncomeEmpty(arrayList);
                        var y = incomeList.get(tableView1.getSelectionModel().getSelectedIndex()).getId();
                        if (!x) {
                            tableLists.UpdateIncome(arrayList, y);
                            conf.getStage().close();
                        }
                        try {
                            refreshTableView(tableView1,"IncomeTableView");
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    });
                    conf.getJfxButton1().setOnAction(actionEvent1 -> {
                        conf.getStage().close();
                        stage.close();
                    });
                });

            } break;
            case 1: {
                runWindow1(SpendingLabels(),SpendingTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 2: {
                runWindow1(UnitsLabels(),UnitsTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 3: {
                runWindow1(PositionLabels(),PositionTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 4: {
                runWindow1(EmployeesLabels(),EmployeesTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 5: {
                runWindow1(EmployeeAddressTypeLabels(),EmployeeAddressTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 6: {
                runWindow1(EmployeeAccountLabels(),EmployeeAccountTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 7: {
                runWindow1(CustomerLabels(),CustomerTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 8: {
                runWindow1(CustomerAddressLabels(),CustomerAddressTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 9: {
                runWindow1(CustomerAccountLabels(),CustomerAccountTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 10: {
                runWindow1(ProductStateLabels(),ProductStateTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 11: {
                runWindow1(ProductTypeLabels(),ProductTypeTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 12: {
                runWindow1(AccountTypeLabels(),AccountTypeTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 13: {
                runWindow1(OrdersLabels(),OrdersTextField(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            case 14: {
                runWindow1(ProductsLabels(),ProductsTextFields(),gridPane, list,list1,list2,list3,list4,list5,list6,list7,list8);
            } break;
            default: {
                Error error = new Error();
                error.error("Error", "You cannot add new data to selected table!");
            }break;
        }

    }



}
