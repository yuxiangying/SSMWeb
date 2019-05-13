import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: SSMWeb
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @date Date : 2019年05月10日 14:50
 */
public class Process {
    public static Connection conn;
    public String sql;
    static{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","yxy","yxy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void desEncrypt(){
        String sql="insert into admin values(admin_seq.nextval,?,?,?,?)";
        @SuppressWarnings("resource")
        Scanner input=new Scanner(System.in);
        System.out.println("请输入后台管理员用户名：");
        String username=input.next();
        System.out.println("请输入后台管理员密码(长度为8的倍数)：");
        String pwd=input.next();
        System.out.println("请输入后台管理员的真实姓名：");
        String name=input.next();
        System.out.println("请输入后台管理员的邮箱：");
        String email=input.next();
        try {
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, pwd);
            pstmt.setString(3, name);
            pstmt.setString(4, email);
            pstmt.executeUpdate();
            System.out.println("插入数据成功！");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Process des = new Process();
        des.desEncrypt();
    }
}
