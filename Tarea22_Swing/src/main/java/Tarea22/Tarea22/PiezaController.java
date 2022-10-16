package Tarea22.Tarea22;

import Tarea22.Tarea22.Modelo;
import Tarea22.Tarea22.View;

import java.sql.Connection;
import java.sql.SQLException;

import Tarea22.Tarea22.ConexionDB;
import Tarea22.Tarea22.Modelo;

public class PiezaController {
	/*public void setIdPieza(int id){
		model.setId(id);
	}
	public String getIdPieza(){
		return model.getId();
	}
	public void updateView(){
		view.printStudentDetails(model.getNombre(), model.getId());
	}*/

	public static void seleccionOpciones(Connection conn) {
		boolean correcto,salir=false,salirCRUD=false;
		int id,opcion,opcion2=0;
		String nombre;
		Object[][] data;
		jframe menu=new jframe();
		jframe2 menuCRUD=new jframe2();
		
		do {
			menu.setVisible(true);
			opcion=menu.getOpcion();
			System.out.println(opcion);
			if (opcion!=0) {
				switch (opcion) {
					case 1:
						correcto=Tarea22.Tarea22.Modelo.EliminarTablaPieza(conn);
						menu.mostrarMensaje(correcto,"Tabla eliminada correctamente","Error al eliminar tabla");
						correcto=Tarea22.Tarea22.Modelo.CrearTablaPieza(conn);
						menu.mostrarMensaje(correcto,"Tabla creada correctamente","Error al crear la tabla");
						break;
					case 2:
						String[] nombres=new String[5];
						for (int i=0;i<nombres.length;i++) {
							nombres[i]=menu.getNombre();
						}
						correcto=Tarea22.Tarea22.Modelo.InsertarPaquetePiezas(nombres, conn);
						menu.mostrarMensaje(correcto,"Registros insertados correctamente","Error al insertar los registros");
						break;
					case 3:
						correcto=Tarea22.Tarea22.Modelo.EliminarTablaPieza(conn);
						menu.mostrarMensaje(correcto,"Tabla eliminada correctamente","Error al eliminar la tabla");
						break;
					case 4:
						menu.setVisible(false);
						do {
							menuCRUD.setVisible(true);
							opcion2=menuCRUD.getOption();
							if (opcion2!=0) {
								switch (opcion2) {
									case 11:
										nombre=menuCRUD.getNombre();
										correcto=Tarea22.Tarea22.Modelo.NuevaPieza(nombre,conn);
										menuCRUD.mostrarMensaje(correcto,"Registro añadido correctamente", "Error al añadir registro");
										break;
									case 22:
										id=Integer.parseInt(menuCRUD.getId());
										try {
											data=Tarea22.Tarea22.Modelo.getRegistro(id,conn);
											menuCRUD.mostrarArray(data);
										} catch (SQLException e) {
											Tarea22.Tarea22.View.mostrarError(e);
										}
										break;
									case 33:
										data=Tarea22.Tarea22.Modelo.getTablaPieza(conn);
										menuCRUD.mostrarArray(data);
										break;
									case 44:
										id=Integer.parseInt(menuCRUD.getId());
										nombre=menuCRUD.getNombre();
										correcto=Tarea22.Tarea22.Modelo.modificarRegistro(nombre, id,conn);
										menuCRUD.mostrarMensaje(correcto, "Registro modificado correctamente", "Error al modificar el registro");;
										break;
									case 55:
										id=Integer.parseInt(menuCRUD.getId());
										correcto=Tarea22.Tarea22.Modelo.EliminarPieza(id,conn);
										menuCRUD.mostrarMensaje(correcto, "Registro eliminado correctamente", "Error al eliminar el registro");
										break;
									case 66:
										salirCRUD=true;
								}
							}
						} while (!salirCRUD);
						opcion2=0;
						menuCRUD.setVisible(false);
						opcion=0;
						break;
					default:
						salir=true;
						menu.exit();
				}
			}
		} while (opcion!=5 || !salir);
	}
	
	public static Connection iniciar() {
		Connection conn;
		conn=Tarea22.Tarea22.ConexionDB.conexion();
    	if (conn!=null) {
    		System.out.println("Connexión correcta");
    	}
    	else {
    		System.out.println("Connexión incorrecta");
    	}
		return conn;
	}
}
