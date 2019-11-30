package globalenums;

public enum SqlQueries {

    todayDate("select to_char(to_date(SYSDATE, 'DD-MM-RR'), 'YYYY-MM-DD') from DUAL"),
    getRandomResource(""),
    getFirstNodeFromAPIResponse(""),
    getSecondNodeFromAPIResponse(""),
    getDetailedResource(""),
    getResourceWithNumberValue(""),
    getResourceWithTwoCharacters(""),
    getAllResources("");
    private String query = ""; // final ?

    private SqlQueries(String q) {
        this.query = q;
    }

    public String toString(){
        return query;
    }

}
