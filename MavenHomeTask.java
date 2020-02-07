package com.epam.JyothirmayeeKankanala_maven;

import java.util.*;
class gift
{
int n_types;
ArrayList<chocolates> chocos;
public gift()
{
chocos=new ArrayList<chocolates>();
}
}
class sweets
{
int weight,price;
}
class chocolates extends sweets
{
 int no_chocos;
 String name;
 public chocolates(String name1,int no_chocos1,int weight1,int price1)
 {
     name=name1;
     no_chocos=no_chocos1;
     weight=weight1;
     price=price1;
 }
}


public class MavenHomeTask
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of children");
    int no_children=sc.nextInt();
    int n_types;
    for(int i=0;i<no_children;i++)//reading the inputs
   {	
	System.out.println("Enter no. of types of chocolates");
	gift temp_gift=new gift();
	n_types=sc.nextInt();
	temp_gift.n_types=n_types;
	temp_gift.chocos=new ArrayList<chocolates>();
	for(int j=0;j<n_types;j++)
	{
		System.out.println("Enter name,no. of chocolates,weight,price of type "+(j+1));
		String name=sc.next();
		int n=sc.nextInt();
		int wt=sc.nextInt();
		int price=sc.nextInt();
		chocolates now=new chocolates(name,n,wt,price);
		temp_gift.chocos.add(now);
	}
//finding total weight of chocolates
    int total_wt=0;
	for(int j=0;j<temp_gift.chocos.size();j++)
	total_wt+=temp_gift.chocos.get(j).weight*temp_gift.chocos.get(j).no_chocos;
    System.out.println("Total weight of all chocolates: "+total_wt);
//sorting the chocolates based on option
    System.out.println("Enter to sort based on  1->no. of chocolates    2->weight of chocolates 3->price of chocolate");
    int option=sc.nextInt();
	switch(option)
	{
		case 1 : for(int j=0;j<temp_gift.chocos.size();j++)
					{
					    for(int k=1;k<temp_gift.chocos.size();k++)
					    if(temp_gift.chocos.get(j).no_chocos>temp_gift.chocos.get(k).no_chocos)
					    {
					        int p_n=temp_gift.chocos.get(j).no_chocos;
					        String n_n=temp_gift.chocos.get(j).name;
					        int p_w=temp_gift.chocos.get(j).weight;
					        int p_p=temp_gift.chocos.get(j).price;
					        temp_gift.chocos.get(j).no_chocos=temp_gift.chocos.get(k).no_chocos;
					        temp_gift.chocos.get(j).name=temp_gift.chocos.get(k).name;
					        temp_gift.chocos.get(j).weight=temp_gift.chocos.get(k).weight;
					        temp_gift.chocos.get(j).price=temp_gift.chocos.get(k).price;
					        temp_gift.chocos.get(k).name=n_n;
					        temp_gift.chocos.get(k).weight=p_w;
					        temp_gift.chocos.get(k).no_chocos=p_n;
					        temp_gift.chocos.get(k).price=p_p;
					    }
					}
					System.out.print("After sorting : ");
					for(int j=0;j<temp_gift.chocos.size();j++)
					System.out.println(temp_gift.chocos.get(j).name+" "+temp_gift.chocos.get(j).no_chocos+" "+temp_gift.chocos.get(j).weight+" "+temp_gift.chocos.get(j).price);

			break;
		case 2 : for(int j=0;j<temp_gift.chocos.size();j++)
					{
					    for(int k=1;k<temp_gift.chocos.size();k++)
					    if(temp_gift.chocos.get(j).weight>temp_gift.chocos.get(k).weight)
					    {
					        int p_n=temp_gift.chocos.get(j).no_chocos;
					        String n_n=temp_gift.chocos.get(j).name;
					        int p_w=temp_gift.chocos.get(j).weight;
					        int p_p=temp_gift.chocos.get(j).price;
					        temp_gift.chocos.get(j).no_chocos=temp_gift.chocos.get(k).no_chocos;
					        temp_gift.chocos.get(j).name=temp_gift.chocos.get(k).name;
					        temp_gift.chocos.get(j).weight=temp_gift.chocos.get(k).weight;
					        temp_gift.chocos.get(j).price=temp_gift.chocos.get(k).price;
					        temp_gift.chocos.get(k).name=n_n;
					        temp_gift.chocos.get(k).weight=p_w;
					        temp_gift.chocos.get(k).no_chocos=p_n;
					        temp_gift.chocos.get(k).price=p_p;
					    }
					}
					System.out.print("After sorting : ");
					for(int j=0;j<temp_gift.chocos.size();j++)
					System.out.println(temp_gift.chocos.get(j).name+" "+temp_gift.chocos.get(j).no_chocos+" "+temp_gift.chocos.get(j).weight+" "+temp_gift.chocos.get(j).price);

			break;
		case 3 : for(int j=0;j<temp_gift.chocos.size();j++)
					{
					    for(int k=1;k<temp_gift.chocos.size();k++)
					    if(temp_gift.chocos.get(j).price>temp_gift.chocos.get(k).price)
					    {
					        int p_n=temp_gift.chocos.get(j).no_chocos;
					        String n_n=temp_gift.chocos.get(j).name;
					        int p_w=temp_gift.chocos.get(j).weight;
					        int p_p=temp_gift.chocos.get(j).price;
					        temp_gift.chocos.get(j).no_chocos=temp_gift.chocos.get(k).no_chocos;
					        temp_gift.chocos.get(j).name=temp_gift.chocos.get(k).name;
					        temp_gift.chocos.get(j).weight=temp_gift.chocos.get(k).weight;
					        temp_gift.chocos.get(j).price=temp_gift.chocos.get(k).price;
					        temp_gift.chocos.get(k).name=n_n;
					        temp_gift.chocos.get(k).weight=p_w;
					        temp_gift.chocos.get(k).no_chocos=p_n;
					        temp_gift.chocos.get(k).price=p_p;
					    }
					}
					System.out.print("After sorting : ");
					for(int j=0;j<temp_gift.chocos.size();j++)
					System.out.println(temp_gift.chocos.get(j).name+" "+temp_gift.chocos.get(j).no_chocos+" "+temp_gift.chocos.get(j).weight+" "+temp_gift.chocos.get(j).price);
			break;
	}
//finding no. of chocolates in betweeen predefined range of options
   int range=0;
   System.out.println("Ënter 1->to get no. of chocos whose weight is in between 5 to 10 grams \n       2->whose price is in between 10 to 100");
   int opt=sc.nextInt();
   if(opt==1)
  {
		for(int j=0;j<temp_gift.chocos.size();j++)
			if(temp_gift.chocos.get(j).weight >=5 && temp_gift.chocos.get(j).weight<=10)
				range+=temp_gift.chocos.get(j).no_chocos;
	System.out.println("No. of chocolates whose weight is in range of 5-10 grams :"+range);
   }
   else
   {
	for(int j=0;j<temp_gift.chocos.size();j++)
			if(temp_gift.chocos.get(j).price >=10 && temp_gift.chocos.get(j).price<=100)
				range+=temp_gift.chocos.get(j).no_chocos;
	System.out.println("No. of chocolates whose price is in range of 10-100  :"+range);
   }
}
    sc.close();
    }
}
