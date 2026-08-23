class Solution {
    public boolean checkDivisibility(int n) {
        int og=n;
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
      
       while(n!=0){
                i=n%10;
                arr.add(i);
                n=n/10;   
       }
       int sum=0;
       int prod=1;
     for (int j = 0; j < arr.size(); j++) {

            sum += arr.get(j);
            prod *= arr.get(j);
        }
    int result=sum+prod;
       if((og%result)==0){
        return true;
       }
       return false;
        }
    }
