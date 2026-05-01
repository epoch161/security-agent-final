
package com.agent.core;
import org.json.JSONObject;
import java.util.*;

public class Context {
    public String code;
    public String fixed;
    public List<String> issues = new ArrayList<>();

    public String toJSON(){
        JSONObject o = new JSONObject();
        o.put("issues", issues);
        o.put("fixed", fixed);
        return o.toString(2);
    }
}
