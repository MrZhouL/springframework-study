/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Div
 * Author:   zhoulei
 * Date:     2018/4/25 下午12:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package concurrentassemblyline;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhoulei
 * @create 2018/4/25
 * @since 1.0.0
 */
public class Div implements Runnable{
    public static BlockingQueue<Msg> bq = new LinkedBlockingDeque<Msg>();

    @Override
    public void run() {
        while (true){
            try {
                Msg msg = bq.take();
                msg.i = msg.i / 2;
                System.out.println(msg.orgStr + "= "+ msg.i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
