package com.paganini.nio.pool;

import java.nio.channels.ServerSocketChannel;

/**
 * <p>boss线程</p>
 * @author paganini
 * @version $Id: Boss.java, v 0.1 2017年12月19日 下午2:31:28 qiuzhongtian Exp $
 */
public interface Boss {
    
    /**
     * 加入一个新的ServerSocket
     * @param serverChannel
     */
    void registerAcceptChannelTask(ServerSocketChannel serverChannel);
}
