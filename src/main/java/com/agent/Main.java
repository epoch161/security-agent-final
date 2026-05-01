
package com.agent;

import com.agent.core.*;
import com.agent.agent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Context ctx = new Context();
        ctx.code = "public class A { public static void main(String[] a)throws Exception{Runtime.getRuntime().exec(a[0]);}}";

        Scheduler scheduler = new Scheduler();
        scheduler.add(new ScannerAgent());
        scheduler.add(new AnalysisAgent());
        scheduler.add(new FixAgent());
        scheduler.add(new ValidationAgent());
        scheduler.run(ctx);

        System.out.println("FINAL REPORT:");
        System.out.println(ctx.toJSON());
    }
}
