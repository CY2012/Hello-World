import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.driver.OracleDriver;
import java.sql.ResultSet;
import java.sql.Types;
import java.sql.ResultSetMetaData;


public class DemoJdbc{

	public static void main(String[] args){
	    //JDBC�������ݿ�Ĳ���
		//step.1	load driver class(����������)
		 try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		 }catch(ClassNotFoundException e){
			e.printStackTrace();
		 }

		//step.2	creat Connection object(�������Ӷ���)
		String url = "jdbc:oracle:thin:@//localhost:1521/orcl";
		String username = "scott";
		String password = "tiger";
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(url,username,password);
		}catch(SQLException e){
			e.printStackTrace();
		}
		//step.3	create statement object(����)
			
		Statement stmt = null;
		 
		 try{
			stmt = conn.createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}
		// step.4 ִ��execute SQL
		/*
		String sql = "insert into dept(deptno,dname,loc)values(80,'�г���','�Ϻ�')"; //dept
		
		try{
			int count = stmt.executeUpdate(sql);
			if(count > 0){
			 System.out.println("����ɹ���");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		*/

		String sql = "select * from emp";
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try{
			rs = stmt.executeQuery(sql);
			rsmd = rs.getMetaData();
			
			//step.5	operation ResultSet(ִ�н����)
			for(int i = 1;i <= rsmd.getColumnCount();i++){
				System.out.print(rsmd.getColumnName(i) + "    ");
			}
			System.out.println();

			while(rs.next()){//next ���ع����һ��
				for(int i = 1;i<=rsmd.getColumnCount();i++){
					int i_o = rsmd.getColumnType(i);
					switch(i_o){
						case Types.VARCHAR:
							System.out.print(rs.getString(i) + "    ");
							break;
						case Types.NUMERIC:
							System.out.print(rs.getString(i) + "    ");
							break;
						case Types.TIMESTAMP:
							System.out.print(rs.getString(i) + "    ");
							break;
						default :
							System.out.print(rs.getString(i) + "    ");
						break;
					}
				}
				System.out.println();
			}
			//System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename") + "\t" + rs.getString("job"));
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		

		
		//step.6	close connection object
		try{
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}


/*
����ʱ��
D:\javalianxi\0629>javac -cp .;ojdbc6.jar DemoJdbc.java
����ʱ��
D:\javalianxi\0629>java -cp .;ojdbc6.jar DemoJdbc
*/