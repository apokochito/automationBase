package globalclasses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import domain.GetRequest;
import domain.GetResponse;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

public class Validations {

    public static JsonElement getBodyJson(String environment, GetRequest request) throws Throwable {
        Map<String, String> field = null;
        GetResponse.Resource resource = new GetResponse.Resource();
        Gson gson = new GsonBuilder().create();

        if (StringUtils.isNotBlank(request.getResource())) {
            // field = DBUtils.executeSingleRowSelect(environment, String.format(SqlQueries.getDetailedResource.toString(),request.getResource()));
        }

        resource.setFirstProperty("");
        resource.setSecondProperty("");
        return gson.toJsonTree(resource);
    }

    public static JsonElement getFirstNode(String environment, GetRequest request) {
        Gson gson = new GsonBuilder().create();
        //String firstNode = DBUtils.executesingleSelect(environment, String.format(SqlQueries.getFirstNodeFromAPIResponse.toString(), request.getResource()));
        GetResponse.FirstNode body = new GetResponse.FirstNode();
        body.setFirstNodeProperty1("");
        body.setFirstNodeProperty2("");
        return gson.toJsonTree(body);
    }

    public static JSONArray getSecondNode(String environment, GetRequest request) throws JSONException {
        // JSONArray secondNode = DBUtils.executeMultipleRowSelectArray(environment, String.format(SqlQueries.getSecondNodeFromAPIResponse.toString());
        JSONArray secondNode = null;
        for (int i = 0; i < secondNode.length(); i++) {
            // Obtain just the value from the Array
            // String value = query.getJSONObject(i).optString("NDC_NO");
            secondNode.getJSONObject(i).put("resourceId", JSONObject.NULL);
        }

        String cleanQuery = StringUtils.replace(secondNode.toString(), "NDC_NO", "ndc");
        JSONArray json = new JSONArray(cleanQuery);

        return json;
    }
}
