package com.cg.projectmanagementsystem;

public class ProductNotFoundException extends Exception{
String exMessage;

public ProductNotFoundException(String exMessage) {
super(exMessage);
this.exMessage=exMessage;
}}
