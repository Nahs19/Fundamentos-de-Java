
public class Promedio {

	public static void main(String[] args) {
		float nota1 = 80.9f, nota2 = 90.5f, nota3 = 60.0f;
		
		float promedio = (nota1 + nota2 + nota3) / 3;
		
		if (promedio >= 70) {
			System.out.println("El estudiante aprobó con un promedio de:" + " " + promedio );
			
		} else {
			System.out.println("El estudiante no aprobó la materia");
		}

	}

}
