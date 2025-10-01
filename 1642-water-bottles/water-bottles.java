class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int x=0;
        int a=0;
        int b=0;
        
        x=numBottles/numExchange;
        b=numBottles%numExchange;
            
        while((b+x)>=numExchange){
            int temp = (b + x) / numExchange;  
            b = (b + x) % numExchange;      
            x = temp;                        
            a += x; 
        }
        return numBottles + a + (numBottles / numExchange);


        
    }
}