
package com.agent.agent;
import com.agent.core.*;

public class AnalysisAgent implements Agent {
    public void run(Context ctx){
        for(String i: ctx.issues){
            System.out.println("Analysis: " + i);
        }
    }
}
