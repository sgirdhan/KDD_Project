import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler implements IFileHandler {

	private String filename;
	
	public FileHandler(String filename) {
		this.filename = filename;
	}

	@Override
	public ArrayList<MammographicMasses> readFile() {
		ArrayList<MammographicMasses> mmList = new ArrayList<>();
		if (filename != null && !(filename.isEmpty())) {
			// Get the file path of folder where the main program is located
			String filePath = System.getProperty("user.dir") + "/" + filename;
			BufferedReader inputStream = null;
			try {
				try {
					// get file from the file path
					File file = new File(filePath);
					// check file exists
					if (file.exists()) {
						// Wrapping file reader in Buffered Reader to avoid Reading of file again and again to improve efficiency
						inputStream = new BufferedReader(new FileReader(filePath));
						String lineContent = null;
						// Loop will iterate over each line within the file. It will stop when no new lines are found.
						while ((lineContent = inputStream.readLine()) != null) {
							if (lineContent != null && !(lineContent.trim().isEmpty()))
							{	 
								lineContent = lineContent.trim();
								String [] arrContent = lineContent.split(",");
								MammographicMasses currentMM = new MammographicMasses();
								for(int i=0; i<arrContent.length;i++)
								{
									switch (i)
									{
										case 0:
											if(!arrContent[i].equalsIgnoreCase("?"))
											{
												currentMM.setBiRadsAssement(Integer.parseInt(arrContent[i]));
											}
											break;
										case 1:
											if(!arrContent[i].equalsIgnoreCase("?"))
											{
												currentMM.setAge(Integer.parseInt(arrContent[i]));
											}
											break;
											
										case 2:
											if(!arrContent[i].equalsIgnoreCase("?"))
											{
												currentMM.setShape(Integer.parseInt(arrContent[i]));
											}
											break;
											
										case 3:
											if(!arrContent[i].equalsIgnoreCase("?"))
											{
												currentMM.setMargin(Integer.parseInt(arrContent[i]));
											}
											break;
											
										case 4:
											if(!arrContent[i].equalsIgnoreCase("?"))
											{
												currentMM.setDensity(Integer.parseInt(arrContent[i]));
											}
											break;
											
										case 5:
											if(!arrContent[i].equalsIgnoreCase("?"))
											{
												currentMM.setSeverity(Integer.parseInt(arrContent[i]));
											}
											break;
										default:
											break;
									}
								}
								
							mmList.add(currentMM);
							}
						}
					} else {
						System.out.println(
								String.format("File with filename %s does not exists at %s", filename, filePath));
								// exit program if file not found
								
					}
				}
				// Making sure we close the buffered reader to avoid memory leaks.
				finally {
					if (inputStream != null)
						inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// display a user friendly message if the file name was not provide from the command line argument
		else {
			System.out.println("File Name was not provided. Please provide a input filename");
		}
		return mmList;
		
	}

}
