package com.ly.test;


import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

    public static void main(String[] args) {

        try {
            /*CompletableFuture<String> completableFuture=new CompletableFuture();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //模拟执行耗时任务
                    System.out.println("task doing...");
                    try {
                        Thread.sleep(3000);
                        System.out.println("ok");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //告诉completableFuture任务已经完成
                    completableFuture.complete("result");
                }
            }).start();
            //获取任务结果，如果没有完成会一直阻塞等待
            String result=completableFuture.get();
            System.out.println("计算结果:"+result);*/
            CompletableFuture result2 = result2();
            CompletableFuture result1 = result1();
            CompletableFuture result = CompletableFuture.allOf(result1,result2);
            result.join();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static CompletableFuture result1(){
        CompletableFuture<String> result1= CompletableFuture.supplyAsync(() -> {
            //模拟执行耗时任务
            System.out.println("task doing...");
            try {
                Thread.sleep(3000);
                System.out.println("ok");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "result1";
        });
        return result1;
    }

    public static CompletableFuture result2(){
        CompletableFuture result2 = CompletableFuture.supplyAsync( ()->{
            int a = 3/0;
            System.out.println("abc");
            return  "result2";
        });
        return result2;
    }
}
