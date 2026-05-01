
package com.agent.agent;
import com.agent.core.*;

public class ValidationAgent implements Agent {
    public void run(Context ctx){
        if(!ctx.fixed.contains("exec")){
            System.out.println("Fix valid");
        }else{
            System.out.println("Fix failed");
        }
    }
}
