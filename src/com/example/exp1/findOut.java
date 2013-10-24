package com.example.exp1;

import java.io.IOException;
import java.util.Locale;

class findOut {
    String nam1,nam2,rtrn;
    public findOut(String nam1,String nam2){
this.nam1=nam1;
this.nam2=nam2;
        }
    String findingOut () throws IOException{
        
 char flames[]={'f','l','a','m','e','s'};
 int ln1=nam1.length();
 int ln2=nam2.length();
 nam1.toUpperCase(Locale.ENGLISH);
 nam2.toUpperCase(Locale.ENGLISH);
 char[] arr1=nam1.toCharArray();
 char[] arr2=nam2.toCharArray();
 char[] nsar1=new char[100];
 char[] nsar2=new char[100];
 int left=0;
 int sp2=0;
 for(int tr=0;tr<ln2;tr++){

     if(arr2[tr]==' ')
         sp2++;
 }
 int sp1=0;
 for(int g=0;g<ln1;g++)
 { 
     if(arr1[g]==' ')
         sp1++;
 for(int h=0;h<ln2;h++)
 {

if (arr1[g]==arr2[h])
{
 left++;
arr2[h]='2';
arr1[g]='1';
}
}
}
int rem=(ln1+ln2)-(2*left)-sp1-sp2;
if(rem<=6)
{
switch(rem)
 {
 case 3:
rtrn="Friends";
break;
case 4:
rtrn="Enemies";
break;
case 5:
rtrn="Friends";
break;
case 6:
rtrn="Marriage";
break;
case 2:
rtrn="Enemies";
break;
 case 1:
rtrn="Sisters";
break;
}
}
else{
char[] swap=new char[100];
char store[]=new char[100];
int f6=6;
 for(int f5=0;f5<5;f5++,f6--)
 {

 int del=rem%f6;
 if(del==0)
     del=f6;

 for(int f=0;f<f6;f++,++del)
 {
     if(del>=f6)
     {
         del=0;
     }
     store[f]=flames[del];
 }

 for (int h=0;h<f6;h++)
{
swap[h]=store[h];
store[h]=flames[h];
flames[h]=swap[h];
}
                        }
switch(flames[0])
{
    case 'f':
rtrn="Friends";
break;
case 'l':
rtrn="Lovers";
break;
case 'a':
rtrn="Ancestors";
break;
case 'm':
rtrn="Marriage";
break;
case 'e':
rtrn="Enemies";
break;
 case 's':
rtrn="Sisters";
break;
}
            }
return rtrn;
}
}
