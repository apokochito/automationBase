package domain;

import lombok.Data;

@Data
public class GetResponse {
    private String generalViewOfTheResource = "";
    private Resource resource;
    private FirstNode firstNode;
    private SecondNode secondNode;

    @Data
    public static class Resource {
        public String firstProperty;
        public String secondProperty;
    }

    @Data
    public static class FirstNode {
        public String firstNodeProperty1;
        public String firstNodeProperty2;
    }

    @Data
    public static class SecondNode {
        public String secondNodeProperty1;
        public String secondNodeProperty2;
    }
}
