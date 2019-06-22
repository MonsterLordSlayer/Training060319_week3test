package com.example.testweek3;

public class Sub {
    public static boolean strCopy(String string,String sub,int num){
        if (num==0) return true;
        String stringcopy=string.replaceFirst(sub,"");
        if (stringcopy.equals(string)){
            return false;
        }

        return strCopy(stringcopy,sub,num-1);
    }
    public static void main(String[] args) {
        System.out.println(strCopy("ssdsdsdMonsterLordSlayersdsdsdsMonsterLordSlayerdsdsds","MonsterLordSlayer",2));
    }
}
