package accesoDatos;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import logicaRefrescos.Deposito;
import logicaRefrescos.Dispensador;


public interface I_Acceso_Datos {
	
	public HashMap<Integer, Deposito>  obtenerDepositos() throws SQLException, FileNotFoundException;
	public HashMap<String, Dispensador> obtenerDispensadores() throws SQLException, FileNotFoundException;
	public boolean guardarDepositos(HashMap<Integer, Deposito> depositos) throws SQLException;
	public boolean guardarDispensadores(HashMap<String, Dispensador> dispensadores) throws SQLException;
	
}
