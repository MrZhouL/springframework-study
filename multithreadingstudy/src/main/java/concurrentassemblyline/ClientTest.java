/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/25 下午12:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package concurrentassemblyline;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhoulei
 * @create 2018/4/25
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) {
        new Thread(new Plus()).start();
        new Thread(new Multiply()).start();
        new Thread(new Div()).start();

        Opertion opertion = new Opertion();

        long dStartTimes = System.currentTimeMillis();
        for(int i = 1;i<=1000;i++){
            for (int j = 1; j <= 100; j++){
                Msg msg = new Msg();
                msg.i = i;
                msg.j = j;
                msg.orgStr = "(("+i+"+"+j+")*"+i+")/2";
                Plus.bq.add(msg);
                //opertion.jisuan(msg);
            }
        }
        long endTimes = System.currentTimeMillis();
        System.out.print("用时：");
        System.out.println(endTimes - dStartTimes);
    }
}
