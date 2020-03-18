package WorkWithSql;

import java.util.Scanner;

public class ScanerDeply {


    public User getPersone() {

        Scanner scanname = new Scanner(System.in);
        Scanner scanlegsize = new Scanner(System.in);
        Scanner scanage = new Scanner(System.in);
        Scanner scansex = new Scanner(System.in);
        Scanner scanstatus = new Scanner(System.in);
        User member = new User();

        System.out.println(" Введите: ");
        System.out.println("Имя: ");
        member.setName(scanname.nextLine());
        System.out.println("Возраст: ");
        member.setAge(scanage.nextInt());
        System.out.println("Размер ноги: ");
        member.setLegSize(scanlegsize.nextInt());
        System.out.println("Пол: ");
        member.setSex(scansex.nextLine());
        System.out.println("Статус :");
        member.setStatus(scanstatus.nextLine());

        return member;
    }

}
