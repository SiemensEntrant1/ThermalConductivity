import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class GCodeRunner2 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\maxporter\\Desktop\\out.txt"));
		
		double height = .27;
		double originX = 120;
		double originY = 120;
		double E = 0;
		
		bw.append("G0 F4320 X" + (originX-(41.91/2)) +" Y" + (originY-(10.414/2)) + " Z0.27");
		bw.newLine();
		bw.append("G1 F1800");
		bw.newLine();
		for(double j = 0; j < 2.032; j += .19)
		{
			double tempx = originX-(41.91/2);
			double tempy = originY-(10.414/2);
			for(double i = 0; i < 13; i++)
			{
				tempx += 41.91;
				E += (41.91 * .0945);
				bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
				bw.newLine();
				tempy += .4;
				//E += (.4 * .0945);
				bw.append("G0 F4320 X" + tempx + " Y" + tempy);
				bw.newLine();
				tempx -= 41.91;
				E += (41.91 * .0945);
				bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
				bw.newLine();
				tempy += .4;
				//E += (.4 * .0945);
				bw.append("G0 F4320 X" + tempx + " Y" + tempy);
				bw.newLine();
			}
			tempx += 41.91;
			E += (41.91 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
			bw.append("G0 F4320 X" + (originX-(41.91/2)) + " Y" + (originY-(10.414/2)) + " Z" + (height+j));
			bw.newLine();
		}
		bw.close();
		/*for(int i = 0; i < 45; i++)
		{
			tempy -= 10;
			E += (10 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
			tempx += .4;
			E += (.4 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
			tempy += 10;
			E += (10 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
			tempx += .4;
			E += (.4 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
		}
		
		for(int i = 0; i < filNum.size(); i++)
		{
			int filNumLay = filNum.get(i);
			double layerHeight = height+(i*.15);
			double startX = (filNumLay)*.2;
			double startY = 1.25;
			double actualX = originX-startX;
			double actualY = originY+startY;
			//System.out.println("G0 F4320 X" + actualX + " Y" + actualY + " Z" + layerHeight);
			bw.append("G0 F1800 F4320 X" + actualX + " Y" + actualY + " Z" + layerHeight);
			bw.newLine();
			double tempX = actualX;
			double tempY = actualY;
			for(int j = 0; j < filNumLay/2; j++)
			{
				tempY -= 2.5;
				E += (2.5*0.0945);
				//System.out.println("G1 X" + tempX + " Y" + tempY + " E" + E);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				tempX += .4;
				E += (.4*0.0945);
				//System.out.println("G1 X" + tempX + " Y" + tempY + " E" + E);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				tempY += 2.5;
				E += (2.5*0.0945);
				//System.out.println("G1 X" + tempX + " Y" + tempY + " E" + E);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				tempX += .4;
				E += (.4*0.0945);
				//System.out.println("G1 X" + tempX + " Y" + tempY + " E" + E);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
			}

		}*/

	}

}
