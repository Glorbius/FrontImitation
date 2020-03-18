package WorkWithSql;

public class WorkWtBd {
    public static String  insertMember = "INSERT INTO domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,'kokoko','24','39','F','Member','39');";
    public static String updateName = "UPDATE domashkaMembers SET name = 'mariamagdalena' WHERE id = '1';";
    public static String updateAge = "UPDATE domashkaMembers SET age = '30' WHERE id = '1';";
    public static String updateLegSize = "UPDATE domashkaMembers SET legsize = '10' WHERE id = '1';";
    public static String updateSex = "UPDATE domashkaMembers SET sex = 'fem' WHERE id = '1';";
    public static String updateStatus = "UPDATE domashkaMembers SET status = 'holop' WHERE id = '1';";
    public static  String deleteId = "DELETE FROM domashkaMembers WHERE id ='1';";
}
