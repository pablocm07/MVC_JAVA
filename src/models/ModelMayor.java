package models;


public class ModelMayor {
    int num1 = 9;
    int num2 = 6;
    int num3 = 3;
    int res = 9;
    
    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum3(){
        return num3;
    }
    public void setNum3(int num3){
        this.num3 = num3;
    }
    public int getRes(){
        return res;
    }
    public void setRes(int res){
        this.res = res;
    }
    
    public void mayor(){
        res = num1;
        if(num2>res){
            res = num2;
        }
        if(num3>res){
            res = num3;
        }
    }
}
