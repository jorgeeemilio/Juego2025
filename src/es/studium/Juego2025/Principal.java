package es.studium.Juego2025;

public class Principal
{
	public static void main(String[] args)
	{
		Vista vista = new Vista();  // Vista
		Modelo modelo = new Modelo(); // Modelo: Ranking (Consulta BD)
		new Controlador(vista, modelo); // Controlador
	}
}