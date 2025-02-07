
package com.mycompany.oop_final_project2;

import java.util.ArrayList;

interface main_user{
    public static String username = "Admin123";
    public static String password = "321nidmA";
    public static String test_account = "test_user";
    }

class account implements main_user{
    static ArrayList<String> orders = new ArrayList<>();
    static ArrayList<String> inventory = new ArrayList<>();
    static ArrayList<String> main_inventory = new ArrayList<>();
}

class back extends mainpage{}

abstract class balance {
    public static double cost = 0.00; 
    public static double total_balance = 300.00; 
    public static double upd_balance = total_balance-cost; 
    
}


