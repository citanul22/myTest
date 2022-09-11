package codeTest;

import java.util.ArrayList;

class Solution {
    public String solution(int num) {
       ArrayList<Integer> arrayList = init();
        input(arrayList, num);
        return calculate(arrayList);
    }
    
    public ArrayList<Integer> init(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
       return arrayList;
    }
    public void input(ArrayList<Integer> arrayList, int num){
         arrayList.add(num);
    }
    public String calculate(ArrayList<Integer> arrayList){
        if(arrayList.get(0) % 2 == 1)
            return "Odd";
        return "Even";
    }
}
