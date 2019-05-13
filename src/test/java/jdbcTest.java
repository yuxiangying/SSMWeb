import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: SSMWeb
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @date Date : 2019年05月10日 14:20
 */
public class jdbcTest {
    @Test
    public void test1(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","yxy","yxy");
            System.out.println(conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
