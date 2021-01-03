class Solution{
    public int maxProfit(int stocks[]){
        
        if(stocks.length==0){
            return 0;
        }
        
        int obsp =-stocks[0];
        int ossp =0;
        int ocsp =0;
        
        for(int i=0; i<stocks.length; i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
            
            //Bought state 
            if(ocsp - stocks[i] > obsp){
                nbsp = ocsp - stocks[i];
            }else {
                nbsp = obsp;
            }
            
            //For selling state 
            if(stocks[i] + obsp > ossp){
                nssp = stocks[i] + obsp;
            }else {
                nssp = ossp;
            }
            
            //For cooldown state 
            if(ossp > ocsp){
                ncsp = ossp;
            }else {
                ncsp = ocsp;
            }
            
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        
        return ossp;
    }
}
