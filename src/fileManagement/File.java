package fileManagement;

public class File {
	
	public String name;
	public int size;
	public int indexOfFirstBlock;
	public boolean open;
	public int readChars;
	File(){
		name = "";
		size=0;
		indexOfFirstBlock = 0;
		open = false;
		readChars = 0;
	}
	
	File(String name, int size, int indexOfFirstBlock){
		this.name=name;
		this.size = size;
		this.indexOfFirstBlock= indexOfFirstBlock;
		open = false;
		readChars = 0;
	}
}