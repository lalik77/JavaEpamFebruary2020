package com.oca_ocp.ocp_ch23_practice_exam;

//Q79

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Plan {

    private ExecutorService service = Executors.newCachedThreadPool();

    private ScheduledExecutorService scheduledservice = Executors.newSingleThreadScheduledExecutor();





    public void planEvents () {

        service.execute( ()-> System.out.println("Take out trash!"));

        // not compile even the reference was correct
       /* scheduledservice.scheduleWithFixedDelay( ()-> System.out.println("Check food stock"),
                   1, TimeUnit.HOURS); */

       scheduledservice.scheduleWithFixedDelay( ()-> System.out.println("Check drink stock"),
               1,10000,TimeUnit.SECONDS);

    }

    public static void main(String[] args) {
        new Plan().planEvents();
    }
}
