package wcresults;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAOTime {
    public boolean exibirTime (Time time) throws Exception {
        String sql = "SELECT * FROM time_table";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public void atualizarTime(Time time) throws Exception {
        String sql = "UPDATE time_table SET nome = ? WHERE nome = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            ps.execute();
            ps.close();
            }
    }
    
    public int atribuirTimes(int times[]) throws Exception {
        for (time = 0; time < 32; time++)
        update time set.grupo    
    }
}    

