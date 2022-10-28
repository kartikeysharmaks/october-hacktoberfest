class Solution {
    public int romanToInt(String str) {
        HashMap<Character,Integer> map=new HashMap<>();

        map.put('M',1000);

        map.put('D',500);

        map.put('C',100);

        map.put('L',50);

        map.put('X',10);

        map.put('V',5);

        map.put('I',1);

        

        int res=map.get(str.charAt(str.length()-1));

        for(int i=str.length()-2;i>=0;i--){

            if(map.get(str.charAt(i))<map.get(str.charAt(i+1))){

                res-=map.get(str.charAt(i));

            }

            else{

                res+=map.get(str.charAt(i));

            }

        }

        return res;
    }
}
