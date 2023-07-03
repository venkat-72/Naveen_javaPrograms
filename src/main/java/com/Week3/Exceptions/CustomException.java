package com.Week3.Exceptions;
class MyException extends RuntimeException{
    MyException(String str){
        super(str);
    }
}
public class CustomException {
    public static void main(String[] args){
        try{
            int val=5/0;
            System.out.println(val);
        }catch (RuntimeException e){
            throw new MyException("Custom Exception");
        }
    }
}
