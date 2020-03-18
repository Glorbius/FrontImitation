package WorkWithSql;

import java.sql.*;
import java.util.Scanner;

public class MainSql {


    public static void main(String[] args) throws SQLException {

        Scanner scanmenu1 = new Scanner(System.in);
        Scanner scanmenu2 = new Scanner(System.in);
        Scanner scanmenu3 = new Scanner(System.in);
        Scanner scanmenu4 = new Scanner(System.in);
        Scanner scanmenu5 = new Scanner(System.in);
        Scanner scanafter4 = new Scanner(System.in);


        int choice = 0, choice1 = 0, choice3 = 0, choice4 = 0, choice5 = 0, choice6 = 0;

        Menu.hi();

        while (choice != 5) {
            Menu.glavMenu();
            choice = scanmenu1.nextInt();

            if (choice == 1) {
                WorkWithTable.plusperson();
                choice1 = 0;


                while (choice1 != 2) {
                    Menu.menu1();
                    choice1 = scanmenu2.nextInt();
                    if (choice1 == 1) {
                        WorkWithTable.plusperson();
                    }
                }
            }

            if (choice == 2) {
                choice3 = 0;
                while (choice3 != 6) {
                    Menu.menu2();
                    choice3 = scanmenu3.nextInt();

                    if (choice3 == 1) {
                        ShowTable.showTable();
                        WorkWithTable.changeName();
                    }

                    if (choice3 == 2) {
                        ShowTable.showTable();
                        WorkWithTable.changeAge();
                    }
                    if (choice3 == 3) {
                        ShowTable.showTable();
                        WorkWithTable.changeLegSize();
                    }
                    if (choice3 == 4) {
                        ShowTable.showTable();
                        WorkWithTable.changeSex();
                    }
                    if (choice3 == 5) {
                        ShowTable.showTable();
                        WorkWithTable.changeStatus();
                    }
                }
            }
            if (choice == 3) {
                choice4 = 0;
                ShowTable.showTable();
                WorkWithTable.deletePerson();
                Menu.menu3();
                choice4 = scanmenu4.nextInt();
                if (choice4 == 1) {
                    ShowTable.showTable();
                    WorkWithTable.deletePerson();

                }

            }


            if (choice == 4) {
                choice5 = 0;
                while (choice5 != 4) {
                    Menu.menu4();
                    choice5 = scanmenu5.nextInt();
                    if (choice5 == 1) {
                        ShowTable.showTable();
                        choice6 = 0;
                        while (choice6 != 1) {
                            Menu.menuAfter4();
                            choice6 = scanafter4.nextInt();

                        }
                    }
                    if (choice5 == 2) {
                        ShowTable.showOver();
                        choice6 = 0;
                        while (choice6 != 1) {
                            Menu.menuAfter4();
                            choice6 = scanafter4.nextInt();
                        }
                    }
                    if (choice5 == 3) {
                        ShowTable.showless21();
                        choice6 = 0;
                        while (choice6 != 1) {
                            Menu.menuAfter4();
                            choice6 = scanafter4.nextInt();
                        }
                    }
                }


            }
        }
    }
}











