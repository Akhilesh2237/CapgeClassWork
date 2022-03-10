package com.cg.insetInteger.arraylist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

class One{
int var1;
One (int x){
var1 = x;
}}
class Derived extends One{
int var2;
void display(){
System.out.println("var 1="+var1+"var2="+var2);
}}

class Main{
public static void main(String[] args){
Derived obj = new Derived();
obj.display();
}}


