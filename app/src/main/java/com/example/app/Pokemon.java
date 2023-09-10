package com.example.app;

public class Pokemon {
    private String typing;
    private int hundoIV;
    private String counters[];

    public void setTyping(String typing){
        this.typing = typing;
    }

    public void setHundoIV(int hundoIV){
        this.hundoIV = hundoIV;
    }

    public void setCounters(String counters[]){
        for(int i = 0; i < counters.length; i++){
            this.counters[i] = counters[i];
        }
    }

    public String getTyping(){
        return typing;
    }

    public int getHundoIV(){
        return hundoIV;
    }
}
