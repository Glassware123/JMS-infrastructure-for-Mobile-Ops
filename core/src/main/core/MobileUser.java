package core;


public class MobileUser {
    public int elapsedTime(){
        Long startTime = System.currentTimeMillis();
        Long estimatedTime = System.currentTimeMillis() - startTime;
        return Integer.valueOf(estimatedTime.intValue());
    }
    public int ifCallSomeBody(Integer currentCredit,Integer currentMinutes){
        currentCredit=100;
        currentMinutes=80;
        if (currentMinutes>0){
            currentMinutes=currentMinutes-elapsedTime();
        }else if(currentCredit>0){
            currentCredit=currentCredit-elapsedTime()*4/10;
        }
        return 1;
    }
}
