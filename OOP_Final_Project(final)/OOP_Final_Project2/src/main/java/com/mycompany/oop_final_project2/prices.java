/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_final_project2;

enum prices {
    default_val(0), Regular_Burger(2), Cheese_Burger(3.5), Big_Mac(5.25),
    Regular_Pizza(10), Cheese_Pizza(15), Vegetarian_Pizza(17.5),
    Regular_Fried_Chicken(3), Spicy_Fried_Chicken(3.5), Family_Size_Fried_Chicken(20),
    Regular_Spaghetti(2), Carbonara(3), Lasagna(15),
    Regular_Steak(10), T_Bone_Steak(25), Tomahawk_Steak(35),
    Small_Fries(2), Medium_Fries(3.5), Large_Fries(6),
    Small_Coke(1.5), Medium_Coke(3), Large_Coke(4.5),
    Small_Coke_Float(2.5), Medium_Coke_Float(5), Large_Coke_Float(7.5),
    Small_Lemonade(1.5), Medium_Lemonade(3), Large_Lemonade(4.5),
    Per_Slice_Apple_Pie(3), Whole_Apple_Pie(24),
    Chocolate_Cupcake(1.25), Strawberry_Cupcake(1.25), Caramel_Cupcake(1.25),
    Per_Slice_Chocolate_Cake(2.5), Whole_Chocolate_Cake(30),
    Chocolate_Ice_Cream(2.5), Strawberry_Ice_Cream(2.5), Caramel_Ice_Cream(2.5);
    double val;
    prices(double val){
        this.val=val;
    }
    public double getValue(){
        return val;
    }
}
