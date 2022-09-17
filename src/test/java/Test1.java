import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class Test1 {

    private String message;

    @Before
    public void init() {
        message = "{\"localParams\":[],\"resourceList\":[],\"delayTime\":0,\"pluginId\":2,\"pluginParmas\":{\"tableConfig\":[{\"confidence\":50,\"delay\":15,\"location\":[\"aaa\"],\"isMaster\":true},{\"confidence\":10,\"delay\":15,\"location\":[\"aaa\"],\"isMaster\":true}],\"assistWait\":30},\"checkInterval\":5,\"checkTime\":30,\"inputTable\":[],\"outTable\":[]}";
    }

    @Test
    // fastjson
    public void testFastJson() {

        Pojo pojo = JSON.parseObject(message, Pojo.class);

        System.out.println("pojo = " + pojo);

        System.out.println("====================");

        Map<String, String> pluginParmas = pojo.getPluginParmas();
        String tableConfig = pluginParmas.get("tableConfig");
        String assistWait = pluginParmas.get("assistWait");
        System.out.println("assistWait = " + assistWait);
        for (Object obj : JSONArray.parseArray(tableConfig)) {
            System.out.println("o = " + obj);
        }

    }

    @Test
    //我们公司用的
    public void testJackson() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Pojo pojo = mapper.readValue(message, Pojo.class);
        System.out.println("pojo = " + pojo);
    }

    @Test
    public void testGson() {
        Gson gson = new Gson();
        Pojo pojo = gson.fromJson(message, Pojo.class);
        System.out.println("pojo = " + pojo);
    }
}
