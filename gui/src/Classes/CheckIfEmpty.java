/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package Classes;

import com.jfoenix.controls.JFXTextField;
import java.util.ArrayList;
import java.util.List;

public class CheckIfEmpty {

    public boolean IsIncomeEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(0).getText()) < 0) {
            tab.add(arrayList.get(0).getPromptText() + " has not been selected");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(1).getText()) < 0 || Integer.parseInt(arrayList.get(1).getText()) > 4)  {
            tab.add(arrayList.get(1).getPromptText() + " has to be between 1 and 4");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(2).getText()) < 0 || arrayList.get(2).getText().length() != 4) {
            tab.add(arrayList.get(2).getPromptText() + " must consist of 4 digits");
            is_empty[2] = true;
        }
        if (arrayList.get(3).getText() == null || arrayList.get(3).getText().trim().isEmpty()) {
            tab.add(arrayList.get(3).getPromptText()  + " cannot be empty");
            is_empty[3] = true;
        }
        if (arrayList.get(4).getText() == null || arrayList.get(4).getText().trim().isEmpty()) {
            tab.add(arrayList.get(4).getPromptText()  + " cannot be empty");
            is_empty[4] = true;
        }
        if (arrayList.get(5).getText() == null || arrayList.get(5).getText().trim().isEmpty()) {
            tab.add(arrayList.get(5).getPromptText()  + " cannot be empty");
            is_empty[5] = true;
        }


        if (is_empty[0] || is_empty[1] || is_empty[2] || is_empty[3] || is_empty[4] || is_empty[5] ) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsSpendingEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(0).getText()) < 0) {
            tab.add(arrayList.get(0).getPromptText() + " has not been selected");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(1).getText()) < 0 || Integer.parseInt(arrayList.get(1).getText()) > 4)  {
            tab.add(arrayList.get(1).getPromptText() + " has to be between 1 and 4");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(2).getText()) < 0 || arrayList.get(2).getText().length() != 4) {
            tab.add(arrayList.get(2).getPromptText() + " must consist of 4 digits");
            is_empty[2] = true;
        }
        if (arrayList.get(3).getText() == null || arrayList.get(3).getText().trim().isEmpty() || Float.parseFloat(arrayList.get(3).getText()) < 0) {
            tab.add(arrayList.get(3).getPromptText()  + " cannot be negative");
            is_empty[3] = true;
        }


        if (is_empty[0] || is_empty[1] || is_empty[2] || is_empty[3]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsPositionEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean is_empty = false;

        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty = true;
        }

        if (is_empty) {
            String string = "You have missing fields or fields:\n";
            string += " - " + tab.get(0) + "\n";

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmployeesEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty())  {
            tab.add(arrayList.get(1).getPromptText() + " cannot be empty");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty()) {
            tab.add(arrayList.get(2).getPromptText() + " cannot be empty");
            is_empty[2] = true;
        }
        if (arrayList.get(3).getText() == null || arrayList.get(3).getText().trim().isEmpty()) {
            tab.add(arrayList.get(3).getPromptText()  + " has not been selected");
            is_empty[3] = true;
        }
        if (arrayList.get(4).getText() == null || arrayList.get(4).getText().trim().isEmpty()) {
            tab.add(arrayList.get(4).getPromptText()  + " cannot be empty");
            is_empty[4] = true;
        }
        if (arrayList.get(5).getText() == null || arrayList.get(5).getText().trim().isEmpty()) {
            tab.add(arrayList.get(5).getPromptText()  + " cannot be empty");
            is_empty[5] = true;
        }
        if (arrayList.get(6).getText() == null || arrayList.get(6).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(6).getText()) < 0) {
            tab.add(arrayList.get(6).getPromptText()  + " has not been selected");
            is_empty[6] = true;
        }
        if (arrayList.get(7).getText() == null || arrayList.get(7).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(7).getText()) < 0) {
            tab.add(arrayList.get(7).getPromptText()  + " has not been selected");
            is_empty[7] = true;
        }
        if (arrayList.get(8).getText() == null || arrayList.get(8).getText().trim().isEmpty() || Float.parseFloat(arrayList.get(8).getText()) < 0) {
            tab.add(arrayList.get(8).getPromptText()  + " cannot be negative");
            is_empty[8] = true;
        }
        if (arrayList.get(9).getText() == null || arrayList.get(9).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(9).getText()) < 0) {
            tab.add(arrayList.get(9).getPromptText()  + " cannot be negative");
            is_empty[9] = true;
        }


        if (is_empty[0] || is_empty[1] || is_empty[2] || is_empty[3] || is_empty[4] || is_empty[5] || is_empty[6] || is_empty[7] || is_empty[8] || is_empty[9]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmployeeAddressEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty())  {
            tab.add(arrayList.get(1).getPromptText() + " cannot be empty");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty()) {
            tab.add(arrayList.get(2).getPromptText() + " cannot be empty");
            is_empty[2] = true;
        }


        if (is_empty[0] || is_empty[1] || is_empty[2]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmployeeAccountEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty())  {
            tab.add(arrayList.get(1).getPromptText() + " cannot be empty");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty()) {
            tab.add(arrayList.get(2).getPromptText() + " cannot be empty");
            is_empty[2] = true;
        }
        if (arrayList.get(3).getText() == null || arrayList.get(3).getText().trim().isEmpty()  || Integer.parseInt(arrayList.get(3).getText()) < 0) {
            tab.add(arrayList.get(3).getPromptText() + " has to be selected");
            is_empty[3] = true;
        }


        if (is_empty[0] || is_empty[1] || is_empty[2] || is_empty[3]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsCustomersEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty())  {
            tab.add(arrayList.get(1).getPromptText() + " cannot be empty");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty()) {
            tab.add(arrayList.get(2).getPromptText() + " cannot be empty");
            is_empty[2] = true;
        }
        if (arrayList.get(3).getText() == null || arrayList.get(3).getText().trim().isEmpty()) {
            tab.add(arrayList.get(3).getPromptText()  + " cannot be empty");
            is_empty[3] = true;
        }
        if (arrayList.get(4).getText() == null || arrayList.get(4).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(4).getText()) < 0) {
            tab.add(arrayList.get(4).getPromptText()  + " has not been selected");
            is_empty[4] = true;
        }
        if (arrayList.get(5).getText() == null || arrayList.get(5).getText().trim().isEmpty()) {
            tab.add(arrayList.get(5).getPromptText()  + " cannot be empty");
            is_empty[5] = true;
        }

        if (is_empty[0] || is_empty[1] || is_empty[2] || is_empty[3] || is_empty[4] || is_empty[5]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsCustomerAddressEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty())  {
            tab.add(arrayList.get(1).getPromptText() + " cannot be empty");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty()) {
            tab.add(arrayList.get(2).getPromptText() + " cannot be empty");
            is_empty[2] = true;
        }


        if (is_empty[0] || is_empty[1] || is_empty[2]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsCustomerAccountEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty())  {
            tab.add(arrayList.get(1).getPromptText() + " cannot be empty");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty()) {
            tab.add(arrayList.get(2).getPromptText() + " cannot be empty");
            is_empty[2] = true;
        }
        if (arrayList.get(3).getText() == null || arrayList.get(3).getText().trim().isEmpty()  || Integer.parseInt(arrayList.get(3).getText()) < 0) {
            tab.add(arrayList.get(3).getPromptText() + " has to be selected");
            is_empty[3] = true;
        }


        if (is_empty[0] || is_empty[1] || is_empty[2] || is_empty[3]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsProductStateEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean is_empty = false;
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty = true;
        }

        if (is_empty) {
            String string = "You have missing fields or fields:\n";
            string += " - " + tab.get(0) + "\n";

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsProductTypeEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean is_empty = false;
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty = true;
        }

        if (is_empty) {
            String string = "You have missing fields or fields:\n";
            string += " - " + tab.get(0) + "\n";

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsAccountTypeEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean is_empty = false;

        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty = true;
        }

        if (is_empty) {
            String string = "You have missing fields or fields:\n";
            string += " - " + tab.get(0) + "\n";

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOrdersEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];

        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(0).getText())<0) {
            tab.add(arrayList.get(0).getPromptText() + " has to be selected");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(1).getText())<0) {
            tab.add(arrayList.get(1).getPromptText() + " has to be selected");
            is_empty[1] = true;
        }

        if (is_empty[0] || is_empty[1]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }


            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsProductsEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean[] is_empty = new boolean[arrayList.size()];
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(0).getText()) < 0) {
            tab.add(arrayList.get(0).getPromptText() + " has not been selected");
            is_empty[0] = true;
        }
        if (arrayList.get(1).getText() == null || arrayList.get(1).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(0).getText()) < 0)  {
            tab.add(arrayList.get(1).getPromptText() + " has not been selected");
            is_empty[1] = true;
        }
        if (arrayList.get(2).getText() == null || arrayList.get(2).getText().trim().isEmpty() || Float.parseFloat(arrayList.get(0).getText()) < 0) {
            tab.add(arrayList.get(2).getPromptText() + " cannot be empty nor negative");
            is_empty[2] = true;
        }
        if (arrayList.get(3).getText() == null || arrayList.get(3).getText().trim().isEmpty() || Float.parseFloat(arrayList.get(0).getText()) < 0) {
            tab.add(arrayList.get(3).getPromptText()  + " cannot be empty nor negative");
            is_empty[3] = true;
        }
        if (arrayList.get(4).getText() == null || arrayList.get(4).getText().trim().isEmpty() || Float.parseFloat(arrayList.get(0).getText()) < 0) {
            tab.add(arrayList.get(4).getPromptText()  + " cannot be empty nor negative");
            is_empty[4] = true;
        }
        if (arrayList.get(5).getText() == null || arrayList.get(5).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(0).getText()) < 0) {
            tab.add(arrayList.get(5).getPromptText()  + " has not been selected");
            is_empty[5] = true;
        }
        if (arrayList.get(6).getText() == null || arrayList.get(6).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(6).getText()) < 0) {
            tab.add(arrayList.get(6).getPromptText()  + " has not been selected");
            is_empty[6] = true;
        }
        if (arrayList.get(7).getText() == null || arrayList.get(7).getText().trim().isEmpty() || Integer.parseInt(arrayList.get(7).getText()) < 0) {
            tab.add(arrayList.get(7).getPromptText()  + " cannot be empty nor negative");
            is_empty[7] = true;
        }

        if (is_empty[0] || is_empty[1] || is_empty[2] || is_empty[3] || is_empty[4] || is_empty[5] || is_empty[6] || is_empty[7]) {
            String string = "You have missing fields or fields:\n";
            for (int i = 0; i < tab.size(); i++) {
                string += " - " + tab.get(i) + "\n";
            }

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

    public boolean IsUnitEmpty(ArrayList<JFXTextField> arrayList) {
        List<String> tab = new ArrayList<>();
        boolean is_empty = false;
        if (arrayList.get(0).getText() == null || arrayList.get(0).getText().trim().isEmpty()) {
            tab.add(arrayList.get(0).getPromptText() + " cannot be empty");
            is_empty = true;
        }

        if (is_empty) {
            String string = "You have missing fields or fields:\n";
            string += " - " + tab.get(0) + "\n";

            Error error = new Error();
            error.error("Missing fields", string);
            return true;
        } else {
            return false;
        }
    }

}
