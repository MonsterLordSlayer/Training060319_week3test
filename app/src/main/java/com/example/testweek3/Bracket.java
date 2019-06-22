package com.example.testweek3;

import java.util.ArrayList;
import java.util.Arrays;

public class Bracket {
    //b1=[ b2={ b3=(
    static boolean result=true;

    public static boolean usestack(String string){
        ArrayList<Character> stack=new ArrayList<>();
        char[] charcopy;
        charcopy=string.toCharArray();

        for (int i=0;i<charcopy.length;i++){
            if (charcopy[i]=='('||charcopy[i]=='{'||charcopy[i]=='['){
                stack.add(charcopy[i]);
            }
            else if (charcopy[i]==']'){
                if (stack.size()>0 && stack.get(stack.size()-1)=='['){
                    stack.remove(stack.size()-1);
                }
                else return false;

            }
            else if (charcopy[i]=='}'){
                if (stack.size()>0 && stack.get(stack.size()-1)=='{'){
                    stack.remove(stack.size()-1);

                }
                else return false;

            }
            else if (charcopy[i]==')'){
                if (stack.size()>0 && stack.get(stack.size()-1)=='('){
                    stack.remove(stack.size()-1);

                }
                else return false;

            }
        }
        return true;

    }
    public static boolean closebracket(String string){
        char[] charcopy;
        charcopy=string.toCharArray();
        for (int i=0;i<charcopy.length;i++){
            int location=i;

            if (charcopy[i]=='['){

                for (int j=i+1;j<charcopy.length;j++){
                    if (charcopy[j]==']'){

                        location=j;
                    }
                }
                if (location==i) {

                    result= false;
                }
                else{
                    charcopy[i]='x';
                    charcopy[location]='x';
                    if (result==true){
                        StringBuilder str=new StringBuilder();
                        str.append("x");
                        for (int k=i+1;k<location;k++){
                            str.append(charcopy[k]);

                        }
                        result=closebracket(str.toString());
                    }




                }

            }
            else if (charcopy[i]=='{'){

                for (int j=i+1;j<charcopy.length;j++){
                    if (charcopy[j]=='}'){

                        location=j;
                    }
                }
                if (location==i) {
                    result= false;
                }
                else{
                    charcopy[i]='x';
                    charcopy[location]='x';
                    if (result==true){
                        StringBuilder str=new StringBuilder();
                        str.append("x");
                        for (int k=i+1;k<location;k++){
                            str.append(charcopy[k]);

                        }
                        result=closebracket(str.toString());
                    }



                }
            }
            else if (charcopy[i]=='('){

                for (int j=i+1;j<charcopy.length;j++){
                    if (charcopy[j]=='}'){

                        location=j;
                    }
                }
                if (location==i) {
                    result= false;
                }
                else{
                    charcopy[i]='x';
                    charcopy[location]='x';
                    if (result==true){
                        StringBuilder str=new StringBuilder();
                        str.append("x");
                        for (int k=i+1;k<location;k++){
                            str.append(charcopy[k]);

                        }
                        result=closebracket(str.toString());
                    }



                }
            }
        }
        for (int i=0;i<charcopy.length;i++){
            if (charcopy[i]==']' ||charcopy[i]=='}'||charcopy[i]==')'){
                result=false;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(usestack("{}{}()"));

        System.out.println(closebracket("{(})"));
    }
}

