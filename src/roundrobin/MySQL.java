package roundrobin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {
	
	// JDBCドライバの登録
    String driver;
    // データベースの指定
    String server, dbname, url, user, password;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
	public MySQL() {
		this.driver  = "org.gjt.mm.mysql.Driver";
		this.server  = "naisyo.naisyo.com";      // MySQLサーバ ( IP または ホスト名 );
		this.dbname  = "naisyo";         // データベース名;
		this.url = "jdbc:mysql://" + server + "/" + dbname + "?useUnicode=true&characterEncoding=UTF-8";
		this.user = "naisyo";         // データベース作成ユーザ名;
		this.password  = "oshienaiyo";     // データベース作成ユーザパスワード;
		
		try {
			this.con = DriverManager.getConnection(url, user, password);
			this.stmt = con.createStatement ();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Class.forName (driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void close(){
		try {
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertCombination(int k, int idx[]){
        String sql = "INSERT INTO combinations(n) VALUES ("+k+")";
        String sql2 = "SELECT * FROM combinations ORDER BY id DESC limit 1";
        int combination_id = 0;
        try {
                stmt.execute (sql);
                ResultSet rs = stmt.executeQuery (sql2);
                while(rs.next()){
                        combination_id = rs.getInt("id");
                }
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }  //try catchで囲む
        //System.out.println("combination_id="+combination_id);
        insertPoint(combination_id, idx);
        return combination_id;
	}
	
	public void insertPoint(int combination_id, int idx[]){
		int idex = 0;
                StringBuffer buf = new StringBuffer();
                buf.append("INSERT INTO points(facility_id, combination_id) VALUES");
                for(int i = 0; i < idx.length; i++){//対象のDMUの係数を使い、全部のDMUのDEAを計算
                		idex = idx[i] +1;
                        if(i == idx.length -1)    			
                                buf.append("("+idex+","+combination_id+")");
                        else
                                buf.append("("+idex+","+combination_id+"),");
             
                }
                        String sql4 = buf.toString();
                        try {
							stmt.execute (sql4);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	}




}
