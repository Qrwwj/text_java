package com.util;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */



//单列模式

public class SingLeton {
    private  SingLeton(){}
    private static volatile SingLeton instance=null;
    public static SingLeton getInstance(){
        if (instance==null){
            synchronized (SingLeton.class){
                if (instance==null){
                    instance=new SingLeton();
                }
            }
        }
        return instance;
    }
}
