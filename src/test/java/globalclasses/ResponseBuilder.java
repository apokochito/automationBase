package globalclasses;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import domain.GetRequest;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class ResponseBuilder {

    JSONObject getExpectedResponse(String environment, GetRequest request) throws Throwable {
        JSONArray finalBody = new JSONArray();
        JSONObject response = new JSONObject();
        Gson gson = new Gson();

        if (StringUtils.isNotBlank(request.getResource())) {
            // Adding fields
            JsonElement body = Validations.getBodyJson(environment, request);
            JsonObject restFields = gson.fromJson(body, JsonObject.class);
            restFields.add("FirstNode", Validations.getFirstNode(environment, request));
            JSONObject result = new JSONObject(gson.toJson(restFields));
            result.put("SecondNode", Validations.getSecondNode(environment,request));
            finalBody.put(result);
        }

        response.put("resource",finalBody);
        return response;
    }
}
