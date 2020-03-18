package kz.lesson.dbpractic.scaner;

import kz.lesson.dbpractic.model.User;

import java.util.Scanner;

public class ScanerDeply {
    Scanner scanId = new Scanner(System.in);
    Scanner scanName = new Scanner(System.in);
    Scanner scanLegsize = new Scanner(System.in);
    Scanner scanAge = new Scanner(System.in);
    Scanner scanSex = new Scanner(System.in);
    Scanner scanStatus = new Scanner(System.in);


    public User getPersone() {

        User member = new User();

        try {
            System.out.println(" Введите: ");
            System.out.println("Имя: ");
            member.setName(scanName.nextLine());
            System.out.println("Возраст: ");
            member.setAge(scanAge.nextInt());
            System.out.println("Размер ноги: ");
            member.setLegSize(scanLegsize.nextInt());
            System.out.println("Пол: ");
            member.setSex(scanSex.nextLine());
            System.out.println("Статус :");
            member.setStatus(scanStatus.nextLine());


        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }


    public User getPersoneName() {

        User member = new User();

        try {
            System.out.println("Введите id человека: ");
            member.setId(scanId.nextInt());
            System.out.println(" Введите обновленное имя: ");
            member.setName(scanName.nextLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }

    public User getPersoneAge() {

        User member = new User();

        try {
            System.out.println("Введите id человека: ");
            member.setId(scanId.nextInt());
            System.out.println(" Введите обновленный возраст: ");
            member.setAge(scanAge.nextInt());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }

    public User getPersoneLegsize() {

        User member = new User();

        try {
            System.out.println("Введите id человека: ");
            member.setId(scanId.nextInt());
            System.out.println(" Введите обновленный размер: ");
            member.setLegSize(scanLegsize.nextInt());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }

    public User getPersoneSex() {

        User member = new User();

        try {
            System.out.println("Введите id человека: ");
            member.setId(scanId.nextInt());
            System.out.println(" Введите обновленный пол: ");
            member.setSex(scanSex.nextLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }

    public User getPersoneStatus() {

        User member = new User();

        try {
            System.out.println("Введите id человека: ");
            member.setId(scanId.nextInt());
            System.out.println(" Введите обновленный статус: ");
            member.setStatus(scanStatus.nextLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }


}




