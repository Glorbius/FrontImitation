package kz.lesson.dbpractic;

import kz.lesson.dbpractic.menu.Menu;
import kz.lesson.dbpractic.model.User;
import kz.lesson.dbpractic.request.Request;
import kz.lesson.dbpractic.scaner.ScanerDeply;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {

        Scanner scanmenu1 = new Scanner(System.in);
        Scanner scanmenu2 = new Scanner(System.in);
        Scanner scanmenu3 = new Scanner(System.in);
        Scanner scanmenu4 = new Scanner(System.in);
        Scanner scanmenu5 = new Scanner(System.in);
        Scanner scanafter4 = new Scanner(System.in);
        Scanner scanId = new Scanner(System.in);


        int choice = 0, choice1 = 0, choice3 = 0, choice4 = 0, choice5 = 0, choice6 = 0;

        Menu.hi();

        while (choice != 5) {
            Menu.glavMenu();
            choice = scanmenu1.nextInt();

            if (choice == 1) {
                ScanerDeply scanner = new ScanerDeply();
                User member = scanner.getPersone();
                Request.add(member);


                choice1 = 0;


                while (choice1 != 2) {
                    Menu.menu1();
                    choice1 = scanmenu2.nextInt();
                    if (choice1 == 1) {
                        ScanerDeply scanner1 = new ScanerDeply();
                        User member1 = scanner1.getPersone();
                        Request.add(member1);
                    }
                }
            }

            if (choice == 2) {
                choice3 = 0;
                while (choice3 != 6) {
                    Menu.menu2();
                    choice3 = scanmenu3.nextInt();

                    if (choice3 == 1) {

                        System.out.println("Весь список домашки: ");
                        Request.getAll();

                        ScanerDeply scanner = new ScanerDeply();
                        User member = scanner.getPersoneName();
                        Request.changeName(member);


                    }

                    if (choice3 == 2) {
                        System.out.println("Весь список домашки: ");
                        Request.getAll();


                        ScanerDeply scanerDeply = new ScanerDeply();
                        User member = scanerDeply.getPersoneAge();
                        Request.changeAge(member);

                    }
                    if (choice3 == 3) {
                        System.out.println("Весь список домашки: ");
                        Request.getAll();


                        ScanerDeply scanerDeply = new ScanerDeply();
                        User member = scanerDeply.getPersoneLegsize();

                        Request.changeLegsize(member);

                    }
                    if (choice3 == 4) {

                        System.out.println("Весь список домашки: ");
                        Request.getAll();


                        ScanerDeply scanerDeply = new ScanerDeply();
                        User member = scanerDeply.getPersoneSex();

                        Request.changeSex(member);

                    }
                    if (choice3 == 5) {
                        System.out.println("Весь список домашки: ");
                        Request.getAll();


                        ScanerDeply scanerDeply = new ScanerDeply();
                        User member = scanerDeply.getPersoneStatus();

                        Request.changeStatus(member);

                    }
                }
            }
            if (choice == 3) {
                choice4 = 0;
                System.out.println("Весь список домашки: ");
                Request.getAll();

                System.out.println("Введите id человека: ");
                Request.delete(scanId.nextInt());

                while (choice4 != 2) {
                    Menu.menu3();

                    choice4 = scanmenu4.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Весь список домашки: ");
                        Request.getAll();

                        System.out.println("Введите id человека: ");

                        Request.delete(scanId.nextInt());
                    }
                }

            }


            if (choice == 4) {
                choice5 = 0;
                while (choice5 != 2) {
                    Menu.menu4();
                    choice5 = scanmenu5.nextInt();
                    if (choice5 == 1) {

                        System.out.println("Весь список домашки: ");
                        Request.getAll();

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


