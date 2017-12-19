package com.paganini.nio;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import com.paganini.nio.pool.NioSelectorRunnablePool;

/**
 * <p>启动函数</p>
 * @author paganini
 * @version $Id: Start.java, v 0.1 2017年12月19日 下午2:50:14 qiuzhongtian Exp $
 */
public class Start {

    public static void main(String[] args) {

        //初始化线程
        NioSelectorRunnablePool nioSelectorRunnablePool = new NioSelectorRunnablePool(
            Executors.newCachedThreadPool(), Executors.newCachedThreadPool());

        //获取服务类
        ServerBootstrap bootstrap = new ServerBootstrap(nioSelectorRunnablePool);

        //绑定端口
        bootstrap.bind(new InetSocketAddress(10101));

        System.out.println("start");
    }

}
