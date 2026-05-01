
package com.agent.agent;
import com.agent.core.*;

public class FixAgent implements Agent {
    public void run(Context ctx){
        ctx.fixed = ctx.code.replace("exec","//exec_removed");
    }
}
