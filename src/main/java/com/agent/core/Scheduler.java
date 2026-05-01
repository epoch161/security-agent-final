
package com.agent.core;
import java.util.*;

public class Scheduler {
    List<Agent> agents = new ArrayList<>();
    public void add(Agent a){ agents.add(a); }

    public void run(Context ctx) throws Exception {
        for(Agent a: agents){
            System.out.println("Running: " + a.getClass().getSimpleName());
            a.run(ctx);
        }
    }
}
