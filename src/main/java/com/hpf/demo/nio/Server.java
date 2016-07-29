package com.hpf.demo.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * Created by hanpengfei on 2016/3/2.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel socketChannel = ServerSocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.socket().bind(new InetSocketAddress(80));
        Selector open = Selector.open();
        socketChannel.register(open, SelectionKey.OP_ACCEPT);
        open.select();
    }

}
