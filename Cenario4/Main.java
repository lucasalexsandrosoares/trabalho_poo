package CursoJava;

public class Main {
	public static void main(String[] args) {
		SolidosGeometricos s = new SolidosGeometricos();
		Cubo c = new Cubo();
		System.out.println("Cubo é um sólido geométrico e pertece ao grupo dos poliedros");
		c.setLargura(5);
		c.setComprimento(5);
		c.setAltura(5);
		System.out.println("Volume do cubo:" + c.calcularVolume());
		Cilindro ci = new Cilindro();
		System.out.println("Cilindro é um sólido geométrico e pertece ao grupo dos corpos redondos");
		ci.setAltura(6);
		ci.setRaio(2);
		System.out.println("Volume do cilindro:" + ci.calcularVolume());
		Cone co = new Cone();
		System.out.println("Cone é um sólido geométrico e pertece ao grupo dos corpos redondos");
		co.setAltura(12);
		co.setRaio(5);
		System.out.println("Volume do cone:" + co.calcularVolume());
		Paralelepipedo p = new Paralelepipedo();
	}
}
