
package com.agent.agent;
import com.agent.core.*;

public class ScannerAgent implements Agent {
    public void run(Context ctx){
        if(ctx.code.contains("exec")){
            ctx.issues.add("command injection risk");
        }
    }
}
