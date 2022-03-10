package com.cg.mcq;


class C{
	Order(){
		System.out.println("Cat");
		}
		public static void main(String... Args){
		Order obj = new Order();
		System.out.println("Ant");
		}
		static{
		System.out.println("Dog");
		}
		{
		System.out.println("Man");
		}
}