public class TiposPrimitivos {
	private byte tipoByte;
	private short tipoShort;
	private int tipoInt;
	private long tipoLong;
	private float tipoFloat;
	private double tipoDouble;
	private char tipoChar;
	private boolean tipoBoolean;


	public String mostrarValoresPadrao() {
		StringBuilder builder = new StringBuilder();
		builder.append("byte: " + this.tipoByte + "\n");
		builder.append("short: " + this.tipoShort + "\n");
		builder.append("int: " + this.tipoInt + "\n");
		builder.append("long: " + this.tipoLong + "\n");
		builder.append("float: " + this.tipoFloat + "\n");
		builder.append("double: " + this.tipoDouble + "\n");
		builder.append("char: " + this.tipoChar + "\n");
		builder.append("boolean:" + this.tipoBoolean);
		return builder.toString();
	}

	public String mostrarIntervalos() {
		StringBuilder builder = new StringBuilder();
		builder.append("Byte: "  + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE + "\n");
		builder.append("Short: " + Short.MIN_VALUE + " - " + Short.MAX_VALUE + "\n");
		builder.append("Integer (int): " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "\n");
		builder.append("Long: "  + Long.MIN_VALUE + " - " + Long.MAX_VALUE + "\n");
		builder.append("Float: " + Float.MIN_VALUE + " - " + Float.MAX_VALUE + "\n");
		builder.append("Double: "+ Double.MIN_VALUE + " - " + Double.MAX_VALUE + "\n");
		builder.append("Char: Um caractere" + "\n");
		builder.append("Boolean: True - False" + "\n");
		return builder.toString();
	}

	public int narrowing(double value){
		return (int) value;
	}

	public double widening(int value){
		double result = value;
		return result;
	}

	/*	
		byte b = 12;
		short s = 255;
		int i = 474945;
		long l = 23442323432435L;
		float f = 3434.65F;
		double d = 8723462332.3434;
		char c = 'r';
		boolean b = true;


	*/


}
