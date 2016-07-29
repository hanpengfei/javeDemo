package com.hpf.demo.pattern;

import java.util.concurrent.BlockingQueue;

/**
 * Created by hanpengfei on 2016/3/3.
 */
public class ProducerConsumerPattern {
    public class Prodecter implements Runnable{
        private BlockingQueue queue;
        public Prodecter(BlockingQueue queue){
             this.queue=queue;
        }

        @Override
        public void run() {

        }
        public void product(int t) throws InterruptedException {
            queue.put(t);
        }
    }
}
