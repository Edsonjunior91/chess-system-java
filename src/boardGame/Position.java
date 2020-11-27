package boardGame;

public class Position {
	//encapsulamento com private
	private int row;
	private int column;
	
	//construtor com argumentos
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	//sobrescrita do método toString da classe object
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
}
