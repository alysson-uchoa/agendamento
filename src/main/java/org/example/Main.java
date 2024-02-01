package org.example;

import Cadastro.Employee;
import Cadastro.Procedure;
import CashRegister.CashRegister;
import Schedule.ToSchedule;

import java.util.ArrayList;
import java.util.Scanner;

import static Enum.EnumMain.REGISTER;
import static Enum.EnumSchedule.PROCEDURE;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Procedure> procedures;
    static ArrayList<Employee> employees;
    static ArrayList<CashRegister> cashRegisters;
    static ArrayList<ToSchedule> toSchedules;
    public static void main(String[] args) {

        procedures = new ArrayList<Procedure>();
        employees = new ArrayList<Employee>();
        cashRegisters = new ArrayList<CashRegister>();
        toSchedules = new ArrayList<ToSchedule>();
        menuMain();
    }

    private static void menuMain()
    {
        System.out.println("""
                ------------------------
                ****    MenuMain    ****
                **** 1. Register    ****
                **** 2. To Schedule ****
                **** 3. Schedule    ****
                **** 4. Exit        ****
                ------------------------""");

        int optionMain = input.nextInt();

        switch (optionMain)
        {
            case 1:
                register();
                break;

            case 3:
                to_Schedule();
                break;
        }
    }

    private static void register()
    {
        System.out.println("""
                ---------------------------------
                  ****    Menu Schedule    ****
                **** 1. Add Procedure        ****
                **** 2. Show Procedure       ****
                **** 3. Edit Procedure       ****
                **** 4. Delete Procedure     ****
                **** 5. Add Employee         ****
                **** 6. Show Employee        ****
                **** 7. Edit Employee        ****
                **** 8. Delete Employee      ****
                **** 9. To Back Main Menu    ****
                **** 0. Exit                 ****
                -----------------------------""");

        int optionSchedule = input.nextInt();

        switch (optionSchedule)
        {
            case 1:
                addProcedure();
                break;

            case 2:
                showProcedure();
                break;

            case 9:
                menuMain();
                break;
        }
    }


    private static void addProcedure()
    {
        System.out.println("Name of the procedure");
        String name = input.next();

        Procedure procedure = new Procedure(name);
        procedures.add(procedure);

        System.out.println("Procedure added successfully");

        System.out.println("""
                Type:
                1. To back menu Schedule
                2. for Add new Procedure
                3. exit""");

        int optionProcedure = input.nextInt();

        switch (optionProcedure)
        {
            case 1:
                register();
                break;

            case 2:
                addProcedure();
                break;

            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("invalid option");
                break;

        }
    }

    private static void showProcedure() {
        if(procedures.size()>0)
        {
            for(Procedure list_procedure: procedures)
            {
                System.out.println(list_procedure);
            }
        }

        // perguntar se pode colocar o retorno depois do for, tirar o else e colocar o método register()
        else
        {
            System.out.println("There are no registered procedures");
        }

        register();
    }

    private static void addEmployee()
    {
        System.out.println("Name of the employeer");
        String name = input.next();

        System.out.println("""
                type 
                1. for Director
                2. for Manager
                3. for Seller
                4. for receptionist""");
        int position = input.nextInt();

        System.out.println("Type the value of the salary");
        double salary = input.nextDouble();

        Employee employee = new Employee(name, position, salary);
        employees.add(employee);

    }

    private static void cash()
    {
        System.out.println("""
                ------------------------------
                   ****    Menu Cash    ****
                **** 1. Add Pay           ****
                **** 2. Show Pay          ****
                **** 3. Edit Pay          ****
                **** 4. Delete Pay        ****
                **** 5. To Back Main Menu ****
                **** 6. Exit              ****
                ------------------------------""");

        int optionCash = input.nextInt();

        switch (optionCash)
        {
            case 1:
                addPay();
        }
    }

    private static void to_Schedule()
    {
        if (procedures.size() > 0)
        {
            ToSchedule toSchedule = new ToSchedule();
            toSchedules.add(toSchedule);
            menuMain();
        }

        else
        {
            System.out.println("There are no registered procedures");
            menuMain();
        }
    }

    private static void addPay() {
        System.out.println("Type the value total of the procedure");
        double total = input.nextDouble();
    }


}