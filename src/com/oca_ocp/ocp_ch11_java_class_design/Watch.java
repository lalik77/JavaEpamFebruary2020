package com.oca_ocp.ocp_ch11_java_class_design;



// Q 25
class SmartWatch extends Watch {
    final int secret = 3;
    private String getType() {return "smart watch";}
    public String getName(String suffix) {

        return getType() + suffix;
    }


}

public class Watch {
    final int secret = 5;

    private String getType() {return "watch";}
    public String getName(String suffix) {
        return getType() + suffix;
    }

    public static void main(String[] args) {
        Watch watch = new Watch();
        SmartWatch smartWatch = new SmartWatch();
        System.out.println(watch.getName(","));
        System.out.println(smartWatch.getName(","));
        Watch ws = new SmartWatch();
        System.out.println(ws.getName(","));

        System.out.println("----------------------------");

        System.out.println("watch.secret " + watch.secret); // 5
        System.out.println("smartwatch.secret " + smartWatch.secret); // 3
        System.out.println("ws.secret " + ws.secret); // 3
    }


}
